package DataAccessObjectPattern;

import java.util.List;

public class DataSource {

    public List<Developer> developers;

    public DataSource(List<Developer> developersDatabase) {
        this.developers = developersDatabase;
    }

    public  List<Developer> getDevelopers() {
        return developers;
    }

    public  void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
