package org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SymptomSignNameDefiningcode implements EnumValueSet {
  N25064002("25064002", "25064002", "SNOMED-CT", "25064002"),

  N3006004("3006004", "3006004", "SNOMED-CT", "3006004"),

  N91175000("91175000", "91175000", "SNOMED-CT", "91175000");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SymptomSignNameDefiningcode(String value, String description, String terminologyId, String code) {
    this.value = value;
    this.description = description;
    this.terminologyId = terminologyId;
    this.code = code;
  }

  public String getValue() {
     return this.value;
  }

  public String getDescription() {
    return this.description;
  }

  public String getTerminologyId() {
    return this.terminologyId;
  }

  public String getCode() {
    return this.code;
  }
}
