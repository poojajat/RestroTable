/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author pjat2
 */
public class PublicIn {
    private String userId;
    private String password;
    private String EMail;
    private String country;
    private String city;
    private String address;
    private String ph;

    public PublicIn() {
    }

    public PublicIn(String userId, String password, String EMail, String country, String city, String address, String ph) {
        this.userId = userId;
        this.password = password;
        this.EMail = EMail;
        this.country = country;
        this.city = city;
        this.address = address;
        this.ph = ph;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

   
}
