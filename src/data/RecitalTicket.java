package data;

import java.util.Date;
import java.util.List;

import data.interfaces.IRecitalTicket;
import lang.Messages;

/*  Clase Recital que representa a Ticket de tipo Recital
 *  @author pato
 */
public class RecitalTicket extends Ticket implements IRecitalTicket {

	private String band;
	private String genre;
	private List<String> supportBands;
	private Boolean vip;

	@Override
	public String getBand() {
		return band;
	}

	@Override
	public void setBand(String band) {
		this.band = band;
	}

	@Override
	public String getGenre() {
		return genre;
	}

	@Override
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public List<String> getSupportBands() {
		return supportBands;
	}

	@Override
	public void setSupportBands(List<String> supportBands) {
		this.supportBands = supportBands;
	}

	@Override
	public String toString() {
		String supportBandsString = String.join(", ", supportBands); //$NON-NLS-1$
		String[] additionalLines = { 
				Messages.getString("RecitalTicket.Band") + band,  //$NON-NLS-1$
				Messages.getString("RecitalTicket.Genre") + genre, //$NON-NLS-1$
				Messages.getString("RecitalTicket.SupportBands") + supportBandsString }; //$NON-NLS-1$
		return super.toString(additionalLines);
	}

	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public RecitalTicket(String name, Date date, int duration, String band, String genre,
			List<String> supportBands, Boolean vip) {
		super(name, ShowType.RECITAL, date, duration);
		this.band = band;
		this.genre = genre;
		this.supportBands = supportBands;
		this.vip = vip;
		this.updateFee();
	}

	@Override
	public void updateFee() {
		setFee(this.getVip() ? 1500 : 800);
	}
}
