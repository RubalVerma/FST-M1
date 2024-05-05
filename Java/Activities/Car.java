package Activities;

public class Car {
  String color;
  String transmission;
  int make;
  int tyres;
  int doors;


  Car(){
    tyres=4;
    doors=4;
  }

  public void displayCharacteristics()
  {
    System.out.println("car color is "+color);
    System.out.println("transmission is "+transmission);
    System.out.println("making of car is " +make);
    System.out.println("Total tyres of car are " +tyres);
    System.out.println("Total Doors of car are " +doors);
  }


  public void accelarate()
  {
      System.out.println("Car is moving forward");
  }

    public void brake()
    {
        System.out.println("Car has stopped");
    }
}
