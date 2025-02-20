import java.util.*;

class Employee {
    String name, department;
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

class GroupByDepartment {
    Map<String, List<Employee>> group(List<Employee> employees) {
        Map<String, List<Employee>> map = new HashMap<>();
        for (Employee emp : employees) {
            map.putIfAbsent(emp.department, new ArrayList<>());
            map.get(emp.department).add(emp);
        }
        return map;
    }
}
