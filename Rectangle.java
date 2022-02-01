/*
 * Christopher Bazan
 * June 14th 2019
 * Rectangle Circle Program
 * No errors, runs fine
*/
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args){
	System.out.println("Calculating Rectangle Area With Circles");
	System.out.print("Input number of circles: ");
	
		Scanner s = new Scanner(System.in);
		int circles = s.nextInt();
		
		//made to plot points 
		double xvalue[] = new double [circles];
		double yvalue[] = new double [circles];
		
		//made to see how far points extend
		double radius[] = new double [circles];
		
		//hold value meanwhile before inputs update with a new max/min
		double maxleft = 99999;
		double maxright = -99999;
		double maxup = -99999;
		double maxdown = 99999;
		
		
		
		//Inputting data as many times as there is circles
		for (int i=0; i<circles; i++) {
			System.out.print("Input circle "+(i+1)+" x-value, y-value, and radius: ");
			xvalue[i] = s.nextDouble();
			yvalue[i] = s.nextDouble();
			radius[i] = s.nextDouble();
			
			}
		
		
			//Maximum x value loop
			for(int i=0; i<circles; i++) {
	
				if(xvalue[i]+radius[i]>=maxright)
				maxright = xvalue[i]+radius[i];
				}
			
			//Maximum y value loop
			for(int i=0; i<circles; i++) {
				
				if(yvalue[i]+radius[i]>=maxup)
				maxup = yvalue[i]+radius[i];
				}
			
			//Minimum x value loop
			for(int i=0; i<circles; i++) {
	
				if(xvalue[i]-radius[i]<=maxleft)
				maxleft = xvalue[i]-radius[i];
				}
			
			//Minimum y value loop
			for(int i=0; i<circles; i++) {
				
				if(xvalue[i]-radius[i]<=maxdown)
				maxdown = yvalue[i]-radius[i];
				}
	
			//finding length and width and area is calculated with the two values
			double length = Math.abs(maxright - maxleft);
			double width = Math.abs(maxup - maxdown);
			double area = length * width;
			
			System.out.println("Max and Min x values (considering radius): "+maxright+" and "+maxleft+". Total length: "+length);
			System.out.println("Max and Min y values (considering radius): "+maxup+" and "+maxdown+". Total width: "+width);
			System.out.println("Rectangle Area: "+area); 
	 	
	}
}
