package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.beans.PropertyVetoException;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPaneTelaPrincipal;
	private JMenuItem itemMenuGerenciarPaciente;
	private JMenuItem mntmGerarAtendimento;
	private JMenuItem mntmGerarConsulta;
	private JMenuItem mntmEncaminharParaInternao;
	private JMenuItem mntmFinalizarAtendimento;
	private JMenuItem mntmListarPacientesAguardando;
	private JMenuItem mntmListarPacientesInternados;
	private JMenuItem mntmListarNmeroDe;
	private CardLayout card;

	/**
	 * Create the frame.
	 * 
	 * @throws PropertyVetoException
	 */
	public Janela() {
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

		itemMenuGerenciarPaciente = new JMenuItem("Gerenciar Paciente");
		menuPaciente.add(itemMenuGerenciarPaciente);

		JMenu menuAtendimentoEmergencia = new JMenu("Atendimento");
		menuAtendimentoEmergencia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuAtendimentoEmergencia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuAtendimentoEmergencia);

		mntmGerarAtendimento = new JMenuItem("Gerar Atendimento");
		menuAtendimentoEmergencia.add(mntmGerarAtendimento);

		JMenu menuConsulta = new JMenu("Consulta");
		menuConsulta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuConsulta.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuConsulta);

		mntmGerarConsulta = new JMenuItem("Gerar Consulta");
		menuConsulta.add(mntmGerarConsulta);

		mntmEncaminharParaInternao = new JMenuItem("Encaminhar Para Internação");
		menuConsulta.add(mntmEncaminharParaInternao);

		mntmFinalizarAtendimento = new JMenuItem("Finalizar Atendimento");
		menuConsulta.add(mntmFinalizarAtendimento);

		JMenu menuRelatorios = new JMenu("Relatórios");
		menuRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuRelatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuRelatorios);

		mntmListarPacientesAguardando = new JMenuItem("Pacientes Aguardando Por Leito");
		menuRelatorios.add(mntmListarPacientesAguardando);

		mntmListarPacientesInternados = new JMenuItem("Pacientes Internados");
		menuRelatorios.add(mntmListarPacientesInternados);

		mntmListarNmeroDe = new JMenuItem("Número de Leitos Vagos");
		menuRelatorios.add(mntmListarNmeroDe);
	}

	public void actionPerformed(ActionEvent menuSelect) {
		// TODO Auto-generated method stub
		if (menuSelect.getSource().equals("Gerenciar Paciente")) {
			card.show(getContentPane(), "painel2");
		}
		if (menuSelect.getSource().equals("Gerar Atendimento")) {
			card.show(getContentPane(), "painel3");
		}
		if (menuSelect.getSource().equals("Gerar Consulta")) {
			card.show(getContentPane(), "painel4");
		}
		if (menuSelect.getSource().equals("Encaminhar Para Internação")) {
			card.show(getContentPane(), "painel5");
		}
		if (menuSelect.getSource().equals("Finalizar Atendimento")) {
			card.show(getContentPane(), "painel6");
		}
		if (menuSelect.getSource().equals("Pacientes Aguardando Por Leito")) {
			card.show(getContentPane(), "painel7");
		}
		if (menuSelect.getSource().equals("Pacientes Internados")) {
			card.show(getContentPane(), "painel8");
		}
		if (menuSelect.getSource().equals("Número de Leitos Vagos")) {
			card.show(getContentPane(), "painel9");
		}

		card = new CardLayout();
		
		contentPaneTelaPrincipal.setLayout(card);

		Tela_Inicial painel1 = new Tela_Inicial();
		
		contentPaneTelaPrincipal.add(painel1);

	}

	public JPanel getContentPaneTelaPrincipal() {
		return contentPaneTelaPrincipal;
	}

	public void setContentPaneTelaPrincipal(JPanel contentPaneTelaPrincipal) {
		this.contentPaneTelaPrincipal = contentPaneTelaPrincipal;
	}

	public JMenuItem getItemMenuGerenciarPaciente() {
		return itemMenuGerenciarPaciente;
	}

	public void setItemMenuGerenciarPaciente(JMenuItem itemMenuGerenciarPaciente) {
		this.itemMenuGerenciarPaciente = itemMenuGerenciarPaciente;
	}

	public JMenuItem getMntmGerarAtendimento() {
		return mntmGerarAtendimento;
	}

	public void setMntmGerarAtendimento(JMenuItem mntmGerarAtendimento) {
		this.mntmGerarAtendimento = mntmGerarAtendimento;
	}

	public JMenuItem getMntmGerarConsulta() {
		return mntmGerarConsulta;
	}

	public void setMntmGerarConsulta(JMenuItem mntmGerarConsulta) {
		this.mntmGerarConsulta = mntmGerarConsulta;
	}

	public JMenuItem getMntmEncaminharParaInternao() {
		return mntmEncaminharParaInternao;
	}

	public void setMntmEncaminharParaInternao(JMenuItem mntmEncaminharParaInternao) {
		this.mntmEncaminharParaInternao = mntmEncaminharParaInternao;
	}

	public JMenuItem getMntmFinalizarAtendimento() {
		return mntmFinalizarAtendimento;
	}

	public void setMntmFinalizarAtendimento(JMenuItem mntmFinalizarAtendimento) {
		this.mntmFinalizarAtendimento = mntmFinalizarAtendimento;
	}

	public JMenuItem getMntmListarPacientesAguardando() {
		return mntmListarPacientesAguardando;
	}

	public void setMntmListarPacientesAguardando(JMenuItem mntmListarPacientesAguardando) {
		this.mntmListarPacientesAguardando = mntmListarPacientesAguardando;
	}

	public JMenuItem getMntmListarPacientesInternados() {
		return mntmListarPacientesInternados;
	}

	public void setMntmListarPacientesInternados(JMenuItem mntmListarPacientesInternados) {
		this.mntmListarPacientesInternados = mntmListarPacientesInternados;
	}

	public JMenuItem getMntmListarNmeroDe() {
		return mntmListarNmeroDe;
	}

	public void setMntmListarNmeroDe(JMenuItem mntmListarNmeroDe) {
		this.mntmListarNmeroDe = mntmListarNmeroDe;
	}

}
