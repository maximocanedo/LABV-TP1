package data;

import java.util.Date;
import java.util.List;

import data.interfaces.IShowType;
import data.interfaces.Ideportes;

public class deportes extends Ticket implements Ideportes {

private List<String> Equipment;
private eType_Esport eType_Esport;

public deportes(String name, IShowType type, Date date, int duration, double fee, List<String> equipment, eType_Esport eType_Esport, eClassification classification) {
	super(name,type,date,duration,fee);
	this.Equipment = equipment;
	this.eType_Esport = eType_Esport;
}

public List<String> getEquipment() {
	return Equipment;
}
public void setEquipment(List<String> equipment) {
	Equipment = equipment;
}

public eType_Esport getType_Eport() {
	return eType_Esport;
}
public void setType_Eport(eType_Esport eType_Esport) {
	this.eType_Esport = eType_Esport;
}
public eClassification getClassification1() {
	return classification;
}
public void setClassification(eClassification classification) {
	this.classification = classification;
}
@Override
public String toString() {
	return "Equipo:" + Equipment +"clasificacion:"+ classification + "Tipo de deporte:" + eType_Esport;
}

public void updateFee() {
	// TODO Auto-generated method stub
	double free=0;
	switch (this.eType_Esport) {
    case futbol:
    	free= 300;
        break;
    case rugby:
    	free= 450;
        break;
    case hockey:
    	free= 390;
        break;
}
	if(classification == eClassification.internacional) {
		setFee(free+(free*0.3));
	}
	else if(classification == eClassification.nacional) {
		setFee(free);
	}
	}
}
