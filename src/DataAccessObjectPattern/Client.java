package DataAccessObjectPattern;

import java.util.List;

public class Client {
   private DataAccessObjectImplementer daoImplementer;

    public Client(DataAccessObjectImplementer daoImplementer) {
        this.daoImplementer = daoImplementer;
    }

    void getAndShowAllDevelopers(){
        System.out.println(daoImplementer.getAllDevelopers());
    }

    void getAndShowDeveloperById(int id){
        System.out.println(daoImplementer.getDeveloper(id));
    }

    void insertDeveloper(Developer developer){
        daoImplementer.insertDeveloper(developer);
    }

    void updateDeveloper(Developer developer){
        daoImplementer.updateDeveloper(developer);
    }

    void deleteDeveloper(Developer developer){
        daoImplementer.deleteDeveloper(developer);
    }
}
