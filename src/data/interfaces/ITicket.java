package data.interfaces;

import java.util.Date;
import java.util.UUID;

public interface ITicket {

	/**
	 * Método TOSTRING FINAL.
	 * Este es el método que se debe desarrollar en cada clase que herede de esta. 
	 * Sugiero que llamen a super.toString(String[]) con las líneas adicionales que deseen agregar que sean propias de su clase.
	 */
	String toString();

	/**
	 * Devuelve el nombre del espectáculo.
	 * @return the name
	 */
	String getName();

	/**
	 * Establecer el nombre del espectáculo.
	 * @param name the name to set
	 */
	void setName(String name);

	/**
	 * Devuelve el tipo de espectáculo.
	 * @return the type
	 */
	IShowType getType();

	/**
	 * Establecer el tipo de espectáculo.
	 * @param type the type to set
	 */
	void setType(IShowType type);

	/**
	 * Devuelve la fecha y hora de inicio del espectáculo.
	 * @return the date
	 */
	Date getDate();

	/**
	 * Establecer la fecha y la hora de inicio del espectáculo.
	 * @param date the date to set
	 */
	void setDate(Date date);

	/**
	 * Devuelve la duración, en minutos, del espectáculo.
	 * @return the duration
	 */
	int getDuration();

	/**
	 * Establecer la duración aproximada del evento.
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