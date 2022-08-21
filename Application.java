package AnimalSim_AAA;


import java.util.ArrayList;
import java.util.Arrays;

public class Application {
	
	


	

	   public static void main(String[] args) {

	       

	       System.out.println("***********************Location Test******************************");
	       Location goldFinchLocation = new Location(25, 30);
	       System.out.println("x-coord: " + goldFinchLocation.getxCoord());
	       System.out.println("y-coord: " + goldFinchLocation.getyCoord());
	       goldFinchLocation.update(15, 6);
	       System.out.println("updated coordinates: " + Arrays.toString(goldFinchLocation.getCoordinates()));

	       System.out.println("");

	       Location bearLocation = new Location(50, 45);
	       System.out.println("x-coord: " + bearLocation.getxCoord());
	       System.out.println("y-coord: " + bearLocation.getyCoord());
	       bearLocation.update(12, 4);
	       System.out.println("updated coordinates: " + Arrays.toString(bearLocation.getCoordinates()));
	       System.out.println("******************************************************************");
	       System.out.println("");

	       System.out.println("************************Animal Test**********************************");
	       //Animal animal = new Animal();
	       System.out.println("Animal class is abstract class cannot be instantiated which is correct");
	       System.out.println("************************Animal Test**********************************");
	       System.out.println("");
	       
	       System.out.println("*********************GoldFinch Test**********************************");
	       Goldfinch goldfinch = new Goldfinch(1, goldFinchLocation, 25.0);
	       System.out.println("Goldfinch current location: " + goldfinch.toString());
	       goldfinch.eat();
	       goldfinch.sleep();
	       goldfinch.fly(new Location(48, 50));
	       System.out.println("Goldfinch after flying: " + goldfinch.toString());

	       goldfinch.walk(68);
	       System.out.println("Goldfinch after walking: " + goldfinch.toString());

	       System.out.println("Goldfinch is full? " + goldfinch.isFull());
	       System.out.println("Goldfinch is resting? " + goldfinch.isRested());
	       System.out.println("**********************************************************************");
	       System.out.println("");
	       
	       System.out.println("*********************Brwonbear Test**********************************");
	       BrownBear brownBear = new BrownBear(2, bearLocation, "Grizzly");
	       System.out.println("Brown bear current location: " + brownBear.toString());
	       brownBear.eat();
	       brownBear.sleep();
	       brownBear.walk(20);
	       System.out.println("Brown bear after walking: " + brownBear.toString());

	       brownBear.swim(80);
	       System.out.println("Brown bear after swimming: " + brownBear.toString());

	       System.out.println("Bear is full? " + brownBear.isFull());
	       System.out.println("Bear is resting? " + brownBear.isRested());
	       System.out.println("*********************************************************************");
	       System.out.println("");
	       
	       System.out.println("***************************Generic Test*******************************");
	       ArrayList<Animal> list = new ArrayList<>();
	       list.add(brownBear);
	       list.add(goldfinch);
	       
	       for(Animal animalList: list){
	           System.out.println(animalList.toString());
	       }
	       
	       System.out.println("**********************************************************************");
	   }

	}