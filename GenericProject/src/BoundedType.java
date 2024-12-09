public class BoundedType <T extends Employee> {
    private T employee;

    public BoundedType(T employee) {
        this.employee = employee;
    }

    public T getEmployee() {
        return employee;
    }

    public void setEmployee(T employee) {
        this.employee = employee;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details: " + employee.toString());
    }
}
