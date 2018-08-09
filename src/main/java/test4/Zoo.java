package test4;

import org.springframework.beans.factory.annotation.Autowired;
import test3.Animal;

public class Zoo {
    @Autowired
    private Monkey monkey;

    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey) {
        this.monkey = monkey;
    }
}
