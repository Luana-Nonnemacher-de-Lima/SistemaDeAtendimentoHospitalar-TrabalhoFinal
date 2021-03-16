package teste;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;

public class NumLeitos extends JPanel {

	/**
	 * Create the panel.
	 */
	public NumLeitos() {
		
		
			setLayout(new MigLayout("", "[grow][grow]", "[][][][60.00][][][][]"));
			
			JLabel lblNewLabel = new JLabel("Vagas por unidade");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			add(lblNewLabel, "cell 0 0 2 1,alignx center");
			
			JLabel lblNewLabel_1 = new JLabel("Vagas Cardiologia");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			add(lblNewLabel_1, "flowx,cell 0 2 2 1");
			
			JLabel lblNewLabel_1_1 = new JLabel("Vagas Pedi\u00E1tricas");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			add(lblNewLabel_1_1, "cell 1 2");
			
			JLabel lblNewLabel_1_2_1 = new JLabel("Vagas Pneumo");
			lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			add(lblNewLabel_1_2_1, "cell 0 7");
			
			JLabel lblNewLabel_1_2_1_1 = new JLabel("Vagas Neuro");
			lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			add(lblNewLabel_1_2_1_1, "cell 1 7");
		}

	}

