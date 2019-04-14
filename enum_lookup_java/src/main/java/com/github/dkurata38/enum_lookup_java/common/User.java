package com.github.dkurata38.enum_lookup_java.common;

import com.github.dkurata38.enum_lookup_java.before.RegistrationStatus;

public class User {
    public final Id<User> id;
    public final RegistrationStatus registrationStatus;

    User(Id<User> id, RegistrationStatus registrationStatus) {
    this.id = id;
    this.registrationStatus = registrationStatus;
    }
}
