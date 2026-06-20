    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
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