package main;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * プログラム内で使用されるメッセージを一元管理するクラス。
 * メッセージ内容はsrc/languagesの中にあるプロパティファイルにあります。
 *
 * @author hizumi
 */

/*
 * ja_JPはUTF-16BE
 */
	public enum Messages{
		MSGSwitchToPotential,
		MSGSwitchToStep,
		MSGSwitchToExp,
		MSGSwitchToPerformance,
		MSGSwitchToChartConstant,
		MSGCalc,
		MSGEnd,
		MSGResult,
		MSGCalcPotential,
		MSGCalcStep,
		MSGCalcExp,
		MSGCalcPerformance,
		MSGCalcChartConstant,
		MSGSongInformation,
		MSGSongPack,
		MSGSongTitle,
		MSGChartDifficulty,
		MSGEnglishTitle,
		MSGJapaneseTitle,
		MSGChartConstant,
		MSGShowScore,
		MSGShowChartPotential,
		MSGShowGrade,
		MSGLv,
		MSGAwakened,
		MSGPartnerName,
		MSGForTempest,
		MSGShowSteps;

	@Override public String toString() {
		try {
			return ResourceBundle.getBundle("languages.List", Locale.getDefault()).getString(name());
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}