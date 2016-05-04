package systemstart;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.TextArea;

public class GUI {

	private JFrame mainFrame;
	private JFrame databaserFrame;
	private JFrame eservicesFrame;
	private JFrame javaFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setTitle("IPA");
		mainFrame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		mainFrame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		JMenuItem mntmDatabas = new JMenuItem("Databaser");
		mntmDatabas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Du klickade på Databaser...");
				//mainFrame.setVisible(false);
				mainFrame.dispose();
				KursDatabaser();
			}
		});
		menuBar.add(mntmDatabas);
		
		JMenuItem mntmEtjnster = new JMenuItem("E-Tjänster");
		mntmEtjnster.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Du klickade på E-tjänster...");
				//mainFrame.setVisible(false);
				mainFrame.dispose();
				kursEServices();
			}
		});
		menuBar.add(mntmEtjnster);
		
		JMenuItem mntmJava = new JMenuItem("Java");
		mntmJava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Du klickade på Java...");
				//mainFrame.setVisible(false);
				mainFrame.dispose();
				kursJava();
			}
		});
		menuBar.add(mntmJava);
		
		JPanel panel_1 = new JPanel();
		mainFrame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setRows(1);
		textArea.setColumns(50);
		textArea.setText("Välkommen kursledaren, välj kurs...");
		panel_1.add(textArea);
		
	}
	
	public void KursDatabaser(){
		
		databaserFrame = new JFrame();
		
		databaserFrame.setBounds(100, 100, 450, 300);
		databaserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		databaserFrame.setResizable(false);
		databaserFrame.setLocationRelativeTo(null);
		databaserFrame.setTitle("Databaser");
		databaserFrame.getContentPane().setLayout(new BorderLayout(0, 0));
		databaserFrame.setVisible(false);
		
		JPanel panel = new JPanel();
		databaserFrame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		JMenuItem mntmDatabas = new JMenuItem("Moment 1");
		
		menuBar.add(mntmDatabas);
		
		JMenuItem mntmEtjnster = new JMenuItem("Moment 2");
		menuBar.add(mntmEtjnster);
		
		JMenuItem mntmJava = new JMenuItem("Moment 3");
		menuBar.add(mntmJava);
		
		JPanel panel_1 = new JPanel();
		databaserFrame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setRows(1);
		textArea.setColumns(50);
		textArea.setText("Dags för moment!");
		panel_1.add(textArea);
		databaserFrame.setVisible(true);
		
	}
	
	public void kursEServices() {
		eservicesFrame = new JFrame();
		
		eservicesFrame.setBounds(100, 100, 450, 300);
		eservicesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eservicesFrame.setResizable(false);
		eservicesFrame.setLocationRelativeTo(null);
		eservicesFrame.setTitle("E-tjänster");
		eservicesFrame.getContentPane().setLayout(new BorderLayout(0, 0));
		eservicesFrame.setVisible(false);
		
		JPanel panel = new JPanel();
		eservicesFrame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		JMenuItem mntmDatabas = new JMenuItem("Moment 1");
		
		menuBar.add(mntmDatabas);
		
		JMenuItem mntmEtjnster = new JMenuItem("Moment 2");
		menuBar.add(mntmEtjnster);
		
		JMenuItem mntmJava = new JMenuItem("Moment 3");
		menuBar.add(mntmJava);
		
		JPanel panel_1 = new JPanel();
		eservicesFrame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setRows(1);
		textArea.setColumns(50);
		textArea.setText("Dags för moment!");
		panel_1.add(textArea);
		eservicesFrame.setVisible(true);
	}
	
	public void kursJava(){
		
		javaFrame = new JFrame();
		
		javaFrame.setBounds(100, 100, 450, 300);
		javaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		javaFrame.setResizable(false);
		javaFrame.setLocationRelativeTo(null);
		javaFrame.setTitle("Java");
		javaFrame.getContentPane().setLayout(new BorderLayout(0, 0));
		javaFrame.setVisible(false);
		
		JPanel panel = new JPanel();
		javaFrame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		JMenuItem mntmDatabas = new JMenuItem("Moment 1");
		
		menuBar.add(mntmDatabas);
		
		JMenuItem mntmEtjnster = new JMenuItem("Moment 2");
		menuBar.add(mntmEtjnster);
		
		JMenuItem mntmJava = new JMenuItem("Moment 3");
		menuBar.add(mntmJava);
		
		JPanel panel_1 = new JPanel();
		javaFrame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setRows(1);
		textArea.setColumns(50);
		textArea.setText("Dags för moment!");
		panel_1.add(textArea);
		javaFrame.setVisible(true);
		
	}

}
