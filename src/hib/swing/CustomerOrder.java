/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author pjat2
 */
public class CustomerOrder {
    private int serialNo;
     private String tableNo;
    private String orderDetail;
    private String cost;
    private String quantity;
    private int total;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
   

    public void setTableNo(String tableNo) {
        this.tableNo = tableNo;
    }

    public String getTableNo() {
        return tableNo;
    }

    public CustomerOrder( String orderDetail, String cost, String quantity, int total, String tableNo) {
       
        this.orderDetail = orderDetail;
        this.cost = cost;
        this.quantity = quantity;
        this.total = total;
        this.tableNo = tableNo;
    }
    

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }
    

    

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

  

    public CustomerOrder() {
    }


    /**
     * @return the orderDetail
     */
    public String getOrderDetail() {
        return orderDetail;
    }

    /**
     * @param orderDetail the orderDetail to set
     */
    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }


    
}
