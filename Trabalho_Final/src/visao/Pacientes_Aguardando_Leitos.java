package visao;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class Pacientes_Aguardando_Leitos extends JPanel {
	private Component listPacientesCardiologia;
	private Component listPacientesPediatria;
	private Component listPacientesPneumologia;
	private Component listPacientesNeurologia;
	private Component listPacientesEmergência;

	/**
	 * Create the panel.
	 */
	public Pacientes_Aguardando_Leitos() {
		setLayout(new MigLayout("", "[grow][grow]", "[][grow]"));

		setBounds(0, 0, 765, 510);
		
		JLabel lblNewLabel = new JLabel("PACIENTES AGUARDANDO POR LEITOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel, "cell 0 0 2 1");

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(UIManager.getBorder("InternalFrame.border"));
		add(tabbedPane, "cell 0 1 2 1,grow");
		listPacientesCardiologia = new JList<String>();
		tabbedPane.addTab("Cardiologia", listPacientesCardiologia);
		listPacientesPediatria = new JList<String>();
		tabbedPane.addTab("Pediatria", listPacientesPediatria);
		listPacientesPneumologia = new JList<String>();
		tabbedPane.addTab("Pneumologia", listPacientesPneumologia);
		listPacientesNeurologia = new JList<String>();
		tabbedPane.addTab("Neurologia", listPacientesNeurologia);
		listPacientesEmergência = new JList<String>();
		tabbedPane.addTab("Emergência", listPacientesEmergência);
	}

	public Component getListPacientesCardiologia() {
		return listPacientesCardiologia;
	}

	public void setListPacientesCardiologia(Component listPacientesCardiologia) {
		this.listPacientesCardiologia = listPacientesCardiologia;
	}

	public Component getListPacientesPediatria() {
		return listPacientesPediatria;
	}

	public void setListPacientesPediatria(Component listPacientesPediatria) {
		this.listPacientesPediatria = listPacientesPediatria;
	}

	public Component getListPacientesPneumologia() {
		return listPacientesPneumologia;
	}

	public void setListPacientesPneumologia(Component listPacientesPneumologia) {
		this.listPacientesPneumologia = listPacientesPneumologia;
	}

	public Component getListPacientesNeurologia() {
		return listPacientesNeurologia;
	}

	public void setListPacientesNeurologia(Component listPacientesNeurologia) {
		this.listPacientesNeurologia = listPacientesNeurologia;
	}

	public Component getListPacientesEmergência() {
		return listPacientesEmergência;
	}

	public void setListPacientesEmergência(Component listPacientesEmergência) {
		this.listPacientesEmergência = listPacientesEmergência;
	}

}
