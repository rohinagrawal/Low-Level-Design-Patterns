package SingletonPattern;

import BuilderPattern.bird;

public class main {
    public static void main(String[] args){

        Example object = Example.getInstance("Rohin");

        System.out.println(object.getName());
    }
}
