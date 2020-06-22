public class lambda2 {
    // Functional Interface
    interface FuncInter1 {
        int operation(int a, int b);
    }

    interface FuncInter2 {
        void sayMessage(String message);
    }

    interface FunInter3 {
        int operation(Bike a, Bike b);
    }

    // Performs FuncInter1's operation on 'a' 'b'
    private int operate(int a, int b, FuncInter1 fobj){
        return fobj.operation(a, b);
    }
    private int operate2(Bike a, Bike b, FunInter3 fobj){ return fobj.operation(a, b);}
    Bike b1 = new Bike(1);

    Bike b2 = new Bike(2);

    public Bike getB1(){
        return b1;
    }
    public Bike getB2(){
        return b2;
    }




    public static void main(String[] args) {
        lambda2 s = new lambda2();
        Bike b1 = s.getB1();
        Bike b2 = s.getB2();

        FuncInter1 add = (x,  y) -> x + y;

        FuncInter1 multiply = ( x, y) -> x * y;

        FunInter3 addBike = (a, b) -> a.value + b.value;

        lambda2 tobj = new lambda2();

        System.out.println(tobj.operate(5,3, add));
        System.out.println(tobj.operate(2,5,multiply));
        System.out.println(tobj.operate2(b1, b2, addBike));
        ;

        FuncInter2 fobj = message -> System.out.println("Hello" + message);
        fobj.sayMessage("Geek");
    }
    class Bike {
         int value;
         Bike(int x){
            this.value = x;
        }

    }
    //map(),
}

