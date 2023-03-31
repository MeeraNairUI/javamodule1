package factorymethod;

public class UseVehicleFactory {
           public static void main(String[] args) {
        	   VehicleIface seltos = VehicleFactory.newInstance("Seltos");
        	   seltos.move();
        	   VehicleIface xcross = VehicleFactory.newInstance("XCross");
        	   xcross.start();
           }
}
