package bankloker;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

public class BankAccount extends JFrame
{
   // JPanel for user inputs
   private JPanel inputDetailJPanel;

   // JLabel and JTextField for account name
   private JLabel NameJLabel;
   private JTextField NameJTextField;

   // JLabel and JTextField for account number
   private JLabel AccountnumJLabel;
   private JTextField AccountnumJTextField;

   // JLabel and JTextField for balance
   private JLabel BalanceJLabel;
   private JTextField BalanceJTextField;

    // JLabel and JTextField for withdraw
   private JLabel LodgeJLabel;
   private JTextField LodgeJTextField;

    // JLabel and JTextField for  Withdraw
   private JLabel WithdrawJLabel;
   private JTextField WithdrawJTextField;

   // JButton to create account
   private JButton CreateAccountJButton;

   //JButton to delete account
   private JButton DeleteAccountJButton;

   //JButton to make transaction
   private JButton TransactionJButton;

   // JLabel and JTextArea to display account details
   private JLabel displayJLabel;
   private JTextArea displayJTextArea;

   // initialize number of students to zero
   private int BankCount = 0;

   // constants
   private final int Details = 3;
   private final int MaxAccounts = 10;
   private final int FIRST = 0;
   private final int SECOND = 1;
   private final int THIRD = 2;

   // one-dimensional array to store Account names
   private String AccountNames[] = new String[ MaxAccounts ];

   // two-dimensional array to store Account details
   private int Account[][] = new int[ MaxAccounts ][ Details ];


  //constructor
   public BankAccount()
   {
      createUserInterface();
   }

   // create and position GUI components; register event handlers
   private void createUserInterface()
   {
      // get content pane for attaching GUI components
      Container contentPane = getContentPane();

      // enable explicit positioning of GUI components
      contentPane.setLayout( null );

      // set up inputDetailJPanel
      inputDetailJPanel = new JPanel();
      inputDetailJPanel.setBounds( 16, 16, 208, 218 );
      inputDetailJPanel.setBorder(
      new TitledBorder( "Input Details" ) );
      inputDetailJPanel.setLayout( null );
      contentPane.add( inputDetailJPanel );

      // set up NameJLabel
      NameJLabel = new JLabel();
      NameJLabel.setBounds( 8, 32, 90, 23 );
      NameJLabel.setText( "Name:" );
      inputDetailJPanel.add( NameJLabel );

      // set up NameJTextField
      NameJTextField = new JTextField();
      NameJTextField.setBounds( 104, 32, 88, 21 );
      NameJTextField.setHorizontalAlignment( JTextField.RIGHT );
      inputDetailJPanel.add( NameJTextField );

      // set up AccountnumJLabel
      AccountnumJLabel = new JLabel();
      AccountnumJLabel.setBounds( 8, 56, 100, 23 );
      AccountnumJLabel.setText( "Account Number:" );
      inputDetailJPanel.add( AccountnumJLabel );

      // set up AccountnumTextField
      AccountnumJTextField = new JTextField();
      AccountnumJTextField.setBounds( 112, 56, 80, 21 );
      AccountnumJTextField.setHorizontalAlignment( JTextField.RIGHT );
      inputDetailJPanel.add( AccountnumJTextField );

       // set up BalanceJLabel
      BalanceJLabel = new JLabel();
      BalanceJLabel.setBounds( 8, 80, 60, 23 );
      BalanceJLabel.setText( "Balance:" );
      inputDetailJPanel.add( BalanceJLabel );

      // set up BalanceTextField
      BalanceJTextField = new JTextField();
      BalanceJTextField.setBounds( 112, 80, 80, 21 );
      BalanceJTextField.setHorizontalAlignment( JTextField.RIGHT );
      inputDetailJPanel.add( BalanceJTextField );

      // set up LodgeJLabel
      LodgeJLabel = new JLabel();
      LodgeJLabel.setBounds( 8, 104, 80, 23 );
      LodgeJLabel.setText( "Lodgement:" );
      inputDetailJPanel.add( LodgeJLabel );

      // set up LodgeJTextField
      LodgeJTextField = new JTextField();
      LodgeJTextField.setBounds( 112, 104, 80, 21 );
      LodgeJTextField.setHorizontalAlignment( JTextField.RIGHT );
      inputDetailJPanel.add( LodgeJTextField );

      // set up WithdrawJLabel
      WithdrawJLabel = new JLabel();
      WithdrawJLabel.setBounds( 8, 128, 60, 23 );
      WithdrawJLabel.setText( "Withdraw:" );
      inputDetailJPanel.add( WithdrawJLabel );

      // set up WithdrawJTextField
      WithdrawJTextField = new JTextField();
      WithdrawJTextField.setBounds( 112, 128, 80, 21 );
      WithdrawJTextField.setHorizontalAlignment( JTextField.RIGHT );
      inputDetailJPanel.add( WithdrawJTextField );

      // set up CreateAccountButton
      CreateAccountJButton = new JButton();
      CreateAccountJButton.setBounds( 112, 152, 80, 24 );
      CreateAccountJButton.setText( "Create" );
      inputDetailJPanel.add( CreateAccountJButton );
      CreateAccountJButton.addActionListener(

         new ActionListener()
         {
            // event handler called when CreateAccountJButton
            // is clicked
            public void actionPerformed( ActionEvent event )
            {
               CreateAccountJButtonActionPerformed( event );
            }

         }

      ); // end call to addActionListener

       // set up DeleteAccountButton
       DeleteAccountJButton = new JButton();
       DeleteAccountJButton.setBounds( 16, 152, 80, 24 );
       DeleteAccountJButton.setText( "Delete" );
       inputDetailJPanel.add( DeleteAccountJButton );
       DeleteAccountJButton.addActionListener(

        new ActionListener() // anonymous inner class
        {
           // event handler called when DeleteAccountJButton
           // is clicked
           public void actionPerformed( ActionEvent event )
           {
              DeleteAccountJButtonActionPerformed( event );
           }

        }

     ); // end call to addActionListener

        // set up TransactionJButton
       TransactionJButton = new JButton();
       TransactionJButton.setBounds( 16, 180, 176, 24 );
       TransactionJButton.setText( "Make Transaction" );
       inputDetailJPanel.add( TransactionJButton );
       TransactionJButton.addActionListener(

         new ActionListener() // anonymous inner class
         {
            // event handler called when TransactionJButton
            // is clicked
            public void actionPerformed( ActionEvent event )
            {
               TransactionJButtonActionPerformed( event );
            }

         } // end anonymous inner class

      ); // end call to addActionListener

      // set up displayJLabel
      displayJLabel = new JLabel();
      displayJLabel.setBounds( 240, 16, 150, 23 );
      displayJLabel.setText( "Account Details:" );
      contentPane.add( displayJLabel );

      // set up displayJTextArea
      displayJTextArea = new JTextArea();
      displayJTextArea.setBounds( 240, 48, 402, 184 );
      displayJTextArea.setEditable( false );
      contentPane.add( displayJTextArea );

      // set properties of application's window
      setTitle( "Bank Accounts" ); // set title bar string
      setSize( 670, 308 );          // set window size
      setVisible( true );           // display window

   } // end method createUserInterface


