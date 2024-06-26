/**
 * Application to test all classes, interfaces, and exceptions
 * @author Hannes Nilsson
 * @version 1.0
 * Final project
 * CS1313ON
 */
import java.util.ArrayList;
public class Application {

	public static void main(String[] args) {
		//*********************************************
		// 				Location Tests
		//*********************************************
			Location l1 = new Location(); //Empty argument constructor test
			Location l2 = new Location(1,2); //Preferred constructor test (Also tests setters)
			Location l3 = new Location(-1,2);//Exception test, should set x to 0
			l1.update(2, 3);//update test
			System.out.println("("+l1.getCoordinates()[0]+","+l1.getCoordinates()[1]+")");//getCoordinates test
			System.out.println(l3.getxCoord());//getters test
			System.out.println(l3.getyCoord());
			l2.setxCoord(20);
			l2.setyCoord(30);
			System.out.println("l2 coordinates=" + "("+l2.getCoordinates()[0]+","+l2.getCoordinates()[1]+")");
		//*********************************************
		// 				Animal Tests
		//*********************************************
		//Cannot instantiate an abstract class but methods tested in other calsses
		//*********************************************
		// 				Goldfinch Tests
		//*********************************************
			Goldfinch g1 = new Goldfinch();//Empty argument constructor test
			Goldfinch g2 = new Goldfinch(1,new Location(1,1),6.0);//Preferred constructor test (Also tests setters)
			Goldfinch g3 = new Goldfinch(2,new Location(2,2),4.0);//Exception test
			System.out.println("g1 location=" + "("+g1.location.getCoordinates()[0]+","+g1.location.getCoordinates()[1]+")");
			g1.fly(new Location(5,5));//fly test
			System.out.println("g1 location=" + "("+g1.location.getCoordinates()[0]+","+g1.location.getCoordinates()[1]+")");
			System.out.println("g2 location=" + "("+g2.location.getCoordinates()[0]+","+g2.location.getCoordinates()[1]+")");
			g2.walk(1);//walk tests
			g2.walk(0);
			System.out.println("g2 location=" + "("+g2.location.getCoordinates()[0]+","+g2.location.getCoordinates()[1]+")");
			System.out.println(g3.toString());
			g3.eat();//eat test
			g3.sleep();//sleep test
			System.out.println(g3.isFull());//isFull test
			System.out.println(g3.isRested());//isRested test
			g3.setSimID(0);//exception test
			System.out.println(g3.getSimID());
		//*********************************************
		// 				BrownBear Tests
		//*********************************************
			BrownBear b1 = new BrownBear();//Empty argument constructor test
			BrownBear b2 = new BrownBear(3,new Location(10,10),"Alaskan");//Preferred constructor test (Also tests setters)
			BrownBear b3 = new BrownBear(3,new Location(20,20),"Swedish");//Exception test
			System.out.println("b1 location=" + "("+b1.location.getCoordinates()[0]+","+b1.location.getCoordinates()[1]+")");
			b1.walk(1);//walk test
			b1.walk(0);
			System.out.println("b1 location=" + "("+b1.location.getCoordinates()[0]+","+b1.location.getCoordinates()[1]+")");
			System.out.println("b2 location=" + "("+b2.location.getCoordinates()[0]+","+b2.location.getCoordinates()[1]+")");
			b2.swim(0);//swim test
			b2.swim(1);
			System.out.println("b2 location=" + "("+b2.location.getCoordinates()[0]+","+b2.location.getCoordinates()[1]+")");
			System.out.println(b3.toString());
			b3.eat();//eat test
			b3.sleep();//sleep test
			System.out.println(b3.isFull());//isFull test
			System.out.println(b3.isRested());//isRested test
			b3.setRested(true);
			b3.setFull(true);
			System.out.println(b3.isFull());
			System.out.println(b3.isRested());
		//*********************************************
		// 				Generics Tests
		//*********************************************
		ArrayList<Animal> arL = new ArrayList<Animal>(4);
		arL.add(new BrownBear(1,new Location(1,2),"European"));
		arL.add(new BrownBear(2,new Location(10,20),"Alaskan"));
		arL.add(new Goldfinch(3,new Location(3,1),6.0));
		arL.add(new Goldfinch(4,new Location(30,10),11.0));
			
		System.out.println(arL.toString());

	}//end main

}//end class
