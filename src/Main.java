
public class Main {
    }
class Employee {
    public String firstName;
    public String lastName;
    public int employeeID;
    public double salary;
    public Employee(String s) {salary = 10000;}
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public void employeeSummary() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: "+ employeeID);
        System.out.println("Salary: $" + salary);
    }
    }
class Test {
    public static void main(String[] args) {
        Manager m = new Manager("Latrice Army, 777, Software Engineer, 700000");
        m.setFirstName ("Latrice");
        m.setLastName("Army");
        m.setEmployeeID(Integer.parseInt("777"));
        m.setDepartment ("Software Engineer");
        m.salary = 700000;
        m.employeeSummary();
        System.out.println();
        Employee e = new Employee("Meila Spencer, 708, 100000");
        e.setFirstName("Meila");
        e.setlastName("Spencer");
        e.setEmployeeID(708);
        e.salary = 100000;
        e.employeeSummary();


    }
}