   private void CreateAccountJButtonActionPerformed( ActionEvent event )
   {
      // get user input
      String Name = NameJTextField.getText();
      int Accountnum = Integer.parseInt( AccountnumJTextField.getText() );
      int Balance = Integer.parseInt( BalanceJTextField.getText());

      // add user input to arrays
      AccountNames[ BankCount ] = Name;
      Account[ BankCount ][ FIRST ] = Balance;


      BankCount++; // increment BankCount

      display();

      // clear JTextFields for new data
      NameJTextField.setText( "" );
      AccountnumJTextField.setText( "" );
      BalanceJTextField.setText( "" );
      LodgeJTextField.setText( "" );
      WithdrawJTextField.setText( "" );

      // if ten Accounts have been entered
      if ( BankCount == MaxAccounts )
      {
          // disable CreateAccountsJButton
          CreateAccountJButton.setEnabled( false );
      }

   }

   private void DeleteAccountJButtonActionPerformed( ActionEvent event )
   {
     // get user input
     String name = NameJTextField.getText();
     int Accountnum = Integer.parseInt( AccountnumJTextField.getText() );




      BankCount--;



     // clear JTextFields for new data
     NameJTextField.setText( "" );
     AccountnumJTextField.setText( "" );
     BalanceJTextField.setText( "" );
     LodgeJTextField.setText( "" );
     WithdrawJTextField.setText( "" );

     // if no Accounts have been entered
     if ( BankCount < 1 );
     {
           // disable DeleteAccountsJButton
          DeleteAccountJButton.setEnabled( false );
     }



   }

   private void TransactionJButtonActionPerformed( ActionEvent event )
   {
     // get user input
     int Accountnum = Integer.parseInt( AccountnumJTextField.getText() );
     int Lodge = Integer.parseInt( LodgeJTextField.getText());
     int Withdraw = Integer.parseInt( LodgeJTextField.getText());

     Account[ BankCount ][ SECOND ] = Lodge;
     Account[ BankCount ][ THIRD ] = Withdraw;

     // clear other JTextFields for new data
     NameJTextField.setText( "" );
     AccountnumJTextField.setText( "" );
     BalanceJTextField.setText( "" );
     LodgeJTextField.setText( "" );
     WithdrawJTextField.setText( "" );

     // if no Accounts have been entered
     if ( BankCount < 1 )
     {
        // disable TransactionJButton
        TransactionJButton.setEnabled( false );
     }

   }

   private void display()
   {
      // add a header to displayJTextArea
      displayJTextArea.setText(  "Name\tAccount No.\tLodge\tWithdraw\tBalance\n" );

     /* for ( int account = 0; account < BankCount; account++ )
           {
               // display names
               displayJTextArea.append( Name[ account ] + "\t" );
           }*/


   }



   public static void main( String[] args )
   {
      BankAccount application = new BankAccount();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }


}