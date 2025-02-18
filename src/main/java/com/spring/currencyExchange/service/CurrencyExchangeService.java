package com.spring.currencyExchange.service;

import com.spring.currencyExchange.model.GetConvertAmountResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    public String updateCurrency() {
        return null;
    }

    public ResponseEntity<GetConvertAmountResponse> exchangeRate(String from, String to, long amount) {
        return null;
    }
}
