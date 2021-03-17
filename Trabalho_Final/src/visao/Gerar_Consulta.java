package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Insets;

public class Gerar_Consulta extends JPanel {
	private JTextField fieldDataNascimento;
	private JTextField fieldNome;
	private JTextField fieldCPF;
	private JTextArea textAreaQueixa;
	private JTextArea textAreaAvaliacaoMedica;
	private JTextArea textAreaMedicacao;
	private JRadioButton rdbtnCardiologia;
	private JRadioButton rdbtnEmergncia;
	private JRadioButton rdbtnPediatria;
	private JRadioButton rdbtnPneumologia;
	private JRadioButton rdbtnNeurologia;

	/**
	 * Create the panel.
	 */
	public Gerar_Consulta() {
		setLayout(new MigLayout("", "[grow][][]", "[][][][grow][][grow][][grow][][][]"));

		setBounds(530, 224, 765, 510);

		JLabel labelGerarAtendimento = new JLabel("Gerar Atendimento");
		labelGerarAtendimento.setFont(new Font("Dialog", Font.BOLD, 20));
		add(labelGerarAtendimento, "cell 0 0 3 1");

		JLabel labelNome = new JLabel("Nome:");
		add(labelNome, "flowy,cell 0 1");

		JLabel labelCPF = new JLabel("CPF:");
		add(labelCPF, "flowy,cell 1 1");

		JLabel labelDataDeNascimento = new JLabel("Data de Nascimento:");
		add(labelDataDeNascimento, "flowy,cell 2 1");

		fieldDataNascimento = new JTextField();
		add(fieldDataNascimento, "cell 2 1,growx");
		fieldDataNascimento.setColumns(10);

		JLabel labelQueixa = new JLabel("QUEIXA:");
		add(labelQueixa, "cell 0 2");

		textAreaQueixa = new JTextArea();
		textAreaQueixa.setWrapStyleWord(true);
		textAreaQueixa.setLineWrap(true);
		textAreaQueixa.setPreferredSize(new Dimension(1, 80));
		textAreaQueixa.setMaximumSize(new Dimension(2147483647, 80));
		textAreaQueixa.setBorder(UIManager.getBorder("InternalFrame.border"));
		add(textAreaQueixa, "cell 0 3 3 1,growx");

		JLabel labelAvaliacaoMedica = new JLabel("AVALIAÇÃO MÉDICA:");
		add(labelAvaliacaoMedica, "cell 0 4");

		textAreaAvaliacaoMedica = new JTextArea();
		textAreaAvaliacaoMedica.setWrapStyleWord(true);
		textAreaAvaliacaoMedica.setPreferredSize(new Dimension(1, 80));
		textAreaAvaliacaoMedica.setLineWrap(true);
		textAreaAvaliacaoMedica.setMaximumSize(new Dimension(2147483647, 80));
		textAreaAvaliacaoMedica.setBorder(UIManager.getBorder("InternalFrame.border"));
		add(textAreaAvaliacaoMedica, "cell 0 5 3 1,growx");

		JLabel lblMedicao = new JLabel("MEDICAÇÃO:");
		add(lblMedicao, "cell 0 6");

		textAreaMedicacao = new JTextArea();
		textAreaMedicacao.setWrapStyleWord(true);
		textAreaMedicacao.setPreferredSize(new Dimension(1, 80));
		textAreaMedicacao.setMaximumSize(new Dimension(2147483647, 80));
		textAreaMedicacao.setBorder(UIManager.getBorder("InternalFrame.border"));
		textAreaMedicacao.setLineWrap(true);
		add(textAreaMedicacao, "cell 0 7 3 1,growx");

		JLabel labelAlaInternacao = new JLabel("ALA DE INTERNAÇÃO:");
		add(labelAlaInternacao, "cell 0 8");

		rdbtnCardiologia = new JRadioButton("Cardiologia");
		rdbtnCardiologia.setIconTextGap(0);
		add(rdbtnCardiologia, "flowx,cell 0 9 2 1");

		JButton buttonFinalizarConsulta = new JButton("Finalizar Consulta");
		buttonFinalizarConsulta.setPreferredSize(new Dimension(197, 25));
		buttonFinalizarConsulta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(buttonFinalizarConsulta, "flowx,cell 0 10 3 1,alignx center");

		fieldNome = new JTextField();
		fieldNome.setText("");
		add(fieldNome, "cell 0 1,growx");
		fieldNome.setColumns(10);

		fieldCPF = new JTextField();
		fieldCPF.setText("");
		add(fieldCPF, "cell 1 1,growx");
		fieldCPF.setColumns(10);

		rdbtnPediatria = new JRadioButton("Pediatria");
		rdbtnPediatria.setIconTextGap(0);
		add(rdbtnPediatria, "cell 0 9 2 1");

		rdbtnPneumologia = new JRadioButton("Pneumologia");
		rdbtnPneumologia.setIconTextGap(0);
		add(rdbtnPneumologia, "cell 0 9 2 1");

		rdbtnNeurologia = new JRadioButton("Neurologia");
		rdbtnNeurologia.setIconTextGap(0);
		add(rdbtnNeurologia, "cell 0 9 2 1");

		JButton buttonEncaminharIntercao = new JButton("Encaminhar Internação");
		buttonEncaminharIntercao.setMargin(new Insets(1, 14, 1, 14));
		add(buttonEncaminharIntercao, "cell 0 10 3 1,alignx center");
		
				rdbtnEmergncia = new JRadioButton("Emergência");
				rdbtnEmergncia.setIconTextGap(0);
				add(rdbtnEmergncia, "flowx,cell 0 9 3 1");
								
										JButton buttonLimparTela = new JButton("Limpar Tela");
										buttonLimparTela.setPreferredSize(new Dimension(197, 25));
										add(buttonLimparTela, "cell 0 10 2 1,alignx center");

	}

