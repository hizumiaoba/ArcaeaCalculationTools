package main;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import calcLib.ChartPotential;
import calcLib.FetchLib;
import calcLib.Step;

/**
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
	private static final String VERSION = "Ver.0.4.1-Alpha";
	public static final String[] PACK_NAME = {
			"MemoryArchive",
			"Arcaea",
			"World_Extend",
			"Eternal_Core",
			"Vicious_Labyrinth",
			"Luminous_Sky",
			"Adverse_Prelude",
			"Black_Fate",
			"Esoteric Order",
			"Ephemeral_Page",
			"Sunset_Radiance",
			"Absolute_Reason",
			"Binary_Enfold",
			"Ambivalent_Vision",
			"Crimson_Solace",
			"maimai",
			"O.N.G.E.K.I",
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
			"Axium Tairitsu",
			"Grievous Lady Tairitsu",
			"Hikari&Fisica",
			"Eto",
			"Luna",
			"Zero Hikari",
			"Fracture Hikari",
			"Tairitsu&Trin",
			"Hikari&Seine",
			"Saya",
			"Grievous Lady Tairitsu&Chuni Penguin",
			"Kanae",
			"Fantasia Hikari",
			"Sonata Tairitsu",
			"Tempest Tairitsu",
			"Luna&Mia",
			"Alice&Tenniel",
			"Sia",
			"Lagrange",
			"Stella",
			"Ilith",
			"Shirabe",
			"Summer Hikari",
			"Summer Tairitsu",
			"Ayu",
			"Winter Eto&Luna",
			"Yume",
			"Chuni Penguin",
			"Haruna",
			"Nono",
			"MTA-XXX Pandora Nemesis",
			"MDA-21 Regulus",
			"DORO*C",
			"E/S Primera Brillante",
			"Summer Ilith",
			"Etude Saya",
			"Seele",
			"Areus",
			"Isabelle Yagurush"
	};

	private DefaultComboBoxModel<String> initBoxModel = new DefaultComboBoxModel<String>();
	private JPanel contentPane;
	private final JPanel PotentialSwitchBtn = new JPanel();
	private final JButton btnPotentialSwitchToSteps = new JButton();
	private final JButton btnPotentialSwitchtoexp = new JButton();
	private final JButton btnPotentialSwitchToPerformance = new JButton();
	private final JPanel Potential = new JPanel();
	private final JButton btnPotentialSwitchToChartConstant = new JButton(Messages.MSGSwitchToChartConstant.toString());
	private final JPanel PotentialSystemBtn = new JPanel();
	private final JButton btnPotentialCalculation = new JButton(Messages.MSGCalc.toString());
	private final JButton btnPotentialSwitchToPotential = new JButton(Messages.MSGSwitchToPotential.toString());
	private final JButton btnPotentialEndProgram = new JButton(Messages.MSGEnd.toString());
	private final JPanel Steps = new JPanel();
	CardLayout cardLayout = new CardLayout();
	private final JPanel StepsSwitchBtn = new JPanel();
	private final JButton btnStepsSwitchToPotential = new JButton(Messages.MSGSwitchToPotential.toString());
	private final JButton btnStepsSwitchToSteps = new JButton();
	private final JButton btnStepsSwitchToExp = new JButton();
	private final JButton btnStepsSwitchToPerforance = new JButton();
	private final JButton btnStepsSwitchToChartConstant = new JButton(Messages.MSGSwitchToChartConstant.toString());
	private final JPanel StepsSystemBtn = new JPanel();
	private final JButton btnStepsCalculation = new JButton(Messages.MSGCalc.toString());
	private final JButton btnStepsEndProgram = new JButton(Messages.MSGEnd.toString());
	private final JPanel Exp = new JPanel();
	private final JPanel Performance = new JPanel();
	private final JPanel ChartConstant = new JPanel();
	private final JPanel ExpSwitchBtn = new JPanel();
	private final JButton btnExpSwitchToPotential = new JButton(Messages.MSGSwitchToPotential.toString());
	private final JButton btnExpSwitchToSteps = new JButton();
	private final JButton btnExpSwitchToExp = new JButton();
	private final JButton btnExpSwitchToPerformance = new JButton();
	private final JButton btnExpSwitchToChartConstant = new JButton(Messages.MSGSwitchToChartConstant.toString());
	private final JPanel ExpSystemBtn = new JPanel();
	private final JButton btnExpCalculation = new JButton(Messages.MSGCalc.toString());
	private final JButton btnExpEndProgram = new JButton(Messages.MSGEnd.toString());
	private final JPanel PerformanceSwitchBtn = new JPanel();
	private final JButton btnPerformanceSwitchToPotential = new JButton(Messages.MSGSwitchToPotential.toString());
	private final JButton btnPerformanceSwitchToSteps = new JButton();
	private final JButton btnPerformanceSwitchToExp = new JButton();
	private final JButton btnPerformanceSwitchToPerformance = new JButton();
	private final JButton btnPerformanceSwitchToChartConstant = new JButton(Messages.MSGSwitchToChartConstant.toString());
	private final JPanel PerformanceSystemBtn = new JPanel();
	private final JButton btnPerformanceCalculation = new JButton(Messages.MSGCalc.toString());
	private final JButton btnPerformanceEndProgram = new JButton(Messages.MSGEnd.toString());
	private final JPanel ChartconstantSwitchBtn = new JPanel();
	private final JButton btnChartConstSwitchToPotential = new JButton(Messages.MSGSwitchToPotential.toString());
	private final JButton btnChartConstSwitchToSteps = new JButton();
	private final JButton btnChartConstSwitchToExp = new JButton();
	private final JButton btnChartConstSwitchToPerformance = new JButton();
	private final JButton btnChartConstSwitchToChartConst = new JButton(Messages.MSGSwitchToChartConstant.toString());
	private final JPanel ChartcontantSystemBtn = new JPanel();
	private final JButton btnChartConstCalculation = new JButton(Messages.MSGCalc.toString());
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
	private final JComboBox<String> PotentialPackBox = new JComboBox<>();
	private final JComboBox<String> PotentialSongBox = new JComboBox<String>();
	private DefaultComboBoxModel<String> songModel = new DefaultComboBoxModel<>();
	private final JComboBox<String> PotentialDifficultyBox = new JComboBox<String>();
	private final JLabel PotentialPackNameLabel = new JLabel(Messages.MSGSongPack.toString());
	private final JLabel PotentialSongTitleLabel = new JLabel(Messages.MSGSongTitle.toString());;
	private final JLabel PotentialChartDifficultyLabel = new JLabel(Messages.MSGChartDifficulty.toString());;
	private final JLabel PotentialSongInfLabel = new JLabel(Messages.MSGSongInformation.toString());
	private final JLabel PotentialSongTitleEngLabel = new JLabel("");
	private final JLabel PotentialSongTitleJpnLabel = new JLabel("");
	private final JLabel PotentialChartConstantLabel = new JLabel("");
	private final JTextField PotentialScoreField = new JTextField();
	private final JLabel PotentialYourScoreLabel = new JLabel(Messages.MSGShowScore.toString());
	private final JLabel PotentialChartPotentialResultShowLabel = new JLabel();
	private final JLabel PotentialGradeResultsShowLabel = new JLabel();
	private final JLabel StepsPackLabel = new JLabel(Messages.MSGSongPack.toString());
	private final JLabel StepsTitleLabel = new JLabel(Messages.MSGSongTitle.toString());
	private final JLabel StepsScoreLabel = new JLabel(Messages.MSGShowScore.toString());
	private final JLabel StepsLvLabel = new JLabel(Messages.MSGLv.toString());
	private final JLabel StepsPartnerLabel = new JLabel(Messages.MSGPartnerName.toString());
	private final JComboBox<String> StepsPackBox = new JComboBox<String>();
	private final JComboBox<String> StepsSongBox = new JComboBox<String>();
	private final JComboBox<String> StepsPartnerBox = new JComboBox<String>();
	private final JComboBox<Integer> StepsLvBox = new JComboBox<Integer>();
	private JTextField StepsScoreField;
	private JTextField StepsTempestStepField;
	private JLabel lblTempest;
	private final JLabel StepsSongInfLabel = new JLabel(Messages.MSGSongInformation.toString());
	private final JLabel StepsResultLabel = new JLabel(Messages.MSGResult.toString());
	private final JLabel StepsSongTitleEngLabel = new JLabel("");
	private final JLabel StepsSongTitleJpnLabel = new JLabel("");
	private final JLabel StepsChartConstLabel = new JLabel("");
	private final JLabel StepsScoreResultShowLabel = new JLabel("");
	private final JLabel StepsStepResultShowLabel = new JLabel("");
	private final JLabel StepsGradeResultShowLabel = new JLabel("");
	private JComboBox<String> StepsDifficultyBox;
	private JLabel StepsDifficultyLabel;
	private JLabel ExpPackLabel = new JLabel(Messages.MSGSongPack.toString());
	private JLabel ExpSongLabel = new JLabel(Messages.MSGSongTitle.toString());
	private JLabel ExpDifficultyLabel = new JLabel(Messages.MSGChartDifficulty.toString());
	private JLabel ExpScoreLabel = new JLabel(Messages.MSGShowScore.toString());
	private JLabel ExpIsboostedLabel = new JLabel(Messages.MSGIsBoosted.toString());
	private JComboBox<String> ExpPackbox = new JComboBox<String>();
	private JComboBox<String> ExpSongBox = new JComboBox<String>();
	private JComboBox<String> ExpDifficultyBox = new JComboBox<String>();
	private JCheckBox ExpIsMemoryboostEffected = new JCheckBox(Messages.MSGActive.toString());
	private JLabel ExpSongInfoLabel = new JLabel(Messages.MSGSongInformation.toString());
	private JLabel ExpResultLabel = new JLabel(Messages.MSGResult.toString());
	private JLabel ExpSongTitleEngLabel = new JLabel("");
	private JLabel ExpSongTitleJpnLabel = new JLabel("");
	private JLabel ExpChartConstLabel = new JLabel("");
	private JLabel ExpScoreResultShowLabel = new JLabel("");
	private JLabel ExpExpResultLabel = new JLabel("");
	private JLabel ExpGradeShowLabel = new JLabel("");
	private JTextField ExpScoreField = new JTextField();
	private JLabel PerformancePackLabel;
	private JLabel PerformanceSongLabel;
	private JLabel PerformanceDifficultyLabel;
	private JLabel PerformanceScoreLabel;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JCheckBox chkboxTrackComplete;
	private JTextField textField;

	/**
	 * Launch the application.
	 * @since Ver0.1.0-Alpha
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
	 * @since Ver0.1.0-Alpha
	 */
	public ArcaeaCalculationTools() {
		//for testing codes
		FetchLib.fetchPackNames();
		FetchLib.fetchPartnerNames();
		// initiate the combo box model
		modelInit();
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
		btnPotentialSwitchToSteps.setActionCommand("Step");
		btnPotentialSwitchToSteps.setText(Messages.MSGSwitchToStep.toString());
		btnPotentialSwitchToSteps.setBounds(0, 25, 175, 21);
		PotentialSwitchBtn.add(btnPotentialSwitchToSteps);
		btnPotentialSwitchtoexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPotentialSwitchtoexp.setActionCommand("Exp");
		btnPotentialSwitchtoexp.setText(Messages.MSGSwitchToExp.toString());
		btnPotentialSwitchtoexp.setBounds(0, 50, 175, 21);
		PotentialSwitchBtn.add(btnPotentialSwitchtoexp);
		btnPotentialSwitchToPerformance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPotentialSwitchToPerformance.setActionCommand("Performance");
		btnPotentialSwitchToPerformance.setText(Messages.MSGSwitchToPerformance.toString());
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
				String pack = PotentialPackBox.getSelectedItem().toString();
				String titleEng = PotentialSongBox.getSelectedItem().toString();
				String difficulty = PotentialDifficultyBox.getSelectedItem().toString();
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
		PotentialPackBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Reflection trigger fired.");
				String[] songTitles = ChartPotential.getSongKey((String) PotentialPackBox.getSelectedItem());
				for (String song : songTitles) {
					System.out.println(song);
				}
				songModel.removeAllElements();
				for (String songName : songTitles) {
					songModel.addElement(songName);
				}
				PotentialSongBox.setModel(songModel);
			}
		});
		PotentialPackBox.setModel(new DefaultComboBoxModel<String>(PACK_NAME));
		PotentialPackBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialPackBox.setBounds(175, 188, 204, 27);

		Potential.add(PotentialPackBox);
		PotentialSongBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialSongBox.setBounds(486, 188, 330, 27);

		Potential.add(PotentialSongBox);
		PotentialDifficultyBox.setModel(new DefaultComboBoxModel(new String[] { "PST", "PRS", "FTR", "BYD" }));
		PotentialDifficultyBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialDifficultyBox.setBounds(910, 188, 102, 27);

		Potential.add(PotentialDifficultyBox);
		PotentialPackNameLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialPackNameLabel.setBounds(208, 157, 105, 21);
		Potential.add(PotentialPackNameLabel);
		PotentialSongTitleLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialSongTitleLabel.setBounds(591, 157, 105, 21);

		Potential.add(PotentialSongTitleLabel);
		PotentialChartDifficultyLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 18));
		PotentialChartDifficultyLabel.setBounds(886, 157, 150, 21);

		Potential.add(PotentialChartDifficultyLabel);
		PotentialSongInfLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		PotentialSongInfLabel.setBounds(208, 237, 80, 24);

		Potential.add(PotentialSongInfLabel);
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
		Steps.setName("Step");

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
		btnStepsSwitchToSteps.setText(Messages.MSGSwitchToStep.toString());
		btnStepsSwitchToSteps.setActionCommand("Step");
		btnStepsSwitchToSteps.setBounds(0, 25, 175, 21);

		StepsSwitchBtn.add(btnStepsSwitchToSteps);
		btnStepsSwitchToExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnStepsSwitchToExp.setText(Messages.MSGSwitchToExp.toString());
		btnStepsSwitchToExp.setActionCommand("Exp");
		btnStepsSwitchToExp.setBounds(0, 50, 175, 21);

		StepsSwitchBtn.add(btnStepsSwitchToExp);
		btnStepsSwitchToPerforance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}

		});
		btnStepsSwitchToPerforance.setText(Messages.MSGSwitchToPerformance.toString());
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
		btnStepsCalculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Calculation trigger fired.");
				int score = Integer.parseInt(StepsScoreField.getText());
				String pack = StepsPackBox.getSelectedItem().toString();
				String titleEng = StepsSongBox.getSelectedItem().toString();
				String difficulty = StepsDifficultyBox.getSelectedItem().toString();
				String titleJpn = ChartPotential.getTitle(pack, titleEng).toString();
				String partner = StepsPartnerBox.getSelectedItem().toString();
				int lv = Integer.parseInt(StepsLvBox.getSelectedItem().toString());
				double chartconst = ChartPotential.getChartConstant(pack, titleEng, difficulty);
				double step = 0.0;
				if(partner.equals("Tempest Tairitsu")) {
					step = Step.calcSteps(pack, titleEng, difficulty, score, Integer.parseInt(StepsTempestStepField.getText()));
				} else {
					step = Step.calcSteps(pack, titleEng, difficulty, score, partner, lv);
				}
				StepsSongTitleEngLabel
						.setText(Messages.MSGEnglishTitle.toString() + " : " + titleEng);
				StepsSongTitleJpnLabel.setText(Messages.MSGJapaneseTitle.toString() + " : " + titleJpn);
				StepsChartConstLabel.setText(Messages.MSGChartConstant.toString() + " : " + chartconst);
				StepsScoreResultShowLabel.setText(Messages.MSGShowScore.toString() + " : " + score);
				StepsStepResultShowLabel
						.setText(String.valueOf(Messages.MSGShowSteps.toString() + " : " + step));
				StepsGradeResultShowLabel.setText(Messages.MSGShowGrade + " : " + ChartPotential.getGrade(score));
				System.out.println("calculation complete.\n"
						+ "score : " + score
						+ "\npack : " + pack
						+ "\ntitleEng : " + titleEng
						+ "\ndifficulty : " + difficulty
						+ "\ntitleJpn : " + titleJpn
						+ "\nchartconst : " + chartconst
						+ "\nPartner : "  + partner
						+ "\nPartner Level : " + lv
						+ "\nStep : " + step);
			}
		});
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
		StepVerLabel.setBounds(1136, 10, 106, 13);

		Steps.add(StepVerLabel);
		StepsLabel.setBounds(510, 49, 108, 24);
		Steps.add(StepsLabel);
		StepsLabel.setMaximumSize(new Dimension(60, 20));
		StepsLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		StepsPackLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		StepsPackLabel.setBounds(93, 180, 100, 24);

		Steps.add(StepsPackLabel);

		StepsTitleLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		StepsTitleLabel.setBounds(359, 180, 60, 24);
		Steps.add(StepsTitleLabel);

		StepsScoreLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		StepsScoreLabel.setBounds(641, 180, 60, 24);
		Steps.add(StepsScoreLabel);

		StepsLvLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		StepsLvLabel.setBounds(1156, 180, 60, 24);
		Steps.add(StepsLvLabel);

		StepsPartnerLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		StepsPartnerLabel.setBounds(895, 180, 120, 24);
		Steps.add(StepsPartnerLabel);

		StepsPackBox.setModel(new DefaultComboBoxModel<String>(PACK_NAME));
		StepsPackBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsPackBox.setBounds(38, 214, 214, 21);
		Steps.add(StepsPackBox);

		StepsSongBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsSongBox.setBounds(284, 214, 194, 21);
		Steps.add(StepsSongBox);

		StepsPartnerBox.setModel(new DefaultComboBoxModel<String>(PARTNER_NAME));
		StepsPartnerBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 14));
		StepsPartnerBox.setBounds(785, 214, 314, 21);
		Steps.add(StepsPartnerBox);
		StepsLvBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));

		StepsLvBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsLvBox.setBounds(1136, 214, 106, 21);
		Steps.add(StepsLvBox);

		StepsPackBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Reflection trigger fired.");
				String[] songTitles = ChartPotential.getSongKey((String) StepsPackBox.getSelectedItem());
				for (String song : songTitles) {
					System.out.println(song);
				}
				songModel.removeAllElements();
				for (String songName : songTitles) {
					songModel.addElement(songName);
				}
				StepsSongBox.setModel(songModel);
			}
		});

		StepsScoreField = new JTextField();
		StepsScoreField.setBounds(608, 215, 127, 19);
		Steps.add(StepsScoreField);
		StepsScoreField.setColumns(10);

		StepsTempestStepField = new JTextField();
		StepsTempestStepField.setColumns(10);
		StepsTempestStepField.setBounds(1176, 304, 49, 19);
		Steps.add(StepsTempestStepField);

		lblTempest = new JLabel(Messages.MSGForTempest.toString());
		lblTempest.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		lblTempest.setBounds(1002, 300, 148, 24);
		Steps.add(lblTempest);
		StepsSongInfLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		StepsSongInfLabel.setBounds(168, 258, 80, 24);

		Steps.add(StepsSongInfLabel);
		StepsResultLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		StepsResultLabel.setBounds(631, 258, 80, 24);

		Steps.add(StepsResultLabel);
		StepsSongTitleEngLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsSongTitleEngLabel.setBounds(24, 314, 395, 24);

		Steps.add(StepsSongTitleEngLabel);
		StepsSongTitleJpnLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsSongTitleJpnLabel.setBounds(24, 353, 395, 24);

		Steps.add(StepsSongTitleJpnLabel);
		StepsChartConstLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsChartConstLabel.setBounds(24, 394, 395, 24);

		Steps.add(StepsChartConstLabel);
		StepsScoreResultShowLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsScoreResultShowLabel.setBounds(495, 304, 395, 24);

		Steps.add(StepsScoreResultShowLabel);
		StepsStepResultShowLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsStepResultShowLabel.setBounds(495, 343, 395, 24);

		Steps.add(StepsStepResultShowLabel);
		StepsGradeResultShowLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsGradeResultShowLabel.setBounds(495, 384, 395, 24);

		Steps.add(StepsGradeResultShowLabel);

		StepsDifficultyBox = new JComboBox<String>();
		StepsDifficultyBox.setModel(new DefaultComboBoxModel(new String[] {"PST", "PRS", "FTR", "BYD"}));
		StepsDifficultyBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		StepsDifficultyBox.setBounds(490, 214, 104, 21);
		Steps.add(StepsDifficultyBox);

		StepsDifficultyLabel = new JLabel(Messages.MSGChartDifficulty.toString());
		StepsDifficultyLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		StepsDifficultyLabel.setBounds(478, 180, 120, 24);
		Steps.add(StepsDifficultyLabel);
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
		btnExpSwitchToSteps.setText(Messages.MSGSwitchToStep.toString());
		btnExpSwitchToSteps.setActionCommand("Step");
		btnExpSwitchToSteps.setBounds(0, 25, 175, 21);

		ExpSwitchBtn.add(btnExpSwitchToSteps);
		btnExpSwitchToExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnExpSwitchToExp.setText(Messages.MSGSwitchToExp.toString());
		btnExpSwitchToExp.setActionCommand("Exp");
		btnExpSwitchToExp.setBounds(0, 50, 175, 21);

		ExpSwitchBtn.add(btnExpSwitchToExp);
		btnExpSwitchToPerformance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnExpSwitchToPerformance.setText(Messages.MSGSwitchToPerformance.toString());
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
		btnExpCalculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Calculation trigger fired.");
				int score = Integer.parseInt(ExpScoreField.getText());
				String pack = ExpPackbox.getSelectedItem().toString();
				String titleEng = ExpSongBox.getSelectedItem().toString();
				String difficulty = ExpDifficultyBox.getSelectedItem().toString();
				String titleJpn = ChartPotential.getTitle(pack, titleEng).toString();
				double chartconst = ChartPotential.getChartConstant(pack, titleEng, difficulty);
				boolean isBoosted = ExpIsMemoryboostEffected.isSelected();
				int Exp = calcLib.Exp.calcExp(pack, titleEng, difficulty, score, isBoosted);
				ExpSongTitleEngLabel
						.setText(Messages.MSGEnglishTitle.toString() + " : " + titleEng);
				ExpSongTitleJpnLabel.setText(Messages.MSGJapaneseTitle.toString() + " : " + titleJpn);
				ExpChartConstLabel.setText(Messages.MSGChartConstant.toString() + " : " + chartconst);
				ExpScoreResultShowLabel.setText(Messages.MSGShowScore.toString() + " : " + score);
				ExpExpResultLabel
						.setText(String.valueOf(Messages.MSGShowGotExp.toString() + " : " + Exp));
				ExpGradeShowLabel.setText(Messages.MSGShowGrade + " : " + ChartPotential.getGrade(score));
				System.out.println("calculation complete."
						+ "\nscore : " + score
						+ "\npack : " + pack
						+ "\ntitleEng : " + titleEng
						+ "\ndifficulty : " + difficulty
						+ "\ntitleJpn : " + titleJpn
						+ "\nchartconst : " + chartconst
						+ "\nGotExp : " + Exp);
			}
		});
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
		ExpVerLabel.setBounds(1136, 10, 106, 13);

		Exp.add(ExpVerLabel);
		ExpLabel.setMaximumSize(new Dimension(60, 20));
		ExpLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		ExpLabel.setBounds(510, 49, 100, 24);

		Exp.add(ExpLabel);

		ExpPackLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		ExpPackLabel.setBounds(118, 187, 100, 24);
		Exp.add(ExpPackLabel);

		ExpSongLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		ExpSongLabel.setBounds(440, 187, 60, 24);
		Exp.add(ExpSongLabel);

		ExpDifficultyLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		ExpDifficultyLabel.setBounds(679, 187, 120, 24);
		Exp.add(ExpDifficultyLabel);

		ExpScoreLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		ExpScoreLabel.setBounds(894, 187, 60, 24);
		Exp.add(ExpScoreLabel);

		ExpIsboostedLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		ExpIsboostedLabel.setBounds(1057, 187, 160, 24);
		Exp.add(ExpIsboostedLabel);

		ExpPackbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Reflection trigger fired.");
				String[] songTitles = ChartPotential.getSongKey((String) ExpPackbox.getSelectedItem());
				for (String song : songTitles) {
					System.out.println(song);
				}
				songModel.removeAllElements();
				for (String songName : songTitles) {
					songModel.addElement(songName);
				}
				ExpSongBox.setModel(songModel);
			}
		});
		ExpPackbox.setModel(new DefaultComboBoxModel<String>(PACK_NAME));
		ExpPackbox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		ExpPackbox.setBounds(65, 221, 214, 21);
		Exp.add(ExpPackbox);

		ExpSongBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		ExpSongBox.setBounds(307, 221, 333, 21);
		Exp.add(ExpSongBox);
		ExpDifficultyBox.setModel(new DefaultComboBoxModel(new String[] {"PST", "PRS", "FTR", "BYD"}));

		ExpDifficultyBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		ExpDifficultyBox.setBounds(668, 221, 145, 21);
		Exp.add(ExpDifficultyBox);

		ExpIsMemoryboostEffected.setFont(new Font("UD デジタル 教科書体 NK-B", Font.PLAIN, 14));
		ExpIsMemoryboostEffected.setBounds(1114, 221, 53, 25);
		Exp.add(ExpIsMemoryboostEffected);

		ExpSongInfoLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		ExpSongInfoLabel.setBounds(209, 283, 80, 24);
		Exp.add(ExpSongInfoLabel);

		ExpResultLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		ExpResultLabel.setBounds(672, 283, 80, 24);
		Exp.add(ExpResultLabel);

		ExpSongTitleEngLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		ExpSongTitleEngLabel.setBounds(65, 339, 395, 24);
		Exp.add(ExpSongTitleEngLabel);

		ExpSongTitleJpnLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		ExpSongTitleJpnLabel.setBounds(68, 406, 395, 24);
		Exp.add(ExpSongTitleJpnLabel);

		ExpChartConstLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		ExpChartConstLabel.setBounds(64, 464, 395, 24);
		Exp.add(ExpChartConstLabel);

		ExpScoreResultShowLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		ExpScoreResultShowLabel.setBounds(535, 339, 395, 24);
		Exp.add(ExpScoreResultShowLabel);

		ExpExpResultLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		ExpExpResultLabel.setBounds(538, 406, 395, 24);
		Exp.add(ExpExpResultLabel);

		ExpGradeShowLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		ExpGradeShowLabel.setBounds(534, 464, 395, 24);
		Exp.add(ExpGradeShowLabel);

		ExpScoreField.setBounds(845, 222, 160, 19);
		Exp.add(ExpScoreField);
		ExpScoreField.setColumns(10);
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
		btnPerformanceSwitchToSteps.setText(Messages.MSGSwitchToStep.toString());
		btnPerformanceSwitchToSteps.setActionCommand("Step");
		btnPerformanceSwitchToSteps.setBounds(0, 25, 175, 21);

		PerformanceSwitchBtn.add(btnPerformanceSwitchToSteps);
		btnPerformanceSwitchToExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPerformanceSwitchToExp.setText(Messages.MSGSwitchToExp.toString());
		btnPerformanceSwitchToExp.setActionCommand("Exp");
		btnPerformanceSwitchToExp.setBounds(0, 50, 175, 21);

		PerformanceSwitchBtn.add(btnPerformanceSwitchToExp);
		btnPerformanceSwitchToPerformance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnPerformanceSwitchToPerformance.setText(Messages.MSGSwitchToPerformance.toString());
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
		PerformanceVerLabel.setBounds(1136, 10, 106, 13);

		Performance.add(PerformanceVerLabel);
		PerformanceLabel.setMaximumSize(new Dimension(60, 20));
		PerformanceLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		PerformanceLabel.setBounds(510, 49, 240, 24);

		Performance.add(PerformanceLabel);

		PerformancePackLabel = new JLabel("収録パック");
		PerformancePackLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		PerformancePackLabel.setBounds(176, 225, 100, 24);
		Performance.add(PerformancePackLabel);

		PerformanceSongLabel = new JLabel("楽曲名");
		PerformanceSongLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		PerformanceSongLabel.setBounds(498, 225, 60, 24);
		Performance.add(PerformanceSongLabel);

		PerformanceDifficultyLabel = new JLabel("譜面別難易度");
		PerformanceDifficultyLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		PerformanceDifficultyLabel.setBounds(737, 225, 120, 24);
		Performance.add(PerformanceDifficultyLabel);

		PerformanceScoreLabel = new JLabel("スコア");
		PerformanceScoreLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));
		PerformanceScoreLabel.setBounds(952, 225, 60, 24);
		Performance.add(PerformanceScoreLabel);

		comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		comboBox.setBounds(118, 257, 214, 21);
		Performance.add(comboBox);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		comboBox_1.setBounds(360, 257, 333, 21);
		Performance.add(comboBox_1);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 16));
		comboBox_2.setBounds(721, 257, 145, 21);
		Performance.add(comboBox_2);

		chkboxTrackComplete = new JCheckBox("クリア");
		chkboxTrackComplete.setFont(new Font("UD デジタル 教科書体 NK-B", Font.PLAIN, 14));
		chkboxTrackComplete.setBounds(1100, 255, 60, 25);
		Performance.add(chkboxTrackComplete);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(898, 258, 160, 19);
		Performance.add(textField);
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
		btnChartConstSwitchToSteps.setText(Messages.MSGSwitchToStep.toString());
		btnChartConstSwitchToSteps.setActionCommand("Step");
		btnChartConstSwitchToSteps.setBounds(0, 25, 175, 21);

		ChartconstantSwitchBtn.add(btnChartConstSwitchToSteps);
		btnChartConstSwitchToExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnChartConstSwitchToExp.setText(Messages.MSGSwitchToExp.toString());
		btnChartConstSwitchToExp.setActionCommand("Exp");
		btnChartConstSwitchToExp.setBounds(0, 50, 175, 21);

		ChartconstantSwitchBtn.add(btnChartConstSwitchToExp);
		btnChartConstSwitchToPerformance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, e.getActionCommand());
			}
		});
		btnChartConstSwitchToPerformance.setText(Messages.MSGSwitchToPerformance.toString());
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
		ChartConstVerLabel.setBounds(1136, 10, 106, 13);
		ChartConstant.add(ChartConstVerLabel);
		ChartConstantLabel.setBounds(510, 49, 120, 24);
		ChartConstant.add(ChartConstantLabel);
		ChartConstantLabel.setMaximumSize(new Dimension(60, 20));
		ChartConstantLabel.setFont(new Font("UD デジタル 教科書体 NP-B", Font.PLAIN, 20));

	}

	/**
	 * 楽曲パックの初期値を表示
	 *
	 * @since Ver0.2.2-Alpha
	 * @author hizumi
	 */
	private void modelInit() {
		String[] initStrings = ChartPotential.getSongKey("MemoryArchive");
		for(String initString : initStrings) {
			initBoxModel.addElement(initString);
		}
		PotentialSongBox.setModel(initBoxModel);
		StepsSongBox.setModel(initBoxModel);
		ExpSongBox.setModel(initBoxModel);
	}
}