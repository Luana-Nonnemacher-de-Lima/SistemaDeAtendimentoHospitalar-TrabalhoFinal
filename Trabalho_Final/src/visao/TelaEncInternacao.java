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

public class TelaEncInternacao extends JPanel {

	private JTextArea txtPacientesFilaEspera;
	private JTextArea txtLeitosDisponiveis;
	private JTextArea txtPacientesEncInternacao;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public TelaEncInternacao() {
		setLayout(new MigLayout("", "[grow][grow]", "[][][][150.00][][][75.00][][][]"));

		setBounds(530, 224, 765, 510);

		JLabel lblNewLabel = new JLabel("ENCAMINHAR PARA INTERNA\u00C7\u00C3O");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel, "cell 0 0 2 1,alignx center");

		JLabel lblNewLabel_1 = new JLabel("Pacientes em fila de espera");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_1, "flowx,cell 0 2 2 1");

		txtPacientesFilaEspera = new JTextArea();
		add(txtPacientesFilaEspera, "cell 0 3,grow");

		JLabel lblNewLabel_2 = new JLabel("Disponibilidade de leitos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_2, "cell 1 2");

		txtLeitosDisponiveis = new JTextArea();
		add(txtLeitosDisponiveis, "cell 1 3,grow");

		JLabel lblNewLabel_3 = new JLabel(
				"Informe os nomes dos pacientes que deseja encaminhar para interna\u00E7\u00E3o");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_3, "cell 0 5 2 1,alignx center");

		txtPacientesEncInternacao = new JTextArea();
		add(txtPacientesEncInternacao, "cell 0 6 2 1,grow");

		btnNewButton = new JButton("Encaminhar para Interna\u00E7\u00E3o");
		add(btnNewButton, "cell 0 9 2 1,alignx center");

	}

	public JTextArea getTxtPacientesFilaEspera() {
		return txtPacientesFilaEspera;
	}

	public void setTxtPacientesFilaEspera(JTextArea txtPacientesFilaEspera) {
		this.txtPacientesFilaEspera = txtPacientesFilaEspera;
	}

	public JTextArea getTxtLeitosDisponiveis() {
		return txtLeitosDisponiveis;
	}

	public void setTxtLeitosDisponiveis(JTextArea txtLeitosDisponiveis) {
		this.txtLeitosDisponiveis = txtLeitosDisponiveis;
	}

	public JTextArea getTxtPacientesEncInternacao() {
		return txtPacientesEncInternacao;
	}

	public void setTxtPacientesEncInternacao(JTextArea txtPacientesEncInternacao) {
		this.txtPacientesEncInternacao = txtPacientesEncInternacao;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}
}
