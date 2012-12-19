/** @author luigimartin.petrella@gmail.com
 *  
 */


package it.lmpetrella.gshapes;


public class Circle extends Shape {


	public Circle(){
		super();
		calculateCoordinates();
	}
	


	
	@Override
	protected void calculateCoordinates(){
		this.coordinates = new Coordinates();
		double lat,lon,dlon_rad,radius_deg;
		radius_deg=radius/60; // convert radius from nautic miles to degrees
		for(int i=0; i<=360; i++){
			lat = Math.asin(Math.sin((center_lat*Math.PI)/180)*Math.cos(radius_deg*Math.PI/180) + Math.cos((center_lat*Math.PI)/180)*Math.sin(radius_deg*Math.PI/180)*Math.cos((i*Math.PI)/180));
			dlon_rad = Math.atan2(Math.sin((i*Math.PI)/180)*Math.sin(radius_deg*Math.PI/180)*Math.cos((center_lat*Math.PI)/180), Math.cos(radius_deg*Math.PI/180)-Math.sin((center_lat*Math.PI)/180)*Math.sin(lat));
			lon=(center_lon*Math.PI)/180 + dlon_rad;
			lat=lat*180/Math.PI;
			lon=lon*180/Math.PI;
		this.coordinates.add(lat, lon, this.height);	
		}
	}
	
	

}
