package calcLib;

public class Exp {

	private static final int[] REQUIRE_EXP = {
			0,
			25,
			25,
			25,
			25,
			50,
			75,
			100,
			125,
			150,
			200,
			250,
			300,
			350,
			400,
			450,
			500,
			550,
			650,
			750,
			750,
			750,
			750,
			750,
			750,
			750,
			750,
			750,
			750,
			750
	};

	public static double calcExp(String pack, String title, String difficulty, int score) {
		return (int)ChartPotential.calcChartPotential(pack, title, difficulty, score) * 3;
	}

	public static int requireExpToMax(int lv, int percentage, boolean isMaxThirty) {
		int res = 0;
		int tmp = 0;
		for(int i = 0; i < lv -1; i++) {
			tmp += REQUIRE_EXP[i];
		}
		tmp += (int)REQUIRE_EXP[lv - 1] * percentage / 100;
		if(isMaxThirty) {
			res = 12500 - tmp;
		} else {
			res = 5000 - tmp;
		}
		return res < 0 ? 0 : res;
	}

	public static int getMax(boolean isMaxThirty) {
		return isMaxThirty ? 12500 : 5000;
	}
}
