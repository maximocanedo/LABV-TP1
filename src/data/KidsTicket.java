package data;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import data.Ticket.ShowType;

public class KidsTicket extends Ticket implements IKidsTicket {

	public final double OLDER_COST = 500;
	public final double YOUNGER_COST = 250;
	
	// Inherited properties
	private double entranceFee;
	private String showName;
	private Date showDate;
	private String showStartTime;
	private double estimatedDuration;
	private int age;
	private boolean hasSouvenirs;
	
	public KidsTicket(String showName, Date showDate, String showStartTime, double estimatedDuration, int age, boolean hasSouvenirs) {
		this.setShowName(showName);
		this.setShowDate(showDate);
		this.setShowStartTime(showStartTime);
		this.setEstimatedDuration(estimatedDuration);
		this.setAge(age);
		this.setSouvenirAvailability(hasSouvenirs);
		this.updateEntranceFee();
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#updateEntranceFee()
	 */
	@Override
	public void updateEntranceFee() {
		this.entranceFee = this.age >= 8 ? this.OLDER_COST : this.YOUNGER_COST;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#toString()
	 */
	@Override
	public String toString() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ROOT);
		String formal = "···· Entrada para show\n";
		String[] lines = new String[] {
			"ID: " + this.getID(),
			"Tipo: Infantil",
			"Nombre: " + this.showName,
			"Fecha: " + df.format(this.showDate) + " " + this.showStartTime,
			"Duración estimada: " + this.estimatedDuration + " min",
			"Costo: $" + this.getEntranceFee(),
			"Edad del niño: " + this.age,
			"Con souvenir: " + (this.hasSouvenirs ? "SÍ" : "NO")
		};
		for(String line: lines) {
			formal += "· " + line + "\n";
		}
		formal += "············";
		return formal;		
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#getShowName()
	 */
	@Override
	public String getShowName() {
		return this.showName;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#getShowDate()
	 */
	@Override
	public Date getShowDate() {
		return this.showDate;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#getShowType()
	 */
	@Override
	public ShowType getShowType() {
		return ShowType.FOR_KIDS;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#getStartTime()
	 */
	@Override
	public String getStartTime() {
		return this.showStartTime;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#getEstimatedDuration()
	 */
	@Override
	public double getEstimatedDuration() {
		return this.estimatedDuration;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#getEntranceFee()
	 */
	@Override
	public double getEntranceFee() {
		return this.entranceFee;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#setShowName(java.lang.String)
	 */
	@Override
	public void setShowName(String showName) {
		this.showName = showName;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#setShowDate(java.util.Date)
	 */
	@Override
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#setShowStartTime(java.lang.String)
	 */
	@Override
	public void setShowStartTime(String startTime) {
		this.showStartTime = startTime;
	}

	/* (non-Javadoc)
	 * @see data.IKidsTicket#setEstimatedDuration(double)
	 */
	@Override
	public void setEstimatedDuration(double estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}
	
	/* (non-Javadoc)
	 * @see data.IKidsTicket#getAge()
	 */
	@Override
	public int getAge() {
		return this.age;
	}
	/* (non-Javadoc)
	 * @see data.IKidsTicket#setAge(int)
	 */
	@Override
	public void setAge(int age) {
		this.age = age;
		this.updateEntranceFee();
	}
	/* (non-Javadoc)
	 * @see data.IKidsTicket#hasSouvenirs()
	 */
	@Override
	public boolean hasSouvenirs() {
		return this.hasSouvenirs;
	}
	/* (non-Javadoc)
	 * @see data.IKidsTicket#setSouvenirAvailability(boolean)
	 */
	@Override
	public void setSouvenirAvailability(boolean hasSouvenirs) {
		this.hasSouvenirs = hasSouvenirs;
	}

}
