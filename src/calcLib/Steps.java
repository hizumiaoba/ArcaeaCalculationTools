package calcLib;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Steps {

	public static double calcSteps(String pack, String title, String difficulty, int score) {
		return calcSteps(pack, title, difficulty, score, 50);
	}

	public static double calcSteps(String pack, String title, String difficulty, int score, String partner, int lv) {
		int stats = 0;
		String filepath = "http://hizumiaoba.html.xdomain.jp/json/Partner.json";
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode node = mapper.readTree(new URL(filepath));
			stats = node.get(partner).get("Step").get(lv).asInt();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return calcSteps(pack, title, difficulty, score, stats);
	}

	public static double calcSteps(String pack, String title, String difficulty, int score, int partner) {
		double res = 0.00;
			res = 2.5 + (2.45 * Math.sqrt(ChartPotential.calcChartPotential(pack, title, difficulty, score)));
			return res * (partner * 0.02);
	}
}
