/* An interface for vehicles, including methods to determine the fastest vehicle and printing vehicles.
 Assignment 5, Question 1, 5 & 6*/
import java.util.ArrayList;

public interface Vehicle {
	String getName();
	int getTopSpeed();
	int getMaxPassengers();

	//Question 5
	static String fastestVehicle(ArrayList<Vehicle> vehicles) {
		Vehicle comp = vehicles.get(0);
		String fastest = null;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getTopSpeed() > comp.getTopSpeed()) { //Comparing each vehicle's speed with the current fastest
				comp = vehicle;
				fastest = vehicle.getName(); //Storing the name of the fastest vehicle
			}
		}
		return fastest;
	}

	//Question 6
	static void printVehicles(ArrayList<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof Car) {
				System.out.format("This car weighs " + ((Car) vehicle).getWeight() + " tonnes\n");
			} else {
				System.out.format("This ship displaces " + ((Ship) vehicle).getDisplacement() + " tonnes of water\n");
			}
		}
	}
}
