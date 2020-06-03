package FactoryPattern;
// We will write different validation methods in different classes for each attribute
// because if we put all methods in one class it will not follow
// Single Responsibility Principle.

public class CityValidator {

    public static boolean validate(String city){
//        Logic for validation of city name.
        return false;
    }
}
