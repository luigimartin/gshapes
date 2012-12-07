/** @author luigimartin.petrella@gmail.com
 *  
 */

package it.lmpetrella.gshapes;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {

	private List<coordinate> coordinates;
	
	public Coordinates(){
		coordinates  = new ArrayList<coordinate>();		
	}
	
	public void add(double _lat , double _lon , double _height){ 
		coordinate c= new coordinate(_lat, _lon, _height);
		coordinates.add(c);
	}
	
	public void add(double _lat , double _lon ){ 
		coordinate c= new coordinate(_lat, _lon, 0D);
		coordinates.add(c);
	}
	
	public void add(String s_lat , String s_lon , String s_height){ 
		double _lat = Double.parseDouble(s_lat);
		double _lon = Double.parseDouble(s_lon);
		double _height = Double.parseDouble(s_height);
		coordinate c= new coordinate(_lat, _lon, _height);
		coordinates.add(c);
	}
	
	public void add(String s_lat , String s_lon){ 
		double _lat = Double.parseDouble(s_lat);
		double _lon = Double.parseDouble(s_lon);
		coordinate c= new coordinate(_lat, _lon, 0D);
		coordinates.add(c);
	}
	
	public coordinate get(int i){
		return coordinates.get(i);
	}
	
	public String Coordinates2String(){
		String _toString="";
		for(int i=0; i<coordinates.size(); i++)
			_toString= _toString + coordinates.get(i).coordinate2String();
 
		return _toString;
	}
	
	public class coordinate{
	private double Lat;
	private double Lon;
	private double Height;
	
	public coordinate(double _lat , double _lon , double _height){
		this.Lat=_lat;
		this.Lon=_lon;
		this.Height= _height;
	}
	
	public double getLat() {
		return Lat;
	}
	public void setLat(double lat) {
		Lat = lat;
	}
	public double getLon() {
		return Lon;
	}
	public void setLon(double lon) {
		Lon = lon;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	public String coordinate2String(){
		return Lon + "," + Lat + "," + Height + " \n ";
	}
	
}
	
	
	
}
