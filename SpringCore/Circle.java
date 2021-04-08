package org.padmini.springcore;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;

public class Circle {
	@Inject
	private Point center;

	public Point getCenter() {
		return center;
	}
	@SuppressWarnings("deprecation")
	@Required
	@Resource(name="cen")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void getInfo() {
		System.out.println("Center of circle is: (" +center.getX()+" , "+center.getY()+")");
	}
	
}
