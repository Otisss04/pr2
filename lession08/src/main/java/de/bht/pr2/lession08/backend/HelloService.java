package de.bht.pr2.lession08.backend;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements Serializable {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello anonymous user";
        } else {
            return "Hello " + name;
        }
    }

}
