import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Create objects of Employee and SalariedEmployee
        Employee emp = new Employee(1, "Mathanki");
        SalariedEmployee salariedEmployee = new SalariedEmployee(2, "Suren", 100000);

        //Use GenericClass to demonstrate bounded generics.
        BoundedType<Employee> employeeClass = new BoundedType<>(emp);
        System.out.println("==========GenericClass to demonstrate bounded generics:===========");
        employeeClass.displayEmployeeDetails();

        BoundedType<Employee> employeeSalClass = new BoundedType<>(salariedEmployee);
        employeeSalClass.displayEmployeeDetails();

        //Use GenericInterface to show how it can print any type.
        GenericInterfaceImpl<Employee> employeeGenericClass = new GenericInterfaceImpl<>(emp);
        System.out.println("==========GenericInterface to show how it can print any type:===========");
        employeeGenericClass.print(emp);
        GenericInterfaceImpl<Employee> salEmployeeGenericClass = new GenericInterfaceImpl<>(salariedEmployee);
        employeeGenericClass.print(salariedEmployee);

        //Use GenericMethod to print a list of employees.
        List<Employee> employeeList = Arrays.asList(emp, salariedEmployee);
        GenericMethodDemo genericMethodDemo = new GenericMethodDemo();
        System.out.println("==========================GenericMethod to print a list of employees:==================");
        genericMethodDemo.printList(employeeList);

    }
}