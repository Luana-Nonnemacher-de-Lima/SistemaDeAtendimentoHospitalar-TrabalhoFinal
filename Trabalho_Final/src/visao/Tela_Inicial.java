package visao;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class Tela_Inicial extends JPanel {
	private JPanel contentPaneTelaInicial;

	/**
	 * Create the panel.
	 */
	public Tela_Inicial() {
		setLayout(new MigLayout("", "[][grow][]", "[][grow][]"));

		setBounds(530, 224, 765, 510);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(
				new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_TelaInicial.png"))
						.getImage().getScaledInstance(450, 450, Image.SCALE_SMOOTH)));
		add(lblNewLabel, "cell 1 1,alignx center,aligny center");
		contentPaneTelaInicial = new JPanel();
		contentPaneTelaInicial.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPaneTelaInicial.setLayout(new MigLayout("", "[][grow][]", "[][grow][]"));
	}

}
