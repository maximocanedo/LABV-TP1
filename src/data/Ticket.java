package data;

import java.util.Date;
import java.util.UUID;

public abstract class Ticket {
	
	public static enum ShowType {
		RECITAL,
		THEATER,
		FOR_KIDS,
		SPORTS
	}
	
	private UUID _id;
	
	protected Ticket() {
		this._id = UUID.randomUUID();
	}
	
	public UUID getID() {
		return _id;
	}
	
	public abstract void updateEntranceFee();
	public abstract String toString();
	/** GETTERS **/
	public abstract String getShowName();
	public abstract Date getShowDate();
	public abstract ShowType getShowType();
	public abstract String getStartTime();
	public abstract double getEstimatedDuration();
	public abstract double getEntranceFee();
	/** SETTERS **/
	public abstract void setShowName(String showName);
	public abstract void setShowDate(Date showDate);
	public abstract void setShowStartTime(String startTime);
	public abstract void setEstimatedDuration(double estimatedDuration);
}
