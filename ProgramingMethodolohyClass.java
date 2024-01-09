import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProgramingMethodolohyClass {
	
	private HashMap<String, Double> studentScores;
	
	public ProgramingMethodolohyClass(){
		studentScores = new HashMap<String, Double>();
		
	}
	
	public ProgramingMethodolohyClass(ArrayList<String> students){
		studentScores = new HashMap<String, Double>();
		
		for(String student: students){
			studentScores.put(student, null);
		}	
	}
	
	public Double getScore(String student){
		if(!studentScores.containsKey(student)){
			System.out.println("No such student: " + student);
			return null;
		}
		return studentScores.get(student);
	}
	
	public void getScore(double score){
		
	}
}
