package com.selexsi.swim.Gshapes;

public class Polygon extends Shape {

	private int sides;
	private double inclination;
	
	public Polygon(){
		super();
		this.sides=0;
		this.inclination=0;
		calculateCoordinates();
	}
	
	public Polygon(int _sides, double _center_lat, double _center_lon, double _radius,
			double _height) {
		super(_center_lat, _center_lon, _radius, _height);
		this.sides=_sides;
		calculateCoordinates();
		}

	public Polygon(int _sides , double _center_lat, double _center_lon, double _radius , double _height,  double _inclination) {
		super(_center_lat, _center_lon, _radius, _height);
		this.sides=_sides;
		this.inclination=_inclination;
		calculateCoordinates();
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
		calculateCoordinates();
	}

	public double getInclination() {
		return inclination;
	}

	public void setInclination(double inclination) {
		this.inclination = inclination;
		calculateCoordinates();
	}
	
	@Override
	protected void calculateCoordinates() {

		double lat,lon,dlon_rad,radius_deg;
		radius_deg=radius/60; // convert radius from nautic miles to degrees
		for(int i=0; i<=sides; i++){
			lat = Math.asin(Math.sin((center_lat*Math.PI)/180)*Math.cos(radius_deg*Math.PI/180) + Math.cos((center_lat*Math.PI)/180)*Math.sin(radius_deg*Math.PI/180)*Math.cos((((Math.PI*2)/sides)*i)+inclination*Math.PI/180));
			dlon_rad = Math.atan2(Math.sin((((Math.PI*2)/sides)*i)+inclination*Math.PI/180)*Math.sin(radius_deg*Math.PI/180)*Math.cos((center_lat*Math.PI)/180), Math.cos(radius_deg*Math.PI/180)-Math.sin((center_lat*Math.PI)/180)*Math.sin(lat));
			lon=(center_lon*Math.PI)/180 + dlon_rad;
			lat=lat*180/Math.PI;
			lon=lon*180/Math.PI;
			this.coordinates.add(lat, lon, this.height);	
			}	
		}

}
