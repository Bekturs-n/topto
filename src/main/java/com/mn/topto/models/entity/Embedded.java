package com.mn.topto.models.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Inheritance(strategy = InheritanceType.JOINED)
public class Embedded {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Embedded(String name) {
        this.name = name;
    }
}
