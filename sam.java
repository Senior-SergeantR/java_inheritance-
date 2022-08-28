package Assignment;

abstract class sam {
    sam(){
        System.out.println("This is a Constructor of an abstract class");
    }

    abstract void a_method();

    void abstract_method(){
        System.out.println("This is a normal method of abstract class");
    }

}

class subClass extends sam{
    void a_method(){
        System.out.println("This is an abstract method");
    }
}

abstract class Animals{
    abstract void cats();
    abstract void dogs();
}

class cats extends Animals{

    void cats(){
        System.out.println("Cats Meow");
    }

    @Override
    void dogs() {

    }


}

class dogs extends Animals{
    @Override
    void cats() {

    }

    void dogs(){
        System.out.println("Dogs Bark");
    }
}

abstract class Shape{
    abstract double RectangleArea(double length, double width );
    abstract double SquareArea(double length);
    abstract double CircleArea(double radius);
}

class Area extends Shape{

    @Override
    double RectangleArea(double length, double width) {
        return length*width;
    }

    @Override
    double SquareArea(double length) {
        return length*length;
    }

    @Override
    double CircleArea(double radius) {
        double pie = 3.142;
        return pie *radius*radius;
    }
}