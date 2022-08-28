package Assignment;

public class MainMarks {
    public static void main(String[] args) {
        Marks std1 = new studentA(85,69,57);
        Marks std2 = new studentB(36,65,89,78);

        System.out.println("Your mean score is: "+std1.getPercentage()+"%");
        System.out.println("Your mean score is: "+std2.getPercentage()+"%");
        System.out.println("====================");
        sam s = new subClass();
        s.abstract_method();
        s.a_method();

        System.out.println("====================");
        Animals cat = new cats();
        Animals dog = new dogs();

        cat.cats();
        dog.dogs();
        System.out.println("====================");

        Area rectangle = new Area();
        Area circle = new Area();
        Area square = new Area();

        double rec = rectangle.RectangleArea(52,46);
        double cir = circle.CircleArea(85);
        double sqr = square.SquareArea(74);

        System.out.println(rec+"cm2");
        System.out.println(cir+"cm2");
        System.out.println(sqr+"cm2");
        System.out.println("====================");

        Area[] rectangles = new Area[4];
        rectangles[0] = new Area();
        rectangles[1] = new Area();
        rectangles[2] = new Area();
        rectangles[3] = new Area();

        System.out.println("Area rectangle 1: "+rectangles[0].RectangleArea(78,55)+"cm2");
        System.out.println("Area rectangle 2: "+rectangles[1].RectangleArea(89,45)+"cm2");
        System.out.println("Area rectangle 3: "+rectangles[2].RectangleArea(88,65)+"cm2");
        System.out.println("Area rectangle 4: "+rectangles[3].RectangleArea(57,59)+"cm2");
        System.out.println("====================");

        Area[] circles = new Area[5];
        circles[0] = new Area();
        circles[1] = new Area();
        circles[2] = new Area();
        circles[3] = new Area();
        circles[4] = new Area();

        System.out.println("Area Circle 1: "+circles[0].CircleArea(35)+"cm2");
        System.out.println("Area Circle 2: "+circles[1].CircleArea(45)+"cm2");
        System.out.println("Area Circle 3: "+circles[2].CircleArea(85)+"cm2");
        System.out.println("Area Circle 4: "+circles[3].CircleArea(30)+"cm2");
        System.out.println("Area Circle 5: "+circles[4].CircleArea(65)+"cm2");

    }
}
