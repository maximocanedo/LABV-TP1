package data.interfaces;

import java.util.UUID;

public interface IShowType {

	/**
	 * Devuelve el nombre del tipo de evento.
	 * 
	 * @return nombre del tipo de evento.
	 */
	String getName();

	/**
	 * Devuelve la descripción del tipo de evento.
	 * 
	 * @return descripción del tipo de evento.
	 */
	String getDescription();

	/**
	 * Devuelve el ID único del registro.
	 * 
	 * @return el ID del registro.
	 */
	UUID getID();

}