import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionWindow extends JFrame {
	 
    static JLabel instructionLabel;
    
    static JTextField textField;
    
    static JLabel resultLabel;
    
    static JButton actionButton;
    
    static JPanel panel;
    
    static JFrame frame;
 
    ActionWindow() {
    }
 
    
    String input = textField.getText();

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public static void main(String[] args)
    {
    	// System.out.println("Type here: ");
    	
    	
    	
    	// Scanner input = new Scanner(System.in);
    	
    	// String text = input.toString();
    	
    	frame = new JFrame();
    	
        instructionLabel = new JLabel("Type here: ");
        
        textField = new JTextField();
        
        actionButton = new JButton();
        
        panel = new JPanel();
        
        // wasn't sure how to display user input in the swing panel
        
        resultLabel = new JLabel(input);
        
        panel.add(instructionLabel);
        
        panel.add(resultLabel);
        
        frame.add(panel);
        
        frame.setSize(300,400);
        
        frame.show();
        
        // void actionPerformed(ActionEvent actionButton);

        
 
 
 
    }
}