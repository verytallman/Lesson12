package HW12;

import HW12.shop.BusVehicleShop;
import HW12.shop.CarVehicleShop;
import HW12.shop.VehicleShop;
import HW12.vehicle.VehicleType;

public class App {
    public static void main(String[] args) {
        VehicleShop busVehicleShop = new BusVehicleShop();
        busVehicleShop.orderVehicle(VehicleType.LONGBUS);

        VehicleShop carVehicleShop = new CarVehicleShop();
        carVehicleShop.orderVehicle(VehicleType.SEDAN);
    }

}
