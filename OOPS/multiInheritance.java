public class multiInheritance {
        public static void main(String[] args) {
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}

//Base Class
class Animal{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//Derived Class
class Mammal extends Animal{
    int legs;
}

//Derived Class
class Dog extends Mammal{
    String breed;
}