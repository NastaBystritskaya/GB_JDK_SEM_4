package au.bystritskaia;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * Сотрудник
 */
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

    /**
     * Табельный номер
     */
    Integer tabNum;

    /**
     * Телефон
     */
    String phone;

    /**
     * Имя
     */
    String name;

    /**
     * Стаж
     */
    Integer experience;

    @Override
    public String toString() {
        return """
                Сотрудник:
                    Табельный номер: %d
                    Имя: %s
                    Телефон: %s
                    Стаж: %d
                """.formatted(this.tabNum, this.name, this.phone, this.experience);
    }
}
