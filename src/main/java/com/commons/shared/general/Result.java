package com.commons.shared.general;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Result<E> {

  @JsonProperty("O")
  private Outcome outcome;

  @JsonProperty("D")
  private E data;

  public static <E> Result<E> createResult(String code, E data) {
    Result<E> result = new Result<>();
    result.setData(data);
    Outcome outcome = new Outcome();
    outcome.setOperationResult(true);
    outcome.code = code;
    result.setOutcome(outcome);
    return result;
  }

  public static <E> Result<E> createResult(boolean operationResult, String code, E data) {
    Result<E> result = new Result<>();
    result.setData(data);
    Outcome outcome = new Outcome();
    outcome.setOperationResult(operationResult);
    outcome.code = code;
    result.setOutcome(outcome);
    return result;
  }

  public static <E> Result<E> createResult(String code, Exception e) {
    Result<E> result = new Result<>();
    Outcome outcome = new Outcome();
    outcome.setOperationResult(false);
    outcome.code = code;
    ArrayList<Error> errors = new ArrayList<>();
    Error error = new Error();
    error.setCode(e.getMessage());
    error.setDescription(e.getMessage());
    error.setMessage(e.getLocalizedMessage());
    errors.add(error);
    outcome.setErrors(errors);
    result.setOutcome(outcome);
    return result;
  }

  public Outcome getOutcome() {
    return this.outcome;
  }

  public void setOutcome(Outcome outcome) {
    this.outcome = outcome;
  }

  public E getData() {
    return this.data;
  }

  public void setData(E data) {
    this.data = data;
  }

  public enum ResponseCode {
    COMPLETED,
    DONT_SAVE,
    REFUSED,
    NOT_FOUND
  }

  public static class Error {
    @JsonProperty("C")
    private String code;

    @JsonProperty("D")
    private String description;

    @JsonProperty("M")
    private String message;

    public String getCode() {
      return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }

    public String getDescription() {
      return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public String getMessage() {
      return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
  }

  public static class Outcome {
    @JsonProperty("R")
    private boolean operationResult;

    @JsonProperty("C")
    private String code;

    @JsonProperty("E")
    private List<Error> errors = new ArrayList<>();

    public boolean isOperationResult() {
      return this.operationResult;
    }

    public void setOperationResult(boolean operationResult) {
      this.operationResult = operationResult;
    }

    public String getCode() {
      return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }

    public List<Error> getErrors() {
      return this.errors;
    }

    public void setErrors(List<Error> errors) {
      this.errors = errors;
    }
  }
}
