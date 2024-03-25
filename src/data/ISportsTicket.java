package data;

import java.util.Date;

import data.SportsTicket.Type;
import data.Ticket.ShowType;

public interface ISportsTicket {

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

	Type getType();

	void setType(Type type);

	boolean isInternational();

	void setInternational(boolean isInternational);

}