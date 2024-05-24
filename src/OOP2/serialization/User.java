package OOP2.serialization;

import java.io.Serializable;

public class User implements Serializable {

    String name;
    String password;

    public void SayHello() {
        System.out.println("Hello: " + name);
    }


 }
