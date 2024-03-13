import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Arun", 1000000.00), new Employee("Amit", 1200000.00), new Employee("Akshay", 2000000.00));
        Optional<Employee> secondHighest = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        if (secondHighest.isPresent()) {
            Employee employee = secondHighest.get();
            System.out.print(employee.getSalary());
        }
    }
}
