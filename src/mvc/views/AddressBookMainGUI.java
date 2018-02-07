/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.views;

//vo object
//import mvc.models.Person;

//import mvc.controller.AddressBookController;

import java.awt.BorderLayout;
//import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JList;
import javax.swing.JPanel;
//import javax.swing.ListSelectionModel;

/**
 *
 * @author Admin
 */
public class AddressBookMainGUI {
    
    private JFrame frame;
    private NameListPanel contactListPanel;
    private DetailViewPanel detailsPanel;
    private JButton btn_add;
    private JButton btn_edit;
    private JButton btn_delete;
    private JButton btn_search;
    private JPanel panel_btn;
    private JButton btn_home;
    
    
    
    
     //private ContactDialog add;
     
     
  
        
    public AddressBookMainGUI(String text){
        frame = new JFrame("Address Book");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        //frame.setSize(500, 500);
      //  frame.pack();
        frame.setVisible(true);
     //   frame.pack();
        //frame.setVisible(true);
       // frame.setLocationRelativeTo(null);
         //frame.setVisible(true);
        
        
        contactListPanel=new NameListPanel();
        frame.getContentPane().add(contactListPanel,BorderLayout.WEST);
       /* JList names; 
                names= new JList<String>(nameList);
        Component add1 = contactListPanel.add(names);*/
        //contentPane.add(namesJList);
        // contactListPanel.add(J)
        /*
        nameList = person.getNameList();
        // namesJList = new JList<String>(items);
        //  contentPane.add(namesJList);
        contactList = new JList<String>(nameList);
        this.add(contactList);
         */
        // to be removed from commen=t frim line 66 to  line 67//
        detailsPanel=new DetailViewPanel();
        frame.getContentPane().add(detailsPanel,BorderLayout.CENTER);
        
        panel_btn= new JPanel();
        panel_btn.setLayout(new GridLayout(1, 4));
        
      
       btn_home = new JButton("");
            ImageIcon icon_home = new ImageIcon("C:\\Users\\Mohammed Jassim\\Desktop\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\image\\Address_Book-512.png");
        btn_home.setIcon(icon_home);
     
       panel_btn.add(btn_home);
       
        btn_add = new JButton("");
        ImageIcon icon_add = new ImageIcon("C:\\Users\\Mohammed Jassim\\Desktop\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\image\\add_friend-512.png");
        btn_add.setIcon(icon_add);
     
        panel_btn.add(btn_add);
        
        btn_edit = new JButton("");
        ImageIcon icon_edit = new ImageIcon("C:\\Users\\Mohammed Jassim\\Desktop\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\image\\edit.png");
        btn_edit.setIcon(icon_edit);
        panel_btn.add(btn_edit);
        
        btn_delete = new JButton("");
           ImageIcon icon_delete = new ImageIcon("C:\\Users\\Mohammed Jassim\\Desktop\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\image\\sed-04-512.png");
        btn_delete.setIcon(icon_delete);
     
        panel_btn.add(btn_delete);
        
        btn_search = new JButton("");
           ImageIcon icon_search = new ImageIcon("C:\\Users\\Mohammed Jassim\\Desktop\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\image\\search_users-512.png");
        btn_search.setIcon(icon_search);
     
        panel_btn.add(btn_search);
        
        frame.getContentPane().add(panel_btn,BorderLayout.SOUTH);
    }
    
    public NameListPanel getNameListPanel()
    {
        return contactListPanel;
    }
    
    public DetailViewPanel getDetailViewPanel()
    {
        return detailsPanel;
    }
    
  /*  public  Person addPerson(Person person)
    {
        return person;
    }
    */        
    /*
    
    public LayoutManager getPanelLayout() {
  return panel.getLayout();
}
    
    */
    //btn_add.add
    public JFrame getMainGUIFrame()
    {
        return frame;
    }
    public JButton getHome(){
        return btn_home;
    }
    public JButton getAdd(){ 
        return btn_add;
    }
    
    public JButton getEdit(){
        return btn_edit;
    }
    
    public JButton getDelete(){
        return btn_delete;
    }
    public JButton getSearch(){
        return btn_search;
        
    }
    
    public void setText(String text){
       // label.setText(text);
    }
    
    /*
  public void  populateList(String[] namesList){
      JList namesJList;
            namesJList = new JList<String>(namesList);
            contactListPanel.add(namesJList);
            namesJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }
    */
    
}