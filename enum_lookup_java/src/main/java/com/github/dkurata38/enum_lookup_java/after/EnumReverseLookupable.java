package com.github.dkurata38.enum_lookup_java.after;

import java.util.Arrays;
import java.util.function.Predicate;

interface EnumReverseLookupable {
    public static <E extends Enum<E>> E getByCondition(Class<E> enumClass, Predicate<E> p) {
        return Arrays
            .stream(enumClass.getEnumConstants())
            .filter(p)
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }
}