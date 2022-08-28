package Assignment;

public class MainBank {
    public static void main(String[] args) {
        Bank A = new bankA();
        Bank B = new bankB();
        Bank C = new bankC();

        int bankA = A.getBalance();
        int bankB = B.getBalance();
        int bankC = C.getBalance();

        System.out.println("$"+bankA);
        System.out.println("$"+bankC);
        System.out.println("$"+bankB);
    }

}
