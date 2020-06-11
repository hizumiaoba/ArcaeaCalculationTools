package main;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Arcaeaをプレイする上で重要になってくる色々なパラメータを計算するものです。
 * このファイルは中央処理、ウィンドウ処理用です。
 *
 * @author hizumi
 */

public class ArcaeaCalculationTool extends JFrame implements ActionListener{

	public static final String[] PACK_NAME = {
			"MemoryArchive",
			"Arcaea",
			"World_Extend",
			"Eternal_Core",
			"Vicious_Labyrinth",
			"Luminous_Sky",
			"Adverse_Prelude",
			"Black_Fate",
			"Sunset_Radiance",
			"Absolute_Reason",
			"Binary_Enfold",
			"Ambivalent_Vision",
			"Crimson_Solace",
			"CHUNITHM",
			"Groove_Coaster",
			"Tone_Sphere",
			"Lanota",
			"Dynamix"
			};
	public static final String[] PARTNER_NAME = {
			"Hikari",
			"Tairitsu",
			"Kou",
			"Sapphire",
			"Lethe",
			"Axium_Tairitsu",
			"Grievous_Lady_Tairitsu",
			"Hikari_Fisica",
			"Eto",
			"Luna",
			"Zero_Hikari",
			"Fracture_Hikari",
			"T"
	};
	public static JButton SwichToPotential = new JButton(Messages.MSGSwitchToPotential.toString());
	public static JButton SwitchToStep = new JButton(Messages.MSGSwitchToExp.toString());
	public static JButton SwitchToExp = new JButton(Messages.MSGSwitchToExp.toString());
	public static JButton SwitchToperformance = new JButton(Messages.MSGSwitchToPerformance.toString());
	public static JButton SwitchToChartConstant = new JButton(Messages.MSGSwitchToChartConstant.toString());
	public static JButton EndButton = new JButton(Messages.MSGEnd.toString());
	public static JButton CalcButton = new jbutton(Messages.MSGCalc.toString());

	public ArcaeaCalculationTool() {

	}

}
