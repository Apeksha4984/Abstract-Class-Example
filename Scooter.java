/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclass;

abstract class Vehicle{
abstract void demo();
}
class Car extends Vehicle{
    void demo(){
        System.out.println("Car start with powerbutton");
    }
}
public class Scooter extends Vehicle {
     void demo(){
        System.out.println("Car start with powerbutton");
    }

    
}
