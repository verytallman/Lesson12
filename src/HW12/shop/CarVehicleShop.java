package HW12.shop;

import HW12.vehicle.Vehicle;
import HW12.vehicle.VehicleType;
import HW12.vehicle.HatchBack;
import HW12.vehicle.SUV;
import HW12.vehicle.Sedan;

public class CarVehicleShop extends VehicleShop{

    @Override
    protected Vehicle createVehicle(VehicleType type) {
        Vehicle vehicle = null;
        switch (type) {
            case SUV:
                vehicle = new SUV();
                break;
            case HATCHBACK:
                vehicle = new HatchBack();
                break;
            case SEDAN:
                vehicle = new Sedan();
                break;
        }
        return vehicle;
    }

    @Override
    public Vehicle orderVehicle(VehicleType type) {
        return super.orderVehicle(type);
    }
}
