package com.cfg.repup.domain;

public class User {

    private int user_id;
    private String user_name;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String cardNumber;
    private float userRating;
    private String path_to_profile_photo;

    public User(){}

    public User(String user_name, String firstName, String lastName, String mobileNumber, String cardNumber, float userRating, String path_to_profile_photo) {
        this.user_name = user_name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.cardNumber = cardNumber;
        this.userRating = userRating;
        this.path_to_profile_photo=path_to_profile_photo;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getUserRating() {
        return userRating;
    }

    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }


    public String getPath_to_profile_photo() {
        return path_to_profile_photo;
    }

    public void setPath_to_profile_photo(String path_to_profile_photo) {
        this.path_to_profile_photo = path_to_profile_photo;
    }
}
