/** @author luigimartin.petrella@gmail.com
 *  
 */

package it.lmpetrella.gshapes;

public abstract class Shape {

	protected double center_lat;
	protected double center_lon;
	protected double radius;
	protected double height;
	protected Coordinates coordinates;
	
	public Shape(){
		this.center_lat=0;
		this.center_lon=0;
		this.radius=0;
		this.height=0;
		this.coordinates = new Coordinates();
	}
	

		
	public double getCenter_lat() {
		return center_lat;
	}

	public void setCenter_lat(double center_lat) {
		this.center_lat = center_lat;
		calculateCoordinates();
	}

	public double getCenter_lon() {
		return center_lon;
	}

	public void setCenter_lon(double center_lon) {
		this.center_lon = center_lon;
		calculateCoordinates();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		calculateCoordinates();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		calculateCoordinates();
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	abstract void calculateCoordinates();
	
}
