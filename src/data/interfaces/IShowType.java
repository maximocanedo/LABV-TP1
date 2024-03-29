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
	 * Devuelve la descripci�n del tipo de evento.
	 * 
	 * @return descripci�n del tipo de evento.
	 */
	String getDescription();

	/**
	 * Devuelve el ID �nico del registro.
	 * 
	 * @return el ID del registro.
	 */
	UUID getID();

}