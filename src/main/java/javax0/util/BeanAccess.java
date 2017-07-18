package javax0.util;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class BeanAccess {

    public static <FROM, TO> Collection<TO> beanCollection(FROM bean, Function<FROM, ? extends Collection<TO>> accessor) {
        final Collection<TO> collection;
        try {
            collection = accessor.apply(bean);
        } catch (ArrayIndexOutOfBoundsException ignore) {
            return Collections.emptyList();
        }
        return collection == null ? Collections.emptyList() : collection;
    }

    public static <FROM, TO> Stream<TO> beanStream(FROM bean, Function<FROM, ? extends Collection<TO>> accessor) {
        final Collection<TO> collection;
        try {
            collection = accessor.apply(bean);
        } catch (ArrayIndexOutOfBoundsException ignore) {
            return Stream.empty();
        }
        return collection == null ? Stream.empty() : collection.stream();
    }
}
