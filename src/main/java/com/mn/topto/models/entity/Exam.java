package com.mn.topto.models.entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Exam implements Serializable {
    private String myStr;
    private int myInt;
//    public Exam(){
//
//    }
//    public Exam(String myStr, int myInt){
//        this.myStr = myStr;
//        this.myInt =  myInt;
//    }
}
