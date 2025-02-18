package com.spring.currencyExchange.controller;

import com.spring.currencyExchange.model.GetConvertAmountResponse;
import com.spring.currencyExchange.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/currency/exchange")
public class CurrencyExchangeController {

    @Autowired
    private CurrencyExchangeService currencyExchangeService;

    @GetMapping("/updateCurrency")
    public String currencyExchange() {
        return null;
    }

    @GetMapping("/getExchangeRate")
    public ResponseEntity<GetConvertAmountResponse> getExchangeRate(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam long amount) {
        return null;
    }
}
