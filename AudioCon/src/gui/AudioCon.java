package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class AudioCon extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container c;
	private JList<String> fileList;

	public AudioCon() {
		c = getContentPane();

		DefaultListModel<String> listModel;

		ButtonListener bL = new ButtonListener(this);
		JButton fileOpenButton = new JButton("Datei öffnen");
		fileOpenButton.addActionListener(bL);

		JButton folderOpenButton = new JButton("Ordner öffnen");

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

		panel.add(fileOpenButton);
		panel.add(folderOpenButton);

		listModel = new DefaultListModel<>();
		listModel.addElement("File1File1File1File1File1File1File1File1File1File1");
		listModel.addElement("File2");
		listModel.addElement("File3");
		fileList = new JList<>(listModel);

		c.add(panel, BorderLayout.NORTH);
		c.add(fileList, BorderLayout.WEST);

	}

	public class ButtonListener implements ActionListener {

		JFrame window = null;
		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser fChoose = new JFileChooser();
			fChoose.showOpenDialog(window);

		}
		
		public ButtonListener(JFrame window)
		{
			this.window = window;
		}

	}

	public static void main(String[] args) {
		AudioCon window = new AudioCon();
		window.setTitle("Audio Converter");
		window.setSize(400, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
