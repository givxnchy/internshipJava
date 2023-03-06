package iba.eu.java.education.operatorsClass3;

import static org.junit.jupiter.api.Assertions.*;

class dogDemoTest {

    @org.junit.jupiter.api.Test
    void main() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog unkwnDog = new Dog();
        unkwnDog = dog1;

        dog1.name = "Spot";
        dog2.name = "Scruffy";

        dog1.says = "Ruff!";
        dog2.says = "Wurf!";

        String expDog1Name = "Spot";
        String expDog2Name = "Scruffy";
        String expDog1Says = "Ruff!";
        String expDog2Says = "Wurf!";

        assertEquals(dog1.name,expDog1Name);
        assertEquals(dog2.name,expDog2Name);
        assertEquals(dog1.says,expDog1Says);
        assertEquals(dog2.says,expDog2Says);
    }
}