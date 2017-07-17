package javax0.util.testbeans;

import java.util.List;

public class TaxPayer {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public IncomeYears getIncomeYears() {

        return incomeYears;
    }

    public void setIncomeYears(IncomeYears incomeYears) {
        this.incomeYears = incomeYears;
    }

    private IncomeYears incomeYears;
}
