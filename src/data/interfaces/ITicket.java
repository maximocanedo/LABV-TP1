package data.interfaces;

import java.util.Date;
import java.util.UUID;

public interface ITicket {

	/**
	 * M�todo TOSTRING FINAL.
	 * Este es el m�todo que se debe desarrollar en cada clase que herede de esta. 
	 * Sugiero que llamen a super.toString(String[]) con las l�neas adicionales que deseen agregar que sean propias de su clase.
	 */
	String toString();

	/**
	 * Devuelve el nombre del espect�culo.
	 * @return the name
	 */
	String getName();

	/**
	 * Establecer el nombre del espect�culo.
	 * @param name the name to set
	 */
	void setName(String name);

	/**
	 * Devuelve el tipo de espect�culo.
	 * @return the type
	 */
	IShowType getType();

	/**
	 * Establecer el tipo de espect�culo.
	 * @param type the type to set
	 */
	void setType(IShowType type);

	/**
	 * Devuelve la fecha y hora de inicio del espect�culo.
	 * @return the date
	 */
	Date getDate();

	/**
	 * Establecer la fecha y la hora de inicio del espect�culo.
	 * @param date the date to set
	 */
	void setDate(Date date);

	/**
	 * Devuelve la duraci�n, en minutos, del espect�culo.
	 * @return the duration
	 */
	int getDuration();

	/**
	 * Establecer la duraci�n aproximada del evento.
	 * @param duration the duration to set
	 */
	void setDuration(int duration);

	/**
	 * Devuelve el valor de la entrada.
	 * @return the fee
	 */
	double getFee();

	/**
	 * Devuelve el ID de la entrada.
	 * @return the _id
	 */
	UUID getID();

}