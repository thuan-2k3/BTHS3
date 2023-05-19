/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Order {
    private int order ;
    private LocalDate orderDate;
    private int count ;
    
   ArrayList <OrderDetail> lineItems ; 
   
   public Order(){
    lineItems = new ArrayList<OrderDetail>();
}
   public void addlineItems(Product p, int x){
       lineItems.add(new OrderDetail(p,x));
   }
   
   public double calcTotalCharge(){
       double sum = 0;
       for(OrderDetail odd : lineItems){
           sum += odd.calctotalPrice();
       }
       return sum;
   }

   public LocalDate Ngay(){
       return LocalDate.now();
   }
    public Order(int order, LocalDate orderDate) {
        this.order = order;
        this.orderDate = orderDate;
    }

    public int getOrder() {
        return order;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getCount() {
        return count;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" + "order=" + order + ", orderDate=" + orderDate + ", count=" + count + ", lineItems=" + lineItems + '}';
    }
   
   public void xuat(){
       System.out.format("%-5s %-10s %-15s %-15s %-15s %-20s\n",
                "STT", " Ma SP", "Mo ta", "Don gia", "So Luong", "Thanh tien");
        for (OrderDetail or : lineItems) {
    System.out.format("%-5s %-10s %-15s %-15s %-15s %-20s\n",
            lineItems.indexOf(or)+1,
            or.product.getProductID(),
            or.product.getDescription(),
                or.product.getPrice()+"VND",
                or.getQuatity(),
               or.calctotalPrice()+"VND");
        }
   }
 
        
    
}
