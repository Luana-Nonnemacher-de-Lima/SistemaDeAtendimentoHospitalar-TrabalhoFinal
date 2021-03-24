package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

import modelo.Paciente;
import visao.Gerenciar_Paciente;

import java.io.File;

public class Paciente_dao {

	private static File arq;
	private static FileWriter fw;
	private static BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	private Gerenciar_Paciente gerenciarPaciente;

	private static List<Paciente> ListaDePacientes = new ArrayList<Paciente>();

	public void Paciente() {
		arq = new File("Pacientes.txt");
	}

	Paciente p = new Paciente(null, null, null, null, null, null, null);

	public static Paciente AcharCpf(String cpf) { // encontra pacientes por cpf
		for (Paciente p : ListaDePacientes) {
			if (p.getCpf().equals(cpf)) {
				return p;
			}
		}
		return null;
	}

	public static boolean cadastraPaciente(Paciente p) {

		try {
			FileWriter fw = new FileWriter(arq, true);
			BufferedWriter bw = new BufferedWriter(fw);
			// opçãop 1
			bw.write(ListaDePacientes.toString()); // GRAVAR COMO LISTA

			// opção 2
			bw.write(p.toString()); // GRAVAR COMO PESSOA

			// opção 3
			bw.write(String.format("%s,%s,%s,%s,%s,%s,%s", gerenciarPaciente.get, CPF, DtNasciment, Endereco, TpSangue, NmPai,
					NmMae)); // variáveis que são pegas do usuário

			bw.newLine();
			bw.flush();

			fw.close();
			bw.close();
			return true;

		} catch (IOException e) {
			return false;
		}
	}

	// LER AS INFOS DO TXT
	public static void recuperarPacientesDoTxt() {
		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
			String linhas;
			String[] valores;
			while ((linhas = br.readLine()) != null) {
				valores = linhas.split(",");
				ListaDePacientes.add(new Paciente(valores[0], valores[1], valores[2], valores[3], valores[4],
						valores[5], valores[6]));
			}
		} catch (IOException e) {
			System.out.println(e.getMessage()); // ERRO
		}
	}
}
