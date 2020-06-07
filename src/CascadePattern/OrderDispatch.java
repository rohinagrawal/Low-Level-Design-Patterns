package CascadePattern;

//Team using Address Validation

public class OrderDispatch {
    public boolean AddValidation(Address a){
        return ValidatorCascaderFactory.getInstance().getValidator("OrderDispatch").validate(a);
    }
}
