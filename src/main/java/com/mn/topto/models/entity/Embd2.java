package com.mn.topto.models.entity;

import com.mn.topto.models.util.Enum1;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Iterator;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
//@Builder
public class Embd2 extends Embedded{

    @Column
    private String embd2;

    private Enum1 enum1;

    public Embd2(String embd2) {
        this.embd2 =  embd2;
    }


//    @Enumerated(EnumType.ORDINAL)
//    private Status status;
//
//    @Enumerated(EnumType.STRING)
//    private Type type;
//
//    @Basic
//    private int priorityValue;
//
//    @Transient
//    private Enum1 enum1;
//
//    private Category category;

}
