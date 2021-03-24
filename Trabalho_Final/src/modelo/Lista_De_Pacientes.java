package modelo;

import java.util.LinkedList;

public class Lista_De_Pacientes {

	private LinkedList<Object> listaPaciente = new LinkedList<>();

	public void adicionarPaciente(Paciente paciente) {
		listaPaciente.add(paciente);
	}

}
