import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lambdatest {
    public static void main(String[] args) {
        List<Bike> bikes = new ArrayList<>();
        Bike b1 = new Bike();
        b1.setWheelShap("SQUARE");
        b1.setBrand("jiefang");
        Bike b2 = new Bike();
        b2.setWheelShap("ROUND");
        b2.setBrand("weilai");
        Bike b3 = new Bike();
        b3.setWheelShap("ROUND");
        b3.setBrand("niuniu");
        bikes.add(b1);
        bikes.add(b2);
        bikes.add(b3);
        // filter
        List<Bike> resFilter = bikes.stream().filter(bike -> bike.getWheelShap() == "ROUND").collect(Collectors.toList());
        System.out.println(resFilter);
        // map
        List<String> resMap = bikes.stream().map(bike -> bike.getWheelShap()).collect(Collectors.toList());
        System.out.println(resMap);
         //group by
        Map<String, List<Bike>> map
                = bikes.stream().collect(Collectors.groupingBy(Bike::getWheelShap));
        System.out.println(map);

//        Map<String, List<String>> map2


        // flatmap
        List<Bike> resFlat = map.entrySet().stream().flatMap(b -> b.getValue().stream()).collect(Collectors.toList());
        System.out.println(resFlat);
        List<Bike> flatMap= map.values().stream().flatMap(bikes1 -> bikes1.stream()).collect(Collectors.toList());
        System.out.println(flatMap);
//        Map<String, List<String>> inputmap
//                = bikes.stream().collect(Collectors.groupingBy(Bike::getBrand,
//                Bike::getWheelShap));
//        System.out.println(inputmap);

    }



}
