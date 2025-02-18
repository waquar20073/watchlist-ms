package com.spring.currencyExchange.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetConvertAmountResponse {

    private String message;
    private double convertedAmount;
    private String from;
    private String to;
}
