package com.Kharag;
/**
 * @author kharag
 * @date 03/20/2024
 * writing the circle 2 program
 */

public class CircleIntroduction {
	
	/**
	 * x is the x coordinate of the circle
	 * y is the y coordinate of the circle
	 * radius is the radius coordinate of the circle
	 */
	public int x, y, radius;
	
	/**
	 * This function defaults the x and y coordinate to 0 and radius to 1
	 */
	public CircleIntroduction() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;

	}

	/**
	 * This functions lets the user set the radius of the circle and defaults the x and y coordinate to 0
	 * @param radius is the radius of the circle
	 */
	public CircleIntroduction(int radius) {
		this.x = 0;
		this.y = 0;
		this.radius = radius;
	}

	/**
	 * This function lets the user set  the x coordinate , y coordinate and the radius
	 * @param xcord The X coordinate
	 * @param ycord The Y coordinate
	 * @param rad The radius
	 */
	public CircleIntroduction(int xcord, int ycord, int rad) {
		this.x = xcord;
		this.y = ycord;
		this.radius = rad;
		
	}

	/**
	 * This function prints the equation of the circle
	 */
	public String toString() {
		return "(" + "x-" + this.x + ")^2 " + "+" + " (" + "y-" + this.y + ")^2 " + "= " + this.radius + "^2";
 	}

}
