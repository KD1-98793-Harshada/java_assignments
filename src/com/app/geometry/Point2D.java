package com.app.geometry;
import static java.lang.Math.*;

import java.util.Scanner; 


public class Point2D {
	int x ;
	int y ;
	
	public Point2D() {
		
	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getDetails() {
		return this.x + this.y;
	}
	
	public boolean isEqual(Point2D p) {
		return this.x == p.x && this.y == p.y;	
	}
	
	public double CalculateDistance(Point2D p) {
		return Math.sqrt((Math.pow(this.x - p.x,2) + Math.pow(this.y - p.x,2)));
	}

}
