package javax0.util;

import org.junit.Test;

public class DumpCompose {

    private static void p(String s) {
        System.out.print(s);
    }

    @Test
    public void dumpCompose() {

        for (int i = 1; i < 10; i++) {
            p("public static <");
            for (int j = 0; j <= i; j++) p("V" + j + ",");
            p("V" + (i + 1));
            p("> ");
            p("Function<V0,V" + (i + 1) + "> safe(");

            for (int j = 0; j <= i; j++) {
                p("Function<V" + j + ", V" + (j + 1) + "> f" + j + (j == i ? "){" : ",") + "\n");
            }
            p("Function<V1,V" + (i + 1) + "> f = safe(");
            for (int j = 1; j <= i; j++) {
                p("f" + j + (j == i ? ");\n" : ","));
            }
            p("return f0 == null ? x -> null : safe(f.compose(f0));\n}\n");
        }

    }
}
