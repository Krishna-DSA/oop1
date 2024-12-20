// Base class Employee
class Employee {
    String empName, empId, address, mailId, mobileNo;
    double basicPay;

    public Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile Number: " + mobileNo);
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay; // Dearness Allowance
        double hra = 0.10 * basicPay; // House Rent Allowance
        double pf = 0.12 * basicPay; // Provident Fund
        double staffClubFund = 0.001 * basicPay; // Staff Club Fund
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;

        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Dearness Allowance (97% of BP): " + da);
        System.out.println("House Rent Allowance (10% of BP): " + hra);
        System.out.println("Provident Fund (12% of BP): " + pf);
        System.out.println("Staff Club Fund (0.1% of BP): " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

// Programmer class inheriting Employee
class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// TeamLead class inheriting Employee
class TeamLead extends Employee {
    public TeamLead(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// AssistantProjectManager class inheriting Employee
class AssistantProjectManager extends Employee {
    public AssistantProjectManager(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// ProjectManager class inheriting Employee
class ProjectManager extends Employee {
    public ProjectManager(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Main class to test the functionality
public class EmployeeInheritance {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter Employee Details:");

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Mail ID: ");
        String mailId = scanner.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobileNo = scanner.nextLine();

        System.out.print("Enter Basic Pay: ");
        double basicPay = scanner.nextDouble();

        System.out.println("\nSelect Employee Type:");
        System.out.println("1. Programmer");
        System.out.println("2. Team Lead");
        System.out.println("3. Assistant Project Manager");
        System.out.println("4. Project Manager");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Employee employee = null;

        switch (choice) {
            case 1:
                employee = new Programmer(name, empId, address, mailId, mobileNo, basicPay);
                break;
            case 2:
                employee = new TeamLead(name, empId, address, mailId, mobileNo, basicPay);
                break;
            case 3:
                employee = new AssistantProjectManager(name, empId, address, mailId, mobileNo, basicPay);
                break;
            case 4:
                employee = new ProjectManager(name, empId, address, mailId, mobileNo, basicPay);
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        System.out.println("\nEmployee Details:");
        employee.displayDetails();

        System.out.println("\nPay Slip:");
        employee.generatePaySlip();

        scanner.close();
    }
}
