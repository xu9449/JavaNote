@MyAnnotation(name = "Sean", value = "26")
@Person(role = "artist")
@Person(role = "coder")
@Person(role = "PM")
public class TheClass {
    @Deprecated
    public void Test01(){}

    public void Test02(){}

    private void Test03(int a){
        System.out.println(a);
    }

    private  class TheClass2{
        int b = 22;
        public TheClass2() {

        }

        private void Test04(){
            System.out.println("the inner class is successful!");
        }
    }
}



