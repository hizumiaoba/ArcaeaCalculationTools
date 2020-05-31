package main;

import javax.swing.JButton;

import calcLib.ChartPotential;

/**
 * Arcaeaをプレイする上で重要になってくる色々なパラメータを計算するものです。
 * このファイルは中央処理、ウィンドウ処理用です。
 *
 * @author hizumi
 */

public class ArcaeaCalculationTool {

	public static JButton SwichToPotential = new JButton(Messages.MSGSwitchToPotential.toString());
	public static JButton SwitchToStep = new JButton(Messages.MSGSwitchToExp.toString());
	public static JButton SwitchToExp = new JButton(Messages.MSGSwitchToExp.toString());
	public static JButton SwitchToperformance = new JButton(Messages.MSGSwitchToPerformance.toString());
	public static JButton SwitchToChartConstant = new JButton(Messages.MSGSwitchToChartConstant.toString());

	public static void main(String args[]) {
		System.out.println(ChartPotential.calcChartPotential("Black_Fate", "Tempestissimo", "BYD", 9858468));
	}
}
