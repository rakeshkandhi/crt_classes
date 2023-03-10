package crt_classes;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class BankApp extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField nameField, amountField;
	private JButton depositButton, withdrawButton, balanceButton;
	private JLabel nameLabel, amountLabel, balanceLabel;
	private ArrayList<String> transactions;
	private int balance;

	public BankApp() {
		super("Bank Application");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		transactions = new ArrayList<String>();
		balance = 0;

		nameLabel = new JLabel("Name:");
		nameLabel.setBounds(50, 50, 50, 30);

		nameField = new JTextField();
		nameField.setBounds(100, 50, 150, 30);

		amountLabel = new JLabel("Amount:");
		amountLabel.setBounds(50, 100, 50, 30);
		amountField = new JTextField();
		amountField.setBounds(100, 100, 150, 30);

		depositButton = new JButton("Deposit");
		depositButton.setBounds(50, 150, 100, 30);
		depositButton.addActionListener(this);

		withdrawButton = new JButton("Withdraw");
		withdrawButton.setBounds(150, 150, 100, 30);
		withdrawButton.addActionListener(this);

		balanceButton = new JButton("Balance");
		balanceButton.setBounds(250, 150, 100, 30);
		balanceButton.addActionListener(this);

		balanceLabel = new JLabel("Balance: \u20B90");
		balanceLabel.setBounds(50, 200, 150, 30);

		add(nameLabel);
		add(nameField);
		add(amountLabel);
		add(amountField);
		add(depositButton);
		add(withdrawButton);
		add(balanceButton);
		add(balanceLabel);

		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == depositButton) {
			int amount = Integer.parseInt(amountField.getText());
			balance += amount;
			transactions.add("Deposit: +" + amount);
		} else if (e.getSource() == withdrawButton) {
			int amount = Integer.parseInt(amountField.getText());
			if (balance >= amount) {
				balance -= amount;
				transactions.add("Withdraw: -" + amount);
			} else {
				JOptionPane.showMessageDialog(null, "Insufficient funds");
			}
		} else if (e.getSource() == balanceButton) {
			String transactionHistory = "";
			for (String transaction : transactions) {
				transactionHistory += transaction + "\n";
			}
//			JOptionPane.showMessageDialog(null,
//					"Balance: $" + balance + "\nTransaction History:\n" + transactionHistory);
			JTextArea textArea = new JTextArea(10, 30);
			textArea.setEditable(false);
			JScrollPane scrollPane = new JScrollPane(textArea);

			textArea.setText("Balance: $" + balance + "\nTransaction History:\n" + transactionHistory);

			JOptionPane.showMessageDialog(null, scrollPane, "Passbook",
					JOptionPane.INFORMATION_MESSAGE);
		}
		balanceLabel.setText("Balance: \u20B9 " + balance);
	}

	public static void main(String[] args) {
		new BankApp();
	}
}
