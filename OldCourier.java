import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OldCourier extends JFrame{
	
	JMenu choseMenu, displayMenu;
	JLabel action;
	
	public OldCourier() {
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
        OldCourier courier = new OldCourier();
        courier.setVisible(true);
    }
    
    	private Vehicle(); implements ActionListener{
    	
		public class MyHandler
		public void actionPerformed(ActionEvent event) {
        String  menuName;
        menuName = event.getActionCommand();
        if (menuName.equals("Quit")){
           System.exit(0);
        }
        else if (menuName.equals("SWB Van")){
        	(JOptionPane.showInputDialog(null,"You have chosen SWB Van"));           
        }
        else if (menuName.equals("LWB Van")){
           
        }
        else if (menuName.equals("Truck")){
           
        }
        else if (menuName.equals("Display")){
           
        }      
      	else if (menuName.equals("Save")){
           
        }
        
        }
    	} 
        
        private void createChoseMenu(){
        JMenuItem item;
        Vehicle van= new Vehicle;		
        choseMenu = new JMenu("Choices");
        
        item = new JMenuItem("SWB Van");   
        item.addActionListener( van );
        choseMenu.add( item );
        
        item = new JMenuItem("LWB Van"); 
        item.addActionListener( van );
        choseMenu.add( item );
        
        item = new JMenuItem("Truck"); 
        item.addActionListener( van );
        choseMenu.add( item );
	}
	
		private void createDisplayMenu(){
		JMenuItem item;
		Vehicle d= new Vehicle;
		displayMenu = new JMenu("Details");
		
		item = new JMenuItem("Display");
		item.addActionListener( d );
		displayMenu.add( item );
		
		
		item = new JMenuItem("Save");
		item.addActionListener( d );
		displayMenu.add( item );
		}
}
	