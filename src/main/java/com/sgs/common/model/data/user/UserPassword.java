package com.sgs.common.model.data.user;

import com.sgs.common.model.data.UserData;
import javax.validation.constraints.NotNull;

public class UserPassword extends UserData {

    @NotNull
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
