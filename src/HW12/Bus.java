package HW12;

public class Bus extends Vehicle{
    private String colour;
    private int horsePowers;

    public Bus(String colour, int horsePowers) {
        this.colour = colour;
        this.horsePowers = horsePowers;
    }

    @Override
    public void createVehicle() {
        System.out.println("The Bus is created.");
        System.out.println("Colour - "+colour);
        System.out.println("Amount of horse powers - "+horsePowers);
    }
}
