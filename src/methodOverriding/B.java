package methodOverriding;

import java.util.ArrayList;
import java.util.List;

public class B extends A{

//    String doSomething(String string) {
//
//    }

    @Override
    public String doSomething(String string) {
        System.out.println("Hello From B");

//        return "";
    }

    // it should have
    // same name
    // same parameter
    // same return type in child class


}



