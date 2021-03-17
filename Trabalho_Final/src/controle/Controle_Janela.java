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
	Gerenciar_Paciente painel2 = new Gerenciar_Paciente();
	Gerar_Atendimento painel3 = new Gerar_Atendimento();
	Gerar_Consulta painel4 = new Gerar_Consulta();
	Encaminhar_Internação painel5 =new Encaminhar_Internação();
	Finalizar_Atendimento painel6 = new Finalizar_Atendimento();
	Pacientes_Aguardando_Leitos painel7 = new Pacientes_Aguardando_Leitos();
	Pacientes_Internados painel8 = new Pacientes_Internados();
	Leitos_Vagos painel9 = new Leitos_Vagos();
	Janela janela = new Janela();
	public Controle_Janela(Tela_Inicial painel1, Gerenciar_Paciente painel2, Gerar_Atendimento painel3,
			Gerar_Consulta painel4, Encaminhar_Internação painel5, Finalizar_Atendimento painel6,
			Pacientes_Aguardando_Leitos painel7, Pacientes_Internados painel8, Leitos_Vagos painel9, Janela janela) {
		super();
		this.painel1 = painel1;
		this.painel2 = painel2;
		this.painel3 = painel3;
		this.painel4 = painel4;
		this.painel5 = painel5;
		this.painel6 = painel6;
		this.painel7 = painel7;
		this.painel8 = painel8;
		this.painel9 = painel9;
		this.janela = janela;
		
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
