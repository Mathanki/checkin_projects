public class GenericInterfaceImpl<T extends Employee> implements GenericInterface<T> {
    private T employee;

    public GenericInterfaceImpl(T employee) {
        this.employee = employee;
    }

    public T getEmployee() {
        return employee;
    }

    public void setEmployee(T employee) {
        this.employee = employee;
    }

    @Override
    public void print(T value) {
        System.out.println("Values: " + value.toString());
    }
}
