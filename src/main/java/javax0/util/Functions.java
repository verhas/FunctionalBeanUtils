package javax0.util;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.Function;

public class Functions {

     static Function compose0(Function... functions) {
        return compose(0, functions);
    }

    private static Function compose(int index, Function[] functions) {
        if (functions.length - 1 == index) {
            return x -> x == null ? null : functions[index].apply(x);
        }
        return x -> x == null ? null : compose(index + 1, functions).compose(functions[index]).apply(x);
    }

    public static <V0, V1> Function<V0, V1> compose(Function<V0, V1> f0) {
        return compose0(f0);
    }

    public static <V0, V1, V2> Function<V0, V2> compose(Function<V0, V1> f0,
                                                        Function<V1, V2> f1) {
        return compose0(f0, f1);
    }

    public static <V0, V1, V2, V3> Function<V0, V3> compose(Function<V0, V1> f0,
                                                            Function<V1, V2> f1,
                                                            Function<V2, V3> f2) {
        return compose0(f0, f1, f2);
    }

    public static <V0, V1, V2, V3, V4> Function<V0, V4> compose(Function<V0, V1> f0,
                                                                Function<V1, V2> f1,
                                                                Function<V2, V3> f2,
                                                                Function<V3, V4> f3) {
        return compose0(f0, f1, f2, f3);
    }

    public static <V0, V1, V2, V3, V4, V5> Function<V0, V5> compose(Function<V0, V1> f0,
                                                                    Function<V1, V2> f1,
                                                                    Function<V2, V3> f2,
                                                                    Function<V3, V4> f3,
                                                                    Function<V4, V5> f4) {
        return compose0(f0, f1, f2, f3, f4);
    }

    public static <V0, V1, V2, V3, V4, V5, V6> Function<V0, V6> compose(Function<V0, V1> f0,
                                                                        Function<V1, V2> f1,
                                                                        Function<V2, V3> f2,
                                                                        Function<V3, V4> f3,
                                                                        Function<V4, V5> f4,
                                                                        Function<V5, V6> f5) {
        return compose0(f0, f1, f2, f3, f4, f5);
    }

    public static <V0, V1, V2, V3, V4, V5, V6, V7> Function<V0, V7> compose(Function<V0, V1> f0,
                                                                            Function<V1, V2> f1,
                                                                            Function<V2, V3> f2,
                                                                            Function<V3, V4> f3,
                                                                            Function<V4, V5> f4,
                                                                            Function<V5, V6> f5,
                                                                            Function<V6, V7> f6) {
        return compose0(f0, f1, f2, f3, f4, f5, f6);
    }

    public static <V0, V1, V2, V3, V4, V5, V6, V7, V8> Function<V0, V8> compose(Function<V0, V1> f0,
                                                                                Function<V1, V2> f1,
                                                                                Function<V2, V3> f2,
                                                                                Function<V3, V4> f3,
                                                                                Function<V4, V5> f4,
                                                                                Function<V5, V6> f5,
                                                                                Function<V6, V7> f6,
                                                                                Function<V7, V8> f7) {
        return compose0(f0, f1, f2, f3, f4, f5, f6, f7);
    }

    public static <V0, V1, V2, V3, V4, V5, V6, V7, V8, V9> Function<V0, V9> compose(Function<V0, V1> f0,
                                                                                    Function<V1, V2> f1,
                                                                                    Function<V2, V3> f2,
                                                                                    Function<V3, V4> f3,
                                                                                    Function<V4, V5> f4,
                                                                                    Function<V5, V6> f5,
                                                                                    Function<V6, V7> f6,
                                                                                    Function<V7, V8> f7,
                                                                                    Function<V8, V9> f8) {
        return compose0(f0, f1, f2, f3, f4, f5, f6, f7, f8);
    }

    public static <V0, V1, V2, V3, V4, V5, V6, V7, V8, V9, V10> Function<V0, V10> compose(Function<V0, V1> f0,
                                                                                          Function<V1, V2> f1,
                                                                                          Function<V2, V3> f2,
                                                                                          Function<V3, V4> f3,
                                                                                          Function<V4, V5> f4,
                                                                                          Function<V5, V6> f5,
                                                                                          Function<V6, V7> f6,
                                                                                          Function<V7, V8> f7,
                                                                                          Function<V8, V9> f8,
                                                                                          Function<V9, V10> f9) {
        return compose0(f0, f1, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    public static <FROM,TO> ComposeBuilder<FROM,TO> compose(FROM from, TO to){
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
