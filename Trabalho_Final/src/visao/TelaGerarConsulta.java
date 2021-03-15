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

public class TelaGerarConsulta extends JPanel {
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JTextArea txtQueixa;
	private JTextArea txtMedicacao;
	private JTextArea txtAvaliacaoMedica;
	private JRadioButton rdbtnCardiologia;
	private JRadioButton rdbtnPediatria;
	private JRadioButton rdbtnPneumologia;
	private JRadioButton rdbtnNeuro;
	private JRadioButton rdbtnEmergencia;
	private JButton btnFinalizarConsulta;
	private JButton btnEncaminharInternacao;
	private JButton btnLimparTela;

	/**
	 * Create the panel.
	 */
	public TelaGerarConsulta() {
		setLayout(new MigLayout("", "[218.00][218.00][221.00,grow][221.00,grow]",
				"[][][][75.00][][75.00][][75.00][][][]"));
		
		setBounds(530, 224, 765, 510);

		JLabel lblNewLabel_6 = new JLabel("GERAR CONSULTA");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel_6, "cell 0 0 4 1,alignx center");

		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel, "flowx,cell 0 1,alignx left");

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_1, "flowx,cell 1 1 2 1");

		JLabel lblNewLabel_2 = new JLabel("Queixa:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_2, "cell 0 2 2 1");

		fieldCPF = new JTextField();
		add(fieldCPF, "cell 0 1,grow");
		fieldCPF.setColumns(10);

		txtQueixa = new JTextArea();
		add(txtQueixa, "cell 0 3 2 1,grow");

		JLabel lblNewLabel_3 = new JLabel("Avalia\u00E7\u00E3o M\u00E9dica:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_3, "cell 0 4 2 1");

		txtAvaliacaoMedica = new JTextArea();
		add(txtAvaliacaoMedica, "cell 0 5 2 1,grow");

		JLabel lblNewLabel_4 = new JLabel("Medica\u00E7\u00E3o:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_4, "cell 0 6 2 1");

		txtMedicacao = new JTextArea();
		add(txtMedicacao, "cell 0 7 2 1,grow");

		JLabel lblNewLabel_5 = new JLabel("Ala de interna\u00E7\u00E3o");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_5, "cell 0 8 2 1");

		rdbtnCardiologia = new JRadioButton("Cardiologia");
		rdbtnCardiologia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnCardiologia, "flowx,cell 0 9 2 1");

		rdbtnPediatria = new JRadioButton("Pediatria");
		rdbtnPediatria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnPediatria, "cell 0 9 2 1");

		rdbtnPneumologia = new JRadioButton("Pneumologia");
		rdbtnPneumologia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnPneumologia, "cell 0 9 2 1");

		rdbtnNeuro = new JRadioButton("Neurologia");
		rdbtnNeuro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnNeuro, "cell 0 9 2 1");

		rdbtnEmergencia = new JRadioButton("Emerg\u00EAncia");
		rdbtnEmergencia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(rdbtnEmergencia, "cell 0 9 2 1");

		fieldNome = new JTextField();
		add(fieldNome, "cell 1 1,grow");
		fieldNome.setColumns(10);

		btnFinalizarConsulta = new JButton("Finalizar Consulta");
		add(btnFinalizarConsulta, "flowx,cell 0 10 4 1,alignx center");

		btnEncaminharInternacao = new JButton("Encaminhar Interna\u00E7\u00E3o");
		add(btnEncaminharInternacao, "cell 0 10 4 1");

		btnLimparTela = new JButton("Limpar Tela");
		add(btnLimparTela, "cell 0 10 4 1");

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
		return txtQueixa;
	}

	public void setTxtQueixa(JTextArea txtQueixa) {
		this.txtQueixa = txtQueixa;
	}

	public JTextArea getTxtMedicacao() {
		return txtMedicacao;
	}

	public void setTxtMedicacao(JTextArea txtMedicacao) {
		this.txtMedicacao = txtMedicacao;
	}

	public JTextArea getTxtAvaliacaoMedica() {
		return txtAvaliacaoMedica;
	}

	public void setTxtAvaliacaoMedica(JTextArea txtAvaliacaoMedica) {
		this.txtAvaliacaoMedica = txtAvaliacaoMedica;
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
		return rdbtnNeuro;
	}

	public void setRdbtnNeuro(JRadioButton rdbtnNeuro) {
		this.rdbtnNeuro = rdbtnNeuro;
	}

	public JRadioButton getRdbtnEmergencia() {
		return rdbtnEmergencia;
	}

	public void setRdbtnEmergencia(JRadioButton rdbtnEmergencia) {
		this.rdbtnEmergencia = rdbtnEmergencia;
	}

	public JButton getBtnFinalizarConsulta() {
		return btnFinalizarConsulta;
	}

	public void setBtnFinalizarConsulta(JButton btnFinalizarConsulta) {
		this.btnFinalizarConsulta = btnFinalizarConsulta;
	}

	public JButton getBtnEncaminharInternacao() {
		return btnEncaminharInternacao;
	}

	public void setBtnEncaminharInternacao(JButton btnEncaminharInternacao) {
		this.btnEncaminharInternacao = btnEncaminharInternacao;
	}

	public JButton getBtnLimparTela() {
		return btnLimparTela;
	}

	public void setBtnLimparTela(JButton btnLimparTela) {
		this.btnLimparTela = btnLimparTela;
	}

}
