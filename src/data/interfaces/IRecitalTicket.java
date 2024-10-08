package data.interfaces;

import java.util.List;

public interface IRecitalTicket {

	String getBand();

	void setBand(String band);

	String getGenre();

	void setGenre(String genre);

	List<String> getSupportBands();

	void setSupportBands(List<String> supportBands);
}
