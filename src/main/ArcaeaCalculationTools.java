package main;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import calcLib.ChartPotential;

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
	private static final String VERSION = "Ver. 0.1.0-Alpha";
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
			"Stella",
	};

	private JPanel contentPane;
	private final JPanel PotentialSwitchBtn = new JPanel();
	private final JButton btnPotentialSwitchToSteps = new JButton();
	private final JButton btnPotentialSwitchtoexp = new JButton();
	private final JButton btnPotentialSwitchToPerformance = new JButton();
	private final JPanel Potential = new JPanel();
	private final JButton btnPotentialSwitchToChartConstant = new JButton("SwitchToChartConstant");
	private final JPanel PotentialSystemBtn = new JPanel();
	private final JButton btnPotentialCalculation = new JButton(Messages.MSGCalc.toString());
	private final JButton btnPotentialSwitchToPotential = new JButton("SwitchToPotential");
	private final JButton btnPotentialEndProgram = new JButton(Messages.MSGEnd.toString());
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
	private final JButton btnStepsEndProgram = new JButton(Messages.MSGEnd.toString());
	private final JPanel Exp = new JPanel();
	private final JPanel Performance = new JPanel();
	private final JPanel ChartConstant = new JPanel();
	private final JPanel ExpSwitchBtn = new JPanel();
	private final JButton btnExpSwitchToPotential = new JButton("SwitchToPotential");
	private final JButton btnExpSwitchToSteps = new JButton();
	private final JButton btnExpSwitchToExp = new JButton();
	private final JButton btnExpSwitchToPerformance = new JButton();
	private final JButton btnExpSwitchToChartConstant = new JButton("SwitchToChartConstant");
	private final JPanel ExpSystemBtn = new JPanel();
	private final JButton btnExpCalculation = new JButton("Calculation");
	private final JButton btnExpEndProgram = new JButton(Messages.MSGEnd.toString());
	private final JPanel PerformanceSwitchBtn = new JPanel();
	private final JButton btnPerformanceSwitchToPotential = new JButton("SwitchToPotential");
	private final JButton btnPerformanceSwitchToSteps = new JButton();
	private final JButton btnPerformanceSwitchToExp = new JButton();
	private final JButton btnPerformanceSwitchToPerformance = new JButton();
	private final JButton btnPerformanceSwitchToChartConstant = new JButton("SwitchToChartConstant");
	private final JPanel PerformanceSystemBtn = new JPanel();
	private final JButton btnPerformanceCalculation = new JButton("Calculation");
	private final JButton btnPerformanceEndProgram = new JButton(Messages.MSGEnd.toString());
	private final JPanel ChartconstantSwitchBtn = new JPanel();
	private final JButton btnChartConstSwitchToPotential = new JButton("SwitchToPotential");
	private final JButton btnChartConstSwitchToSteps = new JButton();
	private final JButton btnChartConstSwitchToExp = new JButton();
	private final JButton btnChartConstSwitchToPerformance = new JButton();
	private final JButton btnChartConstSwitchToChartConst = new JButton("SwitchToChartConstant");
	private final JPanel ChartcontantSystemBtn = new JPanel();
	private final JButton btnChartConstCalculation = new JButton("Calculation");
	private final JButton btnChartConstEndProgram = new JButton(Messages.MSGEnd.toString());
	private final JLabel PotentialVerLabel = new JLabel(VERSION);
	private final JLabel StepVerLabel = new JLabel(VERSION);
	private final JLabel ExpVerLabel = new JLabel(VERSION);
	private final JLabel PerformanceVerLabel = new JLabel(VERSION);
	private final JLabel ChartConstVerLabel = new JLabel(VERSION);
	private final JLabel PotentialLabel = new JLabel(Messages.MSGCalcPotential.toString());
	private final JLabel StepsLabel = new JLabel(Messages.MSGCalcStep.toString());
	private final JLabel ExpLabel = new JLabel(Messages.MSGCalcExp.toString());
	private final JLabel PerformanceLabel = new JLabel(Messages.MSGCalcPerformance.toString());
	private final JLabel ChartConstantLabel = new JLabel(Messages.MSGChartConstant.toString());
	private final JLabel PotentialResultLabel = new JLabel(Messages.MSGResult.toString());
	private final JLabel PotentialScoreResultShowLabel = new JLabel("");
	private final JComboBox<String> packBox = new JComboBox<>();
	private final JComboBox<String> songBox = new JComboBox<String>();
	private DefaultComboBoxModel<String> songModel = new DefaultComboBoxModel<>();
	private final JComboBox<String> DifficultyBox = new JComboBox<String>();
	private final JLabel PotentialPackNameLabel = new JLabel(Messages.MSGSongPack.toString());
	private final JLabel PotentialSongTitleLabel = new JLabel(Messages.MSGSongTitle.toString());;
	private final JLabel PotentialChartDifficultyLabel = new JLabel(Messages.MSGChartDifficulty.toString());;
	private final JLabel potentialSongInfLabel = new JLabel(Messages.MSGSongInformation.toString());
	private final JLabel PotentialSongTitleEngLabel = new JLabel("");
	private final JLabel PotentialSongTitleJpnLabel = new JLabel("");
	private final JLabel PotentialChartConstantLabel = new JLabel("");
	private final JTextField PotentialScoreField = new JTextField();
	private final JLabel PotentialYourScoreLabel = new JLabel(Messages.MSGShowScore.toString());
	private final JLabel PotentialChartPotentialResultShowLabel = new JLabel();
	private final JLabel PotentialGradeResultsShowLabel = new JLabel();

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
		PotentialScoreField.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 12));
		PotentialScoreField.setBounds(1067, 193, 150, 19);
		PotentialScoreField.setColumns(10);
		setTitle("ArcaeaCalculationTools - hizumiaoba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(cardLayout);
		Potential.setName("Potential");

		contentPane.add(Potential, Potential.getName());
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
				System.out.println("Calculation trigger fired.");
				int score = Integer.parseInt(PotentialScoreField.getText());
				String pack = packBox.getSelectedItem().toString();
				String titleEng = songBox.getSelectedItem().toString();
				String difficulty = DifficultyBox.getSelectedItem().toString();
				String titleJpn = ChartPotential.getTitle(pack, titleEng).toString();
				double chartconst = ChartPotential.getChartConstant(pack, titleEng, difficulty);
				double potential = ChartPotential.calcChartPotential(pack, titleEng, difficulty, score);
				PotentialSongTitleEngLabel
						.setText(Messages.MSGEnglishTitle.toString() + " : " + titleEng);
				PotentialSongTitleJpnLabel.setText(Messages.MSGJapaneseTitle.toString() + " : " + titleJpn);
				PotentialChartConstantLabel.setText(Messages.MSGChartConstant.toString() + " : " + chartconst);

				PotentialScoreResultShowLabel.setText(Messages.MSGShowScore.toString() + " : " + score);
				PotentialChartPotentialResultShowLabel
						.setText(String.valueOf(Messages.MSGShowChartPotential.toString() + " : " + potential));
				PotentialGradeResultsShowLabel.setText(Messages.MSGShowGrade + " : " + ChartPotential.getGrade(score));
				System.out.println("calculation complete.\n"
						+ "score : " + score
						+ "\npack : " + pack
						+ "\ntitleEng : " + titleEng
						+ "\ndifficulty : " + difficulty
						+ "\ntitleJpn : " + titleJpn
						+ "\nchartconst : " + chartconst
						+ "\npotential : " + potential);
			}
		});
		btnPotentialCalculation.setActionCommand("PotentialCalc");
		btnPotentialCalculation.setBounds(0, 0, 175, 40);

		PotentialSystemBtn.add(btnPotentialCalculation);
		btnPotentialEndProgram.setActionCommand("");
		btnPotentialEndProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Requested exit by pressing button.");
				System.exit(0);
			}
		});
		btnPotentialEndProgram.setBounds(0, 60, 175, 40);

		PotentialSystemBtn.add(btnPotentialEndProgram);
		PotentialVerLabel.setBounds(1136, 10, 106, 13);
		Potential.add(PotentialVerLabel);
		PotentialLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		PotentialLabel.setSize(new Dimension(60, 20));
		PotentialLabel.setMaximumSize(new Dimension(60, 20));
		PotentialLabel.setBounds(510, 49, 160, 24);

		Potential.add(PotentialLabel);
		PotentialResultLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		PotentialResultLabel.setBounds(656, 237, 80, 24);

		Potential.add(PotentialResultLabel);
		packBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Reflection trigger fired.");
				String[] songTitles = ChartPotential.getSongKey((String) packBox.getSelectedItem());
				for (String song : songTitles) {
					System.out.println(song);
				}
				songModel.removeAllElements();
				for (String songName : songTitles) {
					songModel.addElement(songName);
				}
				songBox.setModel(songModel);
			}
		});
		packBox.setModel(new DefaultComboBoxModel<String>(PACK_NAME));
		packBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		packBox.setBounds(175, 188, 204, 27);

		Potential.add(packBox);
		songBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		songBox.setBounds(486, 188, 330, 27);

		Potential.add(songBox);
		DifficultyBox.setModel(new DefaultComboBoxModel(new String[] { "PST", "PRS", "FTR", "BYD" }));
		DifficultyBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		DifficultyBox.setBounds(910, 188, 102, 27);

		Potential.add(DifficultyBox);
		PotentialPackNameLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialPackNameLabel.setBounds(208, 157, 105, 21);
		Potential.add(PotentialPackNameLabel);
		PotentialSongTitleLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialSongTitleLabel.setBounds(591, 157, 105, 21);

		Potential.add(PotentialSongTitleLabel);
		PotentialChartDifficultyLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialChartDifficultyLabel.setBounds(886, 157, 150, 21);

		Potential.add(PotentialChartDifficultyLabel);
		potentialSongInfLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		potentialSongInfLabel.setBounds(208, 237, 80, 24);

		Potential.add(potentialSongInfLabel);
		PotentialSongTitleEngLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		PotentialSongTitleEngLabel.setBounds(46, 271, 395, 24);

		Potential.add(PotentialSongTitleEngLabel);
		PotentialSongTitleJpnLabel.setBounds(46, 310, 395, 24);
		Potential.add(PotentialSongTitleJpnLabel);
		PotentialSongTitleJpnLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		PotentialChartConstantLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		PotentialChartConstantLabel.setBounds(46, 351, 395, 24);

		Potential.add(PotentialChartConstantLabel);

		Potential.add(PotentialScoreField);
		PotentialYourScoreLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialYourScoreLabel.setBounds(1102, 157, 115, 21);

		Potential.add(PotentialYourScoreLabel);
		PotentialScoreResultShowLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		PotentialScoreResultShowLabel.setBounds(510, 271, 307, 24);

		Potential.add(PotentialScoreResultShowLabel);
		PotentialChartPotentialResultShowLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		PotentialChartPotentialResultShowLabel.setBounds(510, 316, 307, 24);

		Potential.add(PotentialChartPotentialResultShowLabel);
		PotentialGradeResultsShowLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		PotentialGradeResultsShowLabel.setBounds(510, 357, 307, 24);

		Potential.add(PotentialGradeResultsShowLabel);
		Steps.setName("Steps");

		contentPane.add(Steps, Steps.getName());
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
				System.out.println("Requested exit by pressing button.");
				System.exit(0);
			}
		});
		btnStepsEndProgram.setActionCommand("");
		btnStepsEndProgram.setBounds(0, 60, 175, 40);

		StepsSystemBtn.add(btnStepsEndProgram);
		StepVerLabel.setBounds(1161, 10, 81, 13);

		Steps.add(StepVerLabel);
		StepsLabel.setBounds(510, 49, 108, 24);
		Steps.add(StepsLabel);
		StepsLabel.setMaximumSize(new Dimension(60, 20));
		StepsLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		Exp.setName("Exp");

		contentPane.add(Exp, Exp.getName());
		Exp.setLayout(null);
		ExpSwitchBtn.setBounds(0, 0, 175, 130);
		ExpSwitchBtn.setLayout(null);

		Exp.add(ExpSwitchBtn);
		btnExpSwitchToPotential.setActionCommand("Potential");
		btnExpSwitchToPotential.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnExpSwitchToPotential.setBounds(0, 0, 175, 21);

		ExpSwitchBtn.add(btnExpSwitchToPotential);
		btnExpSwitchToSteps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnExpSwitchToSteps.setText("SwitchToSteps");
		btnExpSwitchToSteps.setActionCommand("Steps");
		btnExpSwitchToSteps.setBounds(0, 25, 175, 21);

		ExpSwitchBtn.add(btnExpSwitchToSteps);
		btnExpSwitchToExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnExpSwitchToExp.setText("SwitchToExp");
		btnExpSwitchToExp.setActionCommand("Exp");
		btnExpSwitchToExp.setBounds(0, 50, 175, 21);

		ExpSwitchBtn.add(btnExpSwitchToExp);
		btnExpSwitchToPerformance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnExpSwitchToPerformance.setText("SwitchToPerformance");
		btnExpSwitchToPerformance.setActionCommand("Performance");
		btnExpSwitchToPerformance.setBounds(0, 75, 175, 21);

		ExpSwitchBtn.add(btnExpSwitchToPerformance);
		btnExpSwitchToChartConstant.setActionCommand("ChartConstant");
		btnExpSwitchToChartConstant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnExpSwitchToChartConstant.setBounds(0, 100, 175, 21);

		ExpSwitchBtn.add(btnExpSwitchToChartConstant);
		ExpSystemBtn.setBounds(1067, 561, 175, 100);
		ExpSystemBtn.setLayout(null);

		Exp.add(ExpSystemBtn);
		btnExpCalculation.setActionCommand("");
		btnExpCalculation.setBounds(0, 0, 175, 40);

		ExpSystemBtn.add(btnExpCalculation);
		btnExpEndProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Requested exit by pressing button.");
				System.exit(0);
			}
		});
		btnExpEndProgram.setActionCommand("");
		btnExpEndProgram.setBounds(0, 60, 175, 40);

		ExpSystemBtn.add(btnExpEndProgram);
		ExpVerLabel.setBounds(1161, 10, 81, 13);

		Exp.add(ExpVerLabel);
		ExpLabel.setMaximumSize(new Dimension(60, 20));
		ExpLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		ExpLabel.setBounds(510, 49, 100, 24);

		Exp.add(ExpLabel);
		Performance.setName("Performance");

		contentPane.add(Performance, Performance.getName());
		Performance.setLayout(null);
		PerformanceSwitchBtn.setBounds(0, 0, 175, 130);
		PerformanceSwitchBtn.setLayout(null);

		Performance.add(PerformanceSwitchBtn);
		btnPerformanceSwitchToPotential.setActionCommand("Potential");
		btnPerformanceSwitchToPotential.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPerformanceSwitchToPotential.setBounds(0, 0, 175, 21);

		PerformanceSwitchBtn.add(btnPerformanceSwitchToPotential);
		btnPerformanceSwitchToSteps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPerformanceSwitchToSteps.setText("SwitchToSteps");
		btnPerformanceSwitchToSteps.setActionCommand("Steps");
		btnPerformanceSwitchToSteps.setBounds(0, 25, 175, 21);

		PerformanceSwitchBtn.add(btnPerformanceSwitchToSteps);
		btnPerformanceSwitchToExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPerformanceSwitchToExp.setText("SwitchToExp");
		btnPerformanceSwitchToExp.setActionCommand("Exp");
		btnPerformanceSwitchToExp.setBounds(0, 50, 175, 21);

		PerformanceSwitchBtn.add(btnPerformanceSwitchToExp);
		btnPerformanceSwitchToPerformance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPerformanceSwitchToPerformance.setText("SwitchToPerformance");
		btnPerformanceSwitchToPerformance.setActionCommand("Performance");
		btnPerformanceSwitchToPerformance.setBounds(0, 75, 175, 21);

		PerformanceSwitchBtn.add(btnPerformanceSwitchToPerformance);
		btnPerformanceSwitchToChartConstant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPerformanceSwitchToChartConstant.setActionCommand("ChartConstant");
		btnPerformanceSwitchToChartConstant.setBounds(0, 100, 175, 21);

		PerformanceSwitchBtn.add(btnPerformanceSwitchToChartConstant);
		PerformanceSystemBtn.setBounds(1067, 571, 175, 100);
		PerformanceSystemBtn.setLayout(null);

		Performance.add(PerformanceSystemBtn);
		btnPerformanceCalculation.setActionCommand("");
		btnPerformanceCalculation.setBounds(0, 0, 175, 40);

		PerformanceSystemBtn.add(btnPerformanceCalculation);
		btnPerformanceEndProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Requested exit by pressing button.");
				System.exit(0);
			}
		});
		btnPerformanceEndProgram.setActionCommand("");
		btnPerformanceEndProgram.setBounds(0, 60, 175, 40);

		PerformanceSystemBtn.add(btnPerformanceEndProgram);
		PerformanceVerLabel.setBounds(1161, 10, 81, 13);

		Performance.add(PerformanceVerLabel);
		PerformanceLabel.setMaximumSize(new Dimension(60, 20));
		PerformanceLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		PerformanceLabel.setBounds(510, 49, 240, 24);

		Performance.add(PerformanceLabel);
		ChartConstant.setName("ChartConstant");

		contentPane.add(ChartConstant, ChartConstant.getName());
		ChartConstant.setLayout(null);
		ChartconstantSwitchBtn.setBounds(0, 0, 175, 130);
		ChartconstantSwitchBtn.setLayout(null);

		ChartConstant.add(ChartconstantSwitchBtn);
		btnChartConstSwitchToPotential.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnChartConstSwitchToPotential.setActionCommand("Potential");
		btnChartConstSwitchToPotential.setBounds(0, 0, 175, 21);

		ChartconstantSwitchBtn.add(btnChartConstSwitchToPotential);
		btnChartConstSwitchToSteps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnChartConstSwitchToSteps.setText("SwitchToSteps");
		btnChartConstSwitchToSteps.setActionCommand("Steps");
		btnChartConstSwitchToSteps.setBounds(0, 25, 175, 21);

		ChartconstantSwitchBtn.add(btnChartConstSwitchToSteps);
		btnChartConstSwitchToExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnChartConstSwitchToExp.setText("SwitchToExp");
		btnChartConstSwitchToExp.setActionCommand("Exp");
		btnChartConstSwitchToExp.setBounds(0, 50, 175, 21);

		ChartconstantSwitchBtn.add(btnChartConstSwitchToExp);
		btnChartConstSwitchToPerformance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnChartConstSwitchToPerformance.setText("SwitchToPerformance");
		btnChartConstSwitchToPerformance.setActionCommand("Performance");
		btnChartConstSwitchToPerformance.setBounds(0, 75, 175, 21);

		ChartconstantSwitchBtn.add(btnChartConstSwitchToPerformance);
		btnChartConstSwitchToChartConst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnChartConstSwitchToChartConst.setActionCommand("ChartConstant");
		btnChartConstSwitchToChartConst.setBounds(0, 100, 175, 21);

		ChartconstantSwitchBtn.add(btnChartConstSwitchToChartConst);
		ChartcontantSystemBtn.setBounds(1067, 561, 175, 100);
		ChartcontantSystemBtn.setLayout(null);

		ChartConstant.add(ChartcontantSystemBtn);
		btnChartConstCalculation.setActionCommand("");
		btnChartConstCalculation.setBounds(0, 0, 175, 40);

		ChartcontantSystemBtn.add(btnChartConstCalculation);
		btnChartConstEndProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Requested exit by pressing button.");
				System.exit(0);
			}
		});
		btnChartConstEndProgram.setActionCommand("");
		btnChartConstEndProgram.setBounds(0, 60, 175, 40);

		ChartcontantSystemBtn.add(btnChartConstEndProgram);
		ChartConstVerLabel.setBounds(1161, 10, 81, 13);
		ChartConstant.add(ChartConstVerLabel);
		ChartConstantLabel.setBounds(510, 49, 120, 24);
		ChartConstant.add(ChartConstantLabel);
		ChartConstantLabel.setMaximumSize(new Dimension(60, 20));
		ChartConstantLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));

	}
}