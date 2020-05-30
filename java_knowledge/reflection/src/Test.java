
import javafx.geometry.BoundingBox;

import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class aClass = TheClass.class;
        Annotation annotation = aClass.getAnnotation(MyAnnotation.class);
        Annotation annotation1 = aClass.getAnnotation(Persons.class);

        TheClass tt = new TheClass();
        Class yy = tt.getClass();
        Class test = Class.forName("TheClass");


        Method ttttt = yy.getDeclaredMethod("Test03", int.class) ;
        ttttt.setAccessible(true);

        try{

            // 如何通过inner class 取出
            // 要通过constructor， 然后创建一个constructor的object，然后在调用method的时候，通过inner constructor来调用
            TheClass outerObject = new TheClass();

            Class innerClass = Class.forName("TheClass$TheClass2");

            Constructor innerCons = innerClass.getConstructor(TheClass.class);
            innerCons.setAccessible(true);
            Object obj = innerCons.newInstance(outerObject);


            Method innerMethod = innerClass.getDeclaredMethod("Test04");

            innerMethod.setAccessible(true);


            innerMethod.invoke(obj);



            }catch (Exception e) {
            System.out.println("no");
        }



        ttttt.invoke(tt, 33);



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
