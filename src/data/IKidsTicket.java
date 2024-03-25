package data;

import java.util.Date;

import data.Ticket.ShowType;

public interface IKidsTicket {

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

	int getAge();

	void setAge(int age);

	boolean hasSouvenirs();

	void setSouvenirAvailability(boolean hasSouvenirs);

}