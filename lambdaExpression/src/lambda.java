/*
    functional interface：
    Interface can not be new in old java, now we can write a anonymous class to initiate
    -> 代表的是一个implementation 很简单的，不需要写多个class，直接写两行代码。
    lambda 好处： 代码简单，马上就可以implement
           坏处： 不可以像其他class写了可以到处重用，需要不断的implementation
    经常使用的 lambdafunction
 */

//

import java.util.Comparator;

interface FuncInterface{
    void abstractFun(int x);
    default void normalFun(){
        System.out.println("Hello");
    }
}



public class lambda {
    public static void main(String[] args) {
        FuncInterface fobj = (int x) -> System.out.println(2 * x);

        fobj.abstractFun(5);
    }



    // 经常使用的lambda function

    // items.forEach((String str) -> {

    // });

    // 快速写一个 comparator
        Comparator<Integer> slaruComparator = (a1, a2) ->(int)(a1 - a2);

    // bikes.stream().filter(b -> b.getWheelShap() == WheelShap.SQUARE).collect(Collectors.toList());
    // groupby 所有的变成一个map的形式


}
