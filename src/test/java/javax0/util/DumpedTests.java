package javax0.util;

import org.junit.Test;

import static javax0.util.Functions.safe;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DumpedTests {

    @Test
    public void compose1Functions() {
        assertEquals("0", safe(
                s -> s + "0"
        ).apply(""));
    }

    @Test
    public void compose2Functions() {
        assertEquals("01", safe(
                s -> s + "0",
                s -> s + "1"
        ).apply(""));
    }

    @Test
    public void compose3Functions() {
        assertEquals("012", safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2"
        ).apply(""));
    }

    @Test
    public void compose4Functions() {
        assertEquals("0123", safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose5Functions() {
        assertEquals("01234", safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose6Functions() {
        assertEquals("012345", safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose7Functions() {
        assertEquals("0123456", safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose8Functions() {
        assertEquals("01234567", safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
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
    public void compose1FunctionsNullAt1() {
        assertNull(safe(
                null
        ).apply(""));
    }

    @Test
    public void compose2FunctionsNullAt1() {
        assertNull(safe(
                null,
                s -> s + "1"
        ).apply(""));
    }

    @Test
    public void compose2FunctionsNullAt2() {
        assertNull(safe(
                s -> s + "0",
                null
        ).apply(""));
    }

    @Test
    public void compose3FunctionsNullAt1() {
        assertNull(safe(
                null,
                s -> s + "1",
                s -> s + "2"
        ).apply(""));
    }

    @Test
    public void compose3FunctionsNullAt2() {
        assertNull(safe(
                s -> s + "0",
                null,
                s -> s + "2"
        ).apply(""));
    }

    @Test
    public void compose3FunctionsNullAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                null
        ).apply(""));
    }

    @Test
    public void compose4FunctionsNullAt1() {
        assertNull(safe(
                null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose4FunctionsNullAt2() {
        assertNull(safe(
                s -> s + "0",
                null,
                s -> s + "2",
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose4FunctionsNullAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                null,
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose4FunctionsNullAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                null
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullAt1() {
        assertNull(safe(
                null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullAt2() {
        assertNull(safe(
                s -> s + "0",
                null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                null,
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                null,
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                null
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullAt1() {
        assertNull(safe(
                null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullAt2() {
        assertNull(safe(
                s -> s + "0",
                null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                null,
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                null,
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                null,
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                null
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullAt1() {
        assertNull(safe(
                null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullAt2() {
        assertNull(safe(
                s -> s + "0",
                null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                null,
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                null,
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                null,
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                null,
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                null
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullAt1() {
        assertNull(safe(
                null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullAt2() {
        assertNull(safe(
                s -> s + "0",
                null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                null,
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                null,
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                null,
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                null,
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                null,
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullAt8() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                null
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullAt1() {
        assertNull(safe(
                null,
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

    @Test
    public void compose9FunctionsNullAt2() {
        assertNull(safe(
                s -> s + "0",
                null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                null,
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                null,
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                null,
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                null,
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                null,
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullAt8() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                null,
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullAt9() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                null
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullAt1() {
        assertNull(safe(
                null,
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
    public void compose10FunctionsNullAt2() {
        assertNull(safe(
                s -> s + "0",
                null,
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
    public void compose10FunctionsNullAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                null,
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
    public void compose10FunctionsNullAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                null,
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                null,
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                null,
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                null,
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullAt8() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                null,
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullAt9() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                null,
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullAt10() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                null
        ).apply(""));
    }

    @Test
    public void compose1FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null
        ).apply(""));
    }

    @Test
    public void compose2FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null,
                s -> s + "1"
        ).apply(""));
    }

    @Test
    public void compose2FunctionsNullRetAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> null
        ).apply(""));
    }

    @Test
    public void compose3FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null,
                s -> s + "1",
                s -> s + "2"
        ).apply(""));
    }

    @Test
    public void compose3FunctionsNullRetAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> null,
                s -> s + "2"
        ).apply(""));
    }

    @Test
    public void compose3FunctionsNullRetAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> null
        ).apply(""));
    }

    @Test
    public void compose4FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose4FunctionsNullRetAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> null,
                s -> s + "2",
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose4FunctionsNullRetAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> null,
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose4FunctionsNullRetAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> null
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullRetAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullRetAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> null,
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullRetAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> null,
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsNullRetAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> null
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullRetAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullRetAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> null,
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullRetAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> null,
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullRetAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> null,
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsNullRetAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> null
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullRetAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullRetAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> null,
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullRetAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> null,
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullRetAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> null,
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullRetAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> null,
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsNullRetAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> null
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null,
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullRetAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullRetAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> null,
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullRetAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> null,
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullRetAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> null,
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullRetAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> null,
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullRetAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> null,
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsNullRetAt8() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> null
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null,
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

    @Test
    public void compose9FunctionsNullRetAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> null,
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullRetAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> null,
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullRetAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> null,
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullRetAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> null,
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullRetAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> null,
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullRetAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> null,
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullRetAt8() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> null,
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsNullRetAt9() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> null
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullRetAt1() {
        assertNull(safe(
                s -> null,
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
    public void compose10FunctionsNullRetAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> null,
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
    public void compose10FunctionsNullRetAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> null,
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
    public void compose10FunctionsNullRetAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> null,
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullRetAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> null,
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullRetAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> null,
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullRetAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> null,
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullRetAt8() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> null,
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullRetAt9() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> null,
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsNullRetAt10() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> null
        ).apply(""));
    }

    @Test
    public void compose1FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

    @Test
    public void compose2FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "1"
        ).apply(""));
    }

    @Test
    public void compose2FunctionsThrowAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

    @Test
    public void compose3FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "1",
                s -> s + "2"
        ).apply(""));
    }

    @Test
    public void compose3FunctionsThrowAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "2"
        ).apply(""));
    }

    @Test
    public void compose3FunctionsThrowAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

    @Test
    public void compose4FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "1",
                s -> s + "2",
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose4FunctionsThrowAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "2",
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose4FunctionsThrowAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "3"
        ).apply(""));
    }

    @Test
    public void compose4FunctionsThrowAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

    @Test
    public void compose5FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsThrowAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "2",
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsThrowAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "3",
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsThrowAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "4"
        ).apply(""));
    }

    @Test
    public void compose5FunctionsThrowAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

    @Test
    public void compose6FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsThrowAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsThrowAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "3",
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsThrowAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "4",
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsThrowAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "5"
        ).apply(""));
    }

    @Test
    public void compose6FunctionsThrowAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

    @Test
    public void compose7FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsThrowAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsThrowAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsThrowAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "4",
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsThrowAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "5",
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsThrowAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "6"
        ).apply(""));
    }

    @Test
    public void compose7FunctionsThrowAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

    @Test
    public void compose8FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsThrowAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsThrowAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsThrowAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsThrowAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "5",
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsThrowAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "6",
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsThrowAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "7"
        ).apply(""));
    }

    @Test
    public void compose8FunctionsThrowAt8() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

    @Test
    public void compose9FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                },
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

    @Test
    public void compose9FunctionsThrowAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsThrowAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsThrowAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsThrowAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsThrowAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "6",
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsThrowAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "7",
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsThrowAt8() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "8"
        ).apply(""));
    }

    @Test
    public void compose9FunctionsThrowAt9() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

    @Test
    public void compose10FunctionsThrowAt1() {
        assertNull(safe(
                s -> {
                    throw new RuntimeException();
                },
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
    public void compose10FunctionsThrowAt2() {
        assertNull(safe(
                s -> s + "0",
                s -> {
                    throw new RuntimeException();
                },
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
    public void compose10FunctionsThrowAt3() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> {
                    throw new RuntimeException();
                },
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
    public void compose10FunctionsThrowAt4() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsThrowAt5() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsThrowAt6() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsThrowAt7() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "7",
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsThrowAt8() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "8",
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsThrowAt9() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> {
                    throw new RuntimeException();
                },
                s -> s + "9"
        ).apply(""));
    }

    @Test
    public void compose10FunctionsThrowAt10() {
        assertNull(safe(
                s -> s + "0",
                s -> s + "1",
                s -> s + "2",
                s -> s + "3",
                s -> s + "4",
                s -> s + "5",
                s -> s + "6",
                s -> s + "7",
                s -> s + "8",
                s -> {
                    throw new RuntimeException();
                }
        ).apply(""));
    }

}