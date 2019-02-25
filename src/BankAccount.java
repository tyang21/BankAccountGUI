import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankAccount extends JFrame
{
	private ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
	public BankAccount()
	{
		setBounds(100,100,500,200);
		setLayout(null);
		
		JLabel name = new JLabel("Name:");
		name.setBounds(50, 50, 25, 125);
		add(name);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(50, 75, 25, 100);
		add(nameField);
		
		JLabel acc = new JLabel("Account Type");
		acc.setBounds(100, 100, 100, 100);
		add(acc);
		
		
		JComboBox account = new JComboBox(new String[]{"", "Checking Account", "Savings Account"});
		account.setBounds(100, 100, 100, 100);
		add(account);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JBalanceText =
		
		
	}
	public static void main(String[] args)
	{
		BankAccount myFrame = new BankAccount(); 
	}
}