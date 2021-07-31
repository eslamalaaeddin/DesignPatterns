package DataAccessObjectPattern;

import java.util.List;

public interface DataAccessObject {

    //CRUD operations
    List<Developer> getAllDevelopers();

    Developer getDeveloper(int developerId);

    void insertDeveloper(Developer developer);

    void updateDeveloper(Developer developer);

    void deleteDeveloper(Developer developer);

}
