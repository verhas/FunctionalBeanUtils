package javax0.util;

import javax0.util.testbeans.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Function;

import static javax0.util.Functions.compose;
import static javax0.util.Functions.safe;
import static org.junit.Assert.assertEquals;


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
        for (IncomeYear year : (Collection<IncomeYear>) Optional.ofNullable(palino).map(Functions0.compose(
                (Function<TaxPayer, IncomeYears>) TaxPayer::getIncomeYears,
                (Function<IncomeYears, Collection<IncomeYear>>) IncomeYears::getIncomeYears)).get()) {
            if (!(Boolean) Optional.ofNullable(year).map(
                    Functions0.compose((Function<IncomeYear, Status>) IncomeYear::getStatus,
                            (Function<Status, Boolean>) Status::isTaxPaid))
                    .orElse(YEAR_NOT_CLEARED)) {
                allYearsCleared = false;
            }
        }
        Assert.assertFalse(allYearsCleared);
    }

    @Test
    public void testAccessBetter() {
        boolean allYearsCleared = true;
        TaxPayer palino = createTestTaxPayer();
        for (IncomeYear year : Optional.ofNullable(palino)
                .map(TaxPayer::getIncomeYears)
                .map(IncomeYears::getIncomeYears)
                .orElse(Collections.emptyList())) {
            if (!Optional.ofNullable(year)
                    .map(IncomeYear::getStatus)
                    .map(Status::isTaxPaid)
                    .orElse(YEAR_NOT_CLEARED)) {
                allYearsCleared = false;
            }
        }
        Assert.assertFalse(allYearsCleared);
    }

    @Test
    public void testAccessWithBuilder() {
        boolean allYearsCleared = true;
        TaxPayer palino = createTestTaxPayer();

        for (IncomeYear year : Optional.ofNullable(palino)
                .map(TaxPayer::getIncomeYears)
                .map(IncomeYears::getIncomeYears)
                .orElse(Collections.emptyList())) {
            if (!Optional.ofNullable(year)
                    .map(IncomeYear::getStatus)
                    .map(Status::isTaxPaid)
                    .orElse(YEAR_NOT_CLEARED)) {
                allYearsCleared = false;
            }
        }
        Assert.assertFalse(allYearsCleared);
    }

    @Test
    public void testAccess() {
        boolean allYearsCleared = true;
        TaxPayer palino = createTestTaxPayer();

        for (IncomeYear year : Optional.ofNullable(palino)
                .map(TaxPayer::getIncomeYears)
                .map(IncomeYears::getIncomeYears)
                .orElse(Collections.emptyList())) {
            if (!Optional.ofNullable(year)
                    .map(IncomeYear::getStatus)
                    .map(safe(Status::isTaxPaid))
                    .orElse(false)) {
                allYearsCleared = false;
            }
        }
        Assert.assertFalse(allYearsCleared);
    }

    @Test
    public void testStreamAccess() {
        TaxPayer palino = createTestTaxPayer();

        boolean someYearsNotCleared =
                Optional.ofNullable(palino)
                        .map(TaxPayer::getIncomeYears)
                        .map(IncomeYears::getIncomeYears)
                        .orElse(Collections.emptyList()).stream()
                        .anyMatch(
                                year -> !Optional.ofNullable(year)
                                        .map(IncomeYear::getStatus)
                                        .map(Status::isTaxPaid)
                                        .orElse(false));
        Assert.assertTrue(someYearsNotCleared);
    }

    @Test
    public void compose1Functions() {
        assertEquals("a", safe(s -> s + "a").apply(""));
    }

    @Test
    public void compose10Functions() {
        assertEquals("0123456789", safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose9Functions() {
        assertEquals("012345678", safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }
}
