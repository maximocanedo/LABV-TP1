package data;

import java.util.Date;
import java.util.List;

import data.interfaces.ITeatro;

public class Teatro extends Ticket implements ITeatro {
	private String genre;
	private String[] mainActors = new String[3];

	public Teatro(String name, Date date, int duration, double fee, String genre, String[] mainActors) {
		super(name, ShowType.THEATRE, date, duration, fee);
		this.genre = genre;
		this.mainActors = mainActors;
		updateFee();
	}

	@Override
	public String getGenre() {
		return genre;
	}

	@Override
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String[] getMainActors() {
		return mainActors;
	}

	@Override
	public void setMainActors(String[] mainActors) {
		this.mainActors = mainActors;
	}

	@Override
	public String toString() {
		String mainActorsString = String.join(", ", mainActors);
		String[] additionalLines = { "Género: " + genre, "Actores Principales: " + mainActorsString };
		return super.toString(additionalLines);
	}

	@Override
	public void updateFee() {
		setFee(1350.5);
	}
}
