package DataAccessObjectPattern;


import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        //1 Creating some data to be stored in the database
        Developer islam = new Developer("Islam Alaa Eddin",931998);
        Developer amr = new Developer("Amr Mahmoud Sobhy",451998);
        Developer mahmoud = new Developer("Mahmoud Abdou Sanad",3111997);
        Developer abdo = new Developer("Abdulrahman Ali Gaber",441998);

        List<Developer> developers = new ArrayList<>();

        developers.add(islam);
        developers.add(amr);
        developers.add(mahmoud);
        developers.add(abdo);

        //2 Creating database
        DataSource database = new DataSource(developers);

        //3 Creating DAO implementer
        DataAccessObjectImplementer daoImplementer = new DataAccessObjectImplementer(database);

        //4 Creating a client instance
        Client client = new Client(daoImplementer);

        //5 Operations

        //client.getAndShowAllDevelopers();

        //client.getAndShowDeveloperById(amr.getId());
//        client.insertDeveloper(new Developer("Fawzy El haker",101010));
//
//        client.getAndShowAllDevelopers();
//
        client.deleteDeveloper(islam);

        client.getAndShowAllDevelopers();


    }
}
