package visao;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaFinalizarAtendimento extends JPanel {
	private JTextArea txtPacientesInternados;
	private JTextArea txtPacientesAguardandoEnf;
	private JButton btnFinalizaAtendimento;

	/**
	 * Create the panel.
	 */
	public TelaFinalizarAtendimento() {
		setLayout(new MigLayout("", "[50.00,grow]", "[][][][100.00][][][100.00][][][][]"));

		setBounds(530, 224, 765, 510);

		JLabel lblNewLabel = new JLabel("FINALIZAR ATENDIMENTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel, "cell 0 0,alignx center");

		JLabel lblNewLabel_1 = new JLabel("Lista pacientes internados:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_1, "flowx,cell 0 2");

		txtPacientesInternados = new JTextArea();
		add(txtPacientesInternados, "cell 0 3,grow");

		JLabel lblNewLabel_4 = new JLabel("Pacientes aguardando na enfermaria:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel_4, "cell 0 5");

		txtPacientesAguardandoEnf = new JTextArea();
		add(txtPacientesAguardandoEnf, "cell 0 6,grow");

		btnFinalizaAtendimento = new JButton("Finalizar Atendimento");
		add(btnFinalizaAtendimento, "cell 0 9,alignx center");

	}

	public JTextArea getTxtPacientesInternados() {
		return txtPacientesInternados;
	}

	public void setTxtPacientesInternados(JTextArea txtPacientesInternados) {
		this.txtPacientesInternados = txtPacientesInternados;
	}

	public JTextArea getTxtPacientesAguardandoEnf() {
		return txtPacientesAguardandoEnf;
	}

	public void setTxtPacientesAguardandoEnf(JTextArea txtPacientesAguardandoEnf) {
		this.txtPacientesAguardandoEnf = txtPacientesAguardandoEnf;
	}

	public JButton getBtnFinalizaAtendimento() {
		return btnFinalizaAtendimento;
	}

	public void setBtnFinalizaAtendimento(JButton btnFinalizaAtendimento) {
		this.btnFinalizaAtendimento = btnFinalizaAtendimento;
	}
}
