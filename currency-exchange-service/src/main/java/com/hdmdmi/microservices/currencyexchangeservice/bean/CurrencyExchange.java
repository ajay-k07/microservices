package com.hdmdmi.microservices.currencyexchangeservice.bean;

import java.math.BigDecimal;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class CurrencyExchange {
private Long id;
private String from;
private String to;
private BigDecimal conversionMultiple;

private String environment;

public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.conversionMultiple = conversionMultiple;
}

}
