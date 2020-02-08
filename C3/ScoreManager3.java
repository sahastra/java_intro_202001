
public class ScoreManager3 {

	public static void main(String[] args) {
		
		double[] scoreList = new double[6];
		
		scoreList[0] = 5;
		scoreList[1] = 7;
		scoreList[2] = 8;
		scoreList[3] = 5;
		scoreList[4] = 7;
		scoreList[5] = 9;
		
		for (int i = 0; i < 6; i = i + 1) {
			System.out.println("Score of Student "+ (i + 1) + " = " + scoreList[i]);
		}


	}

}
