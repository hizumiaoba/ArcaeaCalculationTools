package calcLib;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * その名の通り譜面別ポテンシャル計算用のライブラリ
 * ライブラリっつてもここで計算処理が行われます
 * 譜面定数のライブラリは{@link http:hizumiaoba.html.xdomain.jp/json/}に集約しています。
 * @author hizumi
 *
 */

public class ChartPotential {

	// 譜面定数へ加算される最大の補正値です。PMをとると、譜面定数＋この値で固定となります。
	private static final double MAXCORRECTION = 2.00;

	/**
	 * 譜面別ポテンシャルを計算します。計算式はArcaea Wikiに記載されている式を採用しています。
	 * @param pack ポテンシャルを求めたい楽曲のパックを指定します。
	 * @param title ポテンシャルを求めたい楽曲を指定します。
	 * @param difficulty 楽曲の曲内難易度（PST,PRS,FTR,BYD）を指定します。
	 * @param score スコアを入力します。
	 * @return Result 計算した譜面別ポテンシャルを返します。譜面別ポテンシャルが0以下の場合はWikiに記載されている内容に基づき、0.0が返されます。
	 */
	public static double calcChartPotential(String pack, String title, String difficulty, int score) {
		double result = 0.00;
		int switcher = 0;
		if(score >= 10000000) {
			switcher = 1;
		} else if(score >= 9800000) {
			switcher = 2;
		} else {
			switcher = 3;
		}

		switch (switcher) {
		case 1:
			result = getChartConstant(pack, title, difficulty) + MAXCORRECTION;
			break;

		case 2:
			result = getChartConstant(pack, title, difficulty) + 1.00 + (score - 9800000)/200000;
			break;

		case 3:
			result = getChartConstant(pack, title, difficulty) + (score - 9500000)/300000;
			break;

		default:
			break;
		}
		return result < 0.00 ? 0.00 : result;
	}


	/**
	 *  独自に作成したJSONライブラリから譜面定数を取得します。
	 * @param pack 取得したい楽曲のパックを指定します。
	 * @param title 取得したい楽曲を指定します
	 * @param difficulty 取得したい楽曲の曲内難易度（PST、PRS、FTR、BYD）を指定します。
	 * @return result 取得した譜面定数を返します。0以下の数値がResultに格納されている場合は-1.0を返します
	 */
	public static double getChartConstant(String pack, String title, String difficulty) {
		double result = 0.00;
		String filepath = "http://hizumiaoba.html.xdomain.jp/json/" + pack + ".json";
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode node = mapper.readTree(new URL(filepath));
			result = node.get(title).get(difficulty).asDouble();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result < 0.00 ? -1.00 : result;
	}

	/**
	 * 譜面定数に加算される最大の補正値の取得用です。
	 * @return　最大の補正値(2.00)
	 */
	public static double getMaxCorrection() {
		return MAXCORRECTION;
	}

	/**
	 * おまけです。スコアを入力するとグレードを返してくれます。
	 * @param score
	 * @return スコアに応じたグレード
	 */
	public static String getGrade(int score) {
		String result = "D";
		if(score >= 10000000) {
			result = "EX+(PM)";
		} else if(score >= 9900000) {
			result = "EX+";
		} else if(score >= 9800000) {
			result = "EX";
		} else if(score >= 9500000) {
			result = "AA";
		} else if(score >= 9200000) {
			result = "A";
		} else if(score  >= 8900000) {
			result = "B";
		} else if(score >= 8600000) {
			result = "C";
		}
		return result;
	}

	/**
	 * おまけその２
	 * 指定した楽曲の日本語名を返します
	 * @param pack
	 * @param title
	 * @return
	 */
	public static String getTitle(String pack, String title) {
		String result = "";
		String filepath = "http://hizumiaoba.html.xdomain.jp/json/" + pack + ".json";
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode node = mapper.readTree(new URL(filepath));
			result = node.get(title).get("Title").asText();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}