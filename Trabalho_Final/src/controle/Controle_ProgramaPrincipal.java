package controle;

import java.beans.PropertyVetoException;

import visao.Janela;

public class Controle_ProgramaPrincipal {
	public static void main(String[] args) throws PropertyVetoException {
		try {
			Janela frame = new Janela();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
