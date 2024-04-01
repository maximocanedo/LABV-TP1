package data.interfaces;

import java.util.List;
import data.SportClassification;
import data.Sport;

public interface ISportsTicket {
	public String getSportName();

	public void setSportName(String sport_name);

	public List<String> getEquipment();

	public void setEquipment(List<String> equipment);

	public Sport getSport();

	public void setSport(Sport type_Eport);

	public SportClassification getClassification1();

	public void setClassification(SportClassification classification);

	public String toString();
}
