package controle;

import java.beans.PropertyVetoException;

import visao.Janela;

public class Controle_ProgramaPrincipal {

	public static void main(String[] args) throws PropertyVetoException {

		Janela janela = new Janela();
		janela.setVisible(true);

		try {
			new Controle_Janela(janela);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
