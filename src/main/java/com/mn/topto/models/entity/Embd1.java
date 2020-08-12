package com.mn.topto.models.entity;

import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Builder
public class Embd1 extends Embedded {


    @Column
    private String embd1;

//    @Basic(fetch = FetchType.LAZY)
//    @Basic(optional = false)
//    @Basic
//    private Integer age;
//
//    @javax.persistence.Embedded
//    private A a;

//    @ElementCollection
//    private Map<String, Integer> numbers;

    public Embd1(String name, String embd1) {
        super(name);
        this.embd1 = embd1;
    }

}
