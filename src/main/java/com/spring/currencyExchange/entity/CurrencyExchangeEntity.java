package com.spring.currencyExchange.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "currency_exchange_table")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchangeEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(unique = true, nullable = false)
    private String currency;

    private double exchangeRate;

    private String date;
}
