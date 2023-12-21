package au.bystritskaia;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Writer {

    public static void printListAsTable(List<Employee> staff) {
        printHeader();
        staff.forEach(emp -> printEmployee(emp, false));
    }

    public static void printEmployee(Employee employee) {
        printEmployee(employee, true);
    }

    public static void printEmployee(Employee employee, boolean needToPrintHeader) {
        if(needToPrintHeader)
            printHeader();
        System.out.println("|%20d|%20s|%10d|%20s|".formatted(employee.getTabNum(), employee.getName(), employee.getExperience(), employee.getPhone()));
    }

    public static void printHeader() {
        System.out.println("\n|%20s|%20s|%10s|%20s|".formatted("Табельный номер", "Имя", "Стаж", "Телефон"));
    }

}
