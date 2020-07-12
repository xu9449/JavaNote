package DesignPatern;


class Computer {
    public void Comparator(){

    }
}
public class FacoryPattern {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new SERVER(ram, hdd, cpu);
        return null;
    }
}