	public JTextField getFieldDataNascimento() {
		return fieldDataNascimento;
	}

	public void setFieldDataNascimento(JTextField fieldDataNascimento) {
		this.fieldDataNascimento = fieldDataNascimento;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextArea getTextAreaQueixa() {
		return textAreaQueixa;
	}

	public void setTextAreaQueixa(JTextArea textAreaQueixa) {
		this.textAreaQueixa = textAreaQueixa;
	}

	public JTextArea getTextAreaAvaliacaoMedica() {
		return textAreaAvaliacaoMedica;
	}

	public void setTextAreaAvaliacaoMedica(JTextArea textAreaAvaliacaoMedica) {
		this.textAreaAvaliacaoMedica = textAreaAvaliacaoMedica;
	}

	public JTextArea getTextAreaMedicacao() {
		return textAreaMedicacao;
	}

	public void setTextAreaMedicacao(JTextArea textAreaMedicacao) {
		this.textAreaMedicacao = textAreaMedicacao;
	}

	public JRadioButton getRdbtnCardiologia() {
		return rdbtnCardiologia;
	}

	public void setRdbtnCardiologia(JRadioButton rdbtnCardiologia) {
		this.rdbtnCardiologia = rdbtnCardiologia;
	}

	public JRadioButton getRdbtnEmergncia() {
		return rdbtnEmergncia;
	}

	public void setRdbtnEmergncia(JRadioButton rdbtnEmergncia) {
		this.rdbtnEmergncia = rdbtnEmergncia;
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

	public JRadioButton getRdbtnNeurologia() {
		return rdbtnNeurologia;
	}

	public void setRdbtnNeurologia(JRadioButton rdbtnNeurologia) {
		this.rdbtnNeurologia = rdbtnNeurologia;
	}

	public void LimparTela() {
		fieldNome.setText("");
		fieldCPF.setText("");
		fieldDataNascimento.setText("");
		textAreaQueixa.setText("");
		textAreaAvaliacaoMedica.setText("");
		textAreaMedicacao.setText("");
		rdbtnCardiologia.setSelected(false);
		rdbtnEmergncia.setSelected(false);
		rdbtnNeurologia.setSelected(false);
		rdbtnPediatria.setSelected(false);
		rdbtnPneumologia.setSelected(false);

	}
}
