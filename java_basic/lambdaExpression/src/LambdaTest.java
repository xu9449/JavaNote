//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class LambdaTest {
//    @FunctionalInterface
//    interface MyString{
//        String myStringFunction(String str);
//    }
//
//    static class MyStringImpl implements MyString {
//        public  MyStringImpl(){};
//        @Override
//        public String myStringFunction(String str) {
//            return "Good Morning " + str + "!";
//        }
//    }
//
//    public static void main(String[] args) {
//        MyString classString = new LambdaTest.MyStringImpl();
//        System.out.println(classString.myStringFunction("Ryo"));
//
//        // 也可以new interface 但是需要override它的method
//        MyString classString2 = new MyString() {
//            @Override
//            public String myStringFunction(String str) {
//                return "Good Afternoon " + str + "!";
//            }
//        };
//
//        System.out.println(classString2.myStringFunction("Sean"));
//
//        // "->" means implementation
//        // anonymous function
//        MyString value = (str) -> "Good Evening" + str + "!";
//
//        System.out.println(value.myStringFunction("Sean"));
//
//        // For each function
//        List<String> items = new ArrayList<>();
//
//        items.add("A");
//        items.add("B");
//        items.add("C");
//        items.add("D");
//        items.add("E");
//        for(String item:items) {
//            System.out.println(item);
//        }
//        items.forEach((str) -> {
//            System.out.println(str);
//        });
//
//        // 写 comparator
////        Comparator<Employee> ageCompatator = {Employee a, Employee b} -> (int)(a.getSallery() - b.getSallery());
////    }
////
////    public class Employee {
////
////        public int getSallery( ){
////
////            int sallery = 0;
////
////            return sallery;
////        }
//
////        // FILTER
////        bikes.stream().filter(b -> b.getWheelShape() == WheelShape.SQUARE).collect(Collector.toList());
//
////        // Map 对结构进行改变
////        Bike -> setWheelShape
////
////                bikes.stream().map(b -> b.getWheelShape()).collect(Collectors.toList());
//        //groupBy(Bike::getWheelShape));
//        // Map<WheelShape, List<Bike>> ByWheelShape = bike.stream().collectors.groupingBy(Bike::getWheelShape)
//
//
//        //flatMap  拼接起来
//        List<List<Integer>> ls;
//        ls.stream().flatMap(l ->l.stream()).colllect(Collectors.toList());
//
//        Map<String, Employee> mapEmployee
//                List<Employee>
//
//        List<Employee> result;
//        result = mapEmployee.values().stream().collect(Collectors.toList());
//
//        List<Employee> ls;
//        Map<String, Employee> mapEmployee
//
//        Map<String, Employee> Result = new HashMap<String, Employee>();
//        Map<String, Employee> tmp = ls.stream().map(e -> Map<e.getName(), e>).collect(Collectors.toMap());
//        Result.putAll(tmp);
//
//
////        Map<Integer, String> studentsMap = students.stream().collect(Collectors.toMap(Student :: getId, Student :: getName));
////        return studentsMap;
//
//        //
////        public static Map<Integer,String> listToHashmapJava8WithDuplicates(List<Student> students)
////        {
////            Map<Integer, String> studentsMap = students.stream().collect(Collectors.toMap(Student :: getId, Student :: getName
////                    , (oldValue, newValue) -> oldValue));
////            return studentsMap;
////        }
////        //
//
//    }
//
//    List<Employee> agedEmplpoyee = new ArrayList<Employee>();
//    agedEmployee.stream().filter(e->(e.getAged() >= 50)).collect(collectors.toList());
//
//
//}
