/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;


/**
 *
 * @author pjat2
 */
public class Menu {
    private int serialNo=412;
    private String foodCategory;
    private String foodName;
    private String image;
    private String cost;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    

    public Menu() {
    }

    public Menu(String foodCategory, String foodName, String image, String cost) {
        this.foodCategory = foodCategory;
        this.foodName = foodName;
        this.image = image;
        this.cost = cost;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    
    
    
}
