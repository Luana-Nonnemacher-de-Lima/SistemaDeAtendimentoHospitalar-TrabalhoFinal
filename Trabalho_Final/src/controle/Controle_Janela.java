package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.Encaminhar_Internação;
import visao.Finalizar_Atendimento;
import visao.Gerar_Atendimento;
import visao.Gerar_Consulta;
import visao.Gerenciar_Paciente;
import visao.Janela;
import visao.Leitos_Vagos;
import visao.Pacientes_Aguardando_Leitos;
import visao.Pacientes_Internados;
import visao.Tela_Inicial;

public class Controle_Janela implements ActionListener {
	Tela_Inicial painel1 = new Tela_Inicial();
	Gerenciar_Paciente gerenciarPaciente = new Gerenciar_Paciente();
	Gerar_Atendimento gerarAtendimento = new Gerar_Atendimento();
	Gerar_Consulta gerarConsulta = new Gerar_Consulta();
	Encaminhar_Internação encaminharInternação =new Encaminhar_Internação();
	Finalizar_Atendimento finalizarAtendimento = new Finalizar_Atendimento();
	Pacientes_Aguardando_Leitos pacientesAguardando = new Pacientes_Aguardando_Leitos();
	Pacientes_Internados pacientesInternados = new Pacientes_Internados();
	Leitos_Vagos leitosVagos = new Leitos_Vagos();
	Janela janela = new Janela();
	
	public Controle_Janela(Janela janela) {
		super();
		this.janela = janela;
		this.janela.getContentPane().add(gerenciarPaciente, "painel2");
		this.janela.getContentPane().add(gerarAtendimento, "painel3");
		this.janela.getContentPane().add(gerarConsulta, "painel4");
		this.janela.getContentPane().add(encaminharInternação, "painel5");
		this.janela.getContentPane().add(finalizarAtendimento, "painel6");
		this.janela.getContentPane().add(pacientesAguardando, "painel7");
		this.janela.getContentPane().add(pacientesInternados, "painel8");
		this.janela.getContentPane().add(leitosVagos, "painel9");

		
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
		if(menuSelect.getSource().equals("Gerenciar Paciente")) {

		}
		else if(menuSelect.getSource().equals("Gerar Atendimento")) {

		}
		else if(menuSelect.getSource().equals("Gerar Consulta")) {

		}
		else if(menuSelect.getSource().equals("Encaminhar Para Internação")) {

		}
		else if(menuSelect.getSource().equals("Finalizar Atendimento")) {

		}
		else if(menuSelect.getSource().equals("Pacientes Aguardando Por Leito")) {

		}
		else if(menuSelect.getSource().equals("Pacientes Internados")) {

		}
		else if(menuSelect.getSource().equals("Número de Leitos Vagos")) {

		}

			
		
	}
	
	
}
