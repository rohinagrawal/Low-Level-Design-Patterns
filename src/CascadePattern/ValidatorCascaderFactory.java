package CascadePattern;

/* Cascading
 ______     _______     ________
| Zip | => | City | => | State | => ........
------     -------     --------
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidatorCascaderFactory {
    public static Map <String, MasterValidator> m;
    private static ValidatorCascaderFactory temp;

    private ValidatorCascaderFactory(){
        m.put("OrderDispatch",new MasterValidator(new ArrayList <> (List.of(new zipValidator(), new cityValidator()))));
        m.put("Cart", new MasterValidator(new ArrayList<>(List.of(new zipValidator()))));
        m.put("ProductAvailability",new MasterValidator(new ArrayList<>(List.of(new zipValidator()))));
    }

    public static ValidatorCascaderFactory getInstance(){
        if (temp==null)
            temp = new ValidatorCascaderFactory();
        return temp;
    }

    public MasterValidator getValidator(String s){
        return m.get(s);
    }
}
