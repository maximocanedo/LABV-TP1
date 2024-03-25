package main;
import java.util.Date;

import data.*;
import data.RecitalTicket.Genre;

public class Main {

	public static void main(String[] args) {
		Ticket recital1 = new RecitalTicket("The Magic Flute", new Date(), "19:00", 120, true, 2, Genre.REGGAETON);
		System.out.println("Trabajo Práctico N.º 1 · Laboratorio de Computación IV");
		System.out.println("----");
		System.out.println(recital1.toString());
	}

}
