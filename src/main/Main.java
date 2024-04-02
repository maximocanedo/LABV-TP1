package main;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import data.RecitalTicket;
import data.TheatreTicket;

public class Main {

	public static void main(String[] args) {
		System.out.println("Trabajo Práctico N.º 1 · Laboratorio de Computación IV");
		// Recital No VIP
		List<String> bandasSoporte = new ArrayList<String>(Arrays.asList("Guns & Roses"));
		LocalDate fecha = LocalDate.of(2024, 5, 5);
		Date date = Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		RecitalTicket entradaRecital = new RecitalTicket("ACDC - Tour History", date, 120, "ACDC", "Rock",
				bandasSoporte, false);
		entradaRecital.toString();
		// Recital VIP
		bandasSoporte = new ArrayList<String>(Arrays.asList("Guns & Roses", "The Clash"));
		fecha = LocalDate.of(2024, 8, 12);
		date = Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		RecitalTicket entradaRecitalVip = new RecitalTicket("ACDC - Tour History", date, 159, "ACDC", "Rock",
				bandasSoporte, true);
		entradaRecitalVip.toString();
		// Teatro
		String[] actoresPrincipales = new String[] {"Leonardo Di Caprio", "Johnny Deep", "Diego Pereti"};
		fecha = LocalDate.of(2024, 12, 6);
		date = Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		TheatreTicket entradaTeatro = new TheatreTicket("Los Autenticos", date, 136, "comedia", actoresPrincipales);
		entradaTeatro.toString();
	}

}
