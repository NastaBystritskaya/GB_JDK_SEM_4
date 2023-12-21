package au.bystritskaia;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Справочник сотрудников
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Staff {

    /**
     * Список сотрудников
     */
    List<Employee> records = new LinkedList<>();

    /**
     * Добавление сотрудника
     * @param employee Новый сотрудник
     */
    public void addEmployee(@NonNull Employee employee) {
        this.records.add(employee);
    }

    /**
     * Поиск сотрудников по стажу
     * @param experienceFrom Стаж От
     * @param experienceTo Стаж До
     * @return Список найденых сотрудников
     */
    public List<Employee> getEmployeeByExperience(int experienceFrom, int experienceTo) {
        return this.records
                .stream()
                .filter(emp -> emp.getExperience() >= experienceFrom && emp.getExperience() <= experienceTo )
                .collect(Collectors.toList());
    }

    /**
     * Поиск сотрудников по номеру телефона или его части
     * @param phone Номер телефона
     * @return Список найденых сотрудников
     */
    public List<Employee> getEmployeeByPhone(String phone) {
        return this.records
                .stream()
                .filter(emp -> emp.getPhone().toLowerCase().contains(phone.toLowerCase()))
                .collect(Collectors.toList());
    }

    /**
     * Поиск сотрудника по табельному номеру
     * @param tabNum Табельный номер
     * @return Найденый сотрудник
     */
    public Employee getEmployeeByTabNum(int tabNum) {
        return this.records
                .stream()
                .filter(emp -> emp.getTabNum() == tabNum)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Сотрудник с табельным номером: %d не найден".formatted(tabNum)));
    }
}
