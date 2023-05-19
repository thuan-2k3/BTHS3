/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth3;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        Product a = new Product("x1", "a1", 100);
        Product ab = new Product("x2", "a2", 200);
        Product ac = new Product("x3", "a3", 300);
        Product ad = new Product("x4", "a4", 400);
        Product ae = new Product("x5", "a5", 500); 
        OrderDetail b = new OrderDetail(a, 1);
        OrderDetail b1 = new OrderDetail(a, 11);
        OrderDetail b2 = new OrderDetail(ab, 12);
        OrderDetail b3 = new OrderDetail(ac, 13);
        OrderDetail b4 = new OrderDetail(ad, 14);
        OrderDetail b5 = new OrderDetail(ae, 15);
        Order or = new Order();
        Order oo = new Order(1,LocalDate.now());
        or.addlineItems(a, 5);
        or.addlineItems(ab, 10);
        or.addlineItems(ac, 15);
        or.addlineItems(ad, 20);
        or.addlineItems(ae, 25);
       or.xuat();
    }
}
