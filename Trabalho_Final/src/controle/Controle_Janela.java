package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.Encaminhar_Internação;
import visao.Finalizar_Atendimento;
import visao.Gerar_Consulta;
import visao.Gerar_Atendimento;
import visao.Gerenciar_Paciente;
import visao.Janela;
import visao.Leitos_Vagos;
import visao.Pacientes_Aguardando_Leitos;
import visao.Pacientes_Internados;
import visao.Tela_Inicial;

public class Controle_Janela implements ActionListener {
	Tela_Inicial painel1 = new Tela_Inicial();
	Gerenciar_Paciente gerenciarPaciente = new Gerenciar_Paciente();
	Gerar_Consulta gerarConsulta = new Gerar_Consulta();
	Gerar_Atendimento gerarAtendimento = new Gerar_Atendimento();
	Encaminhar_Internação encaminharInternação = new Encaminhar_Internação();
	Finalizar_Atendimento finalizarAtendimento = new Finalizar_Atendimento();
	Pacientes_Aguardando_Leitos pacientesAguardando = new Pacientes_Aguardando_Leitos();
	Pacientes_Internados pacientesInternados = new Pacientes_Internados();
	Leitos_Vagos leitosVagos = new Leitos_Vagos();
	Janela janela = new Janela();

	public Controle_Janela(Janela janela) {
		super();
		this.janela = janela;
		this.janela.getContentPane().add("painel2", gerenciarPaciente);
		this.janela.getContentPane().add("painel3", gerarAtendimento);
		this.janela.getContentPane().add("painel4", gerarConsulta);
		this.janela.getContentPane().add("painel5", encaminharInternação);
		this.janela.getContentPane().add("painel6", finalizarAtendimento);
		this.janela.getContentPane().add("painel7", pacientesAguardando);
		this.janela.getContentPane().add("painel8", pacientesInternados);
		this.janela.getContentPane().add("painel9", leitosVagos);

		janela.getItemMenuGerenciarPaciente().addActionListener(this);
		janela.getMntmGerarAtendimento().addActionListener(this);
		janela.getMntmGerarConsulta().addActionListener(this);
		janela.getMntmEncaminharParaInternao().addActionListener(this);
		janela.getMntmFinalizarAtendimento().addActionListener(this);
		janela.getMntmListarPacientesAguardando().addActionListener(this);
		janela.getMntmListarPacientesInternados().addActionListener(this);
		janela.getMntmListarNmeroDe().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent menuSelect) {
		// TODO Auto-generated method stub

	}

}
