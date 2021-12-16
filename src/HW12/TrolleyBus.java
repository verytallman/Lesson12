package HW12;

public class TrolleyBus extends Vehicle{
    private String colour;
    private String powerCapacity;

    public TrolleyBus(String colour, String powerCapacity) {
        this.colour = colour;
        this.powerCapacity = powerCapacity;
    }

    @Override
    public void createVehicle() {
        System.out.println("The Trolleybus is created");
        System.out.println("Colour -"+colour);
        System.out.println("Battery capacity "+powerCapacity);
    }
}
