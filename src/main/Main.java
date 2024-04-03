package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import data.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Trabajo Práctico N.º 1 · Laboratorio de Computación IV");
		System.out.println("Grupo N.º 3");
		
		ArrayList<String> recitalBandasDeSoporte = new ArrayList<String>(Arrays.asList("Guns & Roses", "The Clash"));
		ArrayList<String> equipment = new ArrayList<String>(Arrays.asList("Equipo 1", "Equipo 2"));
		String[] teatroActoresPrincipales = new String[] { "Leonardo Di Caprio", "Johnny Deep", "Diego Pereti" };
		String[] bosActors = new String[] { "Actor 1", "Actor 2", "Actriz 1", "Actriz 2" };
		
		Date[] fechas = new Date[] {
			getDateOf(2024, 5, 5, 18, 0),
			getDateOf(2024, 12, 6, 18, 0),
			getDateOf(2024, 9, 16, 16, 0),
			getDateOf(2024, 6, 20, 19, 0),
			getDateOf(2024, 9, 5, 10, 0),
			getDateOf(2025, 10, 10, 10, 0),
			getDateOf(2026, 10, 10, 10, 0),
			getDateOf(2027, 10, 10, 10, 0)
		};
	
		Ticket[] tickets = new Ticket[] {
			// Entradas para recitales. No VIP y VIP.
			new RecitalTicket("ACDC - Tour History", fechas[0], 120, "ACDC", "Rock", recitalBandasDeSoporte, false),
			new RecitalTicket("ACDC - Tour History", fechas[0], 120, "ACDC", "Rock", recitalBandasDeSoporte, true),
			// Teatro
			new TheatreTicket("Los Auténticos", fechas[1], 136, "Comedia", teatroActoresPrincipales),
			new TheatreTicket("Barber of Seville", fechas[2], 195, "Opera", bosActors),
			// Eventos infantiles
			new KidsTicket("PARQUE DE LOS NIÑOS - LA PLATA", fechas[2], 300, 6, Kids.lleva_souvenir),
			new KidsTicket("TECNOPOLIS - ALGO PARA RECORDAR", fechas[3] , 60, 9),
			new KidsTicket("COCINA COMO MAMI EN CASA - NIÑOS/AS COLEGIO SAN ESTEBAN", fechas[4], 30, 5),
			// Eventos deportivos
			new SportsTicket("Fútbol internacional", fechas[5], 120, "Deporte", equipment, Sport.futbol, SportClassification.internacional),
			new SportsTicket("Rugby internacional", fechas[6], 120, "Deporte", equipment, Sport.rugby, SportClassification.internacional),
			new SportsTicket("Hockey internacional", fechas[7], 120, "Deporte", equipment, Sport.hockey, SportClassification.internacional),
			new SportsTicket("Fútbol nacional", fechas[5], 120, "Deporte", equipment, Sport.futbol, SportClassification.nacional),
			new SportsTicket("Rugby nacional", fechas[6], 120, "Deporte", equipment, Sport.rugby, SportClassification.nacional),
			new SportsTicket("Hockey nacional", fechas[7], 120, "Deporte", equipment, Sport.hockey, SportClassification.nacional)
			// 
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
