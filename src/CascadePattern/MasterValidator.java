package CascadePattern;

import java.util.List;

public class MasterValidator {
    List <Validator> vals;
    public MasterValidator (List <Validator> vals){
        this.vals=vals;
    }

    boolean validate (Address a){
        for (Validator val :vals){
            if(!val.validate(a))
                return false;
        }
        return true;
    }
}
