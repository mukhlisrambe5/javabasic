package innerclass;

public class Outside {
    String x = "Hello";

    public class Inside{
        String y = "world";

        public void display(){
            System.out.println(x + " " + y);
        }
    }
}
