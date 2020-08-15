package principal;

public class Volume {
	public double radius;
	
	public double calcVolume(double radius) {
		return 4*Math.PI*Math.pow(radius, 3)/3;
	}
	
}
