package com.proj.ApiRest.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity (name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", scale = 2, precision = 13)
    private BigDecimal Limit;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getLimit() {
        return Limit;
    }

    public void setLimit(BigDecimal limit) {
        Limit = limit;
    }
}
