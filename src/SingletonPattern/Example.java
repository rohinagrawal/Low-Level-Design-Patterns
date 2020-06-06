package SingletonPattern;

// Singleton Class means that the class will be instantiated only once

// To make a class singleton just make the constructor of the class private so that
// it will be only able to be called inside the class and then expose a public method to
// instantiate the class but checking that it has not been instantiated before.

public class Example {
    String name;
    Example instance;

    private Example(String name){
        this.name=name;
    }

    public Example getInstance(String name){
        if(instance==null)
            instance= new Example(name);
        return instance;
    }
}

// In this example once the name is set the name cant be changed
