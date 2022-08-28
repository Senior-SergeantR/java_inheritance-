package Assignment;

abstract class Marks {
    abstract double getPercentage();
}

class studentA extends Marks{
   double subject1;
    double subject2;
    double subject3;
    studentA(double subject1, double subject2, double subject3){
        this.subject1= subject1;
        this.subject2= subject2;
        this.subject3= subject3;
    }
    double getPercentage(){
        double s1= subject1;
        double s2= subject2;
        double s3= subject3;
        return (s1+s2+s3)/300*100;
    }
}

class studentB extends Marks{
    double subject1;
    double subject2;
    double subject3;
    double subject4;

    public studentB(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    double getPercentage(){
        double s1= subject1;
        double s2= subject2;
        double s3= subject3;
        double s4= subject4;
        return (s1+s2+s3+s4)/400*100;

    }

}


