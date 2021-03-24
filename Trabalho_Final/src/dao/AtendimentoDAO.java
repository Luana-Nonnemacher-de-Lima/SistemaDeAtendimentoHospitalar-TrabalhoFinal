package pacote;
import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.LinkedList;
	
	//import modelo.Atendimento;

	public class AtendimentoDAO{
		// Quatros filas de espera para cada prioridade e uma enfermaria de emergencia
		private static LinkedList<AtendimentoModelo> enfermaria = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> filaPrioridade1 = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> filaPrioridade2 = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> filaPrioridade3 = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> filaPrioridade4 = new LinkedList<>();

		// Alas para o atendimento
		private static LinkedList<AtendimentoModelo> cardiologia = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> pediatria = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> pneumologia = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> neurologia = new LinkedList<>();

		// Fila de espera por ala
		private static LinkedList<AtendimentoModelo> filaEsperaCardiologia = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> filaEsperaPediatria = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> filaEsperaPneumologia = new LinkedList<>();
		private static LinkedList<AtendimentoModelo> filaEsperaNeurologia = new LinkedList<>();

		//lista pacientes
		private static LinkedList<Paciente> pacienteAtendimento = new LinkedList<Paciente>();
		
		
		// path para adicionar no txt
		private final static String txtASerMudado = "atendimentos";
		

		public static boolean gerarAtendimento(AtendimentoModelo at) {
			switch (at.getPrioridade()) {
			case 1:
				filaPrioridade1.add(at);
				return true;
			case 2:
				filaPrioridade2.add(at);
				return true;
			case 3:
				filaPrioridade3.add(at);
				return true;
			case 4:
				filaPrioridade4.add(at);
				return true;
			case 5:

			}
			return false;
		}
		public static boolean addPacientesAla(AtendimentoModelo at) {

			if (at.getAlaInternacao().equals("cardiologia")) {
				if (cardiologia.size() < 3) { //adicionar um método p verificar se está cheia a lista?!
					cardiologia.add(at);
					return true;
				} else {
					filaEsperaCardiologia.add(at);
					return true;
				}
			} else if (at.getAlaInternacao().equals("pediatrica")) {
				if (pediatria.size() < 6) {
					pediatria.add(at);
					return true;
				} else {
					filaEsperaPediatria.add(at);
					return true;
				}

			} else if (at.getAlaInternacao().equals("pneumologia")) {
				if (pneumologia.size() < 4) {
					pneumologia.add(at);
					return true;
				} else {
					filaEsperaPneumologia.add(at);
					return true;
				}
			} else if (at.getAlaInternacao().equals("neurologia")) {
				if (neurologia.size() < 6) {
					neurologia.add(at);
					return true;
				} else {
					filaEsperaNeurologia.add(at);
					return true;
				}
			}

			return false;

		}
		public static boolean addPacientePrio5(AtendimentoModelo at, Paciente p) {

			if (at.getAlaInternacao().equals("cardiologia")) {
				if (cardiologia.size() < 3) {
					cardiologia.add(at);
					return true;
				} else if (enfermaria.size() < 10) {
					filaEsperaCardiologia.add(at);
					enfermaria.add(at);
				} else {
					addTxtRemoveHospital(at, p);
					return false;
				}
			} else if (at.getAlaInternacao().equals("pediatrica")) {
				if (pediatria.size() < 6) {
					pediatria.add(at);
					return true;
				} else if (enfermaria.size() < 10) {
					filaEsperaPediatria.add(at);
					enfermaria.add(at);
				} else {
					addTxtRemoveHospital(at, p);
					return false;
				}

			} else if (at.getAlaInternacao().equals("pneumologia")) {
				if (pneumologia.size() < 4) {
					pneumologia.add(at);
					return true;
				} else if (enfermaria.size() < 10) {
					filaEsperaPneumologia.add(at);
					enfermaria.add(at);
				} else {
					addTxtRemoveHospital(at, p);
					return false;
				}
			} else if (at.getAlaInternacao().equals("neurologia")) {
				if (neurologia.size() < 6) {
					neurologia.add(at);
					return true;
				} else if (enfermaria.size() < 10) {
					filaEsperaNeurologia.add(at);
					enfermaria.add(at);
				} else {
					addTxtRemoveHospital(at, p);
					return false;
				}
			}

			return false;

		}

		public static boolean addTxtRemoveHospital(AtendimentoModelo at, Paciente p) {

			try (BufferedWriter writer = new BufferedWriter(new FileWriter(File Arq = new File("arq.txt"), true))) {
				writer.write(String.format("%s,%s,%s,%d,%s,%s", p.getNmPaciente(),
						p.getCPF(), at.getDataAtual().getTime(),at.getPrioridade(),
						at.getQueixa(), at.getAlaInternacao(),
						"devido a indisponibilidade de leitos, o paciente foi remanejado para outro hospital!"));
				writer.newLine();
				return true;

			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public static boolean finalizarAtendimento(AtendimentoModelo at) {
			
			enfermaria.remove(at);
			if (at.getAlaInternacao().equals("cardiologia")) {
				filaEsperaCardiologia.remove(at);
				
			} else if (at.getAlaInternacao().equals("pediatrica")) {
				filaEsperaPediatria.remove(at);

			} else if (at.getAlaInternacao().equals("pneumologia")) {
				filaEsperaPneumologia.remove(at);
				
			} else if (at.getAlaInternacao().equals("neurologia")) {
				filaEsperaNeurologia.remove(at);
			}
			return addConsultaTxt(at, null, null);
		}
		
		public static boolean addConsultaTxt(AtendimentoModelo at, Paciente p, GerarConsultaModelo gcm) {
			//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			//LocalDateTime now = LocalDateTime.now();  
			at.getDataAtual().getTime();
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
				bw.write(String.format("%s,%s,%s,%d,%s,%s,%s,%s,%s,%s"), 
						p.getNmPaciente(),
						p.getCPF(), 
						at.getDataAtual().getTime(), 
						at.getPrioridade(),
						at.getQueixa(), 
						at.getAlaInternacao(), 
						gcm.getAvaliacaoMedica(),
						gcm.getMedicacao(),
						gcm.getObservacao(),
						at.getHoraTerminoAt().getTime());
				
				bw.newLine();
				return true;

			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public static boolean encaminhaInternacao(AtendimentoModelo at, String ala) {
			int prioridade = at.getPrioridade();
			switch(prioridade) {
			case 1:
				filaPrioridade1.remove(at);
				break;
			case 2:
				filaPrioridade2.remove(at);
				break;
			case 3:
				filaPrioridade3.remove(at);
				break;
			case 4: 
				filaPrioridade4.remove(at);
				break;
			case 5:
				enfermaria.remove(at);
				if (at.getAlaInternacao().equals("cardiologia")) {
					filaEsperaCardiologia.remove(at);
					
				} else if (at.getAlaInternacao().equals("pediatrica")) {
					filaEsperaPediatria.remove(at);

				} else if (at.getAlaInternacao().equals("pneumologia")) {
					filaEsperaPneumologia.remove(at);
					
				} else if (at.getAlaInternacao().equals("neurologia")) {
					filaEsperaNeurologia.remove(at);
				}
				break;
			}
			
			at.setAlaInternacao(ala);
			return addPacientesAla(at);
		}

		public static AtendimentoModelo pegaAtendimentoPrio() {
			if (!filaPrioridade4.isEmpty()) {
				return filaPrioridade4.getFirst();
			
			} else if (!filaPrioridade3.isEmpty()) {
				return filaPrioridade3.getFirst();
			
			} else if (!filaPrioridade3.isEmpty()) {
				return filaPrioridade3.getFirst();
			
			}else if (!filaPrioridade1.isEmpty()) {
				return filaPrioridade1.getFirst();
			
			}
			return null;
		}

	}

	
	


