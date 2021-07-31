package CompositePattern;

import CompositePattern.composite.CompanyDirectory;
import CompositePattern.leaf.Developer;
import CompositePattern.leaf.Manager;

public class Demo {
    public static void main (String[] args)
    {
        Developer dev1 = new Developer(100, "Islam Alaa", "Pro Developer");
        Developer dev2 = new Developer(101, "Mahmoud sanad", "Developer");

        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Abdo Ali", "SEO Manager");
        Manager man2 = new Manager(201, "Amr Mahmoud ", "Product Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}
