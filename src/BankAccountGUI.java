import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankAccountGUI extends JFrame
{
	private ArrayList<BankAccountGUI> bankAccounts = new ArrayList<BankAccountGUI>();
	public BankAccountGUI()
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
		
		JLabel balance = new JLabel("Initial Balance: ");
		balance.setBounds(100, 100, 100, 100);
		add(balance);
		
		JTextField balanceField = new JTextField();
		balanceField.setBounds(100, 100, 100, 100);
		add(balanceField);
		
		JButton createAccount = new JButton("Create Account");
		createAccount.setBounds(100, 100, 100, 100);
		createAccount.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						//we did the mantha mash
					}
				});
		
		
	}
	public static void main(String[] args)
	{
		BankAccountGUI myFrame = new BankAccountGUI(); 
	}
}