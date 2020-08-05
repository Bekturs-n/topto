package com.mn.topto.models.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "anouns")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Anounsment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private String title;

    @NotNull
    @Column
    @Type(type="text")
    private String description;

    @Column
    private Integer price;

    @Column
    private Byte vip;

    @Column
    private Byte premium;

    @Column(name = "persist_data", nullable = false, updatable = false)
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @CreationTimestamp
    private LocalDateTime persistDateTime;


    @Column(name = "update_data", nullable = false, updatable = true)
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @CreationTimestamp
    private LocalDateTime updateDate;

    @Column
    private Boolean is_update_today = false;

    @Column
    private String img;

    @Column
    private Integer view;

    @Column
    private Integer view_today;

    @Column
    private Boolean isSolt;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Category.class, cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "category_id",nullable = false)
    private Category categoryId;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class, cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "user_id",nullable = false)
    private User userId;


}
