package AnimalSim_AAA;

public class Location {
	
	private int xCoord;
	   private int yCoord;

	   public Location() {
	       xCoord = 0;
	       yCoord = 0;
	   }

	   public Location(int x, int y) {
	       xCoord = x;
	       yCoord = y;
	   }
	   
	   public void update(int x, int y){
	       xCoord = x;
	       yCoord = y;
	   }
	   
	   public int[] getCoordinates(){
	       int[] coordinate = {xCoord, yCoord};
	       return coordinate;
	   }

	   public int getxCoord() {
	       return xCoord;
	   }

	   public int getyCoord() {
	       return yCoord;
	   }

	   @Override
	   public String toString() {
	       return "Location{" + "xCoord=" + xCoord + ", yCoord=" + yCoord + '}';
	   }
	}
