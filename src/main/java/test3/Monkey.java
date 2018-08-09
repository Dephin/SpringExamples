package test3;

import org.springframework.stereotype.Component;

@Component
public class Monkey implements Animal {
    private String monkeyName = "MonkeyKing";

    public String bite() {
        return "MonkeyKing BITE YOU!!!";
    }

    public String toString() {
        return "MonkeyName:" + monkeyName;
    }
}
