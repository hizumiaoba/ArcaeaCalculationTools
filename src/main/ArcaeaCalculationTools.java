package main;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * /**
 * Arcaeaをプレイする上で重要になってくる色々なパラメータを計算するものです。
 * このファイルは中央処理、ウィンドウ処理用です。
 *
 * @author hizumi
 */

public class ArcaeaCalculationTools extends JFrame {
	/**
	 * Serial Wrote at 20200/06/17
	 */
	private static final long serialVersionUID = 1796950740947109175L;
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
			"Tairitsu_Trin",
			"Hikari_Seine",
			"Saya",
			"Grievous_Lady_Tairitsu_Chuni_Penguin",
			"Kanae",
			"Fantasia_Hikari",
			"Sonata_Tairitsu",
			"Tempest_Tairitsu",
			
	};

	private JPanel contentPane;
	private final JPanel PotentialSwitchBtn = new JPanel();
	private final JButton btnPotentialSwitchToSteps = new JButton();
	private final JButton btnPotentialSwitchtoexp = new JButton();
	private final JButton btnPotentialSwitchToPerformance = new JButton();
	private final JPanel Potential = new JPanel();
	private final JButton btnPotentialSwitchToChartConstant = new JButton("SwitchToChartConstant");
	private final JPanel PotentialSystemBtn = new JPanel();
	private final JButton btnPotentialCalculation = new JButton("Calculation");
	private final JButton btnPotentialSwitchToPotential = new JButton("SwitchToPotential");
	private final JButton btnPotentialEndProgram = new JButton("End Program");
	private final JPanel Steps = new JPanel();
	CardLayout cardLayout = new CardLayout();
	private final JPanel StepsSwitchBtn = new JPanel();
	private final JButton btnStepsSwitchToPotential = new JButton("SwitchToPotential");
	private final JButton btnStepsSwitchToSteps = new JButton();
	private final JButton btnStepsSwitchToExp = new JButton();
	private final JButton btnStepsSwitchToPerforance = new JButton();
	private final JButton btnStepsSwitchToChartConstant = new JButton("SwitchToChartConstant");
	private final JPanel StepsSystemBtn = new JPanel();
	private final JButton btnStepsCalculation = new JButton("Calculation");
	private final JButton btnStepsEndProgram = new JButton("End Program");
	private final JPanel Exp = new JPanel();
	private final JPanel Performance = new JPanel();
	private final JPanel ChartConstant = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JButton button_7 = new JButton("SwitchToPotential");
	private final JButton button_8 = new JButton();
	private final JButton button_9 = new JButton();
	private final JButton button_10 = new JButton();
	private final JButton button_11 = new JButton("SwitchToChartConstant");
	private final JPanel panel_3 = new JPanel();
	private final JButton button_12 = new JButton("Calculation");
	private final JButton button_13 = new JButton("End Program");
	private final JPanel panel_4 = new JPanel();
	private final JButton button_14 = new JButton("SwitchToPotential");
	private final JButton button_15 = new JButton();
	private final JButton button_16 = new JButton();
	private final JButton button_17 = new JButton();
	private final JButton button_18 = new JButton("SwitchToChartConstant");
	private final JPanel panel_5 = new JPanel();
	private final JButton button_19 = new JButton("Calculation");
	private final JButton button_20 = new JButton("End Program");
	private final JPanel panel_6 = new JPanel();
	private final JButton button_21 = new JButton("SwitchToPotential");
	private final JButton button_22 = new JButton();
	private final JButton button_23 = new JButton();
	private final JButton button_24 = new JButton();
	private final JButton button_25 = new JButton("SwitchToChartConstant");
	private final JPanel panel_7 = new JPanel();
	private final JButton button_26 = new JButton("Calculation");
	private final JButton button_27 = new JButton("End Program");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArcaeaCalculationTools frame = new ArcaeaCalculationTools();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ArcaeaCalculationTools() {
		setTitle("ArcaeaCalculationTools - hizumiaoba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		contentPane.add(Potential, "name_21300422118700");
		Potential.setLayout(null);
		PotentialSwitchBtn.setBounds(0, 0, 175, 130);
		Potential.add(PotentialSwitchBtn);
		PotentialSwitchBtn.setLayout(null);
		btnPotentialSwitchToPotential.setActionCommand("Potential");
		btnPotentialSwitchToPotential.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPotentialSwitchToPotential.setBounds(0, 0, 175, 21);

		PotentialSwitchBtn.add(btnPotentialSwitchToPotential);
		btnPotentialSwitchToSteps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPotentialSwitchToSteps.setActionCommand("Steps");
		btnPotentialSwitchToSteps.setText("SwitchToSteps");
		btnPotentialSwitchToSteps.setBounds(0, 25, 175, 21);
		PotentialSwitchBtn.add(btnPotentialSwitchToSteps);
		btnPotentialSwitchtoexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPotentialSwitchtoexp.setActionCommand("Exp");
		btnPotentialSwitchtoexp.setText("SwitchToExp");
		btnPotentialSwitchtoexp.setBounds(0, 50, 175, 21);
		PotentialSwitchBtn.add(btnPotentialSwitchtoexp);
		btnPotentialSwitchToPerformance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPotentialSwitchToPerformance.setActionCommand("Performance");
		btnPotentialSwitchToPerformance.setText("SwitchToPerformance");
		btnPotentialSwitchToPerformance.setBounds(0, 75, 175, 21);

		PotentialSwitchBtn.add(btnPotentialSwitchToPerformance);
		btnPotentialSwitchToChartConstant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPotentialSwitchToChartConstant.setActionCommand("ChartConstant");
		btnPotentialSwitchToChartConstant.setBounds(0, 100, 175, 21);

		PotentialSwitchBtn.add(btnPotentialSwitchToChartConstant);
		PotentialSystemBtn.setBounds(1067, 561, 175, 100);
		Potential.add(PotentialSystemBtn);
		PotentialSystemBtn.setLayout(null);
		btnPotentialCalculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnPotentialCalculation.setActionCommand("PotentialCalc");
		btnPotentialCalculation.setBounds(0, 0, 175, 40);

		PotentialSystemBtn.add(btnPotentialCalculation);
		btnPotentialEndProgram.setActionCommand("");
		btnPotentialEndProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnPotentialEndProgram.setBounds(0, 60, 175, 40);

		PotentialSystemBtn.add(btnPotentialEndProgram);

		contentPane.add(Steps, "name_21300451057000");
		Steps.setLayout(null);
		StepsSwitchBtn.setLayout(null);
		StepsSwitchBtn.setBounds(0, 0, 175, 130);

		Steps.add(StepsSwitchBtn);
		btnStepsSwitchToPotential.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnStepsSwitchToPotential.setActionCommand("Potential");
		btnStepsSwitchToPotential.setBounds(0, 0, 175, 21);

		StepsSwitchBtn.add(btnStepsSwitchToPotential);
		btnStepsSwitchToSteps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnStepsSwitchToSteps.setText("SwitchToSteps");
		btnStepsSwitchToSteps.setActionCommand("Steps");
		btnStepsSwitchToSteps.setBounds(0, 25, 175, 21);

		StepsSwitchBtn.add(btnStepsSwitchToSteps);
		btnStepsSwitchToExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnStepsSwitchToExp.setText("SwitchToExp");
		btnStepsSwitchToExp.setActionCommand("Exp");
		btnStepsSwitchToExp.setBounds(0, 50, 175, 21);

		StepsSwitchBtn.add(btnStepsSwitchToExp);
		btnStepsSwitchToPerforance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
			
		});
		btnStepsSwitchToPerforance.setText("SwitchToPerformance");
		btnStepsSwitchToPerforance.setActionCommand("Performance");
		btnStepsSwitchToPerforance.setBounds(0, 75, 175, 21);

		StepsSwitchBtn.add(btnStepsSwitchToPerforance);
		btnStepsSwitchToChartConstant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnStepsSwitchToChartConstant.setActionCommand("ChartConstant");
		btnStepsSwitchToChartConstant.setBounds(0, 100, 175, 21);

		StepsSwitchBtn.add(btnStepsSwitchToChartConstant);
		StepsSystemBtn.setLayout(null);
		StepsSystemBtn.setBounds(1067, 561, 175, 100);

		Steps.add(StepsSystemBtn);
		btnStepsCalculation.setActionCommand("StepsCalc");
		btnStepsCalculation.setBounds(0, 0, 175, 40);

		StepsSystemBtn.add(btnStepsCalculation);
		btnStepsEndProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnStepsEndProgram.setActionCommand("");
		btnStepsEndProgram.setBounds(0, 60, 175, 40);

		StepsSystemBtn.add(btnStepsEndProgram);

		contentPane.add(Exp, "name_22401836273200");
		panel_2.setLayout(null);

		Exp.add(panel_2);
		button_7.setBounds(0, 0, 175, 21);

		panel_2.add(button_7);
		button_8.setText("SwitchToSteps");
		button_8.setActionCommand("SwitchToSteps");
		button_8.setBounds(0, 25, 175, 21);

		panel_2.add(button_8);
		button_9.setText("SwitchToExp");
		button_9.setActionCommand("SwitchToExp");
		button_9.setBounds(0, 50, 175, 21);

		panel_2.add(button_9);
		button_10.setText("SwitchToPerformance");
		button_10.setActionCommand("SwitchToPerformance");
		button_10.setBounds(0, 75, 175, 21);

		panel_2.add(button_10);
		button_11.setBounds(0, 100, 175, 21);

		panel_2.add(button_11);
		panel_3.setLayout(null);

		Exp.add(panel_3);
		button_12.setActionCommand("");
		button_12.setBounds(0, 0, 175, 40);

		panel_3.add(button_12);
		button_13.setActionCommand("");
		button_13.setBounds(0, 60, 175, 40);

		panel_3.add(button_13);

		contentPane.add(Performance, "name_22409236598500");
		panel_4.setLayout(null);

		Performance.add(panel_4);
		button_14.setBounds(0, 0, 175, 21);

		panel_4.add(button_14);
		button_15.setText("SwitchToSteps");
		button_15.setActionCommand("SwitchToSteps");
		button_15.setBounds(0, 25, 175, 21);

		panel_4.add(button_15);
		button_16.setText("SwitchToExp");
		button_16.setActionCommand("SwitchToExp");
		button_16.setBounds(0, 50, 175, 21);

		panel_4.add(button_16);
		button_17.setText("SwitchToPerformance");
		button_17.setActionCommand("SwitchToPerformance");
		button_17.setBounds(0, 75, 175, 21);

		panel_4.add(button_17);
		button_18.setBounds(0, 100, 175, 21);

		panel_4.add(button_18);
		panel_5.setLayout(null);

		Performance.add(panel_5);
		button_19.setActionCommand("");
		button_19.setBounds(0, 0, 175, 40);

		panel_5.add(button_19);
		button_20.setActionCommand("");
		button_20.setBounds(0, 60, 175, 40);

		panel_5.add(button_20);

		contentPane.add(ChartConstant, "name_22446774849400");
		panel_6.setLayout(null);

		ChartConstant.add(panel_6);
		button_21.setBounds(0, 0, 175, 21);

		panel_6.add(button_21);
		button_22.setText("SwitchToSteps");
		button_22.setActionCommand("SwitchToSteps");
		button_22.setBounds(0, 25, 175, 21);

		panel_6.add(button_22);
		button_23.setText("SwitchToExp");
		button_23.setActionCommand("SwitchToExp");
		button_23.setBounds(0, 50, 175, 21);

		panel_6.add(button_23);
		button_24.setText("SwitchToPerformance");
		button_24.setActionCommand("SwitchToPerformance");
		button_24.setBounds(0, 75, 175, 21);

		panel_6.add(button_24);
		button_25.setBounds(0, 100, 175, 21);

		panel_6.add(button_25);
		panel_7.setLayout(null);

		ChartConstant.add(panel_7);
		button_26.setActionCommand("");
		button_26.setBounds(0, 0, 175, 40);

		panel_7.add(button_26);
		button_27.setActionCommand("");
		button_27.setBounds(0, 60, 175, 40);

		panel_7.add(button_27);

	}
}