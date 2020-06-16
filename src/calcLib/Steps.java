package calcLib;

public class Steps {

	public static double calcSteps(String pack, String title, String difficulty, int score) {
		return calcSteps(pack, title, difficulty, score, 50);
	}

	public static double calcSteps(String pack, String title, String difficulty, int score, double partner) {
		double res = 0.00;
			res = 2.5 + (2.45 * Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score)));
			return res * (partner * 0.02);
	}
}
