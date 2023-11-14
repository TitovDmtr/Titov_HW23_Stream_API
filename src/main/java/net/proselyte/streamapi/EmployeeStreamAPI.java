package net.proselyte.streamapi;

import net.proselyte.streamapi.model.Employee;
import net.proselyte.streamapi.util.StreamAPIUtil;

import java.io.IOException;
import java.util.List;

public class EmployeeStreamAPI {
    public static void main(String[] args) throws IOException {

        List<Employee> employee = StreamAPIUtil.getEmployee();
        StreamAPIUtil.printEmployees(employee);

        System.out.println();

        System.out.println("Sort employee by first name:");
        List<Employee> sortSpecialistsByFNameAsc = StreamAPIUtil.sortSpecialistsByFirstNameAsc(employee);
        StreamAPIUtil.printEmployees(sortSpecialistsByFNameAsc);

        System.out.println();

        System.out.println("Sort employee by first and last name:");
        List<Employee> sortSpecialistsByFAndLastNameAsc = StreamAPIUtil.sortSpecialistsByFirstAndLastNameAsc(employee);
        StreamAPIUtil.printEmployees(sortSpecialistsByFAndLastNameAsc);

    }
}
