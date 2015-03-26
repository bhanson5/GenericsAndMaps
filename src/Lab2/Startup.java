
package Lab2;

import java.util.*;
import common.Employee;
/**
 *
 * @author bhanson5
 */
public class Startup {

    public static void main(String[] args) {
        //int empID, String lastName, String firstName, String ssn
        
        Employee e1 = new Employee(1, "Smith", "Jack", "111-11-1111");
        Employee e2 = new Employee(1, "Smith", "Billy", "111-11-1111");
        Employee e3 = new Employee(1, "Smith", "bob", "211-11-1111");
        Employee e4 = new Employee(1, "Smith", "Ben", "231-11-1111");
        
        Map<String, Employee> employees = new HashMap<String, Employee>();
        employees.put("231-11-1111", e4);
        employees.put("211-11-1111", e3);
        employees.put("111-11-1111", e2);
        employees.put("111-11-1111", e1);
        
        for(String key : employees.keySet()) {
            Employee found = employees.get(key);
            System.out.println(found.toString());
        }
    }
}
