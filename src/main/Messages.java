package main;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * プログラム内で使用されるメッセージを一元管理するクラス。
 * メッセージ内容はsrc/languagesの中にあるプロパティファイルにあります。
 *
 * @author hizumiaoba
 */

	public enum Messages{
		MSGSwitchToPotential,
		MSGSwitchToStep,
		MSGSwitchToExp,
		MSGSwitchToPerformance,
		MSGSwitchToChartConstant;

	@Override public String toString() {
		try {
			return ResourceBundle.getBundle("languages.List", Locale.getDefault()).getString(name());
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}