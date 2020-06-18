package exampletestclasnested;

public class Main {
    public static void main(String[] args) {
    A external = new A();
    A.B tmp = external.new B();
    A.C tmp2 = new A.C();
    }
}

class A{
    A(){
        System.out.println("I am from class external");
    }
    class B{

        B(){
            System.out.println("I am from class internal B.");
        }

    void method(){
        test = 5;

    }
        private int tmp;


    }

    static class C{

        C(){
            System.out.println("I am from class internal C.");
        }
    }

    void method2(){

        B object = new B();

    }
    private int test;
}


