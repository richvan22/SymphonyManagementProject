/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

public class Contact {

    private Phone phone;
    private String email;
    
    Contact() {
    	phone = new Phone();
    	email = "";
    }

    void setPhone(String phone) {
        phone.setPhone(phone);
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getPhone() {
        return phone;
    }

    String getEmail() {
        return email;
    }
}
