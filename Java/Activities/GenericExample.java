package Activities;

public class GenericExample {
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println(1);
        System.out.println(true);


    }

    public static <T> T echo2(T input)
    {
        return input;
    }
}
