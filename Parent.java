package Assignment;

abstract class Parent {
    abstract void message();

}

class subclass1 extends Parent{
    void message(){
        System.out.println("This is the first subclass");
    }
}

class subclass2 extends Parent{
    void message(){
        System.out.println("This is the Second message");
    }
}