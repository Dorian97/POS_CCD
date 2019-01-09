/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author Clara
 */
public class User {
    private static String name;
    private static String email;
    private static String password;
    private static String reference;
    private static String gender;
    private static String[] interests;
    
    public User(String name, String email, String password, String reference,
String gender, String[] interests) {
this.name = name;
this.email = email;
this.password = password;
this.reference = reference;
this.gender = gender;
this.interests = interests;
}
  public static String getName() {
return name;
}
public static String getEmail() {
return email;
}
public static String getPassword() {
return password;
}
public static String getReference() {
return reference;
}
public String getGender(){
return gender;
}
public String[] getInterests() {
return interests;
}  
}
