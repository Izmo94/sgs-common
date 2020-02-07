package com.sgs.common.model.data;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sgs.common.model.data.user.*;
import com.sgs.common.model.message.KafkaData;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = UserRegister.class, name = "userRegister"),
        @JsonSubTypes.Type(value = UsersDetails.class, name = "usersDetails"),
        @JsonSubTypes.Type(value = UserDetails.class, name = "userDetails"),
        @JsonSubTypes.Type(value = UserPassword.class, name = "userPassword"),
        @JsonSubTypes.Type(value = UserRole.class, name = "userRole"),
        @JsonSubTypes.Type(value = UserToken.class, name = "userToken"),
        @JsonSubTypes.Type(value = UserLogin.class, name = "userLogin")
})
public abstract class UserData extends KafkaData {
}
