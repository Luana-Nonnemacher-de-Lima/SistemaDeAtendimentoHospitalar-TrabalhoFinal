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

public class Gerar_Atendimento extends JPanel {
	private JTextField fieldDataNascimento;
	private JTextField fieldNome;
	private JTextField fieldCPF;

	/**
	 * Create the panel.
	 */
	public Gerar_Atendimento() {
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
		
		JTextArea textAreaQueixa = new JTextArea();
		textAreaQueixa.setLineWrap(true);
		textAreaQueixa.setPreferredSize(new Dimension(1, 80));
		textAreaQueixa.setMaximumSize(new Dimension(2147483647, 80));
		textAreaQueixa.setBorder(UIManager.getBorder("InternalFrame.border"));
		add(textAreaQueixa, "cell 0 3 3 1,growx");
		
		JLabel labelAvaliacaoMedica = new JLabel("AVALIAÇÃO MÉDICA:");
		add(labelAvaliacaoMedica, "cell 0 4");
		
		JTextArea textAreaAvaliacaoMedica = new JTextArea();
		textAreaAvaliacaoMedica.setPreferredSize(new Dimension(1, 80));
		textAreaAvaliacaoMedica.setLineWrap(true);
		textAreaAvaliacaoMedica.setMaximumSize(new Dimension(2147483647, 80));
		textAreaAvaliacaoMedica.setBorder(UIManager.getBorder("InternalFrame.border"));
		add(textAreaAvaliacaoMedica, "cell 0 5 3 1,growx");
		
		JLabel lblMedicao = new JLabel("MEDICAÇÃO:");
		add(lblMedicao, "cell 0 6");
		
		JTextArea textAreaMedicacao = new JTextArea();
		textAreaMedicacao.setPreferredSize(new Dimension(1, 80));
		textAreaMedicacao.setMaximumSize(new Dimension(2147483647, 80));
		textAreaMedicacao.setBorder(UIManager.getBorder("InternalFrame.border"));
		textAreaMedicacao.setLineWrap(true);
		add(textAreaMedicacao, "cell 0 7 3 1,growx");
		
		JLabel labelAlaInternacao = new JLabel("ALA DE INTERNAÇÃO:");
		add(labelAlaInternacao, "cell 0 8");
		
		JRadioButton rdbtnCardiologia = new JRadioButton("Cardiologia");
		add(rdbtnCardiologia, "flowx,cell 0 9,alignx right");
		
		JButton buttonFinalizarConsulta = new JButton("Finalizar Consulta");
		buttonFinalizarConsulta.setPreferredSize(new Dimension(197, 25));
		buttonFinalizarConsulta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(buttonFinalizarConsulta, "flowx,cell 0 10,alignx right");
		
		JRadioButton rdbtnEmergncia = new JRadioButton("Emergência");
		add(rdbtnEmergncia, "cell 1 9,alignx left");
		
		JButton buttonLimparTela = new JButton("Limpar Tela");
		buttonLimparTela.setPreferredSize(new Dimension(197, 25));
		add(buttonLimparTela, "cell 1 10,alignx left");
		
		fieldNome = new JTextField();
		fieldNome.setText("");
		add(fieldNome, "cell 0 1,growx");
		fieldNome.setColumns(10);
		
		fieldCPF = new JTextField();
		fieldCPF.setText("");
		add(fieldCPF, "cell 1 1,growx");
		fieldCPF.setColumns(10);
		
		JRadioButton rdbtnPediatria = new JRadioButton("Pediatria");
		add(rdbtnPediatria, "cell 0 9,alignx right");
		
		JRadioButton rdbtnPneumologia = new JRadioButton("Pneumologia");
		add(rdbtnPneumologia, "cell 0 9,alignx right");
		
		JRadioButton rdbtnNeurologia = new JRadioButton("Neurologia");
		add(rdbtnNeurologia, "cell 0 9,alignx right");
		
		JButton buttonEncaminharIntercao = new JButton("Encaminhar Internação");
		buttonEncaminharIntercao.setMargin(new Insets(1, 14, 1, 14));
		add(buttonEncaminharIntercao, "cell 0 10,alignx right");

	}
}
