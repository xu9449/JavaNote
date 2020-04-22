
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        int a = 2;
        Pet obj = new Pet(a);
        Class cls = obj.getClass();
        System.out.println("The name of the class is " + cls.getName());

        Constructor constructor2;
        try{
            constructor2 = cls.getConstructor();
            System.out.println("the name of the constructor are "+ constructor2.getName());
        } catch (Exception e){
            System.out.println("Some problems here...");
        }


        Constructor[] constructor = cls.getConstructors();
        System.out.println("the name of the constructors are " + constructor[0].getName() );

        Method[] methods = cls.getDeclaredMethods();
        for(Method method:methods)
            System.out.println(method.getName());

        Method methodcall = null;
        try {
            methodcall=cls.getDeclaredMethod("Test02");
            methodcall.setAccessible(true);
            methodcall.invoke(obj);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

}
