package HW12.shop;

import HW12.vehicle.Vehicle;
import HW12.vehicle.VehicleType;
import HW12.vehicle.LongBus;
import HW12.vehicle.ShortBus;

public class BusVehicleShop extends VehicleShop {

    @Override
    protected Vehicle createVehicle(VehicleType type) {
        Vehicle vehicle = null;
        switch (type) {
                case LONGBUS:
                    vehicle = new LongBus();
                    break;
                case SHORTBUS:
                    vehicle = new ShortBus();
                    break;
        }
        return vehicle;
    }

    @Override
    public Vehicle orderVehicle(VehicleType type) {
        return super.orderVehicle(type);
    }

}
