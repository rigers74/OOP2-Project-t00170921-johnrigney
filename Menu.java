/**
 * @(#)Menu.java
 *
 *
 * @author 
 * @version 1.00 2014/12/4
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Menu extends JFrame implements Serializable{
	
	JMenu choseMenu, displayMenu;
	JLabel action;
	MyHandler myHandler = new MyHandler();
	Vehicle van;
	
	public Menu() {
		Container cPane;
		
		setTitle("Courier");
		setSize(400, 400);
		setLocation(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cPane = getContentPane( );
        cPane.setLayout(new FlowLayout());
        cPane.setBackground(Color.white);
        
        createChoseMenu();
        createDisplayMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.red);
        menuBar.add(choseMenu);
        menuBar.add(displayMenu);
        
        action = new JLabel("Please chose a courier");
        cPane.add(action);
		
	}
	
		public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setVisible(true);
    }
    
    public class MyHandler implements ActionListener{
    public void actionPerformed(ActionEvent event) {
        String  menuName;
        menuName = event.getActionCommand();
        van = new Vehicle();
        if (menuName.equals("Quit")){
        	van.setType();
        	JOptionPane.showMessageDialog(null,"You wish to Quit","Information",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        else if (menuName.equals("SWB Van")){
			JOptionPane.showInputDialog(null,"Please enter Your Name: ","Information",JOptionPane.INFORMATION_MESSAGE);
        	JOptionPane.showInputDialog(null,"Please enter Your Address: ","Information",JOptionPane.INFORMATION_MESSAGE);        	           
        }
        else if (menuName.equals("LWB Van")){
            JOptionPane.showInputDialog(null,"Please enter Your Name: ","Information",JOptionPane.INFORMATION_MESSAGE);
        	JOptionPane.showInputDialog(null,"Please enter Your Address: ","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (menuName.equals("Truck")){
            JOptionPane.showInputDialog(null,"Please enter Your Name: ","Information",JOptionPane.INFORMATION_MESSAGE);
        	JOptionPane.showInputDialog(null,"Please enter Your Address: ","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (menuName.equals("Display")){
            JOptionPane.showMessageDialog(null,"Display","Information",JOptionPane.INFORMATION_MESSAGE);
        }      
      	else if (menuName.equals("Save")){
            JOptionPane.showMessageDialog(null,"Save","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }
    
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