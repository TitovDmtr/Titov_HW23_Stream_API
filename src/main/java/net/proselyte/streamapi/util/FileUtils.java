package net.proselyte.streamapi.util;

import com.google.common.io.Files;
import lombok.SneakyThrows;
import net.proselyte.streamapi.model.Employee;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    @SneakyThrows
    public static List<Employee> getDataFromFile() throws IOException {
        File file = new File("/Users/dmytro/Documents/javalessons/Titov_HW23_Stream_API/src/main/java/net/proselyte/streamapi/employees_small.csv");
        List<String> fileData = Files.readLines(file, Charset.defaultCharset());
        List<Employee> specialists = new ArrayList<>();

        for (int i=1; i < fileData.size(); i++) {
            String[] separator = fileData.get(i).split(",");
            Employee employees = new Employee();

            employees.setId(Integer.parseInt(separator[0]));
            employees.setfName(separator[1]);
            employees.setlName(separator[2]);
            employees.setIsManager(separator[3]);
            employees.setSalary(Double.parseDouble(separator[4]));

            specialists.add(employees);
        }
        return specialists;
    }
}
