import java.awt.EventQueue;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.IDN;
import javax.swing.JPanel;


public class FirstWindowedApp {

	private JFrame frame;
	private JTextField textField;
	private JEditorPane editorPane;
	private JButton btnGo;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindowedApp window = new FirstWindowedApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstWindowedApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		textField = new JTextField();
		frame.getContentPane().add(textField_1, BorderLayout.NORTH);
		textField.setColumns(10);
		
		final JEditorPane editorPane = new JEditorPane();
		frame.getContentPane().add(editorPane, BorderLayout.CENTER);
		
		// TODO ADD TEXT FIELD, EDITOR PANE AND BUTTON
		// TODO FORMAT HOW THEY APPEAR
		// TODO WIRE BUTTON TO ACTION LISTENER
		final JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ac) {
				try {
			          String url = textField.getText().toLowerCase();
			          if (url.startsWith("http://"))
			            url = url.substring(7);
			          editorPane.setPage("http://" + IDN.toASCII(url));
			        } catch (Exception e) {
			          e.printStackTrace();
			          JOptionPane.showMessageDialog( btnGo, "Browser problem: " + e.getMessage());
			        }
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.EAST);
		
	}
	
	public class buttonAction implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			try {
		          String url = textField.getText().toLowerCase();
		          if (url.startsWith("http://"))
		            url = url.substring(7);
		          editorPane.setPage("http://" + IDN.toASCII(url));
		        } catch (Exception e) {
		          e.printStackTrace();
		          JOptionPane.showMessageDialog( btnGo, "Browser problem: " + e.getMessage());
		        }
		}
	}

}
