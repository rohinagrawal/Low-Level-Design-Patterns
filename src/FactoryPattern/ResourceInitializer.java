package FactoryPattern;

/*    --------       create             ~~~~~~~~~~~
 *   | App   | ---------------->        ~~~~~~~~~~~
 *   |       |                          |   Db    |
 *   --------                           |_________|
 * */

// The Operation with the database are very heavy and we should avoid doing it again and again.
// So making this class as a singleton class.

// Singleton Class - it is a class which runs/access only once. Ex - Controllers(MVC Pattern) etc.

import java.util.Set;

public class ResourceInitializer {
    static Set <String> pincode;
    static ResourceInitializer temp;

    private ResourceInitializer(){
//    Create a connection with Database
//    Query the Database
//    Close the connection
    }

    public static ResourceInitializer getInstance(){
        if (temp== null)
            temp= new ResourceInitializer();
        return temp;
    }
}
