package data.interfaces;

import java.util.List;

public interface ITeatro {
	
    String getGenre();

    void setGenre(String genre);

    List<String> getMainActors();

    void setMainActors(List<String> mainActors);
}
