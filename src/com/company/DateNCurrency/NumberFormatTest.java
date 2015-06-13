package com.company.DateNCurrency;

import java.text.NumberFormat;

public class NumberFormatTest {
	public static void main(String[] args){
		float f1 = 999.999f;
		NumberFormat nf =NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits()+ "  ");
		System.out.println(nf.format(f1)+ "	");
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(f1) + "	");
	}
}
