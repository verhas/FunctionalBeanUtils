package javax0.util;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.Function;

public class Functions {

    public static <A, B> Function<A, B> safe(Function<A, B> f) {
        return x -> {
            try {
                return x == null || f == null ? null : f.apply(x);
            } catch (Exception ignored) {
                return null;
            }
        };
    }

    public static <V0, V1, V2> Function<V0, V2> safe(Function<V0, V1> f0,
                                                     Function<V1, V2> f1) {
        Function<V1, V2> f = safe(f1);
        return f0 == null ? x -> null : safe(f.compose(f0));
    }

    public static <V0, V1, V2, V3> Function<V0, V3> safe(Function<V0, V1> f0,
                                                         Function<V1, V2> f1,
                                                         Function<V2, V3> f2) {
        Function<V1, V3> f = safe(f1, f2);
        return f0 == null ? x -> null : safe(f.compose(f0));
    }

    public static <V0, V1, V2, V3, V4> Function<V0, V4> safe(Function<V0, V1> f0,
                                                             Function<V1, V2> f1,
                                                             Function<V2, V3> f2,
                                                             Function<V3, V4> f3) {
        Function<V1, V4> f = safe(f1, f2, f3);
        return f0 == null ? x -> null : safe(f.compose(f0));
    }

    public static <V0, V1, V2, V3, V4, V5> Function<V0, V5> safe(Function<V0, V1> f0,
                                                                 Function<V1, V2> f1,
                                                                 Function<V2, V3> f2,
                                                                 Function<V3, V4> f3,
                                                                 Function<V4, V5> f4) {
        Function<V1, V5> f = safe(f1, f2, f3, f4);
        return f0 == null ? x -> null : safe(f.compose(f0));
    }

    public static <V0, V1, V2, V3, V4, V5, V6> Function<V0, V6> safe(Function<V0, V1> f0,
                                                                     Function<V1, V2> f1,
                                                                     Function<V2, V3> f2,
                                                                     Function<V3, V4> f3,
                                                                     Function<V4, V5> f4,
                                                                     Function<V5, V6> f5) {
        Function<V1, V6> f = safe(f1, f2, f3, f4, f5);
        return f0 == null ? x -> null : safe(f.compose(f0));
    }

    public static <V0, V1, V2, V3, V4, V5, V6, V7> Function<V0, V7> safe(Function<V0, V1> f0,
                                                                         Function<V1, V2> f1,
                                                                         Function<V2, V3> f2,
                                                                         Function<V3, V4> f3,
                                                                         Function<V4, V5> f4,
                                                                         Function<V5, V6> f5,
                                                                         Function<V6, V7> f6) {
        Function<V1, V7> f = safe(f1, f2, f3, f4, f5, f6);
        return f0 == null ? x -> null : safe(f.compose(f0));
    }

    public static <V0, V1, V2, V3, V4, V5, V6, V7, V8> Function<V0, V8> safe(Function<V0, V1> f0,
                                                                             Function<V1, V2> f1,
                                                                             Function<V2, V3> f2,
                                                                             Function<V3, V4> f3,
                                                                             Function<V4, V5> f4,
                                                                             Function<V5, V6> f5,
                                                                             Function<V6, V7> f6,
                                                                             Function<V7, V8> f7) {
        Function<V1, V8> f = safe(f1, f2, f3, f4, f5, f6, f7);
        return f0 == null ? x -> null : safe(f.compose(f0));
    }

    public static <V0, V1, V2, V3, V4, V5, V6, V7, V8, V9> Function<V0, V9> safe(Function<V0, V1> f0,
                                                                                 Function<V1, V2> f1,
                                                                                 Function<V2, V3> f2,
                                                                                 Function<V3, V4> f3,
                                                                                 Function<V4, V5> f4,
                                                                                 Function<V5, V6> f5,
                                                                                 Function<V6, V7> f6,
                                                                                 Function<V7, V8> f7,
                                                                                 Function<V8, V9> f8) {
        Function<V1, V9> f = safe(f1, f2, f3, f4, f5, f6, f7, f8);
        return f0 == null ? x -> null : safe(f.compose(f0));
    }

    public static <V0, V1, V2, V3, V4, V5, V6, V7, V8, V9, V10> Function<V0, V10> safe(Function<V0, V1> f0,
                                                                                       Function<V1, V2> f1,
                                                                                       Function<V2, V3> f2,
                                                                                       Function<V3, V4> f3,
                                                                                       Function<V4, V5> f4,
                                                                                       Function<V5, V6> f5,
                                                                                       Function<V6, V7> f6,
                                                                                       Function<V7, V8> f7,
                                                                                       Function<V8, V9> f8,
                                                                                       Function<V9, V10> f9) {
        Function<V1, V10> f = safe(f1, f2, f3, f4, f5, f6, f7, f8, f9);
        return f0 == null ? x -> null : safe(f.compose(f0));
    }

    public static <FROM, TO> ComposeBuilder<FROM, TO> compose(FROM from, TO to) {
        return new ComposeBuilder<>();
    }

    public static <T extends List<Function> & RandomAccess> Function compose(int index, T functions) {
        if (functions.size() - 1 == index) {
            return x -> x == null ? null : functions.get(index).apply(x);
        }
        return x -> x == null ? null : compose(index + 1, functions).compose(functions.get(index)).apply(x);
    }

    public static class ComposeBuilder<FROM, TO> {
        public <VIA> ViaBuilder<VIA> f(Function<FROM, VIA> r) {
            return new ViaBuilder<FROM>().f(r);
        }

        public class ViaBuilder<VIA> {
            private ArrayList<Function> functions = new ArrayList<>(16);

            public Function<FROM, TO> build() {
                return compose(0, functions);
            }

            public <VIA_NEW> ViaBuilder<VIA_NEW> f(Function<VIA, VIA_NEW> r) {
                functions.add(r);
                return (ViaBuilder<VIA_NEW>) this;
            }

        }
    }

}
