package crowly.library;

import java.util.ArrayList;

public class TimeLapse {
	private double Start;
	private double END;
	private ArrayList<Cuerpo> Bodies = new ArrayList();;

	public double getStart() {
		return Start;
	}
	public void setStart(double start) {
		Start = start;
	}
	public double getEND() {
		return END;
	}
	public void setEND(double eND) {
		END = eND;
	}
	public ArrayList<Cuerpo> getBodies() {
		return Bodies;
	}
	public void setBodies(ArrayList<Cuerpo> bodies) {
		Bodies = bodies;
	}
	
	public int BodyCount(){
		return Bodies.size();
	}
}
