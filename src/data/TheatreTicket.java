package data;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TheatreTicket extends Ticket implements ITheatreTicket {
	
	public static enum Genre {
		DRAMA,
		THEATRE,
		COMEDY
	}
	public final double GENERAL_COST = 1350.50;
	
	// Inherited properties
	private double entranceFee;
	private String showName;
	private Date showDate;
	private String showStartTime;
	private double estimatedDuration;
	
	private Genre genre;
	private String[] actors;

	public TheatreTicket(String showName, Date showDate, String showStartTime, double estimatedDuration, Genre genre, String[] actors) {
		this.setShowName(showName);
		this.setShowDate(showDate);
		this.setShowStartTime(showStartTime);
		this.setEstimatedDuration(estimatedDuration);
		this.setGenre(genre);
		this.setActors(actors);
		this.updateEntranceFee();
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#updateEntranceFee()
	 */
	@Override
	public void updateEntranceFee() {
		this.entranceFee = this.GENERAL_COST;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#toString()
	 */
	@Override
	public String toString() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ROOT);
		String formal = "···· Entrada para show\n";
		String actors = "";
		for(String actorName: this.actors) {
			actors += "\n· * " + actorName;
		}
		String[] lines = new String[] {
			"ID: " + this.getID(),
			"Tipo: Teatro",
			"Nombre: " + this.showName,
			"Fecha: " + df.format(this.showDate) + " " + this.showStartTime,
			"Duración estimada: " + this.estimatedDuration + " min",
			"Costo: $" + this.getEntranceFee(),
			"Género: " + this.genre,
			"Actores: " + actors
		};
		for(String line: lines) {
			formal += "· " + line + "\n";
		}
		formal += "············";
		return formal;		
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#getShowName()
	 */
	@Override
	public String getShowName() {
		return this.showName;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#getShowDate()
	 */
	@Override
	public Date getShowDate() {
		return this.showDate;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#getShowType()
	 */
	@Override
	public ShowType getShowType() {
		return ShowType.THEATRE;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#getStartTime()
	 */
	@Override
	public String getStartTime() {
		return this.showStartTime;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#getEstimatedDuration()
	 */
	@Override
	public double getEstimatedDuration() {
		return this.estimatedDuration;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#getEntranceFee()
	 */
	@Override
	public double getEntranceFee() {
		return this.entranceFee;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#setShowName(java.lang.String)
	 */
	@Override
	public void setShowName(String showName) {
		this.showName = showName;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#setShowDate(java.util.Date)
	 */
	@Override
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#setShowStartTime(java.lang.String)
	 */
	@Override
	public void setShowStartTime(String startTime) {
		this.showStartTime = startTime;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#setEstimatedDuration(double)
	 */
	@Override
	public void setEstimatedDuration(double estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}
	
	/* (non-Javadoc)
	 * @see data.ITheatreTicket#getGenre()
	 */
	@Override
	public Genre getGenre() {
		return genre;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#setGenre(data.TheatreTicket.Genre)
	 */
	@Override
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#getActors()
	 */
	@Override
	public String[] getActors() {
		return actors;
	}

	/* (non-Javadoc)
	 * @see data.ITheatreTicket#setActors(java.lang.String[])
	 */
	@Override
	public void setActors(String[] actors) {
		this.actors = actors;
	}

}
