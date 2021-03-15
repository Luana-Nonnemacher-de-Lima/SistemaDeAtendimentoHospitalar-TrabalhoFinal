package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class Gerenciar_Paciente extends JPanel {
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JTextField fieldDataDeNascimento;
	private JTextField fieldEndereco;
	private JTextField fieldeNomePai;
	private JLabel labelNomeDaMae;
	private JTextField fieldNomeMae;

	/**
	 * Create the panel.
	 */
	public Gerenciar_Paciente() {
		setLayout(new MigLayout("", "[][grow][grow][][]", "[100px][][30px][][30px][][30px][grow][100px]"));
		
		JLabel labelTítulo = new JLabel("Gerenciar Paciente");
		labelTítulo.setFont(new Font("Dialog", Font.BOLD, 20));
		add(labelTítulo, "cell 1 0 3 1");
		
		JLabel labelNome = new JLabel("Nome:");
		add(labelNome, "cell 1 1,aligny bottom");
		
		JLabel labelCPF = new JLabel("CPF:");
		add(labelCPF, "cell 2 1");
		
		JLabel labelDataDeNascimento = new JLabel("Data de Nascimento:");
		add(labelDataDeNascimento, "cell 3 1");
		
		JLabel labelNomeDoPai = new JLabel("Nome do Pai:");
		add(labelNomeDoPai, "cell 1 3");
		
		labelNomeDaMae = new JLabel("Nome da Mãe:");
		add(labelNomeDaMae, "cell 2 3");
		
		fieldeNomePai = new JTextField();
		fieldeNomePai.setPreferredSize(new Dimension(337, 19));
		add(fieldeNomePai, "cell 1 4,growx");
		fieldeNomePai.setColumns(10);
		
		fieldNomeMae = new JTextField();
		fieldNomeMae.setPreferredSize(new Dimension(337, 19));
		fieldNomeMae.setText("");
		add(fieldNomeMae, "cell 2 4 2 1,growx");
		fieldNomeMae.setColumns(10);
		
		JLabel labelEndereco = new JLabel("Endereço:");
		add(labelEndereco, "cell 1 5");
		
		JLabel labelTipoSangue = new JLabel("Tipo Sanguíneo:");
		add(labelTipoSangue, "cell 3 5");
		
		fieldEndereco = new JTextField();
		fieldEndereco.setText("");
		add(fieldEndereco, "cell 1 6 2 1,growx");
		fieldEndereco.setColumns(10);
		
		JButton buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(buttonCadastrar, "cell 1 8,alignx right,gapx 30");
		
		JButton buttonLimpar = new JButton("Limpar");
		buttonLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonLimpar.setMinimumSize(new Dimension(105, 25));
		buttonLimpar.setMaximumSize(new Dimension(105, 25));
		add(buttonLimpar, "cell 2 8");
		
		fieldNome = new JTextField();
		fieldNome.setPreferredSize(new Dimension(250, 19));
		fieldNome.setMinimumSize(new Dimension(250, 19));
		add(fieldNome, "cell 1 2,growx");
		fieldNome.setColumns(10);
		
		fieldCPF = new JTextField();
		fieldCPF.setName("");
		add(fieldCPF, "cell 2 2,growx");
		fieldCPF.setColumns(10);
		
		fieldDataDeNascimento = new JTextField();
		add(fieldDataDeNascimento, "cell 3 2,growx");
		fieldDataDeNascimento.setColumns(10);
		
		JComboBox comboBoxTipoSangue = new JComboBox();
		comboBoxTipoSangue.setMinimumSize(new Dimension(5, 5));
		comboBoxTipoSangue.setPreferredSize(new Dimension(147, 19));
		comboBoxTipoSangue.setModel(new DefaultComboBoxModel(new String[] {"", "Tipo A+", "Tipo A-", "Tipo B+", "Tipo B-", "Tipo AB+", "Tipo AB-", "Tipo O+", "Tipo O-"}));
		add(comboBoxTipoSangue, "cell 3 6");

	}
}
