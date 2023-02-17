package OperatorsTask3;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog unkwnDog = new Dog();
        unkwnDog = dog1;

        dog1.name = "Spot";
        dog2.name = "Scruffy";

        dog1.says = "Ruff!";
        dog2.says = "Wurf!";

        if(dog1.name == dog2.name){
            System.out.println("dog1 and dog2 share same names!");
        }
        else System.out.println("dog1 and dog2 have different names...");

        if(dog1.says.equals(dog2.says)){
            System.out.println("dog1 and dog2 says same words!");
        }
        else System.out.println("dog1 and dog2 have different barks...");

        if (dog1.name == unkwnDog.name && dog1.says.equals(unkwnDog.says)){
            System.out.println("dog1 and unknwDog are twins!");
        }
    }
}
