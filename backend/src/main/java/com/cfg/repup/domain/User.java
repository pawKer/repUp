package com.cfg.repup.domain;

public class User {

    private int user_id;
    private String firstName;
    private String lastName;
    private char mobileNumber;
    private char cardNumber;
    private float userRating;


    public User(int user_id, String firstName, String lastName, char mobileNumber, char cardNumber, float userRating) {
        this.user_id = user_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.cardNumber = cardNumber;
        this.userRating = 0;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public char getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(char mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public char getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(char cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getUserRating() {
        return userRating;
    }

    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }
}
