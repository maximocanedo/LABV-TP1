package main;
import java.util.Date;

import data.*;

public class Main {
	public static void main(String[] args) {
		Ticket[] meineTickets = new Ticket[] {
			new RecitalTicket("The Magic Flute", new Date(), "19:00", 120, true, 2, RecitalTicket.Genre.REGGAETON),
			new TheatreTicket("Barbero de Sevilla", new Date(), "20:00", 120, TheatreTicket.Genre.THEATRE, new String[] {"Alejandro Figueroa"}),
			new KidsTicket("La vaca Lola: El musical", new Date(), "16:30", 30, 42, true),
			new SportsTicket("Partido internacional genérico", new Date(), "09:00", 420, SportsTicket.Type.SOCCER, true)
		};
		System.out.println("Trabajo Práctico N.º 1 · Laboratorio de Computación IV");
		System.out.println("Resolución individual de Máximo Canedo.");
		System.out.println("");
		for(Ticket ticket: meineTickets) {
			System.out.println(ticket);
		}
	}

}
