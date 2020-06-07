package CascadePattern;

// We already know which service need which validator(s) according to business needs,
// So the map should not be made on the Runtime. Instead, We should store them
// in a Configuration file or Database & then fetch.

import java.util.List;

public class MasterValidator {
    List <Validator> vals;
//  Communicating with database is not responsibility of MasterValidator class
//  so we will make another class.

//  Making Connection, Querying, Closing Connection
//  with Database in Factory Class
    public MasterValidator (List <Validator> vals){
        this.vals=vals;
    }

    /* Cascading
     ______     _______     ________
    | Zip | => | City | => | State | => ........
    ------     -------     --------
     */

    boolean validate (Address a){
        for (Validator val :vals){
            if(!val.validate(a))
                return false;
        }
        return true;
    }
}
