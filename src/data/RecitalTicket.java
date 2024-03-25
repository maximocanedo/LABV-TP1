package data;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class RecitalTicket extends Ticket implements IRecitalTicket {
	
	public static enum Genre {
		ROCK,
		HEAVY_METAL,
		REGGAETON,
		TRAP,
		LATINOS,
		POP
	}
	
	public final double VIP_COST = 1500;
	public final double GENERAL_COST = 800;
	
	// Inherited properties
	private double entranceFee;
	private String showName;
	private Date showDate;
	private String showStartTime;
	private double estimatedDuration;
	// 
	private boolean isVIP;
	private int supportBands;
	private Genre genre;
	
	
	

	public RecitalTicket(String showName, Date showDate, String showStartTime, double estimatedDuration, boolean isVIP, int supportBands, Genre genre) {
		this.entranceFee = this.GENERAL_COST;
		this.showName = showName;
		this.showDate = showDate;
		this.showStartTime = showStartTime;
		this.estimatedDuration = estimatedDuration; // 2 horas.		
		
		this.isVIP = isVIP;
		this.supportBands = supportBands;
		this.genre = genre;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#updateEntranceFee()
	 */
	@Override
	public void updateEntranceFee() {
		this.entranceFee = isVIP ? VIP_COST : GENERAL_COST;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#toString()
	 */
	@Override
	public String toString() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ROOT);
		String formal = "···· Entrada para show\n";
		String[] lines = new String[] {
			"ID: " + this.getID(),
			"Tipo: Recital",
			"Nombre: " + this.showName,
			"Fecha: " + df.format(this.showDate) + " " + this.showStartTime,
			"Duración estimada: " + this.estimatedDuration + " min",
			"Costo: $" + this.getEntranceFee(),
			"Género: " + this.genre,
			"Bandas de soporte: " + this.supportBands,
			"Es entrada VIP: " + (this.isVIP ? "SÍ" : "NO")
		};
		for(String line: lines) {
			formal += "· " + line + "\n";
		}
		formal += "············";
		return formal;		
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#getShowName()
	 */
	@Override
	public String getShowName() {
		return this.showName;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#getShowDate()
	 */
	@Override
	public Date getShowDate() {
		return this.showDate;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#getStartTime()
	 */
	@Override
	public String getStartTime() {
		return this.showStartTime;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#getEstimatedDuration()
	 */
	@Override
	public double getEstimatedDuration() {
		return this.estimatedDuration;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#getEntranceFee()
	 */
	@Override
	public double getEntranceFee() {
		this.updateEntranceFee();
		return this.entranceFee;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#setShowName(java.lang.String)
	 */
	@Override
	public void setShowName(String showName) {
		this.showName = showName;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#setShowDate(java.util.Date)
	 */
	@Override
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#setShowStartTime(java.lang.String)
	 */
	@Override
	public void setShowStartTime(String startTime) {
		this.showStartTime = startTime;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#setEstimatedDuration(double)
	 */
	@Override
	public void setEstimatedDuration(double estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#getShowType()
	 */
	@Override
	public ShowType getShowType() {
		return ShowType.RECITAL;
	}

	
	/* (non-Javadoc)
	 * @see data.IRecitalTicket#isVIP()
	 */
	@Override
	public boolean isVIP() {
		return isVIP;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#setVIP(boolean)
	 */
	@Override
	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
		updateEntranceFee();
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#getSupportBands()
	 */
	@Override
	public int getSupportBands() {
		return supportBands;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#setSupportBands(int)
	 */
	@Override
	public void setSupportBands(int supportBands) {
		this.supportBands = supportBands;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#getGenre()
	 */
	@Override
	public Genre getGenre() {
		return genre;
	}

	/* (non-Javadoc)
	 * @see data.IRecitalTicket#setGenre(data.RecitalTicket.Genre)
	 */
	@Override
	public void setGenre(Genre genre) {
		this.genre = genre;
	}


}
