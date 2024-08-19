package com.api.redis.model;

import java.io.Serializable;

public class UserDTO implements Serializable{
    private String userId;
    private String gender;
    private String birthYear;

    public UserDTO() {
    }

    public UserDTO(String userId, String gender, String birthYear) {
        this.userId = userId;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    public String getUserId() {
        return userId;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthYear() {
        return birthYear;
    }
}
