package edu.handong.csee.java.inheritance;

public class Cat extends Animal {

	public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.testClassMethod(); // hiding
        myCat.testInstanceMethod(); //overriding
        
        Animal myAnimal = myCat; // polymorphism
        Animal.testClassMethod();
        myAnimal.testInstanceMethod(); // overriding
        
        Animal myDog = new Dog(); //polymorphism
        myDog.testClassMethod();
        myDog.testInstanceMethod(); // overriding
    }

}
