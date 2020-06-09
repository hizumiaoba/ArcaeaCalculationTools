package calcLib;

public class Steps {

	public static double calcSteps(String pack, String title, String difficulty, int score) {
		double res = 0.00;
		res = 2.5 + (2.45 * Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score)));
		return res;
	}


}
