package javax0.util;

import javax0.util.testbeans.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

import static javax0.util.BeanAccess.*;
import static javax0.util.Functions.compose;


public class FunctionsTest {

    private static final boolean YEAR_NOT_CLEARED = false;

    private static TaxPayer createTestTaxPayer() {
        TaxPayer taxPayer = new TaxPayer();
        taxPayer.setAge(51);
        taxPayer.setName("Pinco Palino");
        taxPayer.setIncomeYears(new IncomeYears());
        taxPayer.getIncomeYears().setIncomeYears(new ArrayList<>(2));

        // 2015 year incomes
        Incomes year_incomes = new Incomes();
        year_incomes.setIncomes(new ArrayList<>(2));
        Income year_income_1 = new Income();
        year_income_1.setAmount(BigDecimal.valueOf(200_000));
        year_incomes.getIncomes().add(year_income_1);
        Income year_income_2 = new Income();
        year_income_2.setAmount(BigDecimal.valueOf(50_000));
        year_incomes.getIncomes().add(year_income_2);
        IncomeYear year = new IncomeYear();
        year.setYear("2015");
        taxPayer.getIncomeYears().getIncomeYears().add(year);

        year_incomes = new Incomes();
        year_incomes.setIncomes(new ArrayList<>(2));
        year_income_1 = new Income();
        year_income_1.setAmount(BigDecimal.valueOf(100_000));
        year_incomes.getIncomes().add(year_income_1);
        year_income_2 = new Income();
        year_income_2.setAmount(BigDecimal.valueOf(70_000));
        year_incomes.getIncomes().add(year_income_2);
        year = new IncomeYear();
        year.setYear("2016");
        taxPayer.getIncomeYears().getIncomeYears().add(year);
        return taxPayer;
    }

    @Test(expected = NullPointerException.class)
    public void testAccessNPE() {
        boolean allYearsCleared = true;
        TaxPayer palino = createTestTaxPayer();
        for (IncomeYear year : palino.getIncomeYears().getIncomeYears()) {
            if (!year.getStatus().isTaxPaid()) {
                allYearsCleared = false;
            }
        }
        Assert.assertFalse(allYearsCleared);
    }

    @Test
    public void testAccessNoException() {
        boolean allYearsCleared = true;
        TaxPayer palino = createTestTaxPayer();
        for (IncomeYear year : (Collection<IncomeYear>) beanField(palino, Functions0.compose(
                (Function<TaxPayer, IncomeYears>) TaxPayer::getIncomeYears,
                (Function<IncomeYears, Collection<IncomeYear>>) IncomeYears::getIncomeYears)).get()) {
            if (!beanField(year, YEAR_NOT_CLEARED,
                    Functions0.compose((Function<IncomeYear, Status>) IncomeYear::getStatus, (Function<Status, Boolean>) Status::isTaxPaid))) {
                allYearsCleared = false;
            }
        }
        Assert.assertFalse(allYearsCleared);
    }

    @Test
    public void testAccessBetter() {
        boolean allYearsCleared = true;
        TaxPayer palino = createTestTaxPayer();
        for (IncomeYear year : beanCollection(palino, compose(
                TaxPayer::getIncomeYears,
                IncomeYears::getIncomeYears))) {
            if (!beanField(year, YEAR_NOT_CLEARED,
                    compose(IncomeYear::getStatus, Status::isTaxPaid))) {
                allYearsCleared = false;
            }
        }
        Assert.assertFalse(allYearsCleared);
    }

    @Test
    public void testAccessWithBuilder() {
        boolean allYearsCleared = true;
        TaxPayer palino = createTestTaxPayer();
        Function<TaxPayer, ? extends Collection<IncomeYear>> accessor =
                compose((TaxPayer) null, (Collection<IncomeYear>) null)
                        .f(TaxPayer::getIncomeYears)
                        .f(IncomeYears::getIncomeYears).build();

        for (IncomeYear year : beanCollection(palino, accessor)) {
            if (!beanField(year, YEAR_NOT_CLEARED,
                    compose(IncomeYear::getStatus, Status::isTaxPaid))) {
                allYearsCleared = false;
            }
        }
        Assert.assertFalse(allYearsCleared);
    }

    @Test
    public void testAccess() {
        boolean allYearsCleared = true;
        TaxPayer palino = createTestTaxPayer();

        for (IncomeYear year : beanCollection(palino, compose(TaxPayer::getIncomeYears, IncomeYears::getIncomeYears))) {
            if (!beanField(year, IncomeYear::getStatus, Status::isTaxPaid).orElse(false)) {
                allYearsCleared = false;
            }
        }
        Assert.assertFalse(allYearsCleared);
    }

    @Test
    public void testStreamAccess() {
        TaxPayer palino = createTestTaxPayer();

        boolean someYearsNotCleared =
                beanStream(palino, TaxPayer::getIncomeYears, IncomeYears::getIncomeYears)
                        .anyMatch(year -> !beanField(year, IncomeYear::getStatus, Status::isTaxPaid)
                                .orElse(false));
        Assert.assertTrue(someYearsNotCleared);
    }

    @Test
    public void composeThreeFunctions() {
        //   Function<Integer,Integer>
    }
}
