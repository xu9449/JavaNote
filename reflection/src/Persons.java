import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Persons {
    Person[] value();
}

@Repeatable(Persons.class )
@interface Person{
    String role () default " ";
}



