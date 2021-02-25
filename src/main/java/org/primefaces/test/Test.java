package org.primefaces.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Test implements Serializable {

  @Setter
  String name;

  TestType testType;

  public void setTestType(TestType testType) {
    System.out.println("name " + name + ": " + testType);
    this.testType = testType;
  }
}
