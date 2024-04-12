import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private double salary;
    private String joiningDate;

    public Employee(String name, String joiningDate, double salary) {
        this.name = name;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", joiningDate='" + joiningDate + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Arun","01-01-2024", 1000), new Employee("Prateek", "02-01-2024", 20000), new Employee("Kapil", "03-01.2024", 30000), new Employee("Rahul", "03-01-2024", 40000));
        //employeeList.stream().filter(e -> e.getSalary() > 10000).distinct().forEach(System.out::println);
        Map<String, List<Employee>> groupedEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getJoiningDate));
        groupedEmployee.forEach((joiningDate, group) -> System.out.print(joiningDate + ","+ group));
    }
}
