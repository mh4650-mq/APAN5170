import java.util.Scanner;
public class PayrollCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter empolyee's Name: "); //First we need to enter the name which the type is String
        String name = scanner.nextLine();
        System.out.print("Enter your Hourly Wage: ");
        double hourlyWage = scanner.nextDouble();//We need to consider that if the user enters a negetive value, it should ask to enter again.
        while(hourlyWage < 0){
            System.out.println("Hourly Wage must be a positive number.");
            System.out.print("Please enter again: ");
            hourlyWage = scanner.nextDouble();
        }
        System.out.print("Enter the number of hours worked: ");// Same as the hourly wage.
        int hoursWorked = scanner.nextInt();
        while (hoursWorked < 0){
            System.out.println("Working Hours must be a positive number.");
            System.out.print("Please enter again: ");
            hoursWorked = scanner.nextInt();
        }
        double grossSalary = hourlyWage * hoursWorked;// Calculating the gross salary
        double tax = grossSalary * 0.20;// Calculating the tax deduction
        double netSalary = grossSalary - tax;// Calculating the net salary

        System.out.println("Payroll Summary for " + name);
        System.out.println("---------------------------------");
        System.out.println("Hours Worked: " + hoursWorked + "hrs");
        System.out.println("Hourly Wage: $ " + hourlyWage);
        System.out.println("Gross Salary: $ " + grossSalary);
        System.out.println("Tax Deduction: $ " + tax);
        System.out.println("Net Salary: $ " + netSalary);
        scanner.close();
    }
}
