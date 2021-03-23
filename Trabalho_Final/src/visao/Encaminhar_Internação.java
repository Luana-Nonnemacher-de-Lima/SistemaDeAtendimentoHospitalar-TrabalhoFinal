package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JButton;

public class Encaminhar_Internação extends JPanel {

	private Component listPacientesCardiologia;
	private Component listPacientesPediatria;
	private Component listPacientesPneumologia;
	private Component listPacientesNeurologia;
	private Component listPacientesEmergência;
	private Component listPacientesCardiologiaVaga;
	private Component listPacientesPediatriaVaga;
	private Component listPacientesPneumologiaVaga;
	private Component listPacientesNeurologiaVaga;
	private Component listPacientesEmergênciaVaga;
	private JTabbedPane tabbedPaneListaEspera;
	private JTabbedPane tabbedPaneLeitosDisponiveis;
	private JButton btnEncaminharInternao;

	/**
	 * Create the panel.
	 */
	public Encaminhar_Internação() {
		setLayout(new MigLayout("", "[grow]", "[][][][grow][][grow][]"));

		setBounds(0, 0, 765, 510);

		JLabel lblEncaminharParaInternao = new JLabel("ENCAMINHAR PARA INTERNAÇÃO");
		lblEncaminharParaInternao.setFont(new Font("Tahoma", Font.BOLD, 20));

		add(lblEncaminharParaInternao, "cell 0 0");

		JLabel lblFilaDeEspera = new JLabel("FILA DE ESPERA");
		add(lblFilaDeEspera, "cell 0 2");

		tabbedPaneListaEspera = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPaneListaEspera, "cell 0 3,grow");
		tabbedPaneListaEspera.setBorder(UIManager.getBorder("InternalFrame.border"));

		listPacientesCardiologia = new JList<String>();
		tabbedPaneListaEspera.addTab("Cardiologia", listPacientesCardiologia);
		listPacientesPediatria = new JList<String>();
		tabbedPaneListaEspera.addTab("Pediatria", listPacientesPediatria);
		listPacientesPneumologia = new JList<String>();
		tabbedPaneListaEspera.addTab("Pneumologia", listPacientesPneumologia);
		listPacientesNeurologia = new JList<String>();
		tabbedPaneListaEspera.addTab("Neurologia", listPacientesNeurologia);
		listPacientesEmergência = new JList<String>();
		tabbedPaneListaEspera.addTab("Emergência", listPacientesEmergência);

		JLabel lblLeitosDisponveis = new JLabel("LEITOS DISPONÍVEIS");
		add(lblLeitosDisponveis, "cell 0 4");

		tabbedPaneLeitosDisponiveis = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPaneLeitosDisponiveis, "cell 0 5,grow");
		tabbedPaneLeitosDisponiveis.setBorder(UIManager.getBorder("InternalFrame.border"));

		listPacientesCardiologiaVaga = new JList<String>();
		tabbedPaneLeitosDisponiveis.addTab("Cardiologia", listPacientesCardiologiaVaga);
		listPacientesPediatriaVaga = new JList<String>();
		tabbedPaneLeitosDisponiveis.addTab("Pediatria", listPacientesPediatriaVaga);
		listPacientesPneumologiaVaga = new JList<String>();
		tabbedPaneLeitosDisponiveis.addTab("Pneumologia", listPacientesPneumologiaVaga);
		listPacientesNeurologiaVaga = new JList<String>();
		tabbedPaneLeitosDisponiveis.addTab("Neurologia", listPacientesNeurologiaVaga);
		listPacientesEmergênciaVaga = new JList<String>();
		tabbedPaneLeitosDisponiveis.addTab("Emergência", listPacientesEmergênciaVaga);

		btnEncaminharInternao = new JButton("Encaminhar Internação");
		add(btnEncaminharInternao, "cell 0 6,alignx center");

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

	public Component getListPacientesCardiologiaVaga() {
		return listPacientesCardiologiaVaga;
	}

	public void setListPacientesCardiologiaVaga(Component listPacientesCardiologiaVaga) {
		this.listPacientesCardiologiaVaga = listPacientesCardiologiaVaga;
	}

	public Component getListPacientesPediatriaVaga() {
		return listPacientesPediatriaVaga;
	}

	public void setListPacientesPediatriaVaga(Component listPacientesPediatriaVaga) {
		this.listPacientesPediatriaVaga = listPacientesPediatriaVaga;
	}

	public Component getListPacientesPneumologiaVaga() {
		return listPacientesPneumologiaVaga;
	}

	public void setListPacientesPneumologiaVaga(Component listPacientesPneumologiaVaga) {
		this.listPacientesPneumologiaVaga = listPacientesPneumologiaVaga;
	}

	public Component getListPacientesNeurologiaVaga() {
		return listPacientesNeurologiaVaga;
	}

	public void setListPacientesNeurologiaVaga(Component listPacientesNeurologiaVaga) {
		this.listPacientesNeurologiaVaga = listPacientesNeurologiaVaga;
	}

	public Component getListPacientesEmergênciaVaga() {
		return listPacientesEmergênciaVaga;
	}

	public void setListPacientesEmergênciaVaga(Component listPacientesEmergênciaVaga) {
		this.listPacientesEmergênciaVaga = listPacientesEmergênciaVaga;
	}

	public JTabbedPane getTabbedPaneListaEspera() {
		return tabbedPaneListaEspera;
	}

	public void setTabbedPaneListaEspera(JTabbedPane tabbedPaneListaEspera) {
		this.tabbedPaneListaEspera = tabbedPaneListaEspera;
	}

	public JTabbedPane getTabbedPaneLeitosDisponiveis() {
		return tabbedPaneLeitosDisponiveis;
	}

	public void setTabbedPaneLeitosDisponiveis(JTabbedPane tabbedPaneLeitosDisponiveis) {
		this.tabbedPaneLeitosDisponiveis = tabbedPaneLeitosDisponiveis;
	}

	public JButton getBtnEncaminharInternao() {
		return btnEncaminharInternao;
	}

	public void setBtnEncaminharInternao(JButton btnEncaminharInternao) {
		this.btnEncaminharInternao = btnEncaminharInternao;
	}

}
