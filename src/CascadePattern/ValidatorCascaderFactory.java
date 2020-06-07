package CascadePattern;

/*    --------     connection             ~~~~~~~~~~~
 *   | App   |   ---------------->        ~~~~~~~~~~~
 *   |       |                            |   Db    |
 *   --------                             |_________|
 * */

// The Operation with the database are very heavy and we should avoid doing it again and again.
// So making this class as a singleton class.

// Singleton Class - it is a class which runs/access only once. Ex - Controllers(MVC Pattern) etc.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidatorCascaderFactory {
    public static Map <String, MasterValidator> m;
    private static ValidatorCascaderFactory temp;

    private ValidatorCascaderFactory(){

//      Create a connection with Database
//      Query the Database
//      Close the connection

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
