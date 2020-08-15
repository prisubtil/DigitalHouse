package student;

public class Student {
	public double note1;
	public double note2;
	public double note3;
	public double sum;
	
	public double finalGrade(){
		double sum = ((note1*0.3)+(note2*0.35)+(note3*0.35));
		return sum;
		
	}
	
	public void missingPoint() {
		
		if(sum >= 60.0) {
			System.out.println("PASS");
			
			}else {
				System.out.println("FAILED");
		for(double i = sum; i==6;i++) {
			System.out.println("MISSING "+i+"POINTS");	
				}
			}
	}
	

}
	
	

