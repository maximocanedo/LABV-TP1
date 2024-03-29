package data.interfaces;

import java.util.List;
import data.eClassification;
import data.eType_Eport;

public interface Ideportes {
	public String getSport_name();

	public void setSport_name(String sport_name);

	public List<String> getEquipment();

	public void setEquipment(List<String> equipment);

	public eType_Eport getType_Eport();

	public void setType_Eport(eType_Eport type_Eport);

	public eClassification getClassification1();

	public void setClassification(eClassification classification);

	public String toString();
}
