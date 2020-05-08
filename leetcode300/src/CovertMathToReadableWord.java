import java.util.ArrayList;
import java.util.List;

public class CovertMathToReadableWord
{

    public String covert(int input){
        if(input == 0){
            return "zero";
        }
        if(input/1000 > 7){
            return "it is out of the memory";
        }
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < input/1000; i++){
            list.add(input%1000);
        }

        System.out.println(

        );
    }

    String helper(int input) {
        StringBuilder sb = new StringBuilder();
        if(input/100 > 0){
            int x = input%100;
            sb.append('几'+"hundred");
        }
        if(input/10 > 0){
            int y = input%10;
            sb.append('几'+'s');
        }
    }

    String helper2(int input){
        if(input == 1){
            return "one";
        }
    return "string";
    }

    String helper3(int input){
        int a = input/10;
    }

}
