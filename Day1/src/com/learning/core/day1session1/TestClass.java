package com.learning.core.day1session1;

//Define the interface MedicineInfo
interface MedicineInfo {
 void displayLabel();
}

//Implement the interface with Tablet class
class Tablet implements MedicineInfo {
 @Override
 public void displayLabel() {
     System.out.println("Store Tablets in a cool dry place.");
 }
}

//Implement the interface with Syrup class
class Syrup implements MedicineInfo {
 @Override
 public void displayLabel() {
     System.out.println("Syrup is consumable only on prescription.");
 }
}

//Implement the interface with Ointment class
class Ointment implements MedicineInfo {
 @Override
 public void displayLabel() {
     System.out.println("Ointment is for external use only.");
 }
}

//Create a TestClass to demonstrate polymorphic behavior
public class TestClass {
 public static void main(String[] args) {
     // Declare Medicine instances
     MedicineInfo[] medicines = {new Tablet(), new Syrup(), new Ointment()};
     
     // Check the polymorphism behavior of the displayLabel() method
     for (MedicineInfo medicine : medicines) {
         medicine.displayLabel();
     }
 }
}