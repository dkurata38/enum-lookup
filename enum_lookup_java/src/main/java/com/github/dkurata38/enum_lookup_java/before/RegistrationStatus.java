package com.github.dkurata38.enum_lookup_java.before;

public enum RegistrationStatus {
    Temporary("0"), Regular("1");

    public final String code;

    RegistrationStatus(String code) {
        this.code = code;
    }
}