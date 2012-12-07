package it.lmpetrella.gshapes;


 public class Calculator {

	//Calculate the mean point between 2 coordinates
	public static double[] meanPoint(double lat1, double lon1, double lat2, double lon2){
		
		lat1=lat1*Math.PI/180; // convert from degrees to radiants
		lat2=lat2*Math.PI/180;
		lon1=lon1*Math.PI/180;
		lon2=lon2*Math.PI/180;
		
		double dlon=lon2-lon1;
		double dlat=lat2-lat1;
		double Bx, By, avglat, avglon;
		
		Bx=Math.cos(lat2)*Math.cos(dlon);
		By=Math.cos(lat2)*Math.sin(dlon);
		avglat=Math.atan2(Math.sin(lat1)+Math.sin(lat2)
				, Math.sqrt((Math.cos(lat1)+Bx)*(Math.cos(lat1)+Bx +By*By))
				);
		avglon= lon1+ Math.atan2(By
				, Math.cos(lat1)+Bx
				);
		
		double[] arrayDouble = {avglat*180/Math.PI,avglat*180/Math.PI};
		return arrayDouble;
	}

	//Calculate distance between 2 point. Distance is expressed in nautic miles
	public static double distance(double lat1, double lon1, double lat2, double lon2) {
	    double earthRadius = 3958.75; //Nautic miles
	    double dLat = Math.toRadians(lat2-lat1);
	    double dLng = Math.toRadians(lon2-lon1);
	    double sindLat = Math.sin(dLat / 2);
	    double sindLng = Math.sin(dLng / 2);
	    double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
	            * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	    double dist = earthRadius * c;
	    return dist;
	    }
	
	
	
}
