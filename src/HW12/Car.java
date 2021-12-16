package HW12;

public class Car extends Vehicle{
    private String colour;
    private String typeOfBody;
    private int horsePowers;

    public Car(String colour, String typeOfBody, int horsePowers) {
        this.colour = colour;
        this.typeOfBody = typeOfBody;
        this.horsePowers = horsePowers;
    }

    @Override
    public void createVehicle() {
        System.out.println("The Car is created.");
        System.out.println("Colour - "+colour);
        System.out.println("Type of body - "+typeOfBody);
        System.out.println("Amount of horse powers - "+horsePowers);
    }
}
