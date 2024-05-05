package Activities;

public class Activity1 {

    public static void main(String[] args)
    {

        Car myCarObj = new Car();
        myCarObj.make = 2000;
        myCarObj.color="white";
        myCarObj.transmission = "manual";

        myCarObj.displayCharacteristics();
        myCarObj.accelarate();
        myCarObj.brake();

    }
}
