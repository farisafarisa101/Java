class Animal{
    void bark(){
        System.out.println("ANIMAL IS BARKING");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("DOG IS BARKING");
    }
}
class Puppy extends Animal{
    void bark(){
        System.out.println("PUPPY IS BARKING");
    }
} 
class OverrideEx{
    public static void main(String args[]){
        /*Dog d=new Dog();
         * d.bark();
         * Animal a=new Animal();
         * a.bark();
         *Animal a1=new Dog();
         * a1.bark();
         * Puppy p=new Puppy();
         * p.bark();
         */
        Animal dobj=new Puppy();
        dobj.bark();
    }
}