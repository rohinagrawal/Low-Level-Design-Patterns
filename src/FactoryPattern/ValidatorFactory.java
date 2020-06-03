package FactoryPattern;

// This is a singleton class
// If once created should not be created again and again

import java.util.HashMap;

public class ValidatorFactory {
    static ValidatorFactory temp;
//    Map will be static as it will same for all methods
    static HashMap <String,Validator> CountryToValidator;
    private ValidatorFactory(){
        CountryToValidator.put("US", new USValidator());
        CountryToValidator.put("IN", new INValidator());
    }
    public static ValidatorFactory getInstance(){
        if(temp==null)
            temp = new ValidatorFactory();
        return temp;
    }
// This method is made to abstract the get method.
// If in future we use any other DS rather than HashMap the function get will also get changed
// So the client should not have to change anything in their code.
    public Validator getValidator(String c){
//        if (CountryToValidator.containsKey(c))
//        Validator x = new INValidator
            return CountryToValidator.get(c);
//        else{
//            System.out.println("Country code not found");
//        }
    }
}
