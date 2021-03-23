package visao;

import javax.swing.JPanel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Dimension;
import java.awt.Insets;

public class Gerar_Consulta extends JPanel {
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JTextArea textAreaQueixa;
	private JRadioButton rdbtnCardiologia;
	private JRadioButton rdbtnPediatria;
	private JRadioButton rdbtnPneumologia;
	private JRadioButton rdbtnNeurologia;
	private JRadioButton rdbtnEmergencia;
	private JButton buttonGerarAtendimento;
	private JButton buttonLimparTela;
	private JRadioButton radioButtonPrioridade1;
	private JRadioButton radioButtonPrioridade2;
	private JRadioButton radioButtonPrioridade3;
	private JRadioButton radioButtonPrioridade4;
	private JRadioButton radioButtonPrioridade5;

	/**
	 * Create the panel.
	 */
	public Gerar_Consulta() {
		setLayout(new MigLayout("", "[220px][grow]", "[][][][75.00,grow][][][][][]"));

		setBounds(0, 0, 765, 510);

		JLabel lblNewLabel_6 = new JLabel("GERAR CONSULTA");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel_6, "cell 0 0 2 1");

		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel, "flowx,cell 0 1,alignx left");

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_1, "flowx,cell 1 1");

		JLabel lblNewLabel_2 = new JLabel("Queixa:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_2, "cell 0 2");

		fieldCPF = new JTextField();
		fieldCPF.setMaximumSize(new Dimension(250, 2147483647));
		add(fieldCPF, "cell 0 1,grow");
		fieldCPF.setColumns(10);

		textAreaQueixa = new JTextArea();
		textAreaQueixa.setPreferredSize(new Dimension(950, 15));
		textAreaQueixa.setLineWrap(true);
		textAreaQueixa.setBorder(UIManager.getBorder("InternalFrame.border"));
		add(textAreaQueixa, "cell 0 3 2 1,alignx center,growy");

		JLabel labelPrioridade = new JLabel("Prioridade:");
		labelPrioridade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(labelPrioridade, "cell 0 4");

		radioButtonPrioridade1 = new JRadioButton("1");
		add(radioButtonPrioridade1, "flowx,cell 0 5 2 1");

		JLabel labelAlaIntern = new JLabel("Ala de interna\u00E7\u00E3o");
		labelAlaIntern.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(labelAlaIntern, "cell 0 6");

		rdbtnCardiologia = new JRadioButton("Cardiologia");
		rdbtnCardiologia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnCardiologia, "flowx,cell 0 7 2 1");

		rdbtnPediatria = new JRadioButton("Pediatria");
		rdbtnPediatria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnPediatria, "cell 0 7 2 1");

		rdbtnPneumologia = new JRadioButton("Pneumologia");
		rdbtnPneumologia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnPneumologia, "cell 0 7 2 1");

		rdbtnNeurologia = new JRadioButton("Neurologia");
		rdbtnNeurologia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnNeurologia, "cell 0 7 2 1");

		rdbtnEmergencia = new JRadioButton("Emerg\u00EAncia");
		rdbtnEmergencia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnEmergencia, "cell 0 7 2 1");

		fieldNome = new JTextField();
		fieldNome.setPreferredSize(new Dimension(200, 19));
		add(fieldNome, "cell 1 1,grow");
		fieldNome.setColumns(10);

		buttonGerarAtendimento = new JButton("Gerar Atendimento");
		add(buttonGerarAtendimento, "flowx,cell 0 8 2 1,alignx center");

		buttonLimparTela = new JButton("Limpar Tela");
		add(buttonLimparTela, "cell 0 8 2 1,alignx center");

		radioButtonPrioridade2 = new JRadioButton("2");
		add(radioButtonPrioridade2, "cell 0 5 2 1");

		radioButtonPrioridade3 = new JRadioButton("3");
		add(radioButtonPrioridade3, "cell 0 5 2 1");

		radioButtonPrioridade4 = new JRadioButton("4");
		add(radioButtonPrioridade4, "cell 0 5 2 1");

		radioButtonPrioridade5 = new JRadioButton("5");
		add(radioButtonPrioridade5, "cell 0 5 2 1");

	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextArea getTxtQueixa() {
		return textAreaQueixa;
	}

	public void setTxtQueixa(JTextArea txtQueixa) {
		this.textAreaQueixa = txtQueixa;
	}

	public JRadioButton getRdbtnCardiologia() {
		return rdbtnCardiologia;
	}

	public void setRdbtnCardiologia(JRadioButton rdbtnCardiologia) {
		this.rdbtnCardiologia = rdbtnCardiologia;
	}

	public JRadioButton getRdbtnPediatria() {
		return rdbtnPediatria;
	}

	public void setRdbtnPediatria(JRadioButton rdbtnPediatria) {
		this.rdbtnPediatria = rdbtnPediatria;
	}

	public JRadioButton getRdbtnPneumologia() {
		return rdbtnPneumologia;
	}

	public void setRdbtnPneumologia(JRadioButton rdbtnPneumologia) {
		this.rdbtnPneumologia = rdbtnPneumologia;
	}

	public JRadioButton getRdbtnNeuro() {
		return rdbtnNeurologia;
	}

	public void setRdbtnNeuro(JRadioButton rdbtnNeuro) {
		this.rdbtnNeurologia = rdbtnNeuro;
	}

	public JRadioButton getRdbtnEmergencia() {
		return rdbtnEmergencia;
	}

	public void setRdbtnEmergencia(JRadioButton rdbtnEmergencia) {
		this.rdbtnEmergencia = rdbtnEmergencia;
	}

	public JButton getButtonGerarAtendimento() {
		return buttonGerarAtendimento;
	}

	public void setButtonGerarAtendimento(JButton buttonGerarAtendimento) {
		this.buttonGerarAtendimento = buttonGerarAtendimento;
	}

	public JButton getButtonLimparTela() {
		return buttonLimparTela;
	}

	public void setButtonLimparTela(JButton buttonLimparTela) {
		this.buttonLimparTela = buttonLimparTela;
	}

	public JRadioButton getRadioButtonPrioridade1() {
		return radioButtonPrioridade1;
	}

	public void setRadioButtonPrioridade1(JRadioButton radioButtonPrioridade1) {
		this.radioButtonPrioridade1 = radioButtonPrioridade1;
	}

	public JRadioButton getRadioButtonPrioridade2() {
		return radioButtonPrioridade2;
	}

	public void setRadioButtonPrioridade2(JRadioButton radioButtonPrioridade2) {
		this.radioButtonPrioridade2 = radioButtonPrioridade2;
	}

	public JRadioButton getRadioButtonPrioridade3() {
		return radioButtonPrioridade3;
	}

	public void setRadioButtonPrioridade3(JRadioButton radioButtonPrioridade3) {
		this.radioButtonPrioridade3 = radioButtonPrioridade3;
	}

	public JRadioButton getRadioButtonPrioridade4() {
		return radioButtonPrioridade4;
	}

	public void setRadioButtonPrioridade4(JRadioButton radioButtonPrioridade4) {
		this.radioButtonPrioridade4 = radioButtonPrioridade4;
	}

	public JRadioButton getRadioButtonPrioridade5() {
		return radioButtonPrioridade5;
	}

	public void setRadioButtonPrioridade5(JRadioButton radioButtonPrioridade5) {
		this.radioButtonPrioridade5 = radioButtonPrioridade5;
	}

	public void LimparTela() {
		fieldNome.setText("");
		fieldCPF.setText("");
		textAreaQueixa.setText("");
		rdbtnCardiologia.setSelected(false);
		rdbtnEmergencia.setSelected(false);
		rdbtnNeurologia.setSelected(false);
		rdbtnPediatria.setSelected(false);
		rdbtnPneumologia.setSelected(false);

	}

}
