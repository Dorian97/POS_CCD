/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cdi;

/**
 *
 * @author Clara
 */
public class UserSessionImpl implements UserSession {
public String welcomeUser (String name){
return "Welcome to the Java EE6 forum, " + name + "!";
}
}
