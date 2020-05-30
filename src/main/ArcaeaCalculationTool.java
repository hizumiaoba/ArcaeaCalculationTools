package main;

import java.util.Locale;

public class ArcaeaCalculationTool {

	public static void main(String args[]) {
		Locale defaultLocale = Locale.getDefault();

		System.out.println(Messages.MSGSwitchToChartConstant);

		Locale.setDefault(Locale.US);

		System.out.println(Messages.MSGSwitchToChartConstant);

		Locale.setDefault(defaultLocale);
	}

}
