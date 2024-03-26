package data;

import java.util.Date;
import java.util.List;

import data.interfaces.IRecital;
/*  Clase Recital que representa a Ticket de tipo Recital
 *  @author pato
 */
public class Recital extends Ticket implements IRecital {

    private String band;
    private String genre;
    private List<String> supportBands;

    public Recital(String name, Date date, int duration, double fee, String band, String genre, List<String> supportBands) {
        super(name, ShowType.RECITAL, date, duration, fee);
        this.band = band;
        this.genre = genre;
        this.supportBands = supportBands;
    }

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
        String supportBandsString = String.join(", ", supportBands);
        String[] additionalLines = {
                "Banda: " + band,
                "Género: " + genre,
                "Banda/s de soporte: " + supportBandsString
        };
        return super.toString(additionalLines);
    }
}
