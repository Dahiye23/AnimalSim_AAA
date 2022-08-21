package AnimalSim_AAA;

import javax.management.InvalidApplicationException;

//public class GoldFinch extends Animal implements Walkable, Flyable{
	
	public class Goldfinch extends Animal implements Walkable, Flyable {
	
	private double wingSpan;

	   public Goldfinch() {
	       super.simID = 0;
	       super.location.update(0, 0);
	       super.full = false;
	       super.rested = true;
	       wingSpan = 9.0;
	   }

	   public Goldfinch(int simID, Location location, double wingSpan) {
	       super(simID, location);
	       this.wingSpan = wingSpan;
	       super.full = false;
	       super.rested = true;
	   }

	   public double getWingSpan() {
	       return wingSpan;
	   }

	   public void setWingSpan(double wingSpan) {
	       this.wingSpan = wingSpan;
	   }

	   @Override
	   public String toString() {
	       return "Goldfinch{" + "wingSpan=" + wingSpan +"location ="+location.toString() +'}';
	   }

	   @Override
	   public void walk(int direction) {

	       int moveUnit = 1;
	       location.update(location.getxCoord() + direction, location.getyCoord() + moveUnit);
	   }

	   @Override
	   public void fly (Location l) {
	       super.location.update(l.getxCoord(), l.getyCoord());
	   }

	}
