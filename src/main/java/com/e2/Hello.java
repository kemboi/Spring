package com.e2;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    private Greeter greeter;
    public Hello(Greeter greeter){
        greeter.greet();
    }
    String greeting(){
return "Hello World! In Spring!";
    }
}
