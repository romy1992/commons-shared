package com.commons.shared.general;

import lombok.Cleanup;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.mapstruct.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.rowset.serial.SerialBlob;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Optional;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class BlobUtils {

  private static final Logger log =
      LoggerFactory.getLogger(BlobUtils.class);

  private BlobUtils() {}

  /**
   * Method to compress a {@link String} to gzip and convert it to {@link Blob}
   *
   * @param string the input String
   * @return the processed Blob
   * @throws IOException
   */
  public static Blob compressToBlob(String string) throws IOException {

    if (Optional.ofNullable(string).isPresent()) {
      Blob result = null;

      try {
        result = gzip(string);
      } catch (IOException | SQLException e) {
        log.error(ExceptionUtils.getMessage(e));
      }
      return result;
    } else return null;
  }

  /**
   * Method to convert a {@link Blob} to {@link String} decompressing it
   *
   * @param blob the input Blob
   * @return the String representation
   */
  public static String decodeToString(Blob blob) {
    String result = null;

    try {
      result = ungzip(blob);
    } catch (IOException | SQLException e) {
      log.error(ExceptionUtils.getMessage(e));
    }
    return result;
  }

  private static String ungzip(Blob blob) throws IOException, SQLException {
    if (Optional.ofNullable(blob).isPresent()) {
      @Cleanup
      InputStreamReader isr =
          new InputStreamReader(
              new GZIPInputStream(new ByteArrayInputStream(blob.getBytes(1, (int) blob.length()))),
              StandardCharsets.UTF_8);
      StringWriter sw = new StringWriter();
      char[] chars = new char[1024];
      for (int len; (len = isr.read(chars)) > 0; ) {
        sw.write(chars, 0, len);
      }
      return sw.toString();
    } else return null;
  }

  private static Blob gzip(String s) throws IOException, SQLException {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    GZIPOutputStream gzip = new GZIPOutputStream(bos);
    @Cleanup OutputStreamWriter osw = new OutputStreamWriter(gzip, StandardCharsets.UTF_8);
    osw.write(s);
    osw.close();
    return new SerialBlob(bos.toByteArray());
  }

  /**
   * Method to convert a {@link String} to {@link Blob} without compressing it
   *
   * @param s the input String
   * @return the Blob result
   */
  @Named("toBlobSimple")
  public static Blob toBlob(String s) throws SQLException {
    if (Objects.nonNull(s)) {
      return new SerialBlob(
          s.getBytes(
              StandardCharsets
                  .UTF_8)); // set StandardCharsets.UTF_8 otherwise it'll takes default system
      // charset
    } else return null;
  }

  /**
   * Method to convert a {@link Blob} to {@link String} without decompressing it
   *
   * @param b the input Blob
   * @return the String representation
   */
  @Named("fromBlobSimple")
  public static String toString(Blob b) throws SQLException {
    if (Objects.nonNull(b)) {
      return new String(b.getBytes(1L, (int) b.length()), StandardCharsets.UTF_8);
    } else return null;
  }
}
