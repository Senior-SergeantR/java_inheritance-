package Assignment;

abstract class Bank {
    abstract int getBalance();
}

class bankA extends Bank{
     int getBalance(){
        return 100;
    }
}

class bankB extends Bank{
     int getBalance(){
       return 150;
    }

}

class bankC extends Bank{
    int getBalance(){
        return 200;
    }
}
