package FactoryPattern;
// This is an umbrella class for all the different address validation Methods
// according to the country U.S.A. as different country have different address patterns
// i.e. PincodeValidation(Known in US as Zipcode), StreetValidation, CityValidation, StateValidation etc.

public class USValidator extends Validator{
    @Override
    public boolean Validate(Address a) {
//        This class will combine the output of different address validation classes acc. to country
        return false;
    }
}
