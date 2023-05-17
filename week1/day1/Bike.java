package week1.day1;

public class Bike {
 public void driveBike() {
	 System.out.println("Drive Bike");
 }
 public void applyBrake() {
	 System.out.println("Apply Brake");
	 
 }
 public void soundHorn() {
	 System.out.println("Sound Horn");
 }
 public void isPuncture() {
	 System.out.println("Is the tyre punctured?");
 }
 public static void main(String[] args) {
	Bike B = new Bike();
	B.applyBrake();
	B.driveBike();
	B.isPuncture();
	B.soundHorn();
	
	}
}
