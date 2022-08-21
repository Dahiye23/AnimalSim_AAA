package AnimalSim_AAA;

public class Animal {
	
	protected int simID;
	   protected Location location;
	   protected boolean full;
	   protected boolean rested;

	   public Animal() {
	       simID = 0;
	       location.update(0, 0);
	       full = false;
	       rested = true;
	   }

	   public Animal(int simID, Location location) {
	       this.simID = simID;
	       this.location = location;
	   }

	   public boolean eat() {

	       double min = 0;
	       double max = 1;
	       double random = (double) Math.floor(Math.random() * (max - min + 1) + min);

	       if (random <= 0.5) {
	           full = false;
	       } else {
	           full = true;
	       }

	       return full;
	   }

	   public boolean sleep() {
	       double min = 0;
	       double max = 1;
	       double random = (double) Math.floor(Math.random() * (max - min + 1) + min);

	       if (random <= 0.5) {
	           rested = false;
	       } else {
	           rested = true;
	       }

	       return rested;
	   }

	   public int getSimID() {
	       return simID;
	   }

	   public void setSimID(int simID) {
	       this.simID = simID;
	   }

	   public Location getLocation() {
	       return location;
	   }

	   public void setLocation(Location location) {
	       this.location = location;
	   }

	   public boolean isFull() {
	       return full;
	   }

	   public void setFull(boolean full) {
	       this.full = full;
	   }

	   public boolean isRested() {
	       return rested;
	   }

	   public void setRested(boolean rested) {
	       this.rested = rested;
	   }

	public void fly(Location l) {
		// TODO Auto-generated method stub
		
	}

	public void walk(int direction) {
		// TODO Auto-generated method stub
		
	}

	public void swim(int direction) {
		// TODO Auto-generated method stub
		
	}
	   
	   
	}

