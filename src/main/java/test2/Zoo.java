package test2;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Zoo {
    @Autowired
    private Bird smallBird;
    @Autowired
    private Lion lion;


    public Bird getSmallBird() {
        return smallBird;
    }

    public Lion getLion() {
        return lion;
    }

}
