package au.bystritskaia;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.addEmployee(new Employee(123, "+79000000000", "Василий", 2));
        staff.addEmployee(new Employee(345, "+79100000000", "Петр", 22));
        staff.addEmployee(new Employee(567, "+79200000000", "Вера", 10));
        staff.addEmployee(new Employee(789, "+79210000000", "Анжелика", 7));

        System.out.println("Поиск по табельному номеру");
        Writer.printEmployee(staff.getEmployeeByTabNum(567));

        System.out.println("\nПоиск по стажу");
        Writer.printListAsTable(staff.getEmployeeByExperience(5, 10));

        System.out.println("\nПоиск по номеру");
        Writer.printListAsTable(staff.getEmployeeByPhone("+792"));
    }
}
