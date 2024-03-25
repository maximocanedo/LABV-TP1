package data;

import java.util.Date;

import data.TheatreTicket.Genre;
import data.Ticket.ShowType;

public interface ITheatreTicket {

	void updateEntranceFee();

	String toString();

	String getShowName();

	Date getShowDate();

	ShowType getShowType();

	String getStartTime();

	double getEstimatedDuration();

	double getEntranceFee();

	void setShowName(String showName);

	void setShowDate(Date showDate);

	void setShowStartTime(String startTime);

	void setEstimatedDuration(double estimatedDuration);

	Genre getGenre();

	void setGenre(Genre genre);

	String[] getActors();

	void setActors(String[] actors);

}