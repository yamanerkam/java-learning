public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        int money = 20;
        money = 40;
        float f = 10.5f;
        long l = 100000L;
        char abc = 'A';
        boolean isAllowed = true;
        System.out.println("Money: " + money);
        if(isAllowed){
            System.out.println(abc);
        }else{
            System.out.println("not allowed");
        }
        int [] grades = {0,5,10,20,30,40,50,60,70,80,90,100};
        for(int grade:grades){
            System.out.println(grade*10);

        }

        MyClass classOne = new MyClass();
        System.out.println(classOne.x);

    }
}

class MyClass {
int x =10;

}