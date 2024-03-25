package data;

import java.util.Date;

import data.RecitalTicket.Genre;
import data.Ticket.ShowType;

public interface IRecitalTicket {

	void updateEntranceFee();

	String toString();

	String getShowName();

	Date getShowDate();

	String getStartTime();

	double getEstimatedDuration();

	double getEntranceFee();

	void setShowName(String showName);

	void setShowDate(Date showDate);

	void setShowStartTime(String startTime);

	void setEstimatedDuration(double estimatedDuration);

	ShowType getShowType();

	boolean isVIP();

	void setVIP(boolean isVIP);

	int getSupportBands();

	void setSupportBands(int supportBands);

	Genre getGenre();

	void setGenre(Genre genre);

}