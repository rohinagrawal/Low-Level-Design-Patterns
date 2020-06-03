package FactoryPattern;
//This contains the code that will be written on the client side
//to initialize and validate the address
public class Client {
    boolean validate(Address a){
        ValidatorFactory x = ValidatorFactory.getInstance();
        return x.getValidator(a.country).Validate(a);
    }
}
