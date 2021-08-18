package com.commons.shared.utils;

import com.commons.shared.utils.model.ProvinceRegion;

import java.util.HashMap;
import java.util.Map;

public class ProvinceUtils {

  private static Map<String, ProvinceRegion> provinceAndRegion = null;

  private static ProvinceUtils provinceUtils = null;

  private ProvinceUtils() {}

  public static ProvinceUtils getInstance() {
    if (provinceUtils == null) {
      provinceUtils = new ProvinceUtils();
      provinceAndRegion = new HashMap<>();
    }
    return provinceUtils;
  }

  public Map<String, ProvinceRegion> getProvinceAndRegion() {
    provinceAndRegion.put("Alessandria", new ProvinceRegion("AL", "Piemonte"));
    provinceAndRegion.put("Agrigento", new ProvinceRegion("AG", "Sicilia"));
    provinceAndRegion.put("Ancona", new ProvinceRegion("AN", "Marche"));
    provinceAndRegion.put("Aosta", new ProvinceRegion("AO", "Valle d'Aosta"));
    provinceAndRegion.put("Foggia", new ProvinceRegion("FG", "Puglia"));
    provinceAndRegion.put("Aquila", new ProvinceRegion("AQ", "Abruzzo"));
    provinceAndRegion.put("Ascoli-Piceno", new ProvinceRegion("AP", "Marche"));
    provinceAndRegion.put("Asti", new ProvinceRegion("AT", "Piemonte"));
    provinceAndRegion.put("Avellino", new ProvinceRegion("AV", "Campania"));
    provinceAndRegion.put("Bari", new ProvinceRegion("BA", "Puglia"));
    provinceAndRegion.put("Barletta-Andria-Trani", new ProvinceRegion("BT", "Puglia"));
    provinceAndRegion.put("Belluno", new ProvinceRegion("BL", "Veneto"));
    provinceAndRegion.put("Benevento", new ProvinceRegion("BN", "Campania"));
    provinceAndRegion.put("Bergamo", new ProvinceRegion("BG", "Lombardia"));
    provinceAndRegion.put("Biella", new ProvinceRegion("BI", "Piemonte"));
    provinceAndRegion.put("Bologna", new ProvinceRegion("BO", "Emilia Romagna"));
    provinceAndRegion.put("Bolzano", new ProvinceRegion("BZ", "Trentino Alto Adige"));
    provinceAndRegion.put("Brescia", new ProvinceRegion("BS", "Lombardia"));
    provinceAndRegion.put("Brindisi", new ProvinceRegion("BR", "Puglia"));
    provinceAndRegion.put("Cagliari", new ProvinceRegion("CA", "Sardegna"));
    provinceAndRegion.put("Caltanissetta", new ProvinceRegion("CL", "Sicilia"));
    provinceAndRegion.put("Campobasso", new ProvinceRegion("CB", "Molise"));
    provinceAndRegion.put("Carbonia Iglesias", new ProvinceRegion("CI", "Sardegna"));
    provinceAndRegion.put("Caserta", new ProvinceRegion("CE", "Campania"));
    provinceAndRegion.put("Catania", new ProvinceRegion("CT", "Sicilia"));
    provinceAndRegion.put("Catanzaro", new ProvinceRegion("CZ", "Calabria"));
    provinceAndRegion.put("Chieti", new ProvinceRegion("CH", "Abruzzo"));
    provinceAndRegion.put("Como", new ProvinceRegion("CO", "Lombardia"));
    provinceAndRegion.put("Cosenza", new ProvinceRegion("CS", "Calabria"));
    provinceAndRegion.put("Cremona", new ProvinceRegion("CR", "Lombardia"));
    provinceAndRegion.put("Crotone", new ProvinceRegion("KR", "Calabria"));
    provinceAndRegion.put("Cuneo", new ProvinceRegion("CN", "Piemonte"));
    provinceAndRegion.put("Enna", new ProvinceRegion("EN", "Sicilia"));
    provinceAndRegion.put("Fermo", new ProvinceRegion("FM", "Marche"));
    provinceAndRegion.put("Ferrara", new ProvinceRegion("FE", "Emilia Romagna"));
    provinceAndRegion.put("Firenze", new ProvinceRegion("FI", "Toscana"));
    provinceAndRegion.put("Forli-Cesena", new ProvinceRegion("FC", "Emilia Romagna"));
    provinceAndRegion.put("Frosinone", new ProvinceRegion("FR", "Lazio"));
    provinceAndRegion.put("Genova", new ProvinceRegion("GE", "Liguria"));
    provinceAndRegion.put("Gorizia", new ProvinceRegion("GO", "Friuli Venezia Giulia"));
    provinceAndRegion.put("Grosseto", new ProvinceRegion("GR", "Toscana"));
    provinceAndRegion.put("Imperia", new ProvinceRegion("IM", "Liguria"));
    provinceAndRegion.put("Isernia", new ProvinceRegion("IS", "Molise"));
    provinceAndRegion.put("La-Spezia", new ProvinceRegion("SP", "Liguria"));
    provinceAndRegion.put("Latina", new ProvinceRegion("LT", "Lazio"));
    provinceAndRegion.put("Lecce", new ProvinceRegion("LE", "Puglia"));
    provinceAndRegion.put("Lecco", new ProvinceRegion("LC", "Lombardia"));
    provinceAndRegion.put("Livorno", new ProvinceRegion("LI", "Toscana"));
    provinceAndRegion.put("Lodi", new ProvinceRegion("LO", "Lombardia"));
    provinceAndRegion.put("Lucca", new ProvinceRegion("LU", "Toscana"));
    provinceAndRegion.put("Macerata", new ProvinceRegion("MC", "Marche"));
    provinceAndRegion.put("Mantova", new ProvinceRegion("MN", "Lombardia"));
    provinceAndRegion.put("Massa-Carrara", new ProvinceRegion("MS", "Toscana"));
    provinceAndRegion.put("Matera", new ProvinceRegion("MT", "Basilicata"));
    provinceAndRegion.put("Medio Campidano", new ProvinceRegion("VS", "Sardegna"));
    provinceAndRegion.put("Messina", new ProvinceRegion("ME", "Sicilia"));
    provinceAndRegion.put("Milano", new ProvinceRegion("MI", "Lombardia"));
    provinceAndRegion.put("Modena", new ProvinceRegion("MO", "Emilia Romagna"));
    provinceAndRegion.put("Monza-Brianza", new ProvinceRegion("MB", "Lombardia"));
    provinceAndRegion.put("Napoli", new ProvinceRegion("NA", "Campania"));
    provinceAndRegion.put("Novara", new ProvinceRegion("NO", "Piemonte"));
    provinceAndRegion.put("Nuoro", new ProvinceRegion("NU", "Sardegna"));
    provinceAndRegion.put("Ogliastra", new ProvinceRegion("OG", "Sardegna"));
    provinceAndRegion.put("Olbia Tempio", new ProvinceRegion("OT", "Sardegna"));
    provinceAndRegion.put("Oristano", new ProvinceRegion("OR", "Sardegna"));
    provinceAndRegion.put("Padova", new ProvinceRegion("PD", "Veneto"));
    provinceAndRegion.put("Palermo", new ProvinceRegion("PA", "Sicilia"));
    provinceAndRegion.put("Parma", new ProvinceRegion("PR", "Emilia Romagna"));
    provinceAndRegion.put("Pavia", new ProvinceRegion("PV", "Lombardia"));
    provinceAndRegion.put("Perugia", new ProvinceRegion("PG", "Umbria"));
    provinceAndRegion.put("Pesaro-Urbino", new ProvinceRegion("PU", "Marche"));
    provinceAndRegion.put("Pescara", new ProvinceRegion("PE", "Abruzzo"));
    provinceAndRegion.put("Piacenza", new ProvinceRegion("PC", "Emilia Romagna"));
    provinceAndRegion.put("Pisa", new ProvinceRegion("PI", "Toscana"));
    provinceAndRegion.put("Pistoia", new ProvinceRegion("PT", "Toscana"));
    provinceAndRegion.put("Pordenone", new ProvinceRegion("PN", "Friuli Venezia Giulia"));
    provinceAndRegion.put("Potenza", new ProvinceRegion("PZ", "Basilicata"));
    provinceAndRegion.put("Prato", new ProvinceRegion("PO", "Toscana"));
    provinceAndRegion.put("Ragusa", new ProvinceRegion("RG", "Sicilia"));
    provinceAndRegion.put("Ravenna", new ProvinceRegion("RA", "Emilia Romagna"));
    provinceAndRegion.put("Reggio-Calabria", new ProvinceRegion("RC", "Calabria"));
    provinceAndRegion.put("Reggio-Emilia", new ProvinceRegion("RE", "Emilia Romagna"));
    provinceAndRegion.put("Rieti", new ProvinceRegion("RI", "Lazio"));
    provinceAndRegion.put("Rimini", new ProvinceRegion("RN", "Emilia Romagna"));
    provinceAndRegion.put("Roma", new ProvinceRegion("RM", "Lazio"));
    provinceAndRegion.put("Rovigo", new ProvinceRegion("RO", "Veneto"));
    provinceAndRegion.put("Salerno", new ProvinceRegion("SA", "Campania"));
    provinceAndRegion.put("Sassari", new ProvinceRegion("SS", "Sardegna"));
    provinceAndRegion.put("Savona", new ProvinceRegion("SV", "Liguria"));
    provinceAndRegion.put("Siena", new ProvinceRegion("SI", "Toscana"));
    provinceAndRegion.put("Siracusa", new ProvinceRegion("SR", "Sicilia"));
    provinceAndRegion.put("Sondrio", new ProvinceRegion("SO", "Lombardia"));
    provinceAndRegion.put("Taranto", new ProvinceRegion("TA", "Puglia"));
    provinceAndRegion.put("Teramo", new ProvinceRegion("TE", "Abruzzo"));
    provinceAndRegion.put("Terni", new ProvinceRegion("TR", "Umbria"));
    provinceAndRegion.put("Torino", new ProvinceRegion("TO", "Piemonte"));
    provinceAndRegion.put("Trapani", new ProvinceRegion("TP", "Sicilia"));
    provinceAndRegion.put("Trento", new ProvinceRegion("TN", "Trentino Alto Adige"));
    provinceAndRegion.put("Treviso", new ProvinceRegion("TV", "Veneto"));
    provinceAndRegion.put("Trieste", new ProvinceRegion("TS", "Friuli Venezia Giulia"));
    provinceAndRegion.put("Udine", new ProvinceRegion("UD", "Friuli Venezia Giulia"));
    provinceAndRegion.put("Varese", new ProvinceRegion("VA", "Lombardia"));
    provinceAndRegion.put("Venezia", new ProvinceRegion("VE", "Veneto"));
    provinceAndRegion.put("Verbania", new ProvinceRegion("VB", "Piemonte"));
    provinceAndRegion.put("Vercelli", new ProvinceRegion("VC", "Piemonte"));
    provinceAndRegion.put("Verona", new ProvinceRegion("VR", "Veneto"));
    provinceAndRegion.put("Vibo-Valentia", new ProvinceRegion("VV", "Calabria"));
    provinceAndRegion.put("Vicenza", new ProvinceRegion("VI", "Veneto"));
    provinceAndRegion.put("Viterbo", new ProvinceRegion("VT", "Lazio"));
    return provinceAndRegion;
  }
}
