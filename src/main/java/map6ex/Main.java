package map6ex;

import java.util.*;

/*  6. Create a Map where the key will be the employee and the value - his manager.
        a. The key and value are of the String type
        b. The key and value are classes of type "Employee" and "Manager"
        c. * The key is of type "Manager", the value is a list storing the type "Employee"
        d. * Let the employee be dismissed, display the result
        e. * Allow to employ a new employee, display the result
 */

public class Main {
    private static Map<Manager, List<Employee>> managerAndEmployeesMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createMapOfStrings();
        createEmployeeAndManagerMap();
        createManagerAndListOfEmployeesMap();
        dismissEmployeeAndDisplayResult();
        employEmployeeAndDisplayResult();
    }

    private static void createMapOfStrings() {
        System.out.print(Color.PURPLE);
        System.out.println("a. The key and value are of the String type");
        System.out.print(Color.RESET);
        Map<String, String> stringsMap = new HashMap<>();
        stringsMap.put("Employee", "Manager");
        System.out.println(stringsMap.entrySet());
        System.out.println();
    }

    private static void createEmployeeAndManagerMap() {
        System.out.print(Color.PURPLE);
        System.out.println("b. The key and value are classes of type \"Employee\" and \"Manager\"");
        System.out.print(Color.RESET);
        Map<Employee, Manager> employeeAndManagerMap = new HashMap<>();
        Employee employee = new Employee("John", "Smith", 123456789, 30);
        Manager manager = new Manager("Andy Martin", 10, "retail");
        employeeAndManagerMap.put(employee, manager);
        for (Map.Entry<Employee, Manager> entry : employeeAndManagerMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println();
    }

    private static void createManagerAndListOfEmployeesMap() {
        System.out.print(Color.PURPLE);
        System.out.println("c. * The key is of type \"Manager\", the value is a list storing the type \"Employee\"");
        System.out.print(Color.RESET);
        Manager manager1 = new Manager("Mark Twain", 15, "car sales");
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Tom", "Cruise", 987654321, 40);
        Employee employee2 = new Employee("Bob", "Marley", 456456456, 45);
        Employee employee3 = new Employee("Jenifer", "Lopez", 919191919, 35);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        managerAndEmployeesMap.put(manager1, employeeList);
        printManagerAndListOfEmployees();
    }

    private static void dismissEmployeeAndDisplayResult() {
        System.out.print(Color.PURPLE);
        System.out.println("d. * Let the employee be dismissed, display the result");
        System.out.print(Color.RESET);
        System.out.println("Write the ssn of the employee you want to dismiss.");
        System.out.print("SSN: ");
        int ssn = scanner.nextInt();
        for (List<Employee> employeeList : managerAndEmployeesMap.values()) {
            for (Employee employee : employeeList) {
                if (employee.getSsn() == ssn) {
                    employeeList.remove(employee);
                    printManagerAndListOfEmployees();
                    break;
                }
            }
        }
    }

    private static void employEmployeeAndDisplayResult() {
        System.out.println("NEW EMPLOYEE");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Surname: ");
        String surname = scanner.next();
        System.out.print("SSN: ");
        int ssnNew = scanner.nextInt();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        Employee newEmployee = new Employee(name, surname, ssnNew, age);
        for (List<Employee> employeeListOld : managerAndEmployeesMap.values()) {
            employeeListOld.add(newEmployee);
        }
        for (Map.Entry<Manager, List<Employee>> entry : managerAndEmployeesMap.entrySet()) {
            System.out.println(entry.getKey());
            for (Employee employeeNew : entry.getValue()) {
                System.out.println(employeeNew);
            }
        }
    }

    private static void printManagerAndListOfEmployees() {
        for (Map.Entry<Manager, List<Employee>> entry : managerAndEmployeesMap.entrySet()) {
            System.out.println(entry.getKey());
            int count = 0;
            for (Employee employee : entry.getValue()) {
                System.out.println(++count + ". " + employee);
            }
        }
        System.out.println();
    }
}
