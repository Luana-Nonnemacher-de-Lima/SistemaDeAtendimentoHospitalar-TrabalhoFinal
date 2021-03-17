package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Dimension;

public class Leitos_Vagos extends JPanel {
	private JLabel lblCardiologia;
	private JTextField fieldCardiologia;
	private JLabel lblPediatria;
	private JTextField fieldPediatria;
	private JLabel lblPneumologia;
	private JTextField fieldPneumologia;
	private JLabel lblNeurologia;
	private JTextField fieldNeurologia;
	private JLabel lblEmergncia;
	private JTextField fieldEmergencia;

	/**
	 * Create the panel.
	 */
	public Leitos_Vagos() {
		setLayout(new MigLayout("", "[grow]", "[][][][][grow][][][grow][][][grow][][][grow][][][grow]"));

		setBounds(530, 224, 765, 510);

		JLabel lblNewLabel = new JLabel("NUMERO DE LEITOS VAGOS POR ALA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel, "cell 0 0");

		lblCardiologia = new JLabel("CARDIOLOGIA");
		add(lblCardiologia, "cell 0 2");

		fieldCardiologia = new JTextField();
		fieldCardiologia.setPreferredSize(new Dimension(5, 30));
		fieldCardiologia.setBorder(UIManager.getBorder("InternalFrame.border"));
		fieldCardiologia.setEditable(false);
		add(fieldCardiologia, "cell 0 3,growx");
		fieldCardiologia.setColumns(10);

		lblPediatria = new JLabel("PEDIATRIA");
		add(lblPediatria, "cell 0 5");

		fieldPediatria = new JTextField();
		fieldPediatria.setPreferredSize(new Dimension(5, 30));
		fieldPediatria.setBorder(UIManager.getBorder("InternalFrame.border"));
		fieldPediatria.setEditable(false);
		add(fieldPediatria, "cell 0 6,growx");
		fieldPediatria.setColumns(10);

		lblPneumologia = new JLabel("PNEUMOLOGIA");
		add(lblPneumologia, "cell 0 8");

		fieldPneumologia = new JTextField();
		fieldPneumologia.setPreferredSize(new Dimension(5, 30));
		fieldPneumologia.setBorder(UIManager.getBorder("InternalFrame.border"));
		fieldPneumologia.setEditable(false);
		add(fieldPneumologia, "cell 0 9,growx");
		fieldPneumologia.setColumns(10);

		lblNeurologia = new JLabel("NEUROLOGIA");
		add(lblNeurologia, "cell 0 11");

		fieldNeurologia = new JTextField();
		fieldNeurologia.setPreferredSize(new Dimension(5, 30));
		fieldNeurologia.setBorder(UIManager.getBorder("InternalFrame.border"));
		fieldNeurologia.setEditable(false);
		add(fieldNeurologia, "cell 0 12,growx");
		fieldNeurologia.setColumns(10);

		lblEmergncia = new JLabel("EMERGÊNCIA");
		add(lblEmergncia, "cell 0 14");

		fieldEmergencia = new JTextField();
		fieldEmergencia.setPreferredSize(new Dimension(5, 30));
		fieldEmergencia.setBorder(UIManager.getBorder("InternalFrame.border"));
		fieldEmergencia.setEditable(false);
		add(fieldEmergencia, "cell 0 15,growx");
		fieldEmergencia.setColumns(10);

	}

	public JTextField getFieldCardiologia() {
		return fieldCardiologia;
	}

	public void setFieldCardiologia(JTextField fieldCardiologia) {
		this.fieldCardiologia = fieldCardiologia;
	}

	public JTextField getFieldPediatria() {
		return fieldPediatria;
	}

	public void setFieldPediatria(JTextField fieldPediatria) {
		this.fieldPediatria = fieldPediatria;
	}

	public JTextField getFieldPneumologia() {
		return fieldPneumologia;
	}

	public void setFieldPneumologia(JTextField fieldPneumologia) {
		this.fieldPneumologia = fieldPneumologia;
	}

	public JTextField getFieldNeurologia() {
		return fieldNeurologia;
	}

	public void setFieldNeurologia(JTextField fieldNeurologia) {
		this.fieldNeurologia = fieldNeurologia;
	}

	public JTextField getFieldEmergencia() {
		return fieldEmergencia;
	}

	public void setFieldEmergencia(JTextField fieldEmergencia) {
		this.fieldEmergencia = fieldEmergencia;
	}

}
