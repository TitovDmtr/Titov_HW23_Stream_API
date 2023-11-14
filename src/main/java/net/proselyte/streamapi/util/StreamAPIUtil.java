package net.proselyte.streamapi.util;

import net.proselyte.streamapi.model.Employee;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIUtil {
    public static List<Employee> getEmployee() throws IOException {
        Employee employee = new Employee();
        List<Employee> dataFromFile = FileUtils.getDataFromFile();
        return dataFromFile;
    }

    public static void printEmployees(List<Employee> employees) {
        employees.forEach(System.out::println);
    }

    public static List<Employee> sortSpecialistsByFirstNameAsc(List<Employee> specialists) {
        return specialists.stream()
                .sorted(Comparator.comparing(Employee::getfName))
                .collect(Collectors.toList());
    }

    public static List<Employee> sortSpecialistsByFirstAndLastNameAsc(List<Employee> specialists) {
        return specialists.stream()
                .sorted(Comparator.comparing(Employee::getfName).thenComparing(Employee::getlName))
                .collect(Collectors.toList());
    }

}
