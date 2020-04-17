public class lambda2 {
    // Functional Interface
    interface FuncInter1 {
        int operation(int a, int b);
    }

    interface FuncInter2 {
        void sayMessage(String message);
    }

    // Performs FuncInter1's operation on 'a' 'b'
    private int operate(int a, int b, FuncInter1 fobj){
        return fobj.operation(a, b);
    }

    public static void main(String[] args) {
        FuncInter1 add = (int x, int y) -> x + y;

        FuncInter1 multiply = (int x, int y) -> x * y;

        lambda2 tobj = new lambda2();

        System.out.println(tobj.operate(5,3, add));
        System.out.println(tobj.operate(2,5,multiply));

        FuncInter2 fobj = message -> System.out.println("Hello" + message);
        fobj.sayMessage("Geek");
    }

    //map(),



}
