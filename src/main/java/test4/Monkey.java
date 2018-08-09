package test4;

import org.springframework.stereotype.Component;
import test3.Animal;

@Component
public class Monkey {
    private String monkeyName = "MonkeyKing";

    public String toString() {
        return "MonkeyName:" + monkeyName;
    }
}
