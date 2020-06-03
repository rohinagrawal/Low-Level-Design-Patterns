package FactoryPattern;
// We will write different validation methods in different classes for each attribute
// because if we put all methods in one class it will not follow
// Single Responsibility Principle

//As all the pincodes are predefined,
// they can be stored in a list in persistent database

public class PincodeValidator {
    public static boolean validate(String pincode){
//        Communicating with database is not responsibility of PincodeValidator class
//        so we will make another class.

//        Making Connection, Querying, Closing Connection
//        with Database in ResourceInitializer Method

        ResourceInitializer.getInstance();

//        Check for the pincode in the list
        return false;
    }
}
