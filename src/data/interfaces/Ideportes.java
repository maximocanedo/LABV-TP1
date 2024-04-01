package data.interfaces;

import java.util.List;
import data.eClassification;
import data.eType_Esport;

public interface Ideportes {
	public List<String> getEquipment();
	public void setEquipment(List<String> equipment);
	public eType_Esport getType_Eport();
	public void setType_Eport(eType_Esport type_Eport);
	public eClassification getClassification1();
	public void setClassification(eClassification classification);
	public String toString();
}
