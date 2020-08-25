/* Creating a ship object with the vehicle interface
 Assignment 5, Question 3 */
public class Ship implements Vehicle {
	private String shipName;
	private int topSpeed;
	private int maxPassengers;
	private double displacement;
	
	public Ship(String name, int speed, int passengers, double displace) {
		if(name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("The name of the car can't be blank");
		}
		shipName = name;
		if(speed < 0) {
			throw new IllegalArgumentException("Max speed can't be negative");
		}
		topSpeed = speed;
		if(passengers < 1 || passengers > 9999) {
			throw new IllegalArgumentException("Max passengers can't be less than 1 0r more than 10000");
		}
		maxPassengers = passengers;
		if(displace < 0) {
			throw new IllegalArgumentException("Water displaced can't be negative");
		}
		displacement = displace;
	}

	public String getName() {
		return shipName;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public double getDisplacement() {
		return displacement;
	}

	public static void main(String[] args) {
		//A test for the ship class
		try {
			  Vehicle v = new Ship("Simmons", 6, 10, 14.15);
			  Ship s = new Ship("Simmons", 6, 10, 14.15);
			  System.out.println(v.getName());
			  System.out.println(v.getTopSpeed());
			  System.out.println(s.getMaxPassengers());
			  System.out.println(s.getDisplacement());
			} catch (IllegalArgumentException ex) {
			  System.out.println("failure");
			}
	}

}
