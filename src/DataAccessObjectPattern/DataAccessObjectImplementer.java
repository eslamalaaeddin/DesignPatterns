package DataAccessObjectPattern;

import java.util.List;

public class DataAccessObjectImplementer implements DataAccessObject {
    private DataSource dataSource;

    public DataAccessObjectImplementer(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Developer> getAllDevelopers() {
        return dataSource.getDevelopers();
    }

    @Override
    public Developer getDeveloper(int developerId) {
        Developer reqDeveloper = null;

        for (Developer developer : dataSource.developers){
            if (developerId == developer.getId()){
                reqDeveloper = developer;

            }
        }
        return reqDeveloper;
    }

    @Override
    public void insertDeveloper(Developer developer) {
        dataSource.getDevelopers().add(developer);
    }

    @Override
    public void updateDeveloper(Developer developer) {
       for (int i = 0 ; i< dataSource.getDevelopers().size(); i++){
           if (developer.getName().equals(dataSource.getDevelopers().get(i).getName())){
               dataSource.getDevelopers().set(i,developer);

           }
       }
    }

    @Override
    public void deleteDeveloper(Developer developer) {
        for (int i = 0 ; i< dataSource.getDevelopers().size(); i++){
            if (developer.getId() == dataSource.getDevelopers().get(i).getId()){
                dataSource.getDevelopers().remove(developer);
            }
        }
    }
}
