package com.sgs.common.model.data.user;

import com.sgs.common.model.data.UserData;
import java.util.List;

public class UsersDetails extends UserData {

    private List<UserDetails> userDetailsList;

    public List<UserDetails> getUserDetailsList() {
        return userDetailsList;
    }

    public void setUserDetailsList(List<UserDetails> userDetailsList) {
        this.userDetailsList = userDetailsList;
    }
}
