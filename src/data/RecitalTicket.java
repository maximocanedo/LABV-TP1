package data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class RecitalTicket extends Ticket {
	
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

	@Override
	public void updateEntranceFee() {
		this.entranceFee = isVIP ? VIP_COST : GENERAL_COST;
	}

	@Override
	public String toString() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ROOT);
		
		String firstLine = "·· Entrada para show";
		String idLine = "ID: " + this.getID();
		String secondLine = "Tipo: Recital";
		String thirdLine = "Nombre: " + this.showName;
		String fourthLine = "Fecha: " + df.format(this.showDate) + " " + this.showStartTime;
		String fifthLine = "Duración estimada: " + this.estimatedDuration + " min";
		String sixthLine = "Costo: $" + this.getEntranceFee();
		String seventhLine = "Género: " + this.genre;
		String eighthLine = "Bandas de soporte: " + this.supportBands;
		String ninethLine = "Es entrada VIP: " + (this.isVIP ? "SÍ" : "NO");
		String lastLine = "····";
		
		String[] e = new String[] { idLine, secondLine, thirdLine, fourthLine, fifthLine, sixthLine, seventhLine, eighthLine, ninethLine };
		String fin = "··" + firstLine + "\n";
		for(int i = 0; i < e.length; i++) {
			fin += "· " + e[i] + "\n";
		}
		fin += lastLine;
		return fin;		
	}

	@Override
	public String getShowName() {
		return this.showName;
	}

	@Override
	public Date getShowDate() {
		return this.showDate;
	}

	@Override
	public String getStartTime() {
		return this.showStartTime;
	}

	@Override
	public double getEstimatedDuration() {
		return this.estimatedDuration;
	}

	@Override
	public double getEntranceFee() {
		this.updateEntranceFee();
		return this.entranceFee;
	}

	@Override
	public void setShowName(String showName) {
		this.showName = showName;
	}

	@Override
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	@Override
	public void setShowStartTime(String startTime) {
		this.showStartTime = startTime;
	}

	@Override
	public void setEstimatedDuration(double estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}

	@Override
	public ShowType getShowType() {
		return ShowType.RECITAL;
	}

	
	public boolean isVIP() {
		return isVIP;
	}

	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
		updateEntranceFee();
	}

	public int getSupportBands() {
		return supportBands;
	}

	public void setSupportBands(int supportBands) {
		this.supportBands = supportBands;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}


}
