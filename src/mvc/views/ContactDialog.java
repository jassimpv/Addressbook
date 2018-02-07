/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.views;
//import javax.swing.JOptionPane;
// vo object class
import mvc.models.Person;

// for GUI
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
//import javax.swing.JComponent;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mvc.controller.AddressBookController;

/**
 *
 * @author Admin
 */
public class ContactDialog {//implements ActionListener{
    private JFrame frame;
    private DetailViewPanel detailsPanel;
    final private JButton submitButton;
    private JButton cancelButton;
    private JPanel panel_btn;
   private Person  person;
   private AddressBookController controller;

    
    public ContactDialog(String name){
        frame = new JFrame(name);
        frame.getContentPane().setLayout(new BorderLayout());
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400, 300);
       frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        detailsPanel = new DetailViewPanel();
        frame.getContentPane().add(detailsPanel,BorderLayout.CENTER);
        
        panel_btn= new JPanel();
        panel_btn.setLayout(new GridLayout(1, 2));
        
        submitButton = new JButton("");
               ImageIcon icon_Submit = new ImageIcon("C:\\Users\\Mohammed Jassim\\Desktop\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\image\\9016-200.png");
        submitButton.setIcon(icon_Submit);
    
       
      panel_btn.add(submitButton);
        
        cancelButton = new JButton("");
                ImageIcon icon_cancel = new ImageIcon("C:\\Users\\Mohammed Jassim\\Desktop\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\image\\cancel(1).png");
        cancelButton.setIcon(icon_cancel);
    
        panel_btn.add(cancelButton);
        
        frame.getContentPane().add(panel_btn,BorderLayout.SOUTH);
        
        
    }
    
   
    
    public JButton getSubmitButton()
            {
                return submitButton;
            }
    
    
     public JButton getcancelButton()
            {
                return cancelButton;
            }
    public JFrame getFrame()
    {
        return frame;
    }
   
    /**
     *
     * @return
     */
    public DetailViewPanel getPanel()
    {
    //detailsPanel.getNameField();
        return detailsPanel;
    }
 
    
    public void getValues()
    {
        System.out.println("name from getValues"+detailsPanel.getNameField().getText());
    }
    public Person getPerson()
    {
        return person;
    }

   
   

}