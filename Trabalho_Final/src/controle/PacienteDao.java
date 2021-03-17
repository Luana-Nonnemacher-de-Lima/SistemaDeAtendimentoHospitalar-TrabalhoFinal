package teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.io.File;

public class PacienteDao {
	
	private static File arq;
	private static FileWriter fw;
	private static BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;

	private static List<PacienteControle> ListaDePacientes = new ArrayList(); //
	//private final static String path = 
	
	public PacienteDao(){
		arq = new File("Pacientes.txt");		
	} 
					
	PacienteControle p = new PacienteControle();
	
	public static PacienteControle AcharCpf(String cpf) { // encontra pacientes por cpf
		for (PacienteControle p : ListaDePacientes) {
			if (p.getCPF().equals(cpf)) {
				return p;
			}
		}
		return null;
	}

	public static boolean AddPaciente(PacienteControle p) { // cadastro de pacientes
		ListaDePacientes.add(p);
        return true;        
		// return addPacTxt(p.getNmPaciente(), p.getCPF(), p.getDtNasciment(), p.getEndereco(), p.getEndereco(), p.getTpSangue(), p.getNmPai(), p.getNmMae());

	}
	public static boolean adicionarPacienteNoTxt(String nmPaciente, String cpf, String dtNascimento, String endereco, String tpSanguineo, String nmPai, String nmMae) {		
		fw= new FileWriter(arq,true);
		bw= new BufferedWriter(fw);
		bw.write(p.toString());
		bw.newLine();
		bw.flush();
	
		fw.close();
		bw.close();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arq, true))) {
			bw.write(String.format("%s,%s,%s,%s,%s,%s,%s", nmPaciente, cpf, dtNascimento, endereco, tpSanguineo, nmPai,
					nmMae));
			bw.newLine();
			return true;

		} catch (IOException e) {
			e.printStackTrace(); //deu erro irmão
			return false;
		}
	}

	// LER AS INFOS DO TXT
	public static void recuperarPacientesDoTxt() {
		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
			String linhas;
			String[] valores;
			while ((linhas = br.readLine()) != null) { valores = linhas.split(",");
				ListaDePacientes.add(new PacienteControle(valores[0], valores[1], valores[2], valores[3], valores[4], valores[5], valores[6])); 
			}
		} catch (IOException e) {
			System.out.println(e.getMessage()); // ERRO
		}
	}
}