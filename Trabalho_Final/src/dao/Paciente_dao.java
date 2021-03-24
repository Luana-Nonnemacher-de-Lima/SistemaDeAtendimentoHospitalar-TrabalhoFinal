package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import modelo.Paciente;

public class Paciente_dao {

	File arquivo = new File("pacientes.txt");

	public Paciente_dao(Paciente paciente) {
		try {
			arquivo = new File("pacientes.txt");

			FileWriter fw = new FileWriter(arquivo);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("CPF: " + paciente.getCpf());
			bw.newLine();
			bw.write("Nome: " + paciente.getNome());
			bw.newLine();
			bw.write("Data de Nascimento: " + paciente.getDataNascimento());
			bw.newLine();
			bw.write("Endereo: " + paciente.getEndereco());
			bw.newLine();
			bw.write("Nome do Pai: " + paciente.getNomePai());
			bw.newLine();
			bw.write("Nome da Me: " + paciente.getNomeMae());
			bw.newLine();
			bw.write("Tipo sanguneo: " + paciente.getTipoSanguineo());
			bw.newLine();
			bw.write("#");
			bw.newLine();

			bw.close();
			fw.close();


		} catch (Exception e) {
			e.printStackTrace();

		}
		
	}

	public File getArquivo() {
		return arquivo;
	}

	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}

}
