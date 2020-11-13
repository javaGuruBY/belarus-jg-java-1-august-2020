package com.javaguru.student_vladimir_petranovski.lesson_13.level_2;

import java.util.List;

class UserCredentials {

    private final List<Role> roles;

    public UserCredentials (List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean isExistRole(Role role) {
        return roles.contains(role);
    }
}
