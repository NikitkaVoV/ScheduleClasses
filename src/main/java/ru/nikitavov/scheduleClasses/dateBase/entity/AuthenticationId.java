package ru.nikitavov.scheduleClasses.dateBase.entity;

import java.io.Serializable;

public class AuthenticationId implements Serializable {
    private User user;
    private AuthenticationType type;

    public AuthenticationId() {}

    public AuthenticationId(User user, AuthenticationType type) {
        this.user = user;
        this.type = type;
    }
}
