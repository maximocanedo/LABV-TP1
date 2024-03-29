package data;

import java.util.Date;
import java.util.List;

import data.interfaces.IShowType;
import data.interfaces.Ideportes;
import lang.Messages;

public class deportes extends Ticket implements Ideportes {

	private String sport_name;
	private List<String> Equipment;
	private eType_Eport Type_Eport;
	private eClassification classification;

	public deportes(String name, IShowType type, Date date, int duration, double fee, String sport_name,
			List<String> equipment, eType_Eport type_Eport, eClassification classification) {
		super(name, type, date, duration, fee);
		this.sport_name = sport_name;
		Equipment = equipment;
		Type_Eport = type_Eport;
		this.classification = classification;
	}

	public String getSport_name() {
		return sport_name;
	}

	public void setSport_name(String sport_name) {
		this.sport_name = sport_name;
	}

	public List<String> getEquipment() {
		return Equipment;
	}

	public void setEquipment(List<String> equipment) {
		Equipment = equipment;
	}

	public eType_Eport getType_Eport() {
		return Type_Eport;
	}

	public void setType_Eport(eType_Eport type_Eport) {
		Type_Eport = type_Eport;
	}

	public eClassification getClassification1() {
		return classification;
	}

	public void setClassification(eClassification classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		String equipment = "\n"; //$NON-NLS-1$
		for (String eq : this.getEquipment()) {
			equipment += " * " + eq; //$NON-NLS-1$
		}
		return super.toString(new String[] { Messages.getString("deportes.Sport") + this.getSport_name(), //$NON-NLS-1$
				Messages.getString("deportes.Team") + equipment, //$NON-NLS-1$
				Messages.getString("deportes.Classification") + this.getClassification1(), //$NON-NLS-1$
				Messages.getString("deportes.SportType") + this.getType_Eport().name() //$NON-NLS-1$
		});
	}

	public void updateFee() {
		// TODO Auto-generated method stub
		double free = 0;
		switch (this.Type_Eport) {
		case futbol:
			free = 300;
			break;
		case rugby:
			free = 450;
			break;
		case hockey:
			free = 390;
			break;
		}
		if (classification == eClassification.internacional) {
			setFee(free + (free * 0.3));
		} else if (classification == eClassification.nacional) {
			setFee(free);
		}
	}
}
