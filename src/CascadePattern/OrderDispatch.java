package CascadePattern;

public class OrderDispatch {
    public boolean AddValidation(Address a){
        return ValidatorCascaderFactory.getInstance().getValidator("OrderDispatch").validate(a);
    }
}
