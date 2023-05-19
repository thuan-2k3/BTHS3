/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth3;

/**
 *
 * @author ADMIN
 */
public class OrderDetail extends Product {
    private int quatity;
    public Product product;

    public OrderDetail(Product product, int quatity) {
        this.quatity = quatity;
        this.product = product;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quatity=" + quatity + ", product=" + product + '}';
    }
    public double calctotalPrice(){
      return quatity * product.getPrice() ; 
    }
    
    
}
