package response;

import entities.Titles;
import java.util.List;

public class EnergyResponse {
    private List<Titles> results;

    public List<Titles> getResults() {
        return results;
    }

    public void setResults(List<Titles> results) {
        this.results = results;
    }
}
