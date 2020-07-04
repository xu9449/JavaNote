import java.io.IOException;

public class TryCatch {
    int count = 0;
    void A() throws Exception{
        try{
            count++; //1
            try{
                count++;//2
                try{
                    count++; //3
                    throw new Exception();
                } catch (IOException ex){
                    count++; //4
                    System.out.println("test1");
                    throw ex;
                } catch (Exception ex){
                    count++;//5
                    System.out.println("test2");
                    throw new Exception();
                }
            }catch (Exception ex){
                count++;//6
                System.out.println("test3");
            }
        }
        finally {
            System.out.println("the end");
        }
    }
    void display(){
        System.out.println(count);
    }
    public static void main(String[] args) throws Exception {
        TryCatch obj = new TryCatch();
        obj.A();
        obj.display();
    }
}
