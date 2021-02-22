package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;

    private List<Test> tests;
    
    @PostConstruct  
    public void init() {
        string = "Welcome to PrimeFaces!!!";

        tests = new ArrayList<>();
        tests.add(new Test("Test 1", TestType.ONE));
        tests.add(new Test("Test 2", TestType.ONE));
        tests.add(new Test("Test 3", TestType.ONE));
        tests.add(new Test("Test 4", TestType.TWO));
        tests.add(new Test("Test 4", TestType.TWO));
        tests.add(new Test("Test 5", TestType.THREE));
    }

    public TestType[] allValues() {
        return TestType.values();
    }


}
