package visao;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Component;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;

public class Finalizar_Atendimento extends JPanel {
	private Component listPacientesInternados;
	private Component listPacientesNaEnfermaria;
	private JButton buttonFinalizarAtendimento;

	/**
	 * Create the panel.
	 */
	public Finalizar_Atendimento() {
		setLayout(new MigLayout("", "[50.00,grow]", "[][grow][]"));

		setBounds(530, 224, 765, 510);

		JLabel lblNewLabel = new JLabel("FINALIZAR ATENDIMENTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel, "cell 0 0");

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(UIManager.getBorder("InternalFrame.border"));
		add(tabbedPane, "cell 0 1,grow");
		listPacientesInternados = new JList<String>();
		tabbedPane.addTab("Pacientes Internados", listPacientesInternados);
		listPacientesNaEnfermaria = new JList<String>();
		tabbedPane.addTab("Pacientes Internados", listPacientesNaEnfermaria);

		buttonFinalizarAtendimento = new JButton("Finalizar Atendimento");
		add(buttonFinalizarAtendimento, "cell 0 2,alignx center");

	}

	public Component getListPacientesInternados() {
		return listPacientesInternados;
	}

	public void setListPacientesInternados(Component listPacientesInternados) {
		this.listPacientesInternados = listPacientesInternados;
	}

	public Component getListPacientesNaEnfermaria() {
		return listPacientesNaEnfermaria;
	}

	public void setListPacientesNaEnfermaria(Component listPacientesNaEnfermaria) {
		this.listPacientesNaEnfermaria = listPacientesNaEnfermaria;
	}

	public JButton getButtonFinalizarAtendimento() {
		return buttonFinalizarAtendimento;
	}

	public void setButtonFinalizarAtendimento(JButton buttonFinalizarAtendimento) {
		this.buttonFinalizarAtendimento = buttonFinalizarAtendimento;
	}

}
