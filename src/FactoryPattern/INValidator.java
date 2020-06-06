package FactoryPattern;
// This is an umbrella class for all the different address validation Methods
// according to the country INDIA as different country have different address patterns
// i.e. PincodeValidation, CityValidation, StateValidation etc.
public class INValidator implements Validator {
    @Override
    public boolean Validate(Address a) {
//        This class will combine the output of different address validation classes acc. to country
        if(!PincodeValidator.validate(a.getPincode()))
        return false;
        else if(!CityValidator.validate(a.getCity()))
            return false;
        else
            return true;
    }
}
