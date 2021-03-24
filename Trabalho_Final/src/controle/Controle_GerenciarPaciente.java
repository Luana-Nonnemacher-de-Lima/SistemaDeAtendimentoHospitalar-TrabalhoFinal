package controle;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import dao.Paciente_dao;
import modelo.Lista_De_Pacientes;
import modelo.Paciente;
import visao.Gerenciar_Paciente;
import visao.Janela;

public class Controle_GerenciarPaciente {

	Janela janela;
	Gerenciar_Paciente gerenciarPaciente;
	Lista_De_Pacientes listaPaciente;
	Paciente_dao pacienteDAO;

	public Controle_GerenciarPaciente(Janela janela, Gerenciar_Paciente gerenciarPaciente,
			Lista_De_Pacientes listaPaciente, Paciente_dao pacienteDAO) {
		super();
		this.janela = janela;
		this.gerenciarPaciente = gerenciarPaciente;
		this.listaPaciente = listaPaciente;
		this.pacienteDAO = pacienteDAO;
	}

	public void keyPressed(KeyEvent enter) {
		// TODO Auto-generated method stub

		if (enter.getKeyCode() == KeyEvent.VK_ENTER) {
			try {
				FileReader fr = new FileReader(pacienteDAO.getArquivo());
				BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
				String word;
				while ((word = br.readLine()) != null) {
					if (word.equals(gerenciarPaciente.getFieldCPF())) {

					}
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void actionPerformed(ActionEvent buttonPress) {
		// TODO Auto-generated method stub
		if (buttonPress.getActionCommand().contentEquals("Cadastrar")) {
			String nome = gerenciarPaciente.getFieldNome().getText();
			String cpf = gerenciarPaciente.getFieldCPF().getText();
			String dataNascimento = gerenciarPaciente.getFieldDataDeNascimento().getText();
			String endereco = gerenciarPaciente.getFieldEndereco().getText();
			String nomePai = gerenciarPaciente.getFieldeNomePai().getText();
			String nomeMae = gerenciarPaciente.getFieldNomeMae().getText();
			String tipoSanguineo = gerenciarPaciente.getComboBoxTipoSangue().getPrototypeDisplayValue();

			Paciente paciente = new Paciente(nome, cpf, dataNascimento, endereco, nomePai, nomeMae, tipoSanguineo);

			new Paciente_dao(paciente);
		} else if (buttonPress.getActionCommand().contentEquals("Limpar Tela")) {
			gerenciarPaciente.LimparTela();
		}

	}

}
