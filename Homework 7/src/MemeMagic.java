import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * MemeMagic Graphical User Interface 
 * 
 * This class contains the graphical user interface for the Meme Magic Software
 * 
 * You will need to implement certain portions of this class, marked with comments starting with "TODO" to connect 
 * it with your existing code. 
 * 
 * This class provides an example layout for the GUI. You are encouraged to be creative in your design. 
 * More information about Swing is online at: 
 * https://docs.oracle.com/javase/tutorial/uiswing/components/componentlist.html.
 */
public class MemeMagic extends JFrame {

    /**
     * Serialization string required by extending JFrame
     */
    private static final long serialVersionUID = 1L;
    
    private User user;
    private GraphicalMeme currentMeme;
    private String backgroundImageFilename;
    private BorderLayout panelLayout;
    private JLabel backgroundImageFileNameLabel;
    
    // use for getText()
    private JTextField backgroundImageTitleTextBox;
    private JTextField memeCaptionTextBox;
    private JTextField backgroundImageDescriptionTextBox;
    private JComboBox<String> memeAlignComboBox;
    
    private JLabel imageDisplayLabel;
    private JPanel controlPanel;
    private JPanel memeViewPanel;
    private JPanel panelPane;
    
    
    
    public MemeMagic() {
        this.user = new User();
    }
    
    public MemeMagic(User user) {
        this.user = user;
    }


    /**
     * Main method.  This method initializes a PhotoViewer, loads images into a PhotographContainer, then
     * initializes the Graphical User Interface.
     * 
     * @param args  Optional command-line arguments
     */
    public static void main(String[] args) {
        
        // Create a User object for this instance of Meme Magic
        User user = new User();

        // Instantiate the PhotoViewer Class
        MemeMagic myViewer = new MemeMagic(user);
        
        // Invoke and start the Graphical User Interface
        javax.swing.SwingUtilities.invokeLater(() -> myViewer.initialize());
    }

