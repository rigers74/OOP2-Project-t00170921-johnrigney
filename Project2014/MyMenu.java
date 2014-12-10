/**
 * @(#)Menu.java
 *
 *
 * @author 
 * @version 1.00 2014/12/4
 */
//Importing of all packages needed to run the program.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**Creating the MyMenu file which inherits from the JFrame class
 *This will allow us to use its methods in the creation of our menu
 */
public class MyMenu extends JFrame{
	//Declaration of variables and creation of objects	
	JMenu choseMenu, displayMenu;
	JLabel action;
	Vehicle van = new Vehicle();
	//public Vehicle van;
    MyHandler myHandler = new MyHandler();
    
    //Creating the GUI     
	public MyMenu() {
		Container cPane;
		/**Below sets the title for the GUI menu
		 *It also sets the size and location on the screen
		 *and the default closing action*/
		setTitle("Courier");
		setSize(300, 300);
		setLocation(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/**Next the creation of the content pane
		 *This will contain the message to prompt the user
		 *to chose an option from our menu*/
		cPane = getContentPane( );
        cPane.setLayout(new FlowLayout());
        cPane.setBackground(Color.white);
        //Creation of the menu bar options
        createChoseMenu();
        createDisplayMenu();
        //Creation of the menu bar.
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.red);
        //Adding of menu options to the menu bar
        menuBar.add(choseMenu);
        menuBar.add(displayMenu);
        //Action prompts the user to chose an option
        action = new JLabel("Please chose a courier");
        cPane.add(action);
	}
	
	
		/**The creation of the display method which will return the
		 *details entered by the user from the data file*/
      	public void display(){
        try{
	    ObjectInputStream is;
           is = new ObjectInputStream(new FileInputStream ("van.dat"));
           van  = (Vehicle)is.readObject(); 
           is.close();
           JOptionPane.showMessageDialog(null,van.toString(),"Information",JOptionPane.INFORMATION_MESSAGE);
           }
        catch(Exception exc){
        	JOptionPane.showMessageDialog(null,"Open did not work");
        }
 		}
 		/**The creation of the save method which will save the
		 *details entered by the user to the data file*/
        public void save(){
        try{
      	ObjectOutputStream os;
      	
      	os = new ObjectOutputStream(new FileOutputStream ("van.dat"));
      	

      	os.writeObject(van);
      	os.close();
      	} catch(Exception e){}
       }
		/**The main will set the menu to visible and implements the Serializable interface
		 *to allow data to be saved to the data file*/
		public static void main(String [] args){
		MyMenu menu = new MyMenu();
        menu.setVisible(true);
    	}
    
    /**MyHandler is designed to deal with the different options from each menu item
     *The action listener interface is implemented when a choice is made and then
     *the appropriate action is performed*/
    public class MyHandler implements ActionListener{
    public void actionPerformed(ActionEvent event){
    	
        String  menuName;
        menuName = event.getActionCommand();
        //Action performed when quit option is selected
        if (menuName.equals("Quit")){
        	JOptionPane.showMessageDialog(null,"You wish to Quit","Information",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        //Action performed to set attributes for the appropriate vehicle chosen.
        else if (menuName.equals("SWB Van")){
        	van.setType("SWB Van");
        	van.setPrice(50);
        	van.setVat(1.21);
        	van.setTotal(van.price * van.vat);
			van.setName(JOptionPane.showInputDialog(null,"Please enter Your Name: ","Information",JOptionPane.INFORMATION_MESSAGE));
        	van.setAddress(JOptionPane.showInputDialog(null,"Please enter Your Address: ","Information",JOptionPane.INFORMATION_MESSAGE));        	           
        }
        else if (menuName.equals("LWB Van")){
            van.setType("LWB Van");
        	van.setPrice(75);
        	van.setVat(1.21);
        	van.setTotal(van.price * van.vat);
            van.setName(
            	JOptionPane.showInputDialog(null,"Please enter Your Name: ","Information",JOptionPane.INFORMATION_MESSAGE));
        	van.setAddress(JOptionPane.showInputDialog(null,"Please enter Your Address: ","Information",JOptionPane.INFORMATION_MESSAGE));
        }
        else if (menuName.equals("Truck")){
            van.setType("Truck");
        	van.setPrice(100);
        	van.setVat(1.21);
        	van.setTotal(van.price * van.vat);
        	van.setName(JOptionPane.showInputDialog(null,"Please enter Your Name: ","Information",JOptionPane.INFORMATION_MESSAGE));
        	van.setAddress(JOptionPane.showInputDialog(null,"Please enter Your Address: ","Information",JOptionPane.INFORMATION_MESSAGE));
        }
        //Action performed to display the details entered by the user back to the screen
        else if (menuName.equals("Display")){
        	display();		
        }
        //Action performed to save the data entered by the user.      
      	else if (menuName.equals("Save")){
      		save();	
        }
    
    }
    }
    /**Creating the the choices menu and adding the different
     *menu items. The action listener is added and MyHandler is called
     *for processing*/
    private void createChoseMenu(){
        JMenuItem item;		
        choseMenu = new JMenu("Choices");
        
        item = new JMenuItem("SWB Van");   
        item.addActionListener(myHandler);
        choseMenu.add( item );
        
        item = new JMenuItem("LWB Van"); 
        item.addActionListener(myHandler);
        choseMenu.add( item );
        
        item = new JMenuItem("Truck"); 
        item.addActionListener(myHandler);
        choseMenu.add( item );
	}
    /**Creating the the details menu and adding the different
     *menu items. The action listener is added and MyHandler is called
     *for processing*/
    	private void createDisplayMenu(){
		JMenuItem item;
		displayMenu = new JMenu("Details");
		
		item = new JMenuItem("Display");
		item.addActionListener(myHandler);
		displayMenu.add( item );
		
		
		item = new JMenuItem("Save");
		item.addActionListener(myHandler);
		displayMenu.add( item );
		
		item = new JMenuItem("Quit");
		item.addActionListener(myHandler);
		displayMenu.add( item );
	}
    
}