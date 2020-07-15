import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestSimpleDateFormat {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // create threadlocal
//    static ThreadLocal<DateFormat> safeSdf = new ThreadLocal<DateFormat>(){
//        @Override
//        protected SimpleDateFormat initialValue(){
//            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        }
//    };


    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
//                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            System.out.println(sdf.parse("2020-06-15 20:27:24"));

                    } catch (ParseException e){
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
    }
}

// reason: calender has thread unsafe variables
