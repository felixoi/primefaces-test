package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.sun.tools.javac.util.List;
import lombok.Data;
import org.primefaces.event.CellEditEvent;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;

    private List<String> test = List.of("A", "B", "C");
    
    @PostConstruct  
    public void init() {
        string = "Welcome to PrimeFaces!!!";
    }

    public void initEvent(CellEditEvent cellEditEvent) {
        System.out.println("Init worked");
    }

}
