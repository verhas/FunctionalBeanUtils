package javax0.util;

import org.junit.Test;

public class DumpTests {

    private static void p(String s) {
        System.out.println(s);
    }

    @Test
    public void dumpTests() {

        for (int i = 0; i < 10; i++) {
            p("@Test");
            p("public void compose" + (i + 1) + "Functions() {");
            p("    assertEquals(\"" + "0123456789".substring(0,i+1) + "\", safe(");
            for (int j = 0; j <= i; j++) {
                p("            s -> s + \"" + j + "\"" + (i == j ? "" : ","));
            }
            p("    ).apply(\"\"));");
            p("}");
        }

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k <= i; k++) {
                p("@Test");
                p("public void compose" + (i + 1) + "FunctionsNullAt" + (k + 1) + "() {");
                p("    assertNull(safe(");
                for (int j = 0; j <= i; j++) {
                    if (j == k) {
                        p("            null" + (i == j ? "" : ","));
                    } else {
                        p("            s -> s + \"" + j + "\"" + (i == j ? "" : ","));
                    }
                }
                p("    ).apply(\"\"));");
                p("}");
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k <= i; k++) {
                p("@Test");
                p("public void compose" + (i + 1) + "FunctionsNullRetAt" + (k + 1) + "() {");
                p("    assertNull(safe(");
                for (int j = 0; j <= i; j++) {
                    if (j == k) {
                        p("            s -> null" + (i == j ? "" : ","));
                    } else {
                        p("            s -> s + \"" + j + "\"" + (i == j ? "" : ","));
                    }
                }
                p("    ).apply(\"\"));");
                p("}");
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k <= i; k++) {
                p("@Test");
                p("public void compose" + (i + 1) + "FunctionsThrowAt" + (k + 1) + "() {");
                p("    assertNull(safe(");
                for (int j = 0; j <= i; j++) {
                    if (j == k) {
                        p("            s -> { throw new RuntimeException(); }" + (i == j ? "" : ","));
                    } else {
                        p("            s -> s + \"" + j + "\"" + (i == j ? "" : ","));
                    }
                }
                p("    ).apply(\"\"));");
                p("}");
            }
        }
    }
}
