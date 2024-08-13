package com.api.redis_client.model;

public class UserDTO {
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
