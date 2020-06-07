package CascadePattern;

public class Cart {
    public boolean AddValidation(Address a){
        return ValidatorCascaderFactory.getInstance().getValidator("Cart").validate(a);
    }
}
