public class Desk {
    // constructor 是 private的,让用户不可以随便new instance
    private static Desk instance;
    private Desk() {

    }
    public void sit(){

    }

    public static Desk getInstance(){
        if(instance != null) return instance;
        instance = new Desk();
        return instance;
    }

    public static void main(String[] args) {
        Desk d = Desk.getInstance();

    }

    // eager and lazy
    // eagerload 开始及new instance
    // lazyload 则需要在getinstance里面判断 再创造
    // eager load 是 thread safe

}
