import javax.swing.*;  
import java.awt.*;   
public class Widget extends JFrame 

	{
	//New frame for JLabel's, JComboBox's, and JButton   
	JFrame f = new JFrame();
	
	JLabel l1, l2; 
	JLabel l9 =new JLabel();
    	
	JPanel panel=new JPanel();  
    	
	JButton btn1= new JButton("Verify");
    	
	JComboBox<String> day; 
    	JComboBox<String> month; 
    	JComboBox<String> year; 

	//String values for days
    	String days[] 
            	= {"Select" ,"1", "2", "3", "4", "5", 
                "6", "7", "8", "9", "10", 
                "11", "12", "13", "14", "15", 
                "16", "17", "18", "19", "20", 
                "21", "22", "23", "24", "25", 
                "26", "27", "28", "29", "30", 
                "31" }; 
	
	//String values for months
    	String months[] 
            = { "Select","Jan", "Feb", "Mar", "Apr", 
                "May", "Jun", "Jul", "Aug", 
                "Sep", "Oct", "Nov", "Dec" }; 

    	//String values for years
	String years[] 
            = {"Select", "1988", "1989", "1990", 
		"1991",	"1992", "1993", "1994",
		"1995", "1996", "1997", "1998", 
                "1999", "2000", "2001", "2002", 
                "2003", "2004", "2005", "2006", 
                "2007", "2008", "2009", "2010", 
                "2011", "2012", "2013", "2014", 
                "2015", "2016", "2017", "2018", 
                "2019", "2020", "2021"}; 

    	Widget()  
    		{  
       
        	setTitle("Please Verify Your Age");  
        	l1 = new JLabel("Please Verify Your Age");  
        	l1.setForeground(Color.black);  
        	l1.setFont(new Font("Serif", Font.BOLD, 20)); 

  		//DOB JLabel
        	l2 = new JLabel("DOB:");
		l2.setForeground(Color.black);              
        	
		//JPanel bounds created
		panel.setBounds(0,0,550, 450);    
        	panel.setBackground(Color.gray);
        	panel.setLayout(null); 
        	l1.setBounds(150, 90, 400, 30);     
        	l2.setBounds(80, 145, 100, 30);                  
        	btn1.setBounds(150, 200, 200, 30);  
        	panel.add(l1);             
        	panel.add(l2);  
        	panel.add(btn1);  
        	f.add( panel);          
        	
		//Day JComboBox location and font
		day = new JComboBox<String>(days); 
        	day.setFont(new Font("Arial", Font.PLAIN, 15)); 
        	day.setSize(70, 20); 
        	day.setLocation(150, 150);  
        	panel.add(day); 
        	
		//Month JComboBox location and font
		month = new JComboBox<String>(months); 
        	month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        	month.setSize(70, 20); 
       		month.setLocation(250, 150);        
        	panel.add(month); 
        	
		//Year JComboBox location and font
		year = new JComboBox<String>(years); 
        	year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        	year.setSize(70, 20); 
        	year.setLocation(350, 150); 
        	panel.add(year); 
        	
		//JLabel 19
		f.add(l9);
        	f. setVisible(true);  
        	f. setSize(550, 450);  
        	f. setLayout(null);  
        	f. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        }
        
	//Main class
	public static void main(String args[]){   
        	new Widget();  
    }           
}