package data;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class SportsTicket extends Ticket implements ISportsTicket {
	
	public static enum Type {
		SOCCER,
		RUGBY,
		HOCKEY
	}
	
	private final double PRICE_SOCCER = 300;
	private final double PRICE_RUGBY = 450;
	private final double PRICE_HOCKEY = 380;
	
	private final double INTERNATIONAL_CHARGE = 0.3;

	// Inherited properties
	private double entranceFee;
	private String showName;
	private Date showDate;
	private String showStartTime;
	private double estimatedDuration;
	
	private Type type;
	private boolean isInternational;

	public SportsTicket(String showName, Date showDate, String showStartTime, double estimatedDuration, Type type, boolean isInternational) {
		this.setShowName(showName);
		this.setShowDate(showDate);
		this.setShowStartTime(showStartTime);
		this.setEstimatedDuration(estimatedDuration);
		this.setType(type);
		this.setInternational(isInternational);
		this.updateEntranceFee();
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#updateEntranceFee()
	 */
	@Override
	public void updateEntranceFee() {
		double price = 0;
		if(this.type == Type.SOCCER) price = this.PRICE_SOCCER;
		if(this.type == Type.RUGBY) price = this.PRICE_RUGBY;
		if(this.type == Type.HOCKEY) price = this.PRICE_HOCKEY;
		if(this.isInternational) price += price * this.INTERNATIONAL_CHARGE;
		this.entranceFee = price;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#toString()
	 */
	@Override
	public String toString() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ROOT);
		String formal = "···· Entrada para show\n";
		String[] lines = new String[] {
			"ID: " + this.getID(),
			"Tipo: Deportivo",
			"Nombre: " + this.showName,
			"Fecha: " + df.format(this.showDate) + " " + this.showStartTime,
			"Duración estimada: " + this.estimatedDuration + " min",
			"Costo: $" + this.getEntranceFee(),
			"Deporte: " + this.type,
			"Evento " + (this.isInternational ? "INTERNACIONAL" : "NACIONAL")
		};
		for(String line: lines) {
			formal += "· " + line + "\n";
		}
		formal += "············";
		return formal;		
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#getShowName()
	 */
	@Override
	public String getShowName() {
		return this.showName;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#getShowDate()
	 */
	@Override
	public Date getShowDate() {
		return this.showDate;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#getShowType()
	 */
	@Override
	public ShowType getShowType() {
		return ShowType.SPORTS;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#getStartTime()
	 */
	@Override
	public String getStartTime() {
		return this.showStartTime;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#getEstimatedDuration()
	 */
	@Override
	public double getEstimatedDuration() {
		return this.estimatedDuration;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#getEntranceFee()
	 */
	@Override
	public double getEntranceFee() {
		return this.entranceFee;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#setShowName(java.lang.String)
	 */
	@Override
	public void setShowName(String showName) {
		this.showName = showName;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#setShowDate(java.util.Date)
	 */
	@Override
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#setShowStartTime(java.lang.String)
	 */
	@Override
	public void setShowStartTime(String startTime) {
		this.showStartTime = startTime;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#setEstimatedDuration(double)
	 */
	@Override
	public void setEstimatedDuration(double estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#getType()
	 */
	@Override
	public Type getType() {
		return type;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#setType(data.SportsTicket.Type)
	 */
	@Override
	public void setType(Type type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#isInternational()
	 */
	@Override
	public boolean isInternational() {
		return isInternational;
	}

	/* (non-Javadoc)
	 * @see data.ISportsTicket#setInternational(boolean)
	 */
	@Override
	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}

	
}
