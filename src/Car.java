/* Creating a car object with the vehicle interface
Assignment 5, Question 2 */
import java.util.ArrayList;

public class Car implements Vehicle{
	private String carName;
	private int topSpeed;
	private int maxPassengers;
	private double weight;
	
	public Car(String name, int speed, int passengers, double weigh) {
		if(name == null || name.trim().equals("")){
			throw new IllegalArgumentException("The name of the car can't be blank");
		}
		carName = name;
		if(speed < 0) {
			throw new IllegalArgumentException("Max speed can't be negative");
		}
		topSpeed = speed;
		if(passengers < 1) {
			throw new IllegalArgumentException("Max passengers can't be negative");
		}
		maxPassengers = passengers;
		if(weigh < 0) {
			throw new IllegalArgumentException("Weight can't be negative");
		}
		weight = weigh;
	}
	
	
	public String getName() {
		return carName;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public double getWeight() {
		return weight;
	}
	
	public static void main(String[] args) {
		//Tests for the car class & vehicle interface
		try {
			  Vehicle v = new Car("BMW", 280, 5, 2.1);
			  Car c = new Car("BMW", 280, 5, 2.1);
			  System.out.println(v.getName());
			  System.out.println(v.getTopSpeed());
			  System.out.println(c.getMaxPassengers());
			  System.out.println(c.getWeight());
			} catch (IllegalArgumentException ex) {
			  System.out.println("failure");
			}
		
		Vehicle[] vehicles = new Vehicle[5];
		vehicles[0] = new Ship("Titanic", 39, 3327, 52310);
		vehicles[1] = new Car("Toyota Avensis", 200, 5, 2.02);
		vehicles[2] = new Car("Lamborghini Gallardo", 325, 2, 1.485);
		vehicles[3] = new Ship("Nimitz", 58, 5680, 100020);
		vehicles[4] = new Car("Mazda 3", 190, 5, 1.3);
		System.out.println(vehicles.length);

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getName() + " - " + vehicle.getTopSpeed() + " - " + vehicle.getMaxPassengers());
		}

		//Question 4
		ArrayList<Vehicle> vehicles2 = new ArrayList<>();
		vehicles2.add(new Car("Lamborghini Gallardo", 325,2,1.45));
		vehicles2.add(new Ship("Titanic", 39,3327, 52310));
		vehicles2.add(new Car("Mazda 3", 190,5,1.3));
		vehicles2.add(new Car("Toyota Avensis", 200,5,2.02));
		vehicles2.add(new Ship("Nimitz", 58,5680, 100020));
		Vehicle.printVehicles(vehicles2);

		ArrayList<Vehicle> vehicles3 = new ArrayList<>();
		vehicles3.add(new Car("Mazda 3", 190,5,1.3));
		vehicles3.add(new Car("Lamborghini Gallardo", 325,2,1.45));
		vehicles3.add(new Ship("Titanic", 39,3327, 52310));
		vehicles3.add(new Car("Toyota Avensis", 200,5,2.02));
		vehicles3.add(new Ship("Nimitz", 58,5680, 100020));
		System.out.println(Vehicle.fastestVehicle(vehicles3));
	}
}