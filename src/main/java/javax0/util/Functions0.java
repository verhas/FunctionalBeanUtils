package javax0.util;

import java.util.function.Function;

public class Functions0 {

    public static Function compose(Function... functions) {
        return compose(0, functions);
    }

    private static Function compose(int index, Function[] functions) {
        if (functions.length - 1 == index) {
            return x -> x == null ? null : functions[index].apply(x);
        }
        return x -> x == null ? null : compose(index + 1, functions).compose(functions[index]).apply(x);
    }
}
