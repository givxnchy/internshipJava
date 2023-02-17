package concept_task;

public class demoDog{
    public static void main(String[] args) {
        Doggy dog1 = new Doggy();
        dog1.age = 5;
        dog1.gender = "female";
        dog1.breed = "German shepard";
        System.out.println("Dog age = " + dog1.age + " Dog's breed is - " + dog1.breed + " dog's number of paws is = " + dog1.paws +
                " dog's gender is " + dog1.gender);
    }
}
