package com.babursomer.lesson_015;

import com.util.BAUtils;

public class InvoiceTest {
	
	public static void main(String[] args) {
		Invoice inv1 = new Invoice();
		Invoice inv2 = new Invoice();
		Invoice inv3 = new Invoice();
		
		inv1.name = BAUtils.readString("Lütfen lokanta adını giriniz");
		inv1.netValue = BAUtils.readDouble("Lütfen fatura meblağını giriniz");
		int vat = BAUtils.readInt("Lütfen KDV oranını giriniz");
		inv1.calcVAT(vat);
		System.out.println(inv1.taxedValue);
		
		inv2.name = "Kırtasiye";
		inv2.netValue = 160.75d;
		inv2.calcVAT(8);
		System.out.println(inv2.taxedValue);
		
		inv3.name = "Market";
		inv3.netValue = 250.0d;
		inv3.calcVAT(15);
		System.out.println(inv3.taxedValue);
		
		// Toplam ne kadar ödemem var?
		System.out.println("Toplam harcama: " + Invoice.totalAmount);
		System.out.println("Ortalama harcama: " + Invoice.average());
		
		// Ödediğim en yüksek fatura bedelini bilmek istiyorum
		System.out.println("En büyük harcama: " + Invoice.maxInvoiceValue);
	}
	
}
