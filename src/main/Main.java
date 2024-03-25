package main;
import java.util.Date;

import data.*;

public class Main {
	public static void main(String[] args) {
		Ticket[] meineTickets = new Ticket[] {
			new RecitalTicket("The Magic Flute", new Date(), "19:00", 120, true, 2, RecitalTicket.Genre.REGGAETON),
			new TheatreTicket("Barbero de Sevilla", new Date(), "20:00", 120, TheatreTicket.Genre.THEATRE, new String[] {"Alejandro Figueroa"}),
			new KidsTicket("La vaca Lola: El musical", new Date(), "16:30", 30, 42, true),
			new SportsTicket("Partido internacional gen�rico", new Date(), "09:00", 420, SportsTicket.Type.SOCCER, true)
		};
		System.out.println("Trabajo Pr�ctico N.� 1 � Laboratorio de Computaci�n IV");
		System.out.println("Resoluci�n individual de M�ximo Canedo.");
		System.out.println("");
		for(Ticket ticket: meineTickets) {
			System.out.println(ticket);
		}
	}

}
