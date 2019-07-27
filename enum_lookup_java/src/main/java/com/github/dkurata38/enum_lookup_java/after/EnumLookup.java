package com.github.dkurata38.enum_lookup_java.after;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

class EnumLookup<E extends Enum<E>> {
    private final Class<E> enumClass;
    private final Function<E, String> getter;

    public EnumLookup(Class<E> enumClass, Function<E, String> getter) {
        this.enumClass = enumClass;
        this.getter = getter;
    }

    public Optional<E> lookup(String value) {
        return Arrays.stream(enumClass.getEnumConstants())
                .filter(e -> getter.apply(e).equals(value))
                .findFirst();
    }
}