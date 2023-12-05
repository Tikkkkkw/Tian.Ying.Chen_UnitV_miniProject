public class Main {
    public static void main(String[] args) {

        System.out.println("Expected results:  \n08:59:58 \n09:00:08");
        System.out.println("Actual results:");

        Time time1 = new Time(8, 59, 58);
        System.out.println(time1);
        for (int i = 0; i < 10; i++){
         time1.tick();
        }
        System.out.println(time1);
        System.out.println();


        System.out.println("Expected results:  \n23:59:56 \n00:00:01");
        System.out.println("Actual results:");
        Time time3 = new Time(23, 59, 56);
        System.out.println(time3);
        for (int i = 0; i < 5; i++){
            time3.tick();
        }
        System.out.println(time3);
        System.out.println();


        System.out.println("Expected results:  \n10:14:43 \n18:45:12");
        System.out.println("Actual results:");
        Time time4 = new Time(10, 14, 43);
        System.out.println(time4);
        Time time5 = new Time(8, 30, 29);
        time4.add(time5);
        System.out.println(time4);





    }
}