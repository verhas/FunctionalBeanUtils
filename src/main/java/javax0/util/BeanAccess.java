package javax0.util;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static javax0.util.Functions.compose0;

public class BeanAccess {

    public static <FROM, TO> Collection<TO> beanCollection(FROM bean, Function<FROM, ? extends Collection<TO>> accessor) {
        Collection<TO> collection = accessor.apply(bean);
        return collection == null ? Collections.emptyList() : collection;
    }

    public static <FROM, TO> Stream<TO> beanStream(FROM bean, Function<FROM, ? extends Collection<TO>> accessor) {
        Collection<TO> collection = accessor.apply(bean);
        return collection == null ? Stream.empty() : collection.stream();
    }

    public static <FROM, TO> TO beanField(FROM bean, TO defaultValue, Function<FROM, TO> accessor) {
        TO object = accessor.apply(bean);
        return object == null ? defaultValue : object;
    }

    public static <FROM, TO> Optional<TO> beanField(FROM bean, Function<FROM, TO> accessor) {
        return Optional.ofNullable(accessor.apply(bean));
    }

    public static <FROM, V0, V1, V2> Optional<V2> beanField(FROM bean, Function<V0, V1> f0,
                                                            Function<V1, V2> f1) {
        return (Optional<V2>) Optional.ofNullable(compose0(f0, f1).apply(bean));
    }

    public static <FROM, V0, V1, V2> Stream<V2> beanStream(FROM bean, Function<V0, V1> f0,
                                                   Function<V1, Collection<V2>> f1) {
        Collection<V2> collection = beanField(bean,f0,f1).orElse(null);
        return collection == null ? Stream.empty() : collection.stream();
    }

    public static <FROM, V0, V1, V2, V3> Optional<V3> beanFields(FROM bean, Function<V0, V1> f0,
                                                                 Function<V1, V2> f1,
                                                                 Function<V2, V3> f2) {
        return (Optional<V3>) Optional.ofNullable(compose0(f0, f1, f2).apply(bean));
    }

    public static <FROM, V0, V1, V2, V3, V4> Optional<V4> beanFields(FROM bean, Function<V0, V1> f0,
                                                                     Function<V1, V2> f1,
                                                                     Function<V2, V3> f2,
                                                                     Function<V3, V4> f3) {
        return (Optional<V4>) Optional.ofNullable(compose0(f0, f1, f2, f3).apply(bean));
    }

    public static <FROM, V0, V1, V2, V3, V4, V5> Optional<V5> beanFields(FROM bean, Function<V0, V1> f0,
                                                                         Function<V1, V2> f1,
                                                                         Function<V2, V3> f2,
                                                                         Function<V3, V4> f3,
                                                                         Function<V4, V5> f4) {
        return (Optional<V5>) Optional.ofNullable(compose0(f0, f1, f2, f3, f4).apply(bean));
    }

    public static <FROM, V0, V1, V2, V3, V4, V5, V6> Optional<V6> beanFields(FROM bean, Function<V0, V1> f0,
                                                                             Function<V1, V2> f1,
                                                                             Function<V2, V3> f2,
                                                                             Function<V3, V4> f3,
                                                                             Function<V4, V5> f4,
                                                                             Function<V5, V6> f5) {
        return (Optional<V6>) Optional.ofNullable(compose0(f0, f1, f2, f3, f4, f5).apply(bean));
    }

    public static <FROM, V0, V1, V2, V3, V4, V5, V6, V7> Optional<V7> beanFields(FROM bean, Function<V0, V1> f0,
                                                                                 Function<V1, V2> f1,
                                                                                 Function<V2, V3> f2,
                                                                                 Function<V3, V4> f3,
                                                                                 Function<V4, V5> f4,
                                                                                 Function<V5, V6> f5,
                                                                                 Function<V6, V7> f6) {
        return (Optional<V7>) Optional.ofNullable(compose0(f0, f1, f2, f3, f4, f5, f6).apply(bean));
    }

    public static <FROM, V0, V1, V2, V3, V4, V5, V6, V7, V8> Optional<V8> beanFields(FROM bean, Function<V0, V1> f0,
                                                                                     Function<V1, V2> f1,
                                                                                     Function<V2, V3> f2,
                                                                                     Function<V3, V4> f3,
                                                                                     Function<V4, V5> f4,
                                                                                     Function<V5, V6> f5,
                                                                                     Function<V6, V7> f6,
                                                                                     Function<V7, V8> f7) {
        return (Optional<V8>) Optional.ofNullable(compose0(f0, f1, f2, f3, f4, f5, f6, f7).apply(bean));
    }

    public static <FROM, V0, V1, V2, V3, V4, V5, V6, V7, V8, V9> Optional<V9> beanFields(FROM bean, Function<V0, V1> f0,
                                                                                         Function<V1, V2> f1,
                                                                                         Function<V2, V3> f2,
                                                                                         Function<V3, V4> f3,
                                                                                         Function<V4, V5> f4,
                                                                                         Function<V5, V6> f5,
                                                                                         Function<V6, V7> f6,
                                                                                         Function<V7, V8> f7,
                                                                                         Function<V8, V9> f8) {
        return (Optional<V9>) Optional.ofNullable(compose0(f0, f1, f2, f3, f4, f5, f6, f7, f8).apply(bean));
    }

    public static <FROM, V0, V1, V2, V3, V4, V5, V6, V7, V8, V9, V10> Optional<V10> beanFields(FROM bean, Function<V0, V1> f0,
                                                                                               Function<V1, V2> f1,
                                                                                               Function<V2, V3> f2,
                                                                                               Function<V3, V4> f3,
                                                                                               Function<V4, V5> f4,
                                                                                               Function<V5, V6> f5,
                                                                                               Function<V6, V7> f6,
                                                                                               Function<V7, V8> f7,
                                                                                               Function<V8, V9> f8,
                                                                                               Function<V9, V10> f9) {
        return (Optional<V10>) Optional.ofNullable(compose0(f0, f1, f2, f3, f4, f5, f6, f7, f8, f9).apply(bean));
    }
}
