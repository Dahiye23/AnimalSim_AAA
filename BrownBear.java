package AnimalSim_AAA;

public class BrownBear extends Animal implements Walkable, Swimmable{
	

		   private String subSpecies;

		   public BrownBear() {
		       super.simID = 0;
		       super.location.update(0, 0);
		       super.full = false;
		       super.rested = true;
		       subSpecies = "Alaskan";
		   }

		   public BrownBear(int simID, Location location, String subSpecies) {
		       super(simID, location);
		       this.subSpecies = subSpecies;
		       super.full = false;
		       super.rested = true;
		   }

		   public String getSubSpecies() {
		       return subSpecies;
		   }

		   public void setSubSpecies(String subSpecies) {
		       this.subSpecies = subSpecies;
		   }

		   @Override
		   public String toString() {
		       return "BrownBear{" + "subSpecies=" + subSpecies + "location = "+location.toString()+'}';
		   }

		   @Override
		   public void walk(int direction) {
		     int moveUnit = 3;
		     location.update(location.getxCoord()+direction, location.getyCoord()+moveUnit);
		   }

		   @Override
		   public void swim(int direction) {
		      int moveUnit = 2;
		       location.update(location.getxCoord()+direction, location.getyCoord()+moveUnit);
		   }
		   
		}
