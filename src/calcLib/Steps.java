package calcLib;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Steps {

	private static final String FILEPATH = "http://hizumiaoba.html.xdomain.jp/json/Partner.json";

	/**
	 * Step値を計算します。上三つは帰りがDouble型、した三つはBigDecimal型です。
	 * @param pack
	 * @param title
	 * @param difficulty
	 * @param score
	 * @param partner
	 * @return
	 */
	private static double calcSteps(String pack, String title, String difficulty, int score, int partner) {
		double res = 0.00;
			res = 2.5 + (2.45 * Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score)));
			return res * (partner * 0.02);
	}

	public static double calcSteps(String pack, String title, String difficulty, int score) {
		return calcSteps(pack, title, difficulty, score, 50);
	}

	public static double calcSteps(String pack, String title, String difficulty, int score, String partner, int lv) {
		int stats = 0;
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode node = mapper.readTree(new URL(FILEPATH));
			stats = node.get(partner).get("Step").get(lv).asInt();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return calcSteps(pack, title, difficulty, score, stats);
	}

	private static BigDecimal calcStepsWithBD(String pack, String title, String difficulty, int score, int partner) {
		BigDecimal res = new BigDecimal("2.5", new MathContext(20, RoundingMode.DOWN));;
		BigDecimal temp = new BigDecimal(String.valueOf(Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score))));
		temp.multiply(new BigDecimal("2.45"));
		res.add(temp);
		return res.compareTo(BigDecimal.ZERO) == -1 ? null : res;
	}

	public static BigDecimal calcStepsWithBD(String pack, String title, String difficulty, int score) {
		return calcStepsWithBD(pack, title, difficulty, score, 50);
	}

	public static BigDecimal calcStepsWithBD(String pack, String title, String difficulty, int score, String partner, int lv) {
		int stats = 0;
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode node = mapper.readTree(new URL(FILEPATH));
			stats = node.get(partner).get("Step").get(lv).asInt();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return calcStepsWithBD(pack, title, difficulty, score, stats);
	}
}
