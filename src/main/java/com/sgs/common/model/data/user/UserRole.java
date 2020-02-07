package com.sgs.common.model.data.user;

import com.sgs.common.model.data.UserData;
import javax.validation.constraints.NotNull;

public class UserRole extends UserData {

    @NotNull
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
