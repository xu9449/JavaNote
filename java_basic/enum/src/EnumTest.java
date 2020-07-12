public class EnumTest {
    public enum WeekEnum{
        Sunday("Sun"),
        Monday("Mon"),
        Tuesday("Tue"),
        Wednesday("Wed"),
        Thursday("Thu"),
        Friday("Fri"),
        Saturday("Sat");

        private String date;

        private WeekEnum(String date){
            this.date = date;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        @Override
        public String toString(){
            return date;
        }
    }

    public static void main(String[] args) {
        System.out.println(WeekEnum.Friday.compareTo(WeekEnum.Monday));
        // 没有重写 toString 方法
        for (WeekEnum we : WeekEnum.values()) {
            System.out.println(we);
        }

        System.out.println(WeekEnum.valueOf(WeekEnum.class, "Monday"));

    }
}

