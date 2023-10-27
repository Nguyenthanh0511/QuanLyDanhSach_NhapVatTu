/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlydanhsach_nhapvattu;

/**
 *
 * @author Administrator
 */
public class Supplier {
     private String address;
    private String phoneNumber;
    public Supplier(String address , String phoneNumber){
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getAddress(){
        return address;
    }
    public String phoneNumber(){
        return phoneNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
