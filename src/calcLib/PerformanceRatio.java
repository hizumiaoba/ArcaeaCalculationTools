package calcLib;

public class PerformanceRatio {


	public static double calcPerformance(String pack, String title, String difficulty, int score, boolean isComplete) {
		double res = 0.00;
		if(isComplete) {
			res = (8 / 3) + Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score) * (13 / 10));
		} else {
			res = (8 / 9) + Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score) * (13 / 10));
		}
		return res;
	}
}
