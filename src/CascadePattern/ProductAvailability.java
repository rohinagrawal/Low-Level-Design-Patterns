package CascadePattern;

//Team using Address Validation

public class ProductAvailability {
    public boolean AddValidation(Address a){
        return ValidatorCascaderFactory.getInstance().getValidator("ProductAvailability").validate(a);
    }
}
