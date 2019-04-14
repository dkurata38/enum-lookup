package com.github.dkurata38.enum_lookup_java.after;

public enum RegistrationStatus implements EnumReverseLookupable {
    TEMPORARY("0"), REGULAR("1");

    private String code;

    RegistrationStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    // 呼び出し側は, InterfaceのstaticメソッドをCallするだけ. 引数にEnumの検索条件を無名関数で指定.
    public static RegistrationStatus getByCode(String value) {
        return EnumReverseLookupable.getByCondition(RegistrationStatus.class, (RegistrationStatus e) -> e.code.equals(value));
    }
}