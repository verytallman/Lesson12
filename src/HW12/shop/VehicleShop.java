package HW12.shop;

import HW12.vehicle.Vehicle;
import HW12.vehicle.VehicleType;

public abstract class VehicleShop {
    protected abstract Vehicle createVehicle(VehicleType type);

    public Vehicle orderVehicle(VehicleType type) {

        Vehicle vehicle = createVehicle(type);
        vehicle.makeVehicle(type.name());
        vehicle.paintVehicle(type.name());

        System.out.println("Ваша машина - " + type.name() + ".");
      return vehicle;
    }

}
