import it.lmpetrella.gshapes.*;

public class testShapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c= new Circle();
		//System.out.println(c.getCoordinates().Coordinates2String());
		c.setRadius(5);
		//System.out.println(c.getCoordinates().Coordinates2String());
		c.setCenter_lat(40.8011549);
		//System.out.println(c.getCoordinates().Coordinates2String());
		c.setCenter_lon(14.1522796);
		//System.out.println(c.getCoordinates().Coordinates2String());
		c.setHeight(2000);
		System.out.println(c.getCoordinates().Coordinates2String());

		//		Polygon p=new Polygon(4 , 90, 90, 100, 5000000 ,0 );
		//		System.out.println(p.getCoordinates().Coordinates2String());

	}

}
