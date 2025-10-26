import com.tnsif.firstassignment.employees.Developer;
import com.tnsif.firstassignment.employees.Manager;
import com.tnsif.firstassignment.utilities.EmployeeUtilities;


public class AssignmentMain {

  
    public static void main(String[] args) {
        
        Manager manager = new Manager("Alice", 101, 90000, "Engineering");

        
        Developer developer = new Developer("Bob", 202, 75000, "Java");

        System.out.println("Initial Employee Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        System.out.println("\nPerforming Salary Updates...");
        EmployeeUtilities.giveRaise(manager, 10); // 10% raise
        EmployeeUtilities.giveRaise(developer, 15); // 15% raise

        System.out.println("\nUpdated Employee Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}