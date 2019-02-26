import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * BankAccount GUI
 * @author Tyler Yang
 *Period 7
 */
public class BankAccountGUI extends JFrame
{
	//Array List for Bank Account objects
	private ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
	/**
	 * Constructs a Bank Account GUI
	 */
	public BankAccountGUI()
	{
		setBounds(100,100,500,500);
		setLayout(null);
		
		//Label to denote the text Field as the name
		JLabel name = new JLabel("Name:");
		name.setBounds(50, 50, 150, 25);
		add(name);
		
		// TextField that user inputs into the name of the account
		JTextField nameField = new JTextField();
		nameField.setBounds(200, 50, 150, 25);
		add(nameField);
		
		// Label to guide the User that the dropdown menu is for account types
		JLabel acc = new JLabel("Account Type");
		acc.setBounds(50, 75, 150, 25);
		add(acc);
		
		//Drop down menu that allows the user to chose the account type
		JComboBox account = new JComboBox(new String[]{"", "Checking Account", "Savings Account"});
		account.setBounds(200, 75, 150, 25);
		add(account);
	
		//Label that guides the user that the Text Field beside is where the Initial Balance is entered
		JLabel balance = new JLabel("Initial Balance: ");
		balance.setBounds(50, 100, 150, 25);
		add(balance);
		
		//TextField in which the user inputs initial balance
		JTextField balanceField = new JTextField();
		balanceField.setBounds(200, 100, 150, 25);
		add(balanceField);
		
		// Button that when clicked creates the account with user inputed information
		JButton createAccount = new JButton("Create Account");
		createAccount.setBounds(50, 125, 100, 100);
		createAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(account.getSelectedItem().equals("Checking Account"))
				{
					bankAccounts.add(new CheckingAccount(nameField.getText(), Double.parseDouble(balanceField.getText()),0,0,0));
				}
				else
				{
					bankAccounts.add(new SavingsAccount(nameField.getText(), Double.parseDouble(balanceField.getText()),0,0));
				}
				nameField.setText("");
				balanceField.setText("");
				account.setSelectedIndex(0);
			}
		});
		add(createAccount);
		
		// Displays the Bank Accounts made in the command councel
		JButton displayAccount = new JButton("Display Accounts");
		displayAccount.setBounds(150, 125, 100, 100);
		displayAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(BankAccount a : bankAccounts)
				{
					System.out.println(a);
				}
			}
		});
		add(displayAccount);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args)
	{
		BankAccountGUI myFrame = new BankAccountGUI(); 
	}
}