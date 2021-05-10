package com.greenwich.eztrade.DTOs;

public class SellerDetailsDTO {

    private String firstName;
    private String email;
    private int reviews;

    public SellerDetailsDTO(String firstName, String email, int reviews) {
        this.firstName = firstName;
        this.email = email;
        this.reviews = reviews;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
}
