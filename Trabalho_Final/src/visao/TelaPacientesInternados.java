package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;

public class TelaPacientesInternados extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaPacientesInternados() {
		setLayout(new MigLayout("", "[][382.00][grow]", "[][][][172.00][][][129.00][][][][]"));

		setBounds(530, 224, 765, 510);

		JLabel labelTitulo_1 = new JLabel("PACIENTES AGUARDANDO LEITOS");
		labelTitulo_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(labelTitulo_1, "cell 0 0 3 1,alignx center");

		JLabel labelCardio = new JLabel("Pacientes Cardio Aguardando");
		labelCardio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(labelCardio, "cell 1 2");

		JLabel lblPacientesPeditricosAguardando = new JLabel("Pacientes Pedi\u00E1tricos Aguardando");
		lblPacientesPeditricosAguardando.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblPacientesPeditricosAguardando, "cell 2 2");

		JScrollPane scrollPaneCardio = new JScrollPane();
		add(scrollPaneCardio, "cell 1 3,grow");

		JScrollPane scrollPanePedia = new JScrollPane();
		add(scrollPanePedia, "cell 2 3,grow");

		JLabel lblPacientesPneumoAguardando = new JLabel("Pacientes Pneumo Aguardando");
		lblPacientesPneumoAguardando.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblPacientesPneumoAguardando, "cell 1 5");

		JLabel lblPacientesNeuroAguardando = new JLabel("Pacientes Neuro Aguardando");
		lblPacientesNeuroAguardando.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblPacientesNeuroAguardando, "cell 2 5");

		JScrollPane scrollPanePneumo = new JScrollPane();
		add(scrollPanePneumo, "cell 1 6 1 4,grow");

		JScrollPane scrollPaneNeuro = new JScrollPane();
		add(scrollPaneNeuro, "cell 2 6 1 4,grow");

	}

}
