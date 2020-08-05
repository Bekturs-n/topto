package com.mn.topto.models.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
