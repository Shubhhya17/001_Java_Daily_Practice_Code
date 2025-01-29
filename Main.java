// import java.util.*;

// class Employee {
//     int employeeId;
//     String name;
//     String department;
//     double salary;

//     public Employee(int employeeId, String name, String department, double salary) {
//         this.employeeId = employeeId;
//         this.name = name;
//         this.department = department;
//         this.salary = salary;
//     }

//     @Override
//     public String toString() {
//         return "ID: " + employeeId + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
//     }
// }

// public class Main {

//     private static Map<Integer, Employee> employeeMap = new HashMap<>();

//     public static void addEmployee(int id, String name, String dept, double salary) {
//         if (employeeMap.containsKey(id)) {
//             System.out.println("Employee already exists.");
//         } else {
//             employeeMap.put(id, new Employee(id, name, dept, salary));
//             System.out.println("Employee added.");
//         }
//     }

//     public static void updateEmployee(int id, String name, String dept, double salary) {
//         Employee emp = employeeMap.get(id);
//         if (emp != null) {
//             if (name != null) emp.name = name;
//             if (dept != null) emp.department = dept;
//             if (salary >= 0) emp.salary = salary;
//             System.out.println("Employee updated.");
//         } else {
//             System.out.println("Employee not found.");
//         }
//     }

//     public static void deleteEmployee(int id) {
//         if (employeeMap.remove(id) != null) {
//             System.out.println("Employee deleted.");
//         } else {
//             System.out.println("Employee not found.");
//         }
//     }

//     public static void displayAllEmployees() {
//         if (employeeMap.isEmpty()) {
//             System.out.println("No employees.");
//         } else {
//             for (Employee emp : employeeMap.values()) {
//                 System.out.println(emp);
//             }
//         }
//     }

//     public static void searchEmployee(int id) {
//         Employee emp = employeeMap.get(id);
//         if (emp != null) {
//             System.out.println(emp);
//         } else {
//             System.out.println("Employee not found.");
//         }
//     }

//     public static int getIntInput(Scanner scanner) {
//         while (true) {
//             try {
//                 return Integer.parseInt(scanner.nextLine());
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid input.");
//             }
//         }
//     }

//     public static double getSalaryInput(Scanner scanner) {
//         while (true) {
//             try {
//                 double salary = Double.parseDouble(scanner.nextLine());
//                 if (salary >= 0) return salary;
//                 System.out.println("Salary can't be negative.");
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid input.");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         addEmployee(1, "Shubham", "Developer", 50000);
//         addEmployee(2, "Harsha", "Engineering", 70000);
//         addEmployee(3, "Sneha", "Marketing", 60000);
//         addEmployee(4, "Keerti", "Manager", 70000);

//         while (true) {
//             System.out.println("\n1. Add 2. Update 3. Delete 4. Display 5. Search 6. Exit");
//             int choice = getIntInput(scanner);

//             switch (choice) {
//                 case 1:
//                     System.out.print("ID: ");
//                     int id = getIntInput(scanner);
//                     System.out.print("Name: ");
//                     String name = scanner.nextLine();
//                     System.out.print("Department: ");
//                     String dept = scanner.nextLine();
//                     System.out.print("Salary: ");
//                     double salary = getSalaryInput(scanner);
//                     addEmployee(id, name, dept, salary);
//                     break;
//                 case 2:
//                     System.out.print("ID to update: ");
//                     int updateId = getIntInput(scanner);
//                     System.out.print("New Name (leave empty to skip): ");
//                     String newName = scanner.nextLine();
//                     System.out.print("New Department (leave empty to skip): ");
//                     String newDept = scanner.nextLine();
//                     System.out.print("New Salary (-1 to skip): ");
//                     double newSalary = getSalaryInput(scanner);
//                     if (newSalary == -1) newSalary = -1;
//                     updateEmployee(updateId, newName.isEmpty() ? null : newName, 
//                             newDept.isEmpty() ? null : newDept, newSalary == -1 ? -1 : newSalary);
//                     break;
//                 case 3:
//                     System.out.print("ID to delete: ");
//                     int deleteId = getIntInput(scanner);
//                     deleteEmployee(deleteId);
//                     break;
//                 case 4:
//                     displayAllEmployees();
//                     break;
//                 case 5:
//                     System.out.print("ID to search: ");
//                     int searchId = getIntInput(scanner);
//                     searchEmployee(searchId);
//                     break;
//                 case 6:
//                     System.out.println("Goodbye!");
//                     scanner.close();
//                     return;
//                 default:
//                     System.out.println("Invalid choice.");
//             }
//         }
//     }
// }

//!+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//! .Write a java program to check number is even or odd.

class Main{
    public static void main(String args[]){
        // int emp[] = { };
        int arr[] = {11, 20 , 31 , 40, 51};

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2== 0 ){
                System.err.print(i);
            }
        }
    }
}
