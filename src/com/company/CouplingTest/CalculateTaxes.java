package com.company.CouplingTest;

public class CalculateTaxes {
	float rate;
	float doIndia(){
		TaxeRatesInIndia str = new TaxRatesInIndia();
		rate = str.salesRate; //BAD CODE
		//This should be a method call.
		//rate = str.getSalesTaxeRates("CO");
		//do stuff with rate.
	}
}
