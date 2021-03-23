package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.beans.PropertyVetoException;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.CardLayout;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPaneTelaPrincipal;
	private JPanel telaInicial;
	private JMenuItem mntmGerenciarPaciente;
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
		setResizable(false);
		setTitle("Sistema de Atendimento Hospitalar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 224, 770, 510);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setJMenuBar(menuBar);

		JMenu menuPaciente = new JMenu("Paciente");
		menuPaciente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuPaciente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuPaciente);

		mntmGerenciarPaciente = new JMenuItem("Gerenciar Paciente");
		menuPaciente.add(mntmGerenciarPaciente);
		mntmGerenciarPaciente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menuSelect) {
				// TODO Auto-generated method stub
				if (menuSelect.getActionCommand().equals("Gerenciar Paciente")) {
					card.show(contentPaneTelaPrincipal, "painel2");
				}

			}
		});

		JMenu menuAtendimentoEmergencia = new JMenu("Atendimento");
		menuAtendimentoEmergencia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuAtendimentoEmergencia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuAtendimentoEmergencia);

		mntmGerarAtendimento = new JMenuItem("Gerar Atendimento");
		menuAtendimentoEmergencia.add(mntmGerarAtendimento);
		mntmGerarAtendimento.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menuSelect) {
				// TODO Auto-generated method stub
				if (menuSelect.getActionCommand().equals("Gerar Atendimento")) {
					card.show(contentPaneTelaPrincipal, "painel3");
				}
			}
		});

		JMenu menuConsulta = new JMenu("Consulta");
		menuConsulta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuConsulta.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuConsulta);

		mntmGerarConsulta = new JMenuItem("Gerar Consulta");
		menuConsulta.add(mntmGerarConsulta);
		mntmGerarConsulta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menuSelect) {
				// TODO Auto-generated method stub
				if (menuSelect.getActionCommand().equals("Gerar Consulta")) {
					card.show(contentPaneTelaPrincipal, "painel4");
				}
			}
		});

		mntmEncaminharParaInternao = new JMenuItem("Encaminhar Para Internação");
		menuConsulta.add(mntmEncaminharParaInternao);
		mntmEncaminharParaInternao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menuSelect) {
				// TODO Auto-generated method stub
				if (menuSelect.getActionCommand().equals("Encaminhar Para Internação")) {
					card.show(contentPaneTelaPrincipal, "painel5");
				}
			}
		});

		mntmFinalizarAtendimento = new JMenuItem("Finalizar Atendimento");
		menuConsulta.add(mntmFinalizarAtendimento);

		mntmFinalizarAtendimento.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menuSelect) {
				// TODO Auto-generated method stub
				if (menuSelect.getActionCommand().equals("Finalizar Atendimento")) {
					card.show(contentPaneTelaPrincipal, "painel6");
				}
			}
		});

		JMenu menuRelatorios = new JMenu("Relatórios");
		menuRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuRelatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuBar.add(menuRelatorios);

		mntmListarPacientesAguardando = new JMenuItem("Pacientes Aguardando Por Leito");
		menuRelatorios.add(mntmListarPacientesAguardando);
		mntmListarPacientesAguardando.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menuSelect) {
				// TODO Auto-generated method stub
				if (menuSelect.getActionCommand().equals("Pacientes Aguardando Por Leito")) {
					card.show(contentPaneTelaPrincipal, "painel7");
				}
			}
		});

		mntmListarPacientesInternados = new JMenuItem("Pacientes Internados");
		menuRelatorios.add(mntmListarPacientesInternados);
		mntmListarPacientesInternados.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menuSelect) {
				// TODO Auto-generated method stub
				if (menuSelect.getActionCommand().equals("Pacientes Internados")) {
					card.show(contentPaneTelaPrincipal, "painel8");
				}
			}
		});

		mntmListarNmeroDe = new JMenuItem("Número de Leitos Vagos");
		menuRelatorios.add(mntmListarNmeroDe);
		mntmListarNmeroDe.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menuSelect) {
				// TODO Auto-generated method stub
				if (menuSelect.getActionCommand().equals("Número de Leitos Vagos")) {
					card.show(contentPaneTelaPrincipal, "painel9");
				}
			}
		});

		contentPaneTelaPrincipal = new JPanel();
		contentPaneTelaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPaneTelaPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPaneTelaPrincipal);

		
		card = new CardLayout();

		contentPaneTelaPrincipal.setLayout(card);

		telaInicial = new Tela_Inicial();

		contentPaneTelaPrincipal.add(telaInicial, "painel1");

	};

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	public JPanel getContentPaneTelaPrincipal() {
		return contentPaneTelaPrincipal;
	}

	public void setContentPaneTelaPrincipal(JPanel contentPaneTelaPrincipal) {
		this.contentPaneTelaPrincipal = contentPaneTelaPrincipal;
	}

	public JMenuItem getItemMenuGerenciarPaciente() {
		return mntmGerenciarPaciente;
	}

	public void setItemMenuGerenciarPaciente(JMenuItem itemMenuGerenciarPaciente) {
		this.mntmGerenciarPaciente = itemMenuGerenciarPaciente;
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
