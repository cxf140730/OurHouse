package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;

public class OurHouseEmployees {

	private Employee employee = new Employee();
	private JFrame frmMain;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OurHouseEmployees window = new OurHouseEmployees();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OurHouseEmployees() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();
		frmMain.setTitle("Our House - New Employee");
		frmMain.setBounds(100, 100, 450, 300);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);

		JLabel lblEmployee = new JLabel("Employee Number:");
		lblEmployee.setBounds(10, 11, 97, 14);
		frmMain.getContentPane().add(lblEmployee);

		JLabel lblNameFirst = new JLabel("First                           Middle  Last");
		lblNameFirst.setBounds(10, 64, 209, 14);
		frmMain.getContentPane().add(lblNameFirst);

		txtFirstName = new JTextField();
		lblNameFirst.setLabelFor(txtFirstName);
		txtFirstName.setBounds(10, 44, 97, 20);
		frmMain.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(1);

		txtMiddleName = new JTextField();
		txtMiddleName.setBounds(112, 44, 27, 20);
		frmMain.getContentPane().add(txtMiddleName);
		txtMiddleName.setColumns(10);

		textField = new JTextField();
		textField.setBounds(149, 44, 170, 20);
		frmMain.getContentPane().add(textField);
		textField.setColumns(10);
	}

	private void LoadEmployeeDB() {

	}
}
