package visao;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.beans.PropertyVetoException;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.CardLayout;
import java.awt.ComponentOrientation;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPaneTelaPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws PropertyVetoException
	 */
	public Janela() throws PropertyVetoException {
		setTitle("Sistema de Atendimento Hospitalar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 224, 765, 510);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setJMenuBar(menuBar);

		JMenu menuPaciente = new JMenu("Paciente");
		menuPaciente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuPaciente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuPaciente);

		JMenuItem itemMenuGerenciarPaciente = new JMenuItem("Gerenciar Paciente");
		menuPaciente.add(itemMenuGerenciarPaciente);

		JMenu menuAtendimentoEmergencia = new JMenu("Atendimento");
		menuAtendimentoEmergencia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuAtendimentoEmergencia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuAtendimentoEmergencia);

		JMenuItem mntmGerarAtendimento = new JMenuItem("Gerar Atendimento");
		menuAtendimentoEmergencia.add(mntmGerarAtendimento);

		JMenu menuConsulta = new JMenu("Consulta");
		menuConsulta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuConsulta.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuConsulta);

		JMenuItem mntmGerarConsulta = new JMenuItem("Gerar Consulta");
		menuConsulta.add(mntmGerarConsulta);

		JMenuItem mntmEncaminharParaInternao = new JMenuItem("Encaminhar Para Internação");
		menuConsulta.add(mntmEncaminharParaInternao);

		JMenuItem mntmFinalizarAtendimento = new JMenuItem("Finalizar Atendimento");
		menuConsulta.add(mntmFinalizarAtendimento);

		JMenu menuRelatorios = new JMenu("Relatórios");
		menuRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuRelatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuRelatorios);

		JMenuItem mntmListarPacientesAguardando = new JMenuItem("Pacientes Aguardando Por Leito");
		menuRelatorios.add(mntmListarPacientesAguardando);

		JMenuItem mntmListarPacientesInternados = new JMenuItem("Pacientes Internados");
		menuRelatorios.add(mntmListarPacientesInternados);

		JMenuItem mntmListarNmeroDe = new JMenuItem("Número de Leitos Vagos");
		menuRelatorios.add(mntmListarNmeroDe);
		contentPaneTelaPrincipal = new JPanel();
		contentPaneTelaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneTelaPrincipal);
		contentPaneTelaPrincipal.setLayout(new CardLayout(0, 0));
		Tela_Inicial painel1 = new Tela_Inicial();
		contentPaneTelaPrincipal.add(painel1);
		
	}
}
