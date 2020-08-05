package com.mn.topto.models.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

import javax.validation.constraints.NotNull;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @Column(name = "data_time", nullable = false, updatable = false)
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @CreationTimestamp
    private LocalDateTime persistDateTime;

    @Column(name = "is_enable", nullable = false, columnDefinition = "TINYINT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isEnabled = true;

    @Column
    @NotNull
    private String links;

    @Column
    @NotNull
    private String name;

    @Column(name = "reputation")
    private Integer reputation;

    @NotNull
    @Column
    private String telefon;

    @NotNull
    @Column
    private String role;

    @Column
    private Integer points;

    @Column
    private String company;



}
