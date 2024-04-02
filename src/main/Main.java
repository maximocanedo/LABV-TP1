package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import data.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Trabajo Práctico N.º 1 · Laboratorio de Computación IV");
		
		ArrayList<String> recitalBandasDeSoporte = new ArrayList<String>(Arrays.asList("Guns & Roses", "The Clash"));
		String[] teatroActoresPrincipales = new String[] { "Leonardo Di Caprio", "Johnny Deep", "Diego Pereti" };
		
		Date[] fechas = new Date[] {
			getDateOf(2024, 5, 5, 18, 0),
			getDateOf(2024, 12, 6, 18, 0)
		};
	
		Ticket[] tickets = new Ticket[] {
			// Entradas para recitales. No VIP y VIP.
			new RecitalTicket("ACDC - Tour History", fechas[0], 120, "ACDC", "Rock", recitalBandasDeSoporte, false),
			new RecitalTicket("ACDC - Tour History", fechas[0], 120, "ACDC", "Rock", recitalBandasDeSoporte, true),
			// Teatro
			new TheatreTicket("Los Auténticos", fechas[1], 136, "Comedia", teatroActoresPrincipales)
		};
		
		for(Ticket ticket : tickets) 
			System.out.println(ticket);
		
	}
	
	public static Date getDateOf(int year, int month, int day, int hours, int minutes) {
		return Date.from(
				LocalDate
					.of(year, month, day)
					.atTime(LocalTime.of(hours, minutes))
					.atZone(ZoneId.systemDefault())
					.toInstant()
				);
	}

}
