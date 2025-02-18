package com.spring.currencyExchange.repo;

import com.spring.currencyExchange.entity.CurrencyExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchangeEntity, UUID> {

}
