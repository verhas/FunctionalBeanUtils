package javax0.util.testbeans;

public class IncomeYear {
    private String year;
    private Incomes incomes;
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Incomes getIncomes() {
        return incomes;
    }

    public void setIncomes(Incomes incomes) {
        this.incomes = incomes;
    }

    public String getYear() {

        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
