package FactoryPattern;
// This is an Abstract/Interface Class
// this validator class is extended by all countries umbrella classes.

/*                      Validator
                        |    \    \
                        |     \     \
                        |      \      \
              INValidator  USValidator .....
 */

// as the map created can have only one type of class
// so this class will be parent of all Country class and we can initalize the country constructor
// in the object of Validator(Parent) Class.
public interface Validator {
    public boolean Validate(Address a);
}
