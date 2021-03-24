package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleGerarConsulta implements ActionListener {

	
	private Janela janela;
	private Gerenciar_Pacientes gerenciarPaciente;
	private Lista_De_Pacientes listaPaciente;
	private Paciente_dao pacienteDAO;
	private Paciente paciente;
	
	
	public ControleGerarPaciente(Janela j, Paciente p, Gerenciar_Pacientes gp, Lista_De_Pacientes listap) {
		
		this.janela=j;
		this.paciente=p
		this.gerenciarPaciente = gp;
		this.listaPaciente=listap;
		
		this.janela.getButtonLimparTela().addActionListener(this);
		this.janela.getButtonGerarAtendimento().addActionListener(this);
		this.janela.getrdbtnCardiologia().addActionListener(this);
		this.janela.getrdbtnPediatria().addActionListener(this);
		this.janela.getrdbtnPneumologia().addActionListener(this);
		this.janela.getrdbtnNeurologia().addActionListener(this);
		this.janela.getrdbtnEmergencia().addActionListener(this);
		
		this.janela.getradioButtonPrioridade1().addActionListener(this);
		this.janela.getradioButtonPrioridade2().addActionListener(this);
		this.janela.getradioButtonPrioridade3().addActionListener(this);
		this.janela.getradioButtonPrioridade4().addActionListener(this);
		this.janela.getradioButtonPrioridade5().addActionListener(this);
		
		pacienteDAO = new Paciente_dao();
				
	}		
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Gerar Atendimento")) {
			
			String cpfAux = this.janela.getFieldCPF().getText();
			String queixaAux = this.janela.getTextAreaQueixa().getText();
			String nomeAux = this.janela.getFieldNome().getText();
			
			 p = new Paciente(cpfAux,queixaAux,nomeAux);
			 pacienteDao.cadastraAtendimento(p);		 // SERIA ALGO MAIS OU MENOS ASSIM COM A CLASSE PACIENTEDAO PRONTA
			
			
			
			
		}		
		if (e.getActionCommand().equals("Limpar Tela")) {
			
			this.janela.getFieldCPF().setText("");
			this.janela.getTextAreaQueixa().setText("");
			this.janela.getFieldNome().setText("");
				
			
		}		
		if (e.getActionCommand().equals("1")) {
			
		}		
		if (e.getActionCommand().equals("2")) {			
			
		}		
		if (e.getActionCommand().equals("3")) {			
			
		}		
		if (e.getActionCommand().equals("4")) {
			
		}
		if (e.getActionCommand().equals("5")) {
			
		}
		if (e.getActionCommand().equals("1")) {
			
		}
		if (e.getActionCommand().equals("Cardiologia")) {
			
		}
		if (e.getActionCommand().equals("Pediatria")) {
			
		}
		if (e.getActionCommand().equals("Pneumologia")) {
			
		}
		if (e.getActionCommand().equals("Neurologia")) {
			
		}
		if (e.getActionCommand().equals("Emergência")) {
			
		}
		
		
		
		
	}

}
