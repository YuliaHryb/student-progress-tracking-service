package by.tms.studentprogresstrackingservice.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    STUDENT, ADMIN, TEACHER;

    @Override
    public String getAuthority() {
        return name();
    }
}
