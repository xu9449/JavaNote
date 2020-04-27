
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Class aClass = TheClass.class;
        Annotation annotation = aClass.getAnnotation(MyAnnotation.class);
        Annotation annotation1 = aClass.getAnnotation(Persons.class);



        if(annotation instanceof MyAnnotation){
            MyAnnotation myAnnotation = (MyAnnotation) annotation;
            System.out.println("name:" + myAnnotation.name());
            System.out.println("value:" + myAnnotation.value());
        }

        if(annotation1 instanceof Persons){
            Persons myAnnotation = (Persons) annotation1;
            System.out.println("name:" + Arrays.toString(myAnnotation.value()));
        }





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