    /**
     * Initialize all the GUI components.  This method will be called by
     * SwingUtilities when the application is started.
     */
    private void initialize() {

        // Tell Java to exit the program when the window is closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tell Java to title the window to Meme Magic
        this.setTitle("Meme Magic");

        // We will use border layout on the main panel, since it is much easier for organizing panels.
        panelLayout = new BorderLayout();
        panelPane = new JPanel(panelLayout);

        // Create a label to display the full image.
        imageDisplayLabel = new JLabel();
        imageDisplayLabel.setHorizontalAlignment(JLabel.CENTER);
        imageDisplayLabel.setPreferredSize(new Dimension(550, 550));

        // Create a panel on which to display the full image
        memeViewPanel = new JPanel(new BorderLayout());
        memeViewPanel.setPreferredSize(new Dimension(550, 550));
        memeViewPanel.add(imageDisplayLabel, BorderLayout.CENTER);


        // Create a panel on which to display the controls for building a Meme
        controlPanel = new JPanel(new BorderLayout());
        
        // Create a panel that holds BackgroundImage information and give it a title
        JPanel backgroundImagePanel = new JPanel(new BorderLayout());
        backgroundImagePanel.setBorder(BorderFactory.createTitledBorder("Background Image"));

        // Create a panel that provides input for the BackgroundImage fileName
        JPanel backgroundImageFilePanel = new JPanel();
        
        // Label
        JLabel backgroundImageFileLabel = new JLabel("Filename: ");
        backgroundImageFileLabel.setPreferredSize(new Dimension(100, 20));
        backgroundImageFilePanel.add(backgroundImageFileLabel);
        
        // Button
        JButton backgroundImageButton = new JButton("Browse");
        backgroundImageFilePanel.add(backgroundImageButton);
        backgroundImageButton.setPreferredSize(new Dimension(85, 20));
        backgroundImageButton.addActionListener(new OpenButtonListener());
        // TODO The button needs a listener
        
        // Label that will contain the filename of the image
        backgroundImageFileNameLabel = new JLabel("<choose>");
        backgroundImageFilePanel.add(backgroundImageFileNameLabel);
        backgroundImageFileNameLabel.setPreferredSize(new Dimension(265, 20));
        
        // Create a panel that provides input for the BackgroundImage title
        JPanel backgroundImageTitlePanel = new JPanel();
        
        // Title label
        JLabel backgroundImageTitleLabel = new JLabel("Title: ");
        backgroundImageTitleLabel.setPreferredSize(new Dimension(100, 20));
        backgroundImageTitlePanel.add(backgroundImageTitleLabel);
        
        // use getters for text fields and add to constructor to connect to background image
        
        // Title text box
        backgroundImageTitleTextBox = new JTextField(29);
        // backgroundTitleTextBox.setPreferredSize(new Dimension(100, 60));
        backgroundImageTitlePanel.add(backgroundImageTitleTextBox);
        
        
        // Create a panel that provides input for the BackgroundImage title
        JPanel backgroundImageDescriptionPanel = new JPanel();
        // Description label
        JLabel backgroundImageDescriptionLabel = new JLabel("Description: ");
        backgroundImageDescriptionLabel.setPreferredSize(new Dimension(100, 20));
        backgroundImageDescriptionPanel.add(backgroundImageDescriptionLabel);
        
        // Description text box
        backgroundImageDescriptionTextBox = new JTextField(29);
        // backgroundTitleTextBox.setPreferredSize(new Dimension(100, 60));
        backgroundImageDescriptionPanel.add(backgroundImageDescriptionTextBox);
       
        
        // Add the panel about the BackgroundImage fileName to the BackgroundImage information panel
        backgroundImagePanel.add(backgroundImageFilePanel, BorderLayout.NORTH);
        backgroundImagePanel.add(backgroundImageTitlePanel);
        backgroundImagePanel.add(backgroundImageDescriptionPanel,BorderLayout.SOUTH);
        

        // Create a panel that holds Meme
        JPanel memePanel = new JPanel(new BorderLayout());
        memePanel.setBorder(BorderFactory.createTitledBorder("Meme"));

        // Create a panel that provides input for the Meme Caption
        JPanel memeCaptionPanel = new JPanel();
        
        // Label
        JLabel memeCaptionLabel = new JLabel("Caption: ");
        memeCaptionLabel.setPreferredSize(new Dimension(100, 20));
        memeCaptionPanel.add(memeCaptionLabel);
        
        // Caption Text Box
        memeCaptionTextBox = new JTextField(29);
        memeCaptionPanel.add(memeCaptionTextBox);
        
        // Create a panel that provides input for the Meme Align
        JPanel memeAlignPanel = new JPanel();
        
        // Label
        JLabel memeAlignLabel = new JLabel("Vertical Align: ");
        memeAlignPanel.add(memeAlignLabel);
        
        // Caption Text Box
        String[] alignStrings = {"top", "middle", "bottom"}; 
        
        memeAlignComboBox = new JComboBox<>(alignStrings);
        memeAlignComboBox.setSelectedIndex(0);
        memeAlignComboBox.setPreferredSize(new Dimension(365,20));
        // memeAlignComboBox.addActionListener(new ComboBoxListener);
        
        
        // use a setter to connect to background image

        memeAlignPanel.add(memeAlignComboBox);
        

        // Add the panel about the BackgroundImage fileName to the BackgroundImage information panel
        memePanel.add(memeCaptionPanel, BorderLayout.NORTH);
        memePanel.add(memeAlignPanel);
        // TODO Complete the Control Panel implementation (with Background Image and Meme panels)
        
        // button panel
        JPanel buttonPanel = new JPanel();
        
        // Button
        JButton generateButton = new JButton("Generate");
        generateButton.setPreferredSize(new Dimension(85, 20));
        generateButton.addActionListener(new GenerateButtonListener());
        
        // Button
        JButton saveButton = new JButton("Save");
        saveButton.setPreferredSize(new Dimension(85, 20));
        saveButton.addActionListener(new SaveButtonListener());
        
        buttonPanel.add(generateButton, BorderLayout.CENTER);
        buttonPanel.add(saveButton, BorderLayout.LINE_END);
        
        
        // Add the BackgroundImage information panel to the control panel
        controlPanel.add(backgroundImagePanel, BorderLayout.NORTH);
        controlPanel.add(memePanel);
        controlPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        // Add all the panels to the main display based on BorderLayout
        controlPanel.setPreferredSize(new Dimension(500,570));
        panelPane.add(controlPanel, BorderLayout.WEST);
        panelPane.add(memeViewPanel, BorderLayout.CENTER);

        // Add the panelPane to the contentPane of the Frame (Window)
        this.getContentPane().add(panelPane);

        // Set the preferred size and show the main application window
        this.setPreferredSize(new Dimension(1150, 570));
        this.pack();
        this.setVisible(true);
    }
    // private class ComboButtonListener implements ActionListener {
    	// @Override
        // public void actionPerformed(ActionEvent e) {
            // JComboBox memeAlignComboBox = (JComboBox)e.getSource();
            // String align = (String)memeAlignComboBox.getSelectedItem();
           // meme.setCaptionVerticalAlign(align); }
    
    
    /**
     * ActionListener for the open button.  When the button is pressed, this ActionListener
     * opens a FileChooser, asks the user to choose a JPG image file, then
     * sets the field backgroundImageFilename in the main class.
     */
    private class OpenButtonListener implements ActionListener {
        /**
         * Action performed operation.  Opens a save FileChooser, asks the user to choose a JPG image file, then
         * sets the field backgroundImageFilename in the main class.
         * 
         * @param evt The event that was performed
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
            JFileChooser chooser2 = new JFileChooser();
            chooser2.setDialogTitle("Choose a Background Image");
            chooser2.setFileFilter(new FileNameExtensionFilter("JPEG Images", "jpg", "jpeg"));
            int returnVal = chooser2.showOpenDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                backgroundImageFilename = chooser2.getSelectedFile().getAbsolutePath();
                backgroundImageFileNameLabel.setText(backgroundImageFilename);
            }

        }
    }
    
    /**
     * ActionListener for the save button.  When the button is pressed, this ActionListener
     * opens a save FileChooser, asks the user to choose a location and filename, then
     * writes the graphical meme data to a PNG image file.
     */
    private class SaveButtonListener implements ActionListener {
        /**
         * Action performed operation.  Opens a save FileChooser, asks the user to choose
         * a location and filename, then writes the graphical meme data to a PNG file.
         * 
         * @param evt The event that was performed
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
            JFileChooser chooser2 = new JFileChooser();
            chooser2.setDialogTitle("Save Meme");
            chooser2.setFileFilter(new FileNameExtensionFilter("PNG Images", "png"));
            int returnVal = chooser2.showSaveDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                String destinationFile = chooser2.getSelectedFile().getAbsolutePath();
                if (!destinationFile.contains(".png"))
                    destinationFile += ".png";
                
                // TODO: Writing an image throws a checked exception that must be handled.
                //       Catch the exceptions and provide the user with an appropriate message
                
                // received help from cohort membera Rishab and Sam for my try statement
                
                try {
                	ImageIO.write(currentMeme.compileMeme(), "png", new File(destinationFile));
                }
                catch (FileNotFoundException e) {
                System.err.println("File not found");
                }
                catch (IOException e) {
                	System.err.println("Cannot read file");
                }
                catch (Exception e) {
                	System.err.println("Error occured");
                }
             }
          }       
       }
        
    
    private class GenerateButtonListener implements ActionListener {
    	@Override
    	public void actionPerformed(ActionEvent evt) {
    		String caption = memeCaptionTextBox.getText();
    		String title = backgroundImageTitleTextBox.getText();
    		String description = backgroundImageDescriptionTextBox.getText();
    		String filename = backgroundImageFileNameLabel.getText();
    		String align = (String) memeAlignComboBox.getSelectedItem();
    		
    		BackgroundImage image = new BackgroundImage(filename, title, description);
    		
    		currentMeme = new GraphicalMeme(image, caption, user);
    		
    		currentMeme.setCaptionVerticalAlign(align);
    		
    		BufferedImage bufferedImage;
    		
			try {
				bufferedImage = currentMeme.compileMeme();
				
				imageDisplayLabel.setIcon(new javax.swing.ImageIcon(bufferedImage));
				
	    		memeViewPanel.repaint();
			}
	    	catch (FileNotFoundException e) {
	                System.err.println("File not found");
	               }
	        catch (IOException e) {
	                	System.err.println("Cannot read file");
	                }
				
			catch (Exception e) {
				System.err.println("Error occured");
					}
			
			
    		
    		
    	}
    }
}
