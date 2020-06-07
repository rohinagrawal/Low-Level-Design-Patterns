package CascadePattern;

// Rather than implementing the components of the Address as different classes we can make them by
// This style of Coding is called - Code Against Interface.

public interface Validator {
    public boolean validate (Address a);
}
