package calcLib;

import java.math.BigDecimal;

public class PerformanceRatio {

	// Java上の使用回避するため削除検討中
/*
	public static double calcPerformance(String pack, String title, String difficulty, int score, boolean isComplete) {
		double res = 0.00;
		if(isComplete) {
			res = (8 / 3) + Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score) * (13 / 10));
		} else {
			res = (8 / 9) + Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score) * (13 / 10));
		}
		return res;
	}

*/

	public static BigDecimal calcPerformanceWithBD(String pack, String title, String difficulty, int score, boolean isComplete) {
		BigDecimal compCorr = null;
		BigDecimal potential = new BigDecimal(String.valueOf(Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score))));
		BigDecimal corr = new BigDecimal("1.3");
		if(isComplete) {
			compCorr = new BigDecimal(String.valueOf(8 / 3));
			compCorr.add(potential).multiply(corr);
		}else {
			compCorr = new BigDecimal(String.valueOf(8 / 9));
			compCorr.add(potential).multiply(corr);
		}
		return compCorr.compareTo(BigDecimal.ZERO) == -1 || compCorr == null ? null : compCorr;
	}

	public static double calcPerformance(String pack, String title, String difficulty, int score, boolean isComplete) {
		BigDecimal bd = calcPerformanceWithBD(pack, title, difficulty, score, isComplete);
		return Double.parseDouble(String.format("%.2f", bd));
	}
}
