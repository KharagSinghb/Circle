package com.Kharag;
/**
 * @author kharag
 * @date 03/20/2024
 * writing the circle 2 program
 */

public class Circle {
	// Instance variables, exist for all classes
	/**
	 * x and y are coordinates of the circles center
	 *  radius holds the value of Radius
	 */
	private int x, y, radius;
	
	// default constructor
	/**
	 * Default constructor
	 */
	public Circle() {
		
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	
	// constructor again
	/**
	 * Does not let the radius of the circle be bigger than 100 and lesser than 0
	 * @param radius Calls variable radius
	 */
	public Circle(int radius) {
		this();
		
		if (radius > 100) {
			this.radius = 100;
		} else if (radius < 0) {
			this.radius = 1;
		} else {
			this.radius = radius;
		}
	}
	
	
	// constructor again
	/**
	 * limits the value of the variable x , y and z
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle(int x, int y, int radius) { // variable names are made same for convenience
		// modify instance variables/attributes on object creation, to be specific to each new object
		if (x > 100) {
			this.x = 100;
		} else if (x < -100) {
			this.x = -100;
		} else {
			this.x = x;
		}
		
		if (y > 100) {
			this.y = 100;
		} else if (y < -100) {
			this.y = -100;
		} else {
			this.y = y;
		}
		
		if (radius > 100) {
			this.radius = 100;
		} else if (radius < 0) {
			this.radius = 1;
		} else {
			this.radius = radius;
		}
	}
	
	/**
	 * Adds two circles to create a new circle
	 * @param c a new type of circle
	 */
	public void combineCircle(Circle c) {
		this.radius += c.radius;
		this.x = (this.x + c.x) / 2;
		this.y = (this.y + c.y) / 2;
	}
	
	/**
	 * calls the function/method combineCircle
	 */
	public void doubleCircle() {
		combineCircle(this);
	}
	
	/**
	 * getter for radius
	 * @return radius
	 */
	public int getRadius() {
		return this.radius;
	}
	
	/**
	 * getter for the value entered of the x and y coordinates
	 * @return origin
	 */
	public int[] getOrigin() {
		int[] origin = {this.x, this.y};
		return origin;
	}
	
	/**
	 * gives the diameter of the circle
	 * @param radius gets the radius to calculate the diameter
	 * @return diameter
	 */
	private int diameter(int radius) {
		return radius*2;
	}
	
	/**
	 * Gives the area of the circle
	 * @return area
	 */
	public double area() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	/**
	 * returns the circumference of the circle
	 * @return
	 */
	public double perimeter() {
		return Math.PI*diameter(this.radius);
	}
	
	
	// void method that does not return anything but updates the current 'this' object
	/**
	 * returns the new coordinates of the circle after its center is moved
	 * @param x coordinate
	 * @param y coordinate
	 */
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	/**
	 *  changes the radius of the circle
	 * @param radius Calls radius
	 */
	public void resize(int radius) {
		this.radius = radius;
	}
	
	
	// funky method that will output its returned string when object of class is output or printed
	/**
	 * returns the equation of the circle
	 */
	public String toString() {
		return "(x-" + this.x + ")^2 + (y-" + this.y + ")^2 = " + this.radius + "^2";
	}
}