package geometricWeb;

import java.util.ArrayList;
import java.util.List;
import java.awt.geom.Point2D;

import main.CreateNumber;

public class GeometricWeb {

	public void geometricWeb(int w, int h, int numDots){
		List<Point2D> points = new ArrayList<Point2D>();
		
		while(points.size()<numDots){
			CreateNumber num = new CreateNumber();
			int x = num.createNumber(w-1, 1);
			int y = num.createNumber(h-1, 1);
			//check if point exists in ArrayList
			Point2D p = new Point2D.Double(x, y);
			if(!points.contains(p)){
				points.add(p);
				System.out.println(x +"," + y);
			}
		}
		System.out.println("Size: " + points.size());
	}
}
