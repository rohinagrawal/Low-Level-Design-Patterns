package CascadePattern;

public class ProductAvailability {
    public boolean AddValidation(Address a){
        return ValidatorCascaderFactory.getInstance().getValidator("ProductAvailability").validate(a);
    }
}
