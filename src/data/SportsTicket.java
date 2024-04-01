package data;

import java.util.Date;
import java.util.List;

import data.interfaces.IShowType;
import data.interfaces.ISportsTicket;
import lang.Messages;

public class SportsTicket extends Ticket implements ISportsTicket {

	private String sportName;
	private List<String> equipment;
	private Sport sport;
	private SportClassification classification;

	public SportsTicket(String name, IShowType type, Date date, int duration, String sport_name,
			List<String> equipment, Sport type_Eport, SportClassification classification) {
		super(name, type, date, duration);
		this.sportName = sport_name;
		this.equipment.addAll(equipment);
		this.sport = type_Eport;
		this.classification = classification;
		this.updateFee();
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public List<String> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<String> e) {
		this.equipment.addAll(e);
	}

	public Sport getSport() {
		return this.sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public SportClassification getClassification1() {
		return classification;
	}

	public void setClassification(SportClassification classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		String equipment = "\n"; //$NON-NLS-1$
		for (String eq : this.getEquipment()) {
			equipment += " * " + eq; //$NON-NLS-1$
		}
		return super.toString(new String[] { 
				Messages.getString("deportes.Sport") + this.getSportName(), //$NON-NLS-1$
				Messages.getString("deportes.Team") + equipment, //$NON-NLS-1$
				Messages.getString("deportes.Classification") + this.getClassification1(), //$NON-NLS-1$
				Messages.getString("deportes.SportType") + this.getSport().name() //$NON-NLS-1$
		});
	}

	public void updateFee() {
		// TODO Auto-generated method stub
		double free = 0;
		switch (this.sport) {
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
		if (classification == SportClassification.internacional) {
			setFee(free + (free * 0.3));
		} else if (classification == SportClassification.nacional) {
			setFee(free);
		}
	}
}
