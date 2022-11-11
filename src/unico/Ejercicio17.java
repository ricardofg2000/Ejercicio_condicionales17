package unico;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		/* 
		 Escribe un programa que calcule el precio final 
		 de un producto según su base imponible (precio antes de impuestos),
		 el tipo de IVA aplicado (general, reducido o superreducido) y el 
		 código promocional. Los tipos de IVA general, reducido y superreducido 
		 son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden 
		 ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se 
		 aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros 
		 o se descuenta el 5%. El ejercicio se da por bueno si se muestran los 
		 valores correctos, aunque los números no estén tabulados.
		 Ejemplo:

Introduzca la base imponible: 25
Introduzca el tipo de IVA (general, reducido o superreducido): reducido
Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
Base imponible
IVA (10%)
Precio con IVA
25.00
2.50
27.50
Cód. promo. (mitad): -13.75
TOTAL
13.75
		 */
		
		Scanner leer = new Scanner(System.in);
		
		double base;
		String iva;
		String codigo;
		double valor_iva = 0;
		double porc_iva = 0;
		double total;
		double descuento = 0;
		double totalfinal;
		
		System.out.print("Introduzca la base imponible: ");
		base = Double.parseDouble(leer.nextLine());
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		iva = leer.nextLine();
		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		codigo = leer.nextLine();
		
		switch (iva) {
		case "general": porc_iva = 21.00;valor_iva = base * porc_iva/100.00;break;
		case "reducido": porc_iva = 10.00;valor_iva = base * porc_iva/100.00;break;
		case "superreducido": porc_iva = 4.00;valor_iva = base * porc_iva/100.00;break;
		}
		
		total = base + valor_iva;
		
		switch (codigo) {
		case "nopro": descuento = 0.00;break;
		case "mitad": descuento = total/2;break;
		case "meno5": descuento = total - 5.00;break;
		case "5porc": descuento = total * (100.00-5.00)/100.00;break;
		}		
		
		totalfinal = total - descuento;
		
		System.out.println("Base imponible");
		System.out.println("IVA(" + porc_iva + "%)");
		System.out.println("Precio con IVA");
		System.out.println(base);
		System.out.println(valor_iva);
		System.out.println(total);
		System.out.println("Cód. promo. (" + codigo + "): " + "-" + descuento);
		System.out.println("TOTAL");
		System.out.println(totalfinal);
		
	}

}
