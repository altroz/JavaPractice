package com.company.CouplingTest;

public class TaxRatesInIndia {
	public float salesRate; //should be private
	public float adjustedSalesRate //should be private

	public float getSalesTaxRates(String region){
		salesRate = new CalculateTaxes.doIndia(); //Bad Code
		return adjustedSalesRate;}
	}