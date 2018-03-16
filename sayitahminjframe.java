package ornekler2;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
public class Örnek43Kütüphane extends JFrame {
    private int oyunsayisi = 1;
    private int number;
    private int tahmin=10;
    private JTextField guessInputJTextField;   
    private JLabel prompt1JLabel;
    private JLabel prompt2JLabel; 
    private JLabel messageJLabel;   
    private JLabel message2JLabel; 
    private JLabel random1 = new JLabel();
    private JButton newGameJButton;    
    
    public Örnek43Kütüphane() {
        setLayout(new FlowLayout());
        prompt1JLabel = new JLabel("1-100 arasında sayım var tahmin et.");  
        add(prompt1JLabel);
        prompt2JLabel = new JLabel("Tahmininiz nedir? :"); 
        add(prompt2JLabel);
        guessInputJTextField = new JTextField(5); 
        guessInputJTextField.addActionListener(new GuessHandler());
        add(guessInputJTextField);
        messageJLabel = new JLabel("");
        add(messageJLabel);
        message2JLabel = new JLabel("");
        add(message2JLabel);
        newGameJButton = new JButton("Yeni Oyun");   
        add(newGameJButton);
 
        Random generator = new Random();
        number = generator.nextInt(100);  
         
        newGameJButton.addActionListener(
        new ActionListener()  {
        	public void actionPerformed(ActionEvent e) {
        		guessInputJTextField.setText("");
        		Random generator = new Random();
        		number = generator.nextInt(100);
        		random1.setText("" + number);
        		SwingUtilities.updateComponentTreeUI(random1);
        		messageJLabel.setText("");
        		guessInputJTextField.setEditable(true);
        		tahmin--;
        		message2JLabel.setText("Oynanan oyun sayısı: " + oyunsayisi);
        		oyunsayisi++;
        		tahmin=10;
        		}}
              );
        theGame();  
        }  
    public void theGame() {}
    class GuessHandler implements ActionListener{    
        public void actionPerformed( ActionEvent e ){      
            int Guess;
            Guess = Integer.parseInt(guessInputJTextField.getText());
            getContentPane().setBackground(Color.RED);
            	if (Guess > number){
            		messageJLabel.setText( "Sayı yüksek." );
            		SwingUtilities.updateComponentTreeUI(messageJLabel);
            		tahmin--;}
             if(Guess < number){                          
                     messageJLabel.setText("Sayı düşük" );
                     SwingUtilities.updateComponentTreeUI(messageJLabel);
                     tahmin--;
             }
             if (Guess == number)
             {
            	 messageJLabel.setText("Doğru bildiniz!");
            	 SwingUtilities.updateComponentTreeUI(messageJLabel);
            	 getContentPane().setBackground(Color.GREEN);
            	 guessInputJTextField.setEditable(false);
            	 message2JLabel.setText("");}        
             if(tahmin==0){
            	 message2JLabel.setText("Hakkınız bitti. Yeni oyuna geçiniz."); 
            	 guessInputJTextField.setEditable(false);
            	 }
             else if(Guess==number){
            	 message2JLabel.setText("");  
             }
             else if (tahmin>0){
            	 message2JLabel.setText(tahmin + " hakkınız kaldı.");  
             }  
        }
    }
}
