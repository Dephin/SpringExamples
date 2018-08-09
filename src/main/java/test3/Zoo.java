package test3;

import org.springframework.beans.factory.annotation.Autowired;

public class Zoo {
    @Autowired
    private Animal smartAnimal;

    public Animal getSmartAnimal() {
        return smartAnimal;
    }


}
