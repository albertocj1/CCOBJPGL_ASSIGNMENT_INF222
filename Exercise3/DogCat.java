import Cat.Cat;
import Dog.Malpom;

public class DogCat {
    public static void main(String[] args) throws Exception {
        Malpom dog1 = new Malpom();
        System.out.println(dog1.eyeColor);
        System.out.println(dog1.furColor);
        dog1.bark();
        System.out.println("");

        Cat cat1 = new Cat();
        System.out.println(cat1.eyeColor);
        System.out.println(cat1.furColor);
        cat1.meow();
        
    }
}
