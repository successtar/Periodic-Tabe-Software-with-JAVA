package periodic_table;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;





import java.util.Random;

import javax.swing.*;

public class Button extends Content implements MouseListener, ActionListener, KeyListener{
	private static final long serialVersionUID = 1L;
	
	//private KeyStroke keyboardPane = new KeyStroke();
	Dimension k,u;
	JRadioButton[] opt=new JRadioButton[4];
	
	JTextArea[]  optt=new JTextArea[4];
	 JLabel[] mark=new JLabel[10];
	
	ButtonGroup group = new ButtonGroup();
	public Button(){
		
		
		//test();
		//welcomep.setVisible(false);testpanel.setPreferredSize( k);testpage();
		//testpagerq.setVisible(false);testpager.remove(testpagerq);result();
		//back(2);
		//details(1);
		//Down Navigation "Mouse register"
		exitb.addMouseListener(this);testb.addMouseListener(this);backb.addMouseListener(this);aboutb.addMouseListener(this);
	
		
		
		//button mouse register
		b1.addMouseListener(this);b2.addMouseListener(this);b3.addMouseListener(this);b4.addMouseListener(this);b5.addMouseListener(this);b6.addMouseListener(this);b7.addMouseListener(this);b8.addMouseListener(this);b9.addMouseListener(this);b10.addMouseListener(this);b11.addMouseListener(this);b12.addMouseListener(this);b13.addMouseListener(this);b14.addMouseListener(this);b15.addMouseListener(this);b16.addMouseListener(this);b17.addMouseListener(this);b18.addMouseListener(this);b19.addMouseListener(this);b20.addMouseListener(this);
		b21.addMouseListener(this);b22.addMouseListener(this);b23.addMouseListener(this);b24.addMouseListener(this);b25.addMouseListener(this);b26.addMouseListener(this);b27.addMouseListener(this);b28.addMouseListener(this);b29.addMouseListener(this);b30.addMouseListener(this);b31.addMouseListener(this);b32.addMouseListener(this);b33.addMouseListener(this);b34.addMouseListener(this);b35.addMouseListener(this);b36.addMouseListener(this);b37.addMouseListener(this);b38.addMouseListener(this);b39.addMouseListener(this);b40.addMouseListener(this);
		b41.addMouseListener(this);b42.addMouseListener(this);b43.addMouseListener(this);b44.addMouseListener(this);b45.addMouseListener(this);b46.addMouseListener(this);b47.addMouseListener(this);b48.addMouseListener(this);b49.addMouseListener(this);b50.addMouseListener(this);b51.addMouseListener(this);b52.addMouseListener(this);b53.addMouseListener(this);b54.addMouseListener(this);b55.addMouseListener(this);b56.addMouseListener(this);b57.addMouseListener(this);b58.addMouseListener(this);b59.addMouseListener(this);b60.addMouseListener(this);
		b61.addMouseListener(this);b62.addMouseListener(this);b63.addMouseListener(this);b64.addMouseListener(this);b65.addMouseListener(this);b66.addMouseListener(this);b67.addMouseListener(this);b68.addMouseListener(this);b69.addMouseListener(this);b70.addMouseListener(this);b71.addMouseListener(this);b72.addMouseListener(this);b73.addMouseListener(this);b74.addMouseListener(this);b75.addMouseListener(this);b76.addMouseListener(this);b77.addMouseListener(this);b78.addMouseListener(this);b79.addMouseListener(this);b80.addMouseListener(this);
		b81.addMouseListener(this);b82.addMouseListener(this);b83.addMouseListener(this);b84.addMouseListener(this);b85.addMouseListener(this);b86.addMouseListener(this);b87.addMouseListener(this);b88.addMouseListener(this);b89.addMouseListener(this);b90.addMouseListener(this);b91.addMouseListener(this);b92.addMouseListener(this);b93.addMouseListener(this);b94.addMouseListener(this);b95.addMouseListener(this);b96.addMouseListener(this);b97.addMouseListener(this);b98.addMouseListener(this);b99.addMouseListener(this);b100.addMouseListener(this);
		b101.addMouseListener(this);b102.addMouseListener(this);b103.addMouseListener(this);b104.addMouseListener(this);b105.addMouseListener(this);b106.addMouseListener(this);b107.addMouseListener(this);b108.addMouseListener(this);b109.addMouseListener(this);b110.addMouseListener(this);b111.addMouseListener(this);b112.addMouseListener(this);b113.addMouseListener(this);b114.addMouseListener(this);b115.addMouseListener(this);b116.addMouseListener(this);b117.addMouseListener(this);b118.addMouseListener(this);
		
	
		
		
		b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);b16.addActionListener(this);b17.addActionListener(this);b18.addActionListener(this);b19.addActionListener(this);b20.addActionListener(this);
		b21.addActionListener(this);b22.addActionListener(this);b23.addActionListener(this);b24.addActionListener(this);b25.addActionListener(this);b26.addActionListener(this);b27.addActionListener(this);b28.addActionListener(this);b29.addActionListener(this);b30.addActionListener(this);b31.addActionListener(this);b32.addActionListener(this);b33.addActionListener(this);b34.addActionListener(this);b35.addActionListener(this);b36.addActionListener(this);b37.addActionListener(this);b38.addActionListener(this);b39.addActionListener(this);b40.addActionListener(this);
		b41.addActionListener(this);b42.addActionListener(this);b43.addActionListener(this);b44.addActionListener(this);b45.addActionListener(this);b46.addActionListener(this);b47.addActionListener(this);b48.addActionListener(this);b49.addActionListener(this);b50.addActionListener(this);b51.addActionListener(this);b52.addActionListener(this);b53.addActionListener(this);b5.addActionListener(this);b55.addActionListener(this);b56.addActionListener(this);b57.addActionListener(this);b58.addActionListener(this);b59.addActionListener(this);b60.addActionListener(this);
		b61.addActionListener(this);b62.addActionListener(this);b63.addActionListener(this);b64.addActionListener(this);b65.addActionListener(this);b66.addActionListener(this);b67.addActionListener(this);b68.addActionListener(this);b69.addActionListener(this);b70.addActionListener(this);b71.addActionListener(this);b72.addActionListener(this);b73.addActionListener(this);b74.addActionListener(this);b75.addActionListener(this);b76.addActionListener(this);b77.addActionListener(this);b78.addActionListener(this);b79.addActionListener(this);b80.addActionListener(this);
		b81.addActionListener(this);b82.addActionListener(this);b83.addActionListener(this);b84.addActionListener(this);b85.addActionListener(this);b86.addActionListener(this);b87.addActionListener(this);b88.addActionListener(this);b89.addActionListener(this);b90.addActionListener(this);b91.addActionListener(this);b92.addActionListener(this);b93.addActionListener(this);b94.addActionListener(this);b95.addActionListener(this);b96.addActionListener(this);b97.addActionListener(this);b98.addActionListener(this);b99.addActionListener(this);b100.addActionListener(this);
		b101.addActionListener(this);b102.addActionListener(this);b103.addActionListener(this);b104.addActionListener(this);b105.addActionListener(this);b106.addActionListener(this);b107.addActionListener(this);b108.addActionListener(this);b109.addActionListener(this);b110.addActionListener(this);b111.addActionListener(this);b112.addActionListener(this);b113.addActionListener(this);b114.addActionListener(this);b115.addActionListener(this);b116.addActionListener(this);b117.addActionListener(this);b118.addActionListener(this);
		exitb.addActionListener(this);testb.addActionListener(this);backb.addActionListener(this);aboutb.addActionListener(this);
		
		
		b74.setMnemonic('W');b95.setMnemonic('A');b76.setMnemonic('o');b16.setMnemonic('S');b1.setMnemonic('F');b118.setMnemonic('L');b31.setMnemonic('G');b56.setMnemonic('B');b28.setMnemonic('N');b53.setMnemonic('I');b39.setMnemonic('Y');b19.setMnemonic('K');b42.setMnemonic('M');b72.setMnemonic('H');exitb.setMnemonic('x');



		
		b1.setToolTipText("Hydrogen");  b2.setToolTipText("Helium");  b3.setToolTipText("Lithium");  b4.setToolTipText("Beryllium");  b5.setToolTipText("Boron");  b6.setToolTipText("Carbon");  b7.setToolTipText("Nitrogen");  b8.setToolTipText("Oxygen");  b9.setToolTipText("Fluorine");  b10.setToolTipText("Neon");  
		b11.setToolTipText("Sodium");  b12.setToolTipText("Magnesium");  b13.setToolTipText("Aluminum");  b14.setToolTipText("Silicon");  b15.setToolTipText("Phosphorus");  b16.setToolTipText("Sulfur");  b17.setToolTipText("Chlorine");  b18.setToolTipText("Argon");  b19.setToolTipText("Potassium");  b20.setToolTipText("Calcium");    
		b21.setToolTipText("Scandium");  b22.setToolTipText("Titanium");  b23.setToolTipText("Vanadium");  b24.setToolTipText("Chromium");  b25.setToolTipText("Manganese");  b26.setToolTipText("Iron");  b27.setToolTipText("Cobalt");  b28.setToolTipText("Nickel");  b29.setToolTipText("Copper");  b30.setToolTipText("Zinc");    
		b31.setToolTipText("Gallium");  b32.setToolTipText("Germanium");  b33.setToolTipText("Arsenic");  b34.setToolTipText("Selenium");  b35.setToolTipText("Bromine");  b36.setToolTipText("Krypton");  b37.setToolTipText("Rubidium");  b38.setToolTipText("Strontium");  b39.setToolTipText("Yttrium");  b40.setToolTipText("Zirconium");    
		b41.setToolTipText("Niobium");  b42.setToolTipText("Molybdenum");  b43.setToolTipText("Technetium");  b44.setToolTipText("Ruthenium");  b45.setToolTipText("Rhodium");  b46.setToolTipText("Palladium");  b47.setToolTipText("Silver");  b48.setToolTipText("Cadmium");  b49.setToolTipText("Indium");  b50.setToolTipText("Tin");    
		b51.setToolTipText("Antimony");  b52.setToolTipText("Tellurium");  b53.setToolTipText("Iodine");  b54.setToolTipText("Xenon");  b55.setToolTipText("Cesium");  b56.setToolTipText("Barium");  b57.setToolTipText("Lanthanum");  b58.setToolTipText("Cerium");  b59.setToolTipText("Praseodymium");  b60.setToolTipText("Neodymium");    
		b61.setToolTipText("Promethium");  b62.setToolTipText("Samarium");  b63.setToolTipText("Europium");  b64.setToolTipText("Gadolinium");  b65.setToolTipText("Terbium");  b66.setToolTipText("Dysprosium");  b67.setToolTipText("Holmium");  b68.setToolTipText("Erbium");  b69.setToolTipText("Thulium");  b70.setToolTipText("Ytterbium");    
		b71.setToolTipText("Lutetium");  b72.setToolTipText("Hafnium");  b73.setToolTipText("Tantalum");  b74.setToolTipText("Tungsten");  b75.setToolTipText("Rhenium");  b76.setToolTipText("Osmium");  b77.setToolTipText("Iridium");  b78.setToolTipText("Platinum");  b79.setToolTipText("Gold");  b80.setToolTipText("Mercury");    
		b81.setToolTipText("Thallium");  b82.setToolTipText("Lead");  b83.setToolTipText("Bismuth");  b84.setToolTipText("Polonium");  b85.setToolTipText("Astatine");  b86.setToolTipText("Radon");  b87.setToolTipText("Francium");  b88.setToolTipText("Radium");  b89.setToolTipText("Actinium");  b90.setToolTipText("Thorium");       
		b91.setToolTipText("Protactinium");  b92.setToolTipText("Uranium");  b93.setToolTipText("Neptunium");  b94.setToolTipText("Plutonium");  b95.setToolTipText("Americium");  b96.setToolTipText("Curium");  b97.setToolTipText("Berkelium");  b98.setToolTipText("Californium");  b99.setToolTipText("Einsteinium");  b100.setToolTipText("Fermium");    
		b101.setToolTipText("Mendelevium");  b102.setToolTipText("Nobelium");  b103.setToolTipText("Lawrencium");  b104.setToolTipText("Rutherfordium");  b105.setToolTipText("Dubnium");  b106.setToolTipText("Seaborgium");  b107.setToolTipText("Bohrium");  b108.setToolTipText("Hassium");  b109.setToolTipText("Meitnerium");  b110.setToolTipText("Darmstadtium");    
		b111.setToolTipText("Roentgenium");  b112.setToolTipText("Copernicium");  b113.setToolTipText("Ununtrium");  b114.setToolTipText("Flerovium");  b115.setToolTipText("Ununpentium");  b116.setToolTipText("Livermorium");  b117.setToolTipText("Ununseptium");  b118.setToolTipText("Ununoctium");    
		aboutb.setToolTipText("About Me");  testb.setToolTipText("Test Yourself");     backb.setToolTipText("Back to Table");  exitb.setToolTipText("Exit");
		
	
		
		g.addKeyListener(this);
		
				g.setBackground(Color.BLACK);
				g.requestFocus(true);
	
	
	}
	
	
	
	@Override
	public void keyReleased(KeyEvent k) {
		
	}
	@Override
	public void keyPressed(KeyEvent k) {
		
		if(KeyEvent.VK_LEFT==k.getKeyCode()|KeyEvent.VK_4==k.getKeyCode()|KeyEvent.VK_4==k.getKeyChar()){
			
			if(detect==0){
			
			if(detector==72){detector=57;}
			else if(detector==104){detector=89;}
			else if(detector==58){detector=118;}
			else if(detector==90){detector=71;}
			else if(detector==119){detector=103;}
			else if(detector==1){detector=121;}
			else if(detector==0){detector=1;}
			else  {detector--;}
			stroll();}
			
			else if(detect==1){	  
				Color navigator = Color.MAGENTA;
				exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
				if (detector1==0){detector1=2;}
				 if (detector1>=1&&detector1<=3){detector1--;}
				if (detector1==0){detector1=3;}
			        if (detector1==1){about.setForeground(Color.ORANGE);}
			        else if (detector1==2){back.setForeground(Color.ORANGE);}
			        if (detector1==3){exit.setForeground(Color.ORANGE);}
				
				
				}
			
			else if(detect==2){	  
				Color navigator = Color.MAGENTA;
				exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
				if (detector1==0){detector1=2;}
				 if (detector1>=1&&detector1<=3){detector1--;}
				if (detector1==0){detector1=3;}
			        if (detector1==1){about.setForeground(Color.ORANGE);}
			        else if (detector1==2){back.setForeground(Color.ORANGE);}
			        if (detector1==3){exit.setForeground(Color.ORANGE);}
				
				
				}
			
		}
		else if(KeyEvent.VK_RIGHT==k.getKeyCode()|KeyEvent.VK_6==k.getKeyCode()|KeyEvent.VK_6==k.getKeyChar()){
			
			if(detect==0){
			if(detector==57){detector=72;}
			else if(detector==89){detector=104;}
			else if(detector==118){detector=58;}
			else if(detector==71){detector=90;}
			else if(detector==103){detector=119;}
			else if(detector==121){detector=1;}
			else  {detector++;}
			stroll();}
			
			else if(detect==1){	   
				Color navigator = Color.MAGENTA;
				exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
				
			if (detector1>=3){detector1=0;}
			 if (detector1>=0&&detector1<3){detector1++;}
		        if (detector1==1){about.setForeground(Color.ORANGE);}
		        else if (detector1==2){back.setForeground(Color.ORANGE);}
		        if (detector1==3){exit.setForeground(Color.ORANGE);}
		
			}
			else if(detect==2){	   
				Color navigator = Color.MAGENTA;
				exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
				
			if (detector1>=3){detector1=0;}
			 if (detector1>=0&&detector1<3){detector1++;}
		        if (detector1==1){about.setForeground(Color.ORANGE);}
		        else if (detector1==2){back.setForeground(Color.ORANGE);}
		        if (detector1==3){exit.setForeground(Color.ORANGE);}
		
			}	
		}
		
		
		else if(KeyEvent.VK_UP==k.getKeyCode()|KeyEvent.VK_2==k.getKeyCode()|KeyEvent.VK_2==k.getKeyChar()){
			
			if(detect==0){
			
			if(detector==0){detector=1;}
			else if(detector==1){detector=119;}
			else if(detector==2){detector=121;}
			else if(detector==27){detector=120;}
			else if(detector==3){detector=1;}
			else if(detector==10){detector=2;}
			else if(detector==119){detector=87;}
			else if(detector==58){detector=104;}
			else if(detector==120){detector=95;}
			else if(detector==121){detector=103;}
			else if(detector>=90&&detector<=108){detector-=32;}
			else if(detector>=59&&detector<=71){detector+=47;}
			else if(detector>=4&&detector<=9){detector=120;}
			else if(detector>=21&&detector<=30){detector=120;}
			else if(detector>=72&&detector<=118){detector-=32;}
			else if(detector>=31&&detector<=57){detector-=18;}
			else if(detector>=11&&detector<=20){detector-=8;}
			
			stroll();}
			else if(detect==1){	 
				Color navigator = Color.MAGENTA;
				exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
				if (detector1==0){detector1=2;}
				 if (detector1>=1&&detector1<=3){detector1--;}
				if (detector1==0){detector1=3;}
			        if (detector1==1){about.setForeground(Color.ORANGE);}
			        else if (detector1==2){back.setForeground(Color.ORANGE);}
			        if (detector1==3){exit.setForeground(Color.ORANGE);}
				
				
			
				}
			else if(detect==2){	 
				Color navigator = Color.MAGENTA;
				exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
				if (detector1==0){detector1=2;}
				 if (detector1>=1&&detector1<=3){detector1--;}
				if (detector1==0){detector1=3;}
			        if (detector1==1){about.setForeground(Color.ORANGE);}
			        else if (detector1==2){back.setForeground(Color.ORANGE);}
			        if (detector1==3){exit.setForeground(Color.ORANGE);}
				
				
			
				}
			
			
			
		}
		else if(KeyEvent.VK_DOWN==k.getKeyCode()|KeyEvent.VK_8==k.getKeyCode()|KeyEvent.VK_8==k.getKeyChar()){
			
			if(detect==0){
				
			
			 if(detector==0){detector=1;}
			else if(detector==1){detector=3;}
			else if(detector==2){detector=10;}
			else if(detector>=3&&detector<=12){detector+=8;}
			else if(detector>=13&&detector<=39){detector+=18;}
			else if(detector>=40&&detector<=86){detector+=32;}
			else if(detector==87||detector==88){detector=119;}
			else if(detector==89||detector==104){detector=58;}
			else if(detector>=104&&detector<=118){detector-=47;}
			else if(detector>=58&&detector<=71){detector+=32;}
			else if(detector>=90&&detector<=102){detector=120;}
			else if(detector==118){detector=121;}
			else if(detector==119){detector=1;}
			else if(detector==120){detector=27;}
			else if(detector==121){detector=2;}
			else if(detector==103){detector=121;}
			
			
			
			stroll();}
			else if(detect==1){	
				Color navigator = Color.MAGENTA;
				exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
				if (detector1>=3){detector1=0;}
				 if (detector1>=0&&detector1<3){detector1++;}
			        if (detector1==1){about.setForeground(Color.ORANGE);}
			        else if (detector1==2){back.setForeground(Color.ORANGE);}
			        if (detector1==3){exit.setForeground(Color.ORANGE);}
			
				
				}
			else if(detect==2){	
				Color navigator = Color.MAGENTA;
				exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
				if (detector1>=3){detector1=0;}
				 if (detector1>=0&&detector1<3){detector1++;}
			        if (detector1==1){about.setForeground(Color.ORANGE);}
			        else if (detector1==2){back.setForeground(Color.ORANGE);}
			        if (detector1==3){exit.setForeground(Color.ORANGE);}
			
				
				}
	
			
		}
		
		else if(KeyEvent.VK_END==k.getKeyCode()){
			System.exit(0);}
		else if(KeyEvent.VK_HOME==k.getKeyCode()|KeyEvent.VK_BACK_SPACE==k.getKeyCode()|KeyEvent.VK_ESCAPE==k.getKeyCode()){
			if(detect==1){stroll();back(1);}
			else if(detect==2){back(2);}
			g.setText("");
			g.requestFocus(true);}
		
				else if(KeyEvent.VK_ENTER==k.getKeyCode()|KeyEvent.VK_5==k.getKeyCode()|KeyEvent.VK_5==k.getKeyChar()){
			if(detect==0){
			details(detector);}
			else if(detect==1){
				back(1);
			}
			else if(detect>=2){
				if (detector1==1){}
				else if (detector1==2){back(2);}
				else if (detector1==3){System.exit(0);}
			}
		}
			
			
			
		g.setText("");
			
		g.requestFocus(true);
	}
	@Override
	public void keyTyped(KeyEvent k) {
		g.setText("");
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		//System.exit(0);
		Object detector=e.getSource();
		 if (detector==b1){details(1);}  else if (detector==b2){details(2);}  else if (detector==b3){details(3);}  else if (detector==b4){details(4);}  else if (detector==b5){details(5);}  else if (detector==b6){details(6);}  else if (detector==b7){details(7);}  else if (detector==b8){details(8);}  else if (detector==b9){details(9);}  else if (detector==b10){details(10);}  
        else if (detector==b11){details(11);}  else if (detector==b12){details(12);}  else if (detector==b13){details(13);}  else if (detector==b14){details(14);}  else if (detector==b15){details(15);}  else if (detector==b16){details(16);}  else if (detector==b17){details(17);}  else if (detector==b18){details(18);}  else if (detector==b19){details(19);}  else if (detector==b20){details(20);}  
        else if (detector==b21){details(21);}  else if (detector==b22){details(22);}  else if (detector==b23){details(23);}  else if (detector==b24){details(24);}  else if (detector==b25){details(25);}  else if (detector==b26){details(26);}  else if (detector==b27){details(27);}  else if (detector==b28){details(28);}  else if (detector==b29){details(29);}  else if (detector==b30){details(30);}  
        else if (detector==b31){details(31);}  else if (detector==b32){details(32);}  else if (detector==b33){details(33);}  else if (detector==b34){details(34);}  else if (detector==b35){details(35);}  else if (detector==b36){details(36);}  else if (detector==b37){details(37);}  else if (detector==b38){details(38);}  else if (detector==b39){details(39);}  else if (detector==b40){details(40);}
        else if (detector==b41){details(41);}  else if (detector==b42){details(42);}  else if (detector==b43){details(43);}  else if (detector==b44){details(44);}  else if (detector==b45){details(45);}  else if (detector==b46){details(46);}  else if (detector==b47){details(47);}  else if (detector==b48){details(48);}  else if (detector==b49){details(49);}  else if (detector==b50){details(50);}  
        else if (detector==b51){details(51);}  else if (detector==b52){details(52);}  else if (detector==b53){details(53);}  else if (detector==b54){details(54);}  else if (detector==b55){details(55);}  else if (detector==b56){details(56);}  else if (detector==b57){details(57);}  else if (detector==b58){details(58);}  else if (detector==b59){details(59);}  else if (detector==b60){details(60);}  
        else if (detector==b61){details(61);}  else if (detector==b62){details(62);}  else if (detector==b63){details(63);}  else if (detector==b64){details(64);}  else if (detector==b65){details(65);}  else if (detector==b66){details(66);}  else if (detector==b67){details(67);}  else if (detector==b68){details(68);}  else if (detector==b69){details(69);}  else if (detector==b70){details(70);}  
        else if (detector==b71){details(71);}  else if (detector==b72){details(72);}  else if (detector==b73){details(73);}  else if (detector==b74){details(74);}  else if (detector==b75){details(75);}  else if (detector==b76){details(76);}  else if (detector==b77){details(77);}  else if (detector==b78){details(78);}  else if (detector==b79){details(79);}  else if (detector==b80){details(80);}  
        else if (detector==b81){details(81);}  else if (detector==b82){details(82);}  else if (detector==b83){details(83);}  else if (detector==b84){details(84);}  else if (detector==b85){details(85);}  else if (detector==b86){details(86);}  else if (detector==b87){details(87);}  else if (detector==b88){details(88);}  else if (detector==b89){details(89);}  else if (detector==b90){details(90);}  
        else if (detector==b91){details(91);}  else if (detector==b92){details(92);}  else if (detector==b93){details(93);}  else if (detector==b94){details(94);}  else if (detector==b95){details(95);}  else if (detector==b96){details(96);}  else if (detector==b97){details(97);}  else if (detector==b98){details(98);}  else if (detector==b99){details(99);}  else if (detector==b100){details(100);}  
        else if (detector==b101){details(101);}  else if (detector==b102){details(102);}  else if (detector==b103){details(103);}  else if (detector==b104){details(104);}  else if (detector==b105){details(105);}  else if (detector==b106){details(106);}  else if (detector==b107){details(107);}  else if (detector==b108){details(108);}  else if (detector==b109){details(109);}  else if (detector==b110){details(110);}
        else if (detector==b111){details(111);}  else if (detector==b112){details(112);}  else if (detector==b113){details(113);}  else if (detector==b114){details(114);}  else if (detector==b115){details(115);}  else if (detector==b116){details(116);}  else if (detector==b117){details(117);}  else if (detector==b118){details(118);}
        else if (detector==aboutb){details(191);}  else if (detector==testb){test();}  else if (detector==backb){details(2);}  else if (detector==exitb){details(121);}	 
		
        if(detect==2){ if (detector==start){welcomep.setVisible(false);testpage();} }  
        if(detect==3){ if (detector==next){nextq();} else if (detector==opt[0]){ansp=1;}     else if (detector==opt[1]){ansp=2;}     else if (detector==opt[2]){ansp=3;}     else if (detector==opt[3]){ansp=4;}}
        if(detect==4){ if (detector==again){testpager.setVisible(false);testpanel.remove(testpager);testpage();}  }
		
       
		 
		 g.requestFocus(true);
	}
	
	
	
	public void mouseEntered(MouseEvent m) {
		Object detector=m.getSource();
		
		onfocusl.setForeground(Color.MAGENTA);
		Color focus = Color.ORANGE;
		        //Navigator Listeners
		     if (detector==exitb){exit.setForeground(focus);}  else if (detector==testb){test.setForeground(focus);}	else if (detector==aboutb){about.setForeground(focus);}	else if (detector==backb){back.setForeground(focus);}
		
		        //Button Listenerselse 
        else if (detector==b1){sl1.setForeground(focus);}  else if (detector==b2){sl2.setForeground(focus);}  else if (detector==b3){sl3.setForeground(focus);}  else if (detector==b4){sl4.setForeground(focus);}  else if (detector==b5){sl5.setForeground(focus);}  else if (detector==b6){sl6.setForeground(focus);}  else if (detector==b7){sl7.setForeground(focus);}  else if (detector==b8){sl8.setForeground(focus);}  else if (detector==b9){sl9.setForeground(focus);}  else if (detector==b10){sl10.setForeground(focus);}  
		else if (detector==b11){sl11.setForeground(focus);}  else if (detector==b12){sl12.setForeground(focus);}  else if (detector==b13){sl13.setForeground(focus);}  else if (detector==b14){sl14.setForeground(focus);}  else if (detector==b15){sl15.setForeground(focus);}  else if (detector==b16){sl16.setForeground(focus);}  else if (detector==b17){sl17.setForeground(focus);}  else if (detector==b18){sl18.setForeground(focus);}  else if (detector==b19){sl19.setForeground(focus);}  else if (detector==b20){sl20.setForeground(focus);}  
		else if (detector==b21){sl21.setForeground(focus);}  else if (detector==b22){sl22.setForeground(focus);}  else if (detector==b23){sl23.setForeground(focus);}  else if (detector==b24){sl24.setForeground(focus);}  else if (detector==b25){sl25.setForeground(focus);}  else if (detector==b26){sl26.setForeground(focus);}  else if (detector==b27){sl27.setForeground(focus);}  else if (detector==b28){sl28.setForeground(focus);}  else if (detector==b29){sl29.setForeground(focus);}  else if (detector==b30){sl30.setForeground(focus);}  
		else if (detector==b31){sl31.setForeground(focus);}  else if (detector==b32){sl32.setForeground(focus);}  else if (detector==b33){sl33.setForeground(focus);}  else if (detector==b34){sl34.setForeground(focus);}  else if (detector==b35){sl35.setForeground(focus);}  else if (detector==b36){sl36.setForeground(focus);}  else if (detector==b37){sl37.setForeground(focus);}  else if (detector==b38){sl38.setForeground(focus);}  else if (detector==b39){sl39.setForeground(focus);}  else if (detector==b40){sl40.setForeground(focus);}  
		else if (detector==b41){sl41.setForeground(focus);}  else if (detector==b42){sl42.setForeground(focus);}  else if (detector==b43){sl43.setForeground(focus);}  else if (detector==b44){sl44.setForeground(focus);}  else if (detector==b45){sl45.setForeground(focus);}  else if (detector==b46){sl46.setForeground(focus);}  else if (detector==b47){sl47.setForeground(focus);}  else if (detector==b48){sl48.setForeground(focus);}  else if (detector==b49){sl49.setForeground(focus);}  else if (detector==b50){sl50.setForeground(focus);}  	
		else if (detector==b51){sl51.setForeground(focus);}  else if (detector==b52){sl52.setForeground(focus);}  else if (detector==b53){sl53.setForeground(focus);}  else if (detector==b54){sl54.setForeground(focus);}  else if (detector==b55){sl55.setForeground(focus);}  else if (detector==b56){sl56.setForeground(focus);}  else if (detector==b57){sl57.setForeground(focus);}  else if (detector==b58){sl58.setForeground(focus);}  else if (detector==b59){sl59.setForeground(focus);}  else if (detector==b60){sl60.setForeground(focus);}  
		else if (detector==b61){sl61.setForeground(focus);}  else if (detector==b62){sl62.setForeground(focus);}  else if (detector==b63){sl63.setForeground(focus);}  else if (detector==b64){sl64.setForeground(focus);}  else if (detector==b65){sl65.setForeground(focus);}  else if (detector==b66){sl66.setForeground(focus);}  else if (detector==b67){sl67.setForeground(focus);}  else if (detector==b68){sl68.setForeground(focus);}  else if (detector==b69){sl69.setForeground(focus);}  else if (detector==b70){sl70.setForeground(focus);}     
		else if (detector==b71){sl71.setForeground(focus);}  else if (detector==b72){sl72.setForeground(focus);}  else if (detector==b73){sl73.setForeground(focus);}  else if (detector==b74){sl74.setForeground(focus);}  else if (detector==b75){sl75.setForeground(focus);}  else if (detector==b76){sl76.setForeground(focus);}  else if (detector==b77){sl77.setForeground(focus);}  else if (detector==b78){sl78.setForeground(focus);}  else if (detector==b79){sl79.setForeground(focus);}  else if (detector==b80){sl80.setForeground(focus);}  
		else if (detector==b81){sl81.setForeground(focus);}  else if (detector==b82){sl82.setForeground(focus);}  else if (detector==b83){sl83.setForeground(focus);}  else if (detector==b84){sl84.setForeground(focus);}  else if (detector==b85){sl85.setForeground(focus);}  else if (detector==b86){sl86.setForeground(focus);}  else if (detector==b87){sl87.setForeground(focus);}  else if (detector==b88){sl88.setForeground(focus);}  else if (detector==b89){sl89.setForeground(focus);}  else if (detector==b90){sl90.setForeground(focus);}       
		else if (detector==b91){sl91.setForeground(focus);}  else if (detector==b92){sl92.setForeground(focus);}  else if (detector==b93){sl93.setForeground(focus);}  else if (detector==b94){sl94.setForeground(focus);}  else if (detector==b95){sl95.setForeground(focus);}  else if (detector==b96){sl96.setForeground(focus);}  else if (detector==b97){sl97.setForeground(focus);}  else if (detector==b98){sl98.setForeground(focus);}  else if (detector==b99){sl99.setForeground(focus);}  else if (detector==b100){sl100.setForeground(focus);}       
		else if (detector==b101){sl101.setForeground(focus);}  else if (detector==b102){sl102.setForeground(focus);}  else if (detector==b103){sl103.setForeground(focus);}  else if (detector==b104){sl104.setForeground(focus);}  else if (detector==b105){sl105.setForeground(focus);}  else if (detector==b106){sl106.setForeground(focus);}  else if (detector==b107){sl107.setForeground(focus);}  else if (detector==b108){sl108.setForeground(focus);}  else if (detector==b109){sl109.setForeground(focus);}  else if (detector==b110){sl110.setForeground(focus);}  
		else if (detector==b111){sl111.setForeground(focus);}  else if (detector==b112){sl112.setForeground(focus);}  else if (detector==b113){sl113.setForeground(focus);}  else if (detector==b114){sl114.setForeground(focus);}  else if (detector==b115){sl115.setForeground(focus);}  else if (detector==b116){sl116.setForeground(focus);}  else if (detector==b117){sl117.setForeground(focus);}  else if (detector==b118){sl118.setForeground(focus);}       
		     
		if(detect==2){ if (detector==start){start.setForeground(Color.ORANGE);}	}
		  if(detect==3){ if (detector==next){next.setForeground(Color.ORANGE);}	}
		  if(detect==4){ if (detector==again){again.setForeground(Color.ORANGE);} }
		     
		     g.requestFocus(true);     
		     
		     
	}
	public void mouseExited(MouseEvent m) {
				 
		Color solid = Color.BLUE;
		Color gas = Color.RED;
		Color liquid = Color.BLACK;
		Color navigator = Color.MAGENTA;
		
		
		//Navigators Mouse out colour
		exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
		//Buttons Mouse out colour
		sl1.setForeground(gas);  sl2.setForeground(gas);  sl3.setForeground(solid);  sl4.setForeground(solid);  sl5.setForeground(solid);  sl6.setForeground(solid);  sl7.setForeground(gas);  sl8.setForeground(gas);  sl9.setForeground(gas);  sl10.setForeground(gas);  sl11.setForeground(solid);  sl12.setForeground(solid);  sl13.setForeground(solid);  sl14.setForeground(solid);  sl15.setForeground(solid);  sl16.setForeground(solid);  sl17.setForeground(gas);  sl18.setForeground(gas);  sl19.setForeground(solid);  sl20.setForeground(solid);  
		sl21.setForeground(solid);  sl22.setForeground(solid);  sl23.setForeground(solid);  sl24.setForeground(solid);  sl25.setForeground(solid);  sl26.setForeground(solid);  sl27.setForeground(solid);  sl28.setForeground(solid);  sl29.setForeground(solid);  sl30.setForeground(solid);  sl31.setForeground(solid);  sl32.setForeground(solid);  sl33.setForeground(solid);  sl34.setForeground(solid);  sl35.setForeground(liquid);  sl36.setForeground(gas);  sl37.setForeground(solid);  sl38.setForeground(solid);  sl39.setForeground(solid);  sl40.setForeground(solid);  
		sl41.setForeground(solid);  sl42.setForeground(solid);  sl43.setForeground(solid);  sl44.setForeground(solid);  sl45.setForeground(solid);  sl46.setForeground(solid);  sl47.setForeground(solid);  sl48.setForeground(solid);  sl49.setForeground(solid);  sl50.setForeground(solid);  sl51.setForeground(solid);  sl52.setForeground(solid);  sl53.setForeground(solid);  sl54.setForeground(gas);  sl55.setForeground(solid);  sl56.setForeground(solid);  sl57.setForeground(solid);  sl58.setForeground(solid);  sl59.setForeground(solid);  sl60.setForeground(solid);  
		sl61.setForeground(solid);  sl62.setForeground(solid);  sl63.setForeground(solid);  sl64.setForeground(solid);  sl65.setForeground(solid);  sl66.setForeground(solid);  sl67.setForeground(solid);  sl68.setForeground(solid);  sl69.setForeground(solid);  sl70.setForeground(solid);  sl71.setForeground(solid);  sl72.setForeground(solid);  sl73.setForeground(solid);  sl74.setForeground(solid);  sl75.setForeground(solid);  sl76.setForeground(solid);  sl77.setForeground(solid);  sl78.setForeground(solid);  sl79.setForeground(solid);  sl80.setForeground(liquid);  
		sl81.setForeground(solid);  sl82.setForeground(solid);  sl83.setForeground(solid);  sl84.setForeground(solid);  sl85.setForeground(solid);  sl86.setForeground(gas);  sl87.setForeground(solid);  sl88.setForeground(solid);  sl89.setForeground(solid);  sl90.setForeground(solid);  sl91.setForeground(solid);  sl92.setForeground(solid);  sl93.setForeground(solid);  sl94.setForeground(solid);  sl95.setForeground(solid);  sl96.setForeground(solid);  sl97.setForeground(solid);  sl98.setForeground(solid);  sl99.setForeground(solid);  sl100.setForeground(solid);  
		sl101.setForeground(solid);  sl102.setForeground(solid);  sl103.setForeground(solid);  sl104.setForeground(solid);  sl105.setForeground(solid);  sl106.setForeground(solid);  sl107.setForeground(solid);  sl108.setForeground(solid);  sl109.setForeground(solid);  sl110.setForeground(solid);  sl111.setForeground(solid);  sl112.setForeground(solid);  sl113.setForeground(solid);  sl114.setForeground(solid);  sl115.setForeground(solid);  sl116.setForeground(solid);  sl117.setForeground(solid);  sl118.setForeground(gas);
		
		if(detect==2){ start.setForeground(Color.BLUE); }	
	   if(detect==3){next.setForeground(Color.BLUE); }
	  	if(detect==4){again.setForeground(Color.BLUE); }
		
		g.requestFocus(true);
		
		}
		@Override
		public void mouseClicked(MouseEvent m) {
			Object detector=m.getSource();
			
			if (detector==exit){
				System.exit(0);
				
		}
			else if (detector==back){
				if(detect==1){
					back(1);
				}
				else if(detect>=2){
					back(2);
				}
			}
			else if (detector==test){
	            details(120);
					}
		}
	
	@Override
	public void mousePressed(MouseEvent m) {
		Object detector=m.getSource();
		Color focus = Color.pink;
		        //Navigator Listeners
		     if (detector==exit){exit.setForeground(focus);}  else if (detector==test){test.setForeground(focus);}	else if (detector==about){about.setForeground(focus);}	else if (detector==back){back.setForeground(focus);}
		
		        //Button Listeners
		else if (detector==b1){sl1.setForeground(focus);}  else if (detector==b2){sl2.setForeground(focus);}  else if (detector==b3){sl3.setForeground(focus);}  else if (detector==b4){sl4.setForeground(focus);}  else if (detector==b5){sl5.setForeground(focus);}  else if (detector==b6){sl6.setForeground(focus);}  else if (detector==b7){sl7.setForeground(focus);}  else if (detector==b8){sl8.setForeground(focus);}  else if (detector==b9){sl9.setForeground(focus);}  else if (detector==b10){sl10.setForeground(focus);}  
		else if (detector==b11){sl11.setForeground(focus);}  else if (detector==b12){sl12.setForeground(focus);}  else if (detector==b13){sl13.setForeground(focus);}  else if (detector==b14){sl14.setForeground(focus);}  else if (detector==b15){sl15.setForeground(focus);}  else if (detector==b16){sl16.setForeground(focus);}  else if (detector==b17){sl17.setForeground(focus);}  else if (detector==b18){sl18.setForeground(focus);}  else if (detector==b19){sl19.setForeground(focus);}  else if (detector==b20){sl20.setForeground(focus);}  
		else if (detector==b21){sl21.setForeground(focus);}  else if (detector==b22){sl22.setForeground(focus);}  else if (detector==b23){sl23.setForeground(focus);}  else if (detector==b24){sl24.setForeground(focus);}  else if (detector==b25){sl25.setForeground(focus);}  else if (detector==b26){sl26.setForeground(focus);}  else if (detector==b27){sl27.setForeground(focus);}  else if (detector==b28){sl28.setForeground(focus);}  else if (detector==b29){sl29.setForeground(focus);}  else if (detector==b30){sl30.setForeground(focus);}  
		else if (detector==b31){sl31.setForeground(focus);}  else if (detector==b32){sl32.setForeground(focus);}  else if (detector==b33){sl33.setForeground(focus);}  else if (detector==b34){sl34.setForeground(focus);}  else if (detector==b35){sl35.setForeground(focus);}  else if (detector==b36){sl36.setForeground(focus);}  else if (detector==b37){sl37.setForeground(focus);}  else if (detector==b38){sl38.setForeground(focus);}  else if (detector==b39){sl39.setForeground(focus);}  else if (detector==b40){sl40.setForeground(focus);}  
		else if (detector==b41){sl41.setForeground(focus);}  else if (detector==b42){sl42.setForeground(focus);}  else if (detector==b43){sl43.setForeground(focus);}  else if (detector==b44){sl44.setForeground(focus);}  else if (detector==b45){sl45.setForeground(focus);}  else if (detector==b46){sl46.setForeground(focus);}  else if (detector==b47){sl47.setForeground(focus);}  else if (detector==b48){sl48.setForeground(focus);}  else if (detector==b49){sl49.setForeground(focus);}  else if (detector==b50){sl50.setForeground(focus);}  	
		else if (detector==b51){sl51.setForeground(focus);}  else if (detector==b52){sl52.setForeground(focus);}  else if (detector==b53){sl53.setForeground(focus);}  else if (detector==b54){sl54.setForeground(focus);}  else if (detector==b55){sl55.setForeground(focus);}  else if (detector==b56){sl56.setForeground(focus);}  else if (detector==b57){sl57.setForeground(focus);}  else if (detector==b58){sl58.setForeground(focus);}  else if (detector==b59){sl59.setForeground(focus);}  else if (detector==b60){sl60.setForeground(focus);}  
		else if (detector==b61){sl61.setForeground(focus);}  else if (detector==b62){sl62.setForeground(focus);}  else if (detector==b63){sl63.setForeground(focus);}  else if (detector==b64){sl64.setForeground(focus);}  else if (detector==b65){sl65.setForeground(focus);}  else if (detector==b66){sl66.setForeground(focus);}  else if (detector==b67){sl67.setForeground(focus);}  else if (detector==b68){sl68.setForeground(focus);}  else if (detector==b69){sl69.setForeground(focus);}  else if (detector==b70){sl70.setForeground(focus);}     
		else if (detector==b71){sl71.setForeground(focus);}  else if (detector==b72){sl72.setForeground(focus);}  else if (detector==b73){sl73.setForeground(focus);}  else if (detector==b74){sl74.setForeground(focus);}  else if (detector==b75){sl75.setForeground(focus);}  else if (detector==b76){sl76.setForeground(focus);}  else if (detector==b77){sl77.setForeground(focus);}  else if (detector==b78){sl78.setForeground(focus);}  else if (detector==b79){sl79.setForeground(focus);}  else if (detector==b80){sl80.setForeground(focus);}  
		else if (detector==b81){sl81.setForeground(focus);}  else if (detector==b82){sl82.setForeground(focus);}  else if (detector==b83){sl83.setForeground(focus);}  else if (detector==b84){sl84.setForeground(focus);}  else if (detector==b85){sl85.setForeground(focus);}  else if (detector==b86){sl86.setForeground(focus);}  else if (detector==b87){sl87.setForeground(focus);}  else if (detector==b88){sl88.setForeground(focus);}  else if (detector==b89){sl89.setForeground(focus);}  else if (detector==b90){sl90.setForeground(focus);}       
		else if (detector==b91){sl91.setForeground(focus);}  else if (detector==b92){sl92.setForeground(focus);}  else if (detector==b93){sl93.setForeground(focus);}  else if (detector==b94){sl94.setForeground(focus);}  else if (detector==b95){sl95.setForeground(focus);}  else if (detector==b96){sl96.setForeground(focus);}  else if (detector==b97){sl97.setForeground(focus);}  else if (detector==b98){sl98.setForeground(focus);}  else if (detector==b99){sl99.setForeground(focus);}  else if (detector==b100){sl100.setForeground(focus);}       
		else if (detector==b101){sl101.setForeground(focus);}  else if (detector==b102){sl102.setForeground(focus);}  else if (detector==b103){sl103.setForeground(focus);}  else if (detector==b104){sl104.setForeground(focus);}  else if (detector==b105){sl105.setForeground(focus);}  else if (detector==b106){sl106.setForeground(focus);}  else if (detector==b107){sl107.setForeground(focus);}  else if (detector==b108){sl108.setForeground(focus);}  else if (detector==b109){sl109.setForeground(focus);}  else if (detector==b110){sl110.setForeground(focus);}  
		else if (detector==b111){sl111.setForeground(focus);}  else if (detector==b112){sl112.setForeground(focus);}  else if (detector==b113){sl113.setForeground(focus);}  else if (detector==b114){sl114.setForeground(focus);}  else if (detector==b115){sl115.setForeground(focus);}  else if (detector==b116){sl116.setForeground(focus);}  else if (detector==b117){sl117.setForeground(focus);}  else if (detector==b118){sl118.setForeground(focus);}       
		
		     if(detect==2){ if (detector==start){welcomep.setVisible(false);testpage();} }  
		        if(detect==3){ if (detector==opt[0]){ansp=1;}     else if (detector==opt[1]){ansp=2;}     else if (detector==opt[2]){ansp=3;}     else if (detector==opt[3]){ansp=4;} else if (detector==optt[0]){ansp=1;opt[0].setSelected(true);}     else if (detector==optt[1]){ansp=2;opt[1].setSelected(true);}     else if (detector==optt[2]){ansp=3;opt[2].setSelected(true);}     else if (detector==optt[3]){ansp=4;opt[3].setSelected(true);}} 
		        if(detect==4){ if (detector==again){testpager.setVisible(false);testpanel.remove(testpager);testpage();}  }

		     
	     g.requestFocus(true);

	}
	@Override
	public void mouseReleased(MouseEvent m) {
	}

	

	
	
	
	public void details(int k){
		g.setText("");
		
		if(detect==0){
			
		if (k==119){}  
		else if (k==120){test();}
		else if (k==121){System.exit(0);}
		else if (k>0&&k<119){
			detector=k;
		info(k);
		header.setText(P22);
		backb.setVisible(true);
		testb.setVisible(false);
		main_container.add(detail=new JPanel(), BorderLayout.CENTER);detail.setLayout(new BorderLayout());
		detail.add(detail1=new JPanel(), BorderLayout.WEST);detail1.setBackground(Color.BLACK);
		detail.add(detail2=new JPanel(), BorderLayout.CENTER);detail2.setBackground(Color.MAGENTA);detail2.setLayout(new FlowLayout());detail2.setBorder(BorderFactory.createRaisedBevelBorder());detail2.add(detail2=new JPanel());detail2.setBorder(BorderFactory.createRaisedBevelBorder());detail2.setLayout(new BorderLayout());
		detail.add(detail3=new JPanel(), BorderLayout.EAST);detail3.setBackground(Color.BLACK);
		
		detail1.add(labela=new JLabel("                 "));
		detail3.add(labela=new JLabel("                 "));
		
  JLabel[] wale=new JLabel[38];
  String [] star={"Atomic Number",P1,"Atomic Mass",P2,Label4,P11,"Ionization energy",P14,"Electronic config",P6,"Principal Valency",P13,"Density g/cm3",P10,"Melting point  C",P3,"Boiling point  C",P4,"Type of Element",P5,"Electronegativity",P15,
		  "Appearance",P12,"Block",P16,"Period",P17,"Group",P18,"No of Isotopes",P8,"Occurrence",P19,"  Abundance in ppm  ",P20,"Year of Discovery",P9};
		
  Color fore = Color.BLUE;
  
		
		
		detail2.add(detail_short=new JPanel(), BorderLayout.WEST);detail_short.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));detail_short.setLayout(new BorderLayout());
		detail_short.add(p1=new JLabel(P21),BorderLayout.NORTH);p1.setHorizontalAlignment(SwingConstants.CENTER);p1.setFont(new Font("Courier", Font.BOLD, 30));p1.setForeground(Color.BLUE);
		detail_short.add(detail_short=new JPanel(), BorderLayout.CENTER);detail_short.setLayout(new GridLayout(19,2));detail_short.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		for(int i=0;i<38;i++){
			detail_short.add(wale[i]=new JLabel(star[i]));
			wale[i].setHorizontalAlignment(SwingConstants.CENTER);
			wale[i].setForeground(Color.BLUE);
			wale[i].setFont(new Font("Courier", Font.PLAIN, 14));
			wale[i].setBorder(BorderFactory.createLineBorder(Color.BLUE));
			
			
		};
		
		
		detail2.add(detail_long=new JPanel(), BorderLayout.EAST);detail_long.setLayout(new BorderLayout());detail_long.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
		
		
		
		
		
	
		detail_long.add(detail_long1=new JPanel(),BorderLayout.NORTH);detail_long1.setLayout(new BorderLayout());detail_long1.setBackground(Color.WHITE);
		detail_long1.add(p2=new JLabel("INTRODUCTION"),BorderLayout.NORTH);p2.setHorizontalAlignment(SwingConstants.CENTER);p2.setForeground(fore);
		detail_long1.add(detail_long12=new JPanel(), BorderLayout.CENTER);detail_long12.setLayout(new GridLayout(2,1));
		detail_long12.add(intro1=new JTextArea(Intro1,3,44));intro1.setLineWrap(true);intro1.setWrapStyleWord(true);intro1.setEditable(false);intro1.setForeground(fore);
		detail_long12.add(intro2=new JTextArea(Intro2,3,44));intro2.setLineWrap(true);intro2.setWrapStyleWord(true);intro2.setEditable(false);intro2.setForeground(fore);
		
		
		
		
		
		
		detail_long.add(detail_long2=new JPanel(),BorderLayout.CENTER);detail_long2.setLayout(new GridLayout(8,1));detail_long2.setBackground(Color.WHITE);
		detail_long2.add(p3=new JLabel("EXTRACTION"));p3.setHorizontalAlignment(SwingConstants.CENTER);p3.setForeground(fore);
		detail_long2.add(p4=new JLabel(Extract));p4.setHorizontalAlignment(SwingConstants.CENTER);p4.setForeground(fore);p4.setFont(new Font("",Font.PLAIN,12));p4.setVerticalAlignment(SwingConstants.TOP);
		detail_long2.add(p5=new JLabel("OXIDATION STATES"));p5.setHorizontalAlignment(SwingConstants.CENTER);p5.setForeground(fore);
		detail_long2.add(p6=new JLabel(P7));p6.setHorizontalAlignment(SwingConstants.CENTER);p6.setForeground(fore);p6.setFont(new Font("",Font.PLAIN,12));p6.setVerticalAlignment(SwingConstants.TOP);
		detail_long2.add(dlong=new JPanel());dlong.setLayout(new GridLayout(1,2));dlong.add(p7=new JLabel("ELEMENT CATEGORY"));p7.setHorizontalAlignment(SwingConstants.CENTER);p7.setForeground(fore);
		 dlong.setBackground(Color.WHITE);   dlong.add(p8=new JLabel("MAJOR SOURCE"));p8.setHorizontalAlignment(SwingConstants.CENTER);p8.setForeground(fore);
	    detail_long2.add(dlong=new JPanel());dlong.setLayout(new GridLayout(1,2));dlong.add(p9=new JLabel(Elecat));p9.setHorizontalAlignment(SwingConstants.CENTER);p9.setForeground(fore);p9.setFont(new Font("",Font.PLAIN,12));p9.setVerticalAlignment(SwingConstants.TOP);
		 dlong.setBackground(Color.WHITE);   dlong.add(p10=new JLabel(Source));p10.setHorizontalAlignment(SwingConstants.CENTER);p10.setForeground(fore);p10.setFont(new Font("",Font.PLAIN,12));p10.setVerticalAlignment(SwingConstants.TOP);
		
		detail_long2.add(p11=new JLabel(Label3));p11.setHorizontalAlignment(SwingConstants.CENTER);p11.setForeground(fore);
		detail_long2.add(p12=new JLabel(Comp1));p12.setHorizontalAlignment(SwingConstants.CENTER);p12.setForeground(fore);p12.setFont(new Font("",Font.PLAIN,12));p12.setVerticalAlignment(SwingConstants.TOP);
		
		
		
		
		
		
		
		
		
		
		detail_long.add(detail_long30=new JPanel(),BorderLayout.SOUTH);detail_long30.setLayout(new BorderLayout());detail_long30.setBackground(Color.WHITE);
		detail_long30.add(p13=new JLabel("ECONOMIC IMPORTANCE"),BorderLayout.NORTH);p13.setHorizontalAlignment(SwingConstants.CENTER);p13.setForeground(fore);
		detail_long30.add(detail_long31=new JPanel(), BorderLayout.CENTER);detail_long31.setLayout(new GridLayout(4,1));
		detail_long31.add(intro1=new JTextArea(Uses1,2,44));intro1.setLineWrap(true);intro1.setWrapStyleWord(true);intro1.setEditable(false);intro1.setForeground(fore);
		detail_long31.add(intro2=new JTextArea(Uses2,2,44));intro2.setLineWrap(true);intro2.setWrapStyleWord(true);intro2.setEditable(false);intro2.setForeground(fore);
		detail_long31.add(intro3=new JTextArea(Uses3,2,44));intro3.setLineWrap(true);intro3.setWrapStyleWord(true);intro3.setEditable(false);intro3.setForeground(fore);
        detail_long31.add(intro4=new JTextArea(Uses4,2,44));intro4.setLineWrap(true);intro4.setWrapStyleWord(true);intro4.setEditable(false);intro4.setForeground(fore);
		
        Color solid = Color.BLUE;
		Color gas = Color.RED;
		Color liquid = Color.BLACK;
		Color navigator = Color.MAGENTA;
		
		//Navigators Mouse out colour
		exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
		//Buttons Mouse out colour
		sl1.setForeground(gas);  sl2.setForeground(gas);  sl3.setForeground(solid);  sl4.setForeground(solid);  sl5.setForeground(solid);  sl6.setForeground(solid);  sl7.setForeground(gas);  sl8.setForeground(gas);  sl9.setForeground(gas);  sl10.setForeground(gas);  sl11.setForeground(solid);  sl12.setForeground(solid);  sl13.setForeground(solid);  sl14.setForeground(solid);  sl15.setForeground(solid);  sl16.setForeground(solid);  sl17.setForeground(gas);  sl18.setForeground(gas);  sl19.setForeground(solid);  sl20.setForeground(solid);  
		sl21.setForeground(solid);  sl22.setForeground(solid);  sl23.setForeground(solid);  sl24.setForeground(solid);  sl25.setForeground(solid);  sl26.setForeground(solid);  sl27.setForeground(solid);  sl28.setForeground(solid);  sl29.setForeground(solid);  sl30.setForeground(solid);  sl31.setForeground(solid);  sl32.setForeground(solid);  sl33.setForeground(solid);  sl34.setForeground(solid);  sl35.setForeground(liquid);  sl36.setForeground(gas);  sl37.setForeground(solid);  sl38.setForeground(solid);  sl39.setForeground(solid);  sl40.setForeground(solid);  
		sl41.setForeground(solid);  sl42.setForeground(solid);  sl43.setForeground(solid);  sl44.setForeground(solid);  sl45.setForeground(solid);  sl46.setForeground(solid);  sl47.setForeground(solid);  sl48.setForeground(solid);  sl49.setForeground(solid);  sl50.setForeground(solid);  sl51.setForeground(solid);  sl52.setForeground(solid);  sl53.setForeground(solid);  sl54.setForeground(gas);  sl55.setForeground(solid);  sl56.setForeground(solid);  sl57.setForeground(solid);  sl58.setForeground(solid);  sl59.setForeground(solid);  sl60.setForeground(solid);  
		sl61.setForeground(solid);  sl62.setForeground(solid);  sl63.setForeground(solid);  sl64.setForeground(solid);  sl65.setForeground(solid);  sl66.setForeground(solid);  sl67.setForeground(solid);  sl68.setForeground(solid);  sl69.setForeground(solid);  sl70.setForeground(solid);  sl71.setForeground(solid);  sl72.setForeground(solid);  sl73.setForeground(solid);  sl74.setForeground(solid);  sl75.setForeground(solid);  sl76.setForeground(solid);  sl77.setForeground(solid);  sl78.setForeground(solid);  sl79.setForeground(solid);  sl80.setForeground(liquid);  
		sl81.setForeground(solid);  sl82.setForeground(solid);  sl83.setForeground(solid);  sl84.setForeground(solid);  sl85.setForeground(solid);  sl86.setForeground(gas);  sl87.setForeground(solid);  sl88.setForeground(solid);  sl89.setForeground(solid);  sl90.setForeground(solid);  sl91.setForeground(solid);  sl92.setForeground(solid);  sl93.setForeground(solid);  sl94.setForeground(solid);  sl95.setForeground(solid);  sl96.setForeground(solid);  sl97.setForeground(solid);  sl98.setForeground(solid);  sl99.setForeground(solid);  sl100.setForeground(solid);  
		sl101.setForeground(solid);  sl102.setForeground(solid);  sl103.setForeground(solid);  sl104.setForeground(solid);  sl105.setForeground(solid);  sl106.setForeground(solid);  sl107.setForeground(solid);  sl108.setForeground(solid);  sl109.setForeground(solid);  sl110.setForeground(solid);  sl111.setForeground(solid);  sl112.setForeground(solid);  sl113.setForeground(solid);  sl114.setForeground(solid);  sl115.setForeground(solid);  sl116.setForeground(solid);  sl117.setForeground(solid);  sl118.setForeground(gas);
		
        
        
        sub_container02.setVisible(false);
		remove(sub_container02);
		detect=1;
		
		
		
		
	}}
		else if (detect==1){
			if (k==1){}
			else if (k==121){System.exit(0);}
			else if (k==2){
				back(1);
							}
			
		}
		else if (detect>=2){
			if (k==1){}
			else if (k==121){System.exit(0);}
			else if (k==2){
				back(2);
				
						}	
	
	
		}
		g.requestFocus(true);}
	
	public void test(){
		g.setText("");
		
		header.setText("ACHIEVER");
		backb.setVisible(true);
		testb.setVisible(false);
		main_container.add(tester=new JPanel(), BorderLayout.CENTER);tester.setLayout(new BorderLayout());
		tester.add(test1=new JPanel(), BorderLayout.WEST);test1.setBackground(Color.BLACK);
		tester.add(test2=new JPanel(), BorderLayout.CENTER);test2.setBackground(Color.MAGENTA);test2.setLayout(new FlowLayout());test2.setBorder(BorderFactory.createRaisedBevelBorder());test2.add(test2=new JPanel(), BorderLayout.SOUTH);test2.setBorder(BorderFactory.createRaisedBevelBorder());test2.setLayout(new BorderLayout());
		tester.add(test3=new JPanel(), BorderLayout.EAST);test3.setBackground(Color.BLACK);
		
		test1.add(new JLabel("                 "));
		test3.add(new JLabel("                 "));
		 
		test2.add(testpanel=new JPanel(), BorderLayout.CENTER);testpanel.setBackground(Color.BLUE);testpanel.setLayout(new FlowLayout());testpanel.add(welcomep=new JPanel());welcomep.setLayout(new BorderLayout(5,20));welcomep.setBackground(Color.CYAN);
		ImageIcon usIcon = new ImageIcon("src/wale.jpg");
		welcomep.add(labela=new JLabel("      WELCOME TO ACHIEVER TEST CENTER !!!!      ",usIcon,SwingConstants.CENTER), BorderLayout.CENTER);labela.setForeground(Color.BLUE);labela.setVerticalTextPosition(SwingConstants.TOP);labela.setHorizontalTextPosition(SwingConstants.CENTER);labela.setToolTipText("Successtar");labela.setIconTextGap(20);labela.setFont(f3);
		welcomep.add(welcomeps=new JPanel(), BorderLayout.SOUTH);welcomeps.setLayout(new FlowLayout(FlowLayout.CENTER,0,5));welcomeps.setBackground(Color.CYAN);welcomeps.add(start=new JButton("Start"));start.setFont(new Font("Algerian", Font.BOLD, 22));start.setForeground(Color.BLUE);start.setToolTipText("Start");start.addMouseListener(this);
		
		
		
		
		
		start.addActionListener(this);
		
		sub_container02.setVisible(false);
		
			remove(sub_container02);
			k=testpanel.getPreferredSize();
			detect=2;
	
	
			g.requestFocus(true);}
	public void testpage(){
		testpanel.setPreferredSize( k);
		count=1;
		res=0;
		pick=new Random().nextInt(120)+1;
		question(pick);
	   
		testpanel.add(testpager=new JPanel());testpager.setLayout(new BorderLayout(100,10));testpager.setBackground(Color.CYAN);testpager.setBorder(BorderFactory.createLineBorder(Color.CYAN,11));
		testpager.add(testpagerl=new JLabel(count+" /10"), BorderLayout.NORTH);testpagerl.setHorizontalAlignment(SwingConstants.CENTER);testpagerl.setForeground(Color.BLUE);testpagerl.setFont(f3);
		testpager.add(testpagerm=new JPanel(), BorderLayout.SOUTH);testpagerm.setLayout(new GridLayout(1,10,5,5));testpagerm.setBackground(Color.CYAN);testpagerm.setBorder(BorderFactory.createLineBorder(Color.CYAN,5));
		for(int i=0;i<10;i++){
			int f=i+1;
			testpagerm.add(mark[i]=new JLabel("    "+f+"   "));
			mark[i].setOpaque(true);
			mark[i].setBackground(Color.YELLOW);
			mark[i].setForeground(Color.BLUE);
		}
		
		testpager.add(testpagerq=new JPanel(), BorderLayout.CENTER);testpagerq.setLayout(new BorderLayout());
		testpagerq.add(ques=new JTextArea(a,4,6), BorderLayout.NORTH);ques.setFont(new Font("Courier", Font.BOLD, 19));ques.setEditable(false);ques.setWrapStyleWord(true);ques.setLineWrap(true);ques.setForeground(Color.BLUE);
		testpagerq.add(optp=new JPanel(), BorderLayout.CENTER);optp.setLayout(new GridLayout(4,1));
		String[] opts={a1,a2,a3,a4};
		for(int i=0;i<4;i++){
			
			optp.add(p100=new JPanel());p100.setLayout(new FlowLayout());
			p100.add(opt[i]=new JRadioButton());
		    opt[i].setBackground(Color.WHITE);
		    
		    group.add(opt[i]);
		  
		    p100.add(optt[i]=new JTextArea(opts[i],2,31));optt[i].setEditable(false);optt[i].setFont(new Font("", Font.PLAIN, 14));optt[i].setWrapStyleWord(true);optt[i].setLineWrap(true); 
		    p100.setBackground(Color.WHITE);
		    optt[i].setForeground(Color.BLUE);
		    optt[i].addMouseListener(this);
		    opt[i].addActionListener(this);
		    
		   }
		 
		
		
		
		testpagerq.add(nextp=new JPanel(), BorderLayout.SOUTH);nextp.setBackground(Color.WHITE);nextp.add(next=new JButton("NEXT"));next.setFont(f3);next.setForeground(Color.BLUE);next.addActionListener(this);next.setToolTipText("Next");
		next.addMouseListener(this);
		
		u=testpager.getPreferredSize();
		detect=3;
	}
	
	public void nextq(){
		if (ansp>0){
			
			
			if (ansp==Integer.parseInt(ans)){
				res+=1;
				int v=count-1;
				mark[v].setBackground(Color.MAGENTA);
				
			}
			else{
				res+=0;
				int v=count-1;
				mark[v].setBackground(Color.RED);
				
			}
			
			
			
			
			if (count>=10){
				testpagerq.setVisible(false);testpager.remove(testpagerq);
				result();
				
			}
			
			else if (count<10){
			
			
			
			count++;
		pick=new Random().nextInt(120)+1;
		question(pick);
		ques.setText(a);
		testpagerl.setText(count+" /10");
		String[] opts={a1,a2,a3,a4};
		
		for(int i=0;i<4;i++){
			
		group.remove(opt[i]);
			optt[i].setText(opts[i]);
			opt[i].setSelected(false);
			group.add(opt[i]);
		}	}
		ansp=0;
		}
		else {
			JOptionPane.showMessageDialog(null, "No option is selected !!!","Periodic Table", JOptionPane.INFORMATION_MESSAGE);
			//JOptionPane.showConfirmDialog(null, "");
			}
		
	}
	public void result(){
	
		testpager.setPreferredSize(u);testpager.add(testpagerr=new JPanel(), BorderLayout.CENTER);testpagerr.setLayout(new BorderLayout(10,10));
		testpagerr.setBorder(BorderFactory.createLineBorder(Color.BLUE,15));testpagerr.setBackground(Color.CYAN);
		testpagerr.add(testpagerr=new JPanel(), BorderLayout.CENTER);testpagerr.setLayout(new BorderLayout(10,10));
		testpagerr.setBorder(BorderFactory.createLineBorder(Color.CYAN,25));testpagerr.setBackground(Color.CYAN);
		
		switch (res){

		case 10:
		comment= "WOW !!!"
;		Command3= "PLAY AGAIN"
;				break;
		case 9:
		comment= "Great !!!"
;		Command3= "PLAY AGAIN"
;				break;
		
		case 8:
	comment= "Great !!!"
;		Command3= "PLAY AGAIN"
;				break;

		case  7:
	comment= "Great !!!"
;		Command3= "PLAY AGAIN"
;				break;

		case 6:
		comment= "Good !!!"
;		Command3= "PLAY AGAIN"
;				break;
		case 5:
	comment= "Good !!!"
;		Command3= "PLAY AGAIN"
;				break;
	
		case 4 :
		comment= "POOR !!!"
;		Command3= "TRY AGAIN"
;				break;
		case 3 :
	comment= "POOR !!!"
;		Command3= "TRY AGAIN"
;				break;
		case 1:
		comment= "TOO POOR !!!"
;		Command3= "TRY AGAIN"
;				break;
		case 2:
	comment= "TOO POOR !!!"
;		Command3= "TRY AGAIN"
;				break;

		case 0:
		comment= "HIGHLY POOR !!!"
;		Command3= "TRY AGAIN"
;				break;
		 default:
		comment= "O Y O !!!"
;		Command3= "TRY AGAIN"
;break;
	}		
		
		
		testpagerr.add(labela=new JLabel(comment), BorderLayout.NORTH);labela.setHorizontalAlignment(SwingConstants.CENTER);labela.setFont(f5);labela.setForeground(Color.BLUE);
		testpagerr.add(labela=new JLabel("You Score "+res+" out of 10"), BorderLayout.CENTER);labela.setHorizontalAlignment(SwingConstants.CENTER);labela.setFont(f5);labela.setForeground(Color.BLUE);
		
		if(res>=5){ Command3="PLAY AGAIN";}
		else if(res<5){Command3="TRY AGAIN";}
		testpagerl.setText("RESULT");
		testpagerr.add(nextp=new JPanel(), BorderLayout.SOUTH);nextp.setBackground(Color.CYAN);nextp.add(again=new JButton(Command3), BorderLayout.SOUTH);again.setFont(f5);again.setForeground(Color.BLUE);again.addActionListener(this);again.setToolTipText(Command3);again.addMouseListener(this);
		detect=4;
	}
	public void back(int w){
		Color focus = Color.PINK;
		if (w==1){
		detail.setVisible(false);}
		else if (w>=2){
		tester.setVisible(false);}
		
		sub_container02.setVisible(true);
		header.setText(M);
		backb.setVisible(false);
		testb.setVisible(true);
		
		if (detector==1){sl1.setForeground(focus);}  else if (detector==2){sl2.setForeground(focus);}  else if (detector==3){sl3.setForeground(focus);}  else if (detector==4){sl4.setForeground(focus);}  else if (detector==5){sl5.setForeground(focus);}  else if (detector==6){sl6.setForeground(focus);}  else if (detector==7){sl7.setForeground(focus);}  else if (detector==8){sl8.setForeground(focus);}  else if (detector==9){sl9.setForeground(focus);}  else if (detector==10){sl10.setForeground(focus);}  
		else if (detector==11){sl11.setForeground(focus);}  else if (detector==12){sl12.setForeground(focus);}  else if (detector==13){sl13.setForeground(focus);}  else if (detector==14){sl14.setForeground(focus);}  else if (detector==15){sl15.setForeground(focus);}  else if (detector==16){sl16.setForeground(focus);}  else if (detector==17){sl17.setForeground(focus);}  else if (detector==18){sl18.setForeground(focus);}  else if (detector==19){sl19.setForeground(focus);}  else if (detector==20){sl20.setForeground(focus);}  
		else if (detector==21){sl21.setForeground(focus);}  else if (detector==22){sl22.setForeground(focus);}  else if (detector==23){sl23.setForeground(focus);}  else if (detector==24){sl24.setForeground(focus);}  else if (detector==25){sl25.setForeground(focus);}  else if (detector==26){sl26.setForeground(focus);}  else if (detector==27){sl27.setForeground(focus);}  else if (detector==28){sl28.setForeground(focus);}  else if (detector==29){sl29.setForeground(focus);}  else if (detector==30){sl30.setForeground(focus);}  
		else if (detector==31){sl31.setForeground(focus);}  else if (detector==32){sl32.setForeground(focus);}  else if (detector==33){sl33.setForeground(focus);}  else if (detector==34){sl34.setForeground(focus);}  else if (detector==35){sl35.setForeground(focus);}  else if (detector==36){sl36.setForeground(focus);}  else if (detector==37){sl37.setForeground(focus);}  else if (detector==38){sl38.setForeground(focus);}  else if (detector==39){sl39.setForeground(focus);}  else if (detector==40){sl40.setForeground(focus);}  
		else if (detector==41){sl41.setForeground(focus);}  else if (detector==42){sl42.setForeground(focus);}  else if (detector==43){sl43.setForeground(focus);}  else if (detector==44){sl44.setForeground(focus);}  else if (detector==45){sl45.setForeground(focus);}  else if (detector==46){sl46.setForeground(focus);}  else if (detector==47){sl47.setForeground(focus);}  else if (detector==48){sl48.setForeground(focus);}  else if (detector==49){sl49.setForeground(focus);}  else if (detector==50){sl50.setForeground(focus);}  	
		else if (detector==51){sl51.setForeground(focus);}  else if (detector==52){sl52.setForeground(focus);}  else if (detector==53){sl53.setForeground(focus);}  else if (detector==54){sl54.setForeground(focus);}  else if (detector==55){sl55.setForeground(focus);}  else if (detector==56){sl56.setForeground(focus);}  else if (detector==57){sl57.setForeground(focus);}  else if (detector==58){sl58.setForeground(focus);}  else if (detector==59){sl59.setForeground(focus);}  else if (detector==60){sl60.setForeground(focus);}  
		else if (detector==61){sl61.setForeground(focus);}  else if (detector==62){sl62.setForeground(focus);}  else if (detector==63){sl63.setForeground(focus);}  else if (detector==64){sl64.setForeground(focus);}  else if (detector==65){sl65.setForeground(focus);}  else if (detector==66){sl66.setForeground(focus);}  else if (detector==67){sl67.setForeground(focus);}  else if (detector==68){sl68.setForeground(focus);}  else if (detector==69){sl69.setForeground(focus);}  else if (detector==70){sl70.setForeground(focus);}     
		else if (detector==71){sl71.setForeground(focus);}  else if (detector==72){sl72.setForeground(focus);}  else if (detector==73){sl73.setForeground(focus);}  else if (detector==74){sl74.setForeground(focus);}  else if (detector==75){sl75.setForeground(focus);}  else if (detector==76){sl76.setForeground(focus);}  else if (detector==77){sl77.setForeground(focus);}  else if (detector==78){sl78.setForeground(focus);}  else if (detector==79){sl79.setForeground(focus);}  else if (detector==80){sl80.setForeground(focus);}  
		else if (detector==81){sl81.setForeground(focus);}  else if (detector==82){sl82.setForeground(focus);}  else if (detector==83){sl83.setForeground(focus);}  else if (detector==84){sl84.setForeground(focus);}  else if (detector==85){sl85.setForeground(focus);}  else if (detector==86){sl86.setForeground(focus);}  else if (detector==87){sl87.setForeground(focus);}  else if (detector==88){sl88.setForeground(focus);}  else if (detector==89){sl89.setForeground(focus);}  else if (detector==90){sl90.setForeground(focus);}       
		else if (detector==91){sl91.setForeground(focus);}  else if (detector==92){sl92.setForeground(focus);}  else if (detector==93){sl93.setForeground(focus);}  else if (detector==94){sl94.setForeground(focus);}  else if (detector==95){sl95.setForeground(focus);}  else if (detector==96){sl96.setForeground(focus);}  else if (detector==97){sl97.setForeground(focus);}  else if (detector==98){sl98.setForeground(focus);}  else if (detector==99){sl99.setForeground(focus);}  else if (detector==100){sl100.setForeground(focus);}       
		else if (detector==101){sl101.setForeground(focus);}  else if (detector==102){sl102.setForeground(focus);}  else if (detector==103){sl103.setForeground(focus);}  else if (detector==104){sl104.setForeground(focus);}  else if (detector==105){sl105.setForeground(focus);}  else if (detector==106){sl106.setForeground(focus);}  else if (detector==107){sl107.setForeground(focus);}  else if (detector==108){sl108.setForeground(focus);}  else if (detector==109){sl109.setForeground(focus);}  else if (detector==110){sl110.setForeground(focus);}  
		else if (detector==111){sl111.setForeground(focus);}  else if (detector==112){sl112.setForeground(focus);}  else if (detector==113){sl113.setForeground(focus);}  else if (detector==114){sl114.setForeground(focus);}  else if (detector==115){sl115.setForeground(focus);}  else if (detector==116){sl116.setForeground(focus);}  else if (detector==117){sl117.setForeground(focus);}  else if (detector==118){sl118.setForeground(focus);}
		else if (detector==119){about.setForeground(focus);}  else if (detector==120){test.setForeground(focus);}   else if (detector==121){exit.setForeground(focus);}  
		detect=0;
		Color navigator = Color.MAGENTA;
		exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
		onfocusl.setForeground(focus);
	}

	
		public void stroll(){
			Color focus = Color.ORANGE;
			Color solid = Color.BLUE;
			Color gas = Color.RED;
			Color liquid = Color.BLACK;
			Color navigator = Color.MAGENTA;
			exit.setForeground(navigator);	test.setForeground(navigator);	about.setForeground(navigator);	back.setForeground(navigator);
			
			sl1.setForeground(gas);  sl2.setForeground(gas);  sl3.setForeground(solid);  sl4.setForeground(solid);  sl5.setForeground(solid);  sl6.setForeground(solid);  sl7.setForeground(gas);  sl8.setForeground(gas);  sl9.setForeground(gas);  sl10.setForeground(gas);  sl11.setForeground(solid);  sl12.setForeground(solid);  sl13.setForeground(solid);  sl14.setForeground(solid);  sl15.setForeground(solid);  sl16.setForeground(solid);  sl17.setForeground(gas);  sl18.setForeground(gas);  sl19.setForeground(solid);  sl20.setForeground(solid);  
			sl21.setForeground(solid);  sl22.setForeground(solid);  sl23.setForeground(solid);  sl24.setForeground(solid);  sl25.setForeground(solid);  sl26.setForeground(solid);  sl27.setForeground(solid);  sl28.setForeground(solid);  sl29.setForeground(solid);  sl30.setForeground(solid);  sl31.setForeground(solid);  sl32.setForeground(solid);  sl33.setForeground(solid);  sl34.setForeground(solid);  sl35.setForeground(liquid);  sl36.setForeground(gas);  sl37.setForeground(solid);  sl38.setForeground(solid);  sl39.setForeground(solid);  sl40.setForeground(solid);  
			sl41.setForeground(solid);  sl42.setForeground(solid);  sl43.setForeground(solid);  sl44.setForeground(solid);  sl45.setForeground(solid);  sl46.setForeground(solid);  sl47.setForeground(solid);  sl48.setForeground(solid);  sl49.setForeground(solid);  sl50.setForeground(solid);  sl51.setForeground(solid);  sl52.setForeground(solid);  sl53.setForeground(solid);  sl54.setForeground(gas);  sl55.setForeground(solid);  sl56.setForeground(solid);  sl57.setForeground(solid);  sl58.setForeground(solid);  sl59.setForeground(solid);  sl60.setForeground(solid);  
			sl61.setForeground(solid);  sl62.setForeground(solid);  sl63.setForeground(solid);  sl64.setForeground(solid);  sl65.setForeground(solid);  sl66.setForeground(solid);  sl67.setForeground(solid);  sl68.setForeground(solid);  sl69.setForeground(solid);  sl70.setForeground(solid);  sl71.setForeground(solid);  sl72.setForeground(solid);  sl73.setForeground(solid);  sl74.setForeground(solid);  sl75.setForeground(solid);  sl76.setForeground(solid);  sl77.setForeground(solid);  sl78.setForeground(solid);  sl79.setForeground(solid);  sl80.setForeground(liquid);  
			sl81.setForeground(solid);  sl82.setForeground(solid);  sl83.setForeground(solid);  sl84.setForeground(solid);  sl85.setForeground(solid);  sl86.setForeground(gas);  sl87.setForeground(solid);  sl88.setForeground(solid);  sl89.setForeground(solid);  sl90.setForeground(solid);  sl91.setForeground(solid);  sl92.setForeground(solid);  sl93.setForeground(solid);  sl94.setForeground(solid);  sl95.setForeground(solid);  sl96.setForeground(solid);  sl97.setForeground(solid);  sl98.setForeground(solid);  sl99.setForeground(solid);  sl100.setForeground(solid);  
			sl101.setForeground(solid);  sl102.setForeground(solid);  sl103.setForeground(solid);  sl104.setForeground(solid);  sl105.setForeground(solid);  sl106.setForeground(solid);  sl107.setForeground(solid);  sl108.setForeground(solid);  sl109.setForeground(solid);  sl110.setForeground(solid);  sl111.setForeground(solid);  sl112.setForeground(solid);  sl113.setForeground(solid);  sl114.setForeground(solid);  sl115.setForeground(solid);  sl116.setForeground(solid);  sl117.setForeground(solid);  sl118.setForeground(gas);
			
			
			info(detector);
			     if (detector==1){sl1.setForeground(focus);onfocusl.setText(P22);}  else if (detector==2){sl2.setForeground(focus);onfocusl.setText(P22);}  else if (detector==3){sl3.setForeground(focus);onfocusl.setText(P22);}  else if (detector==4){sl4.setForeground(focus);onfocusl.setText(P22);}  else if (detector==5){sl5.setForeground(focus);onfocusl.setText(P22);}  else if (detector==6){sl6.setForeground(focus);onfocusl.setText(P22);}  else if (detector==7){sl7.setForeground(focus);onfocusl.setText(P22);}  else if (detector==8){sl8.setForeground(focus);onfocusl.setText(P22);}  else if (detector==9){sl9.setForeground(focus);onfocusl.setText(P22);}  else if (detector==10){sl10.setForeground(focus);onfocusl.setText(P22);}  
			else if (detector==11){sl11.setForeground(focus);onfocusl.setText(P22);}  else if (detector==12){sl12.setForeground(focus);onfocusl.setText(P22);}  else if (detector==13){sl13.setForeground(focus);onfocusl.setText(P22);}  else if (detector==14){sl14.setForeground(focus);onfocusl.setText(P22);}  else if (detector==15){sl15.setForeground(focus);onfocusl.setText(P22);}  else if (detector==16){sl16.setForeground(focus);onfocusl.setText(P22);}  else if (detector==17){sl17.setForeground(focus);onfocusl.setText(P22);}  else if (detector==18){sl18.setForeground(focus);onfocusl.setText(P22);}  else if (detector==19){sl19.setForeground(focus);onfocusl.setText(P22);}  else if (detector==20){sl20.setForeground(focus);onfocusl.setText(P22);}  
			else if (detector==21){sl21.setForeground(focus);onfocusl.setText(P22);}  else if (detector==22){sl22.setForeground(focus);onfocusl.setText(P22);}  else if (detector==23){sl23.setForeground(focus);onfocusl.setText(P22);}  else if (detector==24){sl24.setForeground(focus);onfocusl.setText(P22);}  else if (detector==25){sl25.setForeground(focus);onfocusl.setText(P22);}  else if (detector==26){sl26.setForeground(focus);onfocusl.setText(P22);}  else if (detector==27){sl27.setForeground(focus);onfocusl.setText(P22);}  else if (detector==28){sl28.setForeground(focus);onfocusl.setText(P22);}  else if (detector==29){sl29.setForeground(focus);onfocusl.setText(P22);}  else if (detector==30){sl30.setForeground(focus);onfocusl.setText(P22);}  
			else if (detector==31){sl31.setForeground(focus);onfocusl.setText(P22);}  else if (detector==32){sl32.setForeground(focus);onfocusl.setText(P22);}  else if (detector==33){sl33.setForeground(focus);onfocusl.setText(P22);}  else if (detector==34){sl34.setForeground(focus);onfocusl.setText(P22);}  else if (detector==35){sl35.setForeground(focus);onfocusl.setText(P22);}  else if (detector==36){sl36.setForeground(focus);onfocusl.setText(P22);}  else if (detector==37){sl37.setForeground(focus);onfocusl.setText(P22);}  else if (detector==38){sl38.setForeground(focus);onfocusl.setText(P22);}  else if (detector==39){sl39.setForeground(focus);onfocusl.setText(P22);}  else if (detector==40){sl40.setForeground(focus);onfocusl.setText(P22);}  
			else if (detector==41){sl41.setForeground(focus);onfocusl.setText(P22);}  else if (detector==42){sl42.setForeground(focus);onfocusl.setText(P22);}  else if (detector==43){sl43.setForeground(focus);onfocusl.setText(P22);}  else if (detector==44){sl44.setForeground(focus);onfocusl.setText(P22);}  else if (detector==45){sl45.setForeground(focus);onfocusl.setText(P22);}  else if (detector==46){sl46.setForeground(focus);onfocusl.setText(P22);}  else if (detector==47){sl47.setForeground(focus);onfocusl.setText(P22);}  else if (detector==48){sl48.setForeground(focus);onfocusl.setText(P22);}  else if (detector==49){sl49.setForeground(focus);onfocusl.setText(P22);}  else if (detector==50){sl50.setForeground(focus);onfocusl.setText(P22);}  	
			else if (detector==51){sl51.setForeground(focus);onfocusl.setText(P22);}  else if (detector==52){sl52.setForeground(focus);onfocusl.setText(P22);}  else if (detector==53){sl53.setForeground(focus);onfocusl.setText(P22);}  else if (detector==54){sl54.setForeground(focus);onfocusl.setText(P22);}  else if (detector==55){sl55.setForeground(focus);onfocusl.setText(P22);}  else if (detector==56){sl56.setForeground(focus);onfocusl.setText(P22);}  else if (detector==57){sl57.setForeground(focus);onfocusl.setText(P22);}  else if (detector==58){sl58.setForeground(focus);onfocusl.setText(P22);}  else if (detector==59){sl59.setForeground(focus);onfocusl.setText(P22);}  else if (detector==60){sl60.setForeground(focus);onfocusl.setText(P22);}  
			else if (detector==61){sl61.setForeground(focus);onfocusl.setText(P22);}  else if (detector==62){sl62.setForeground(focus);onfocusl.setText(P22);}  else if (detector==63){sl63.setForeground(focus);onfocusl.setText(P22);}  else if (detector==64){sl64.setForeground(focus);onfocusl.setText(P22);}  else if (detector==65){sl65.setForeground(focus);onfocusl.setText(P22);}  else if (detector==66){sl66.setForeground(focus);onfocusl.setText(P22);}  else if (detector==67){sl67.setForeground(focus);onfocusl.setText(P22);}  else if (detector==68){sl68.setForeground(focus);onfocusl.setText(P22);}  else if (detector==69){sl69.setForeground(focus);onfocusl.setText(P22);}  else if (detector==70){sl70.setForeground(focus);onfocusl.setText(P22);}     
			else if (detector==71){sl71.setForeground(focus);onfocusl.setText(P22);}  else if (detector==72){sl72.setForeground(focus);onfocusl.setText(P22);}  else if (detector==73){sl73.setForeground(focus);onfocusl.setText(P22);}  else if (detector==74){sl74.setForeground(focus);onfocusl.setText(P22);}  else if (detector==75){sl75.setForeground(focus);onfocusl.setText(P22);}  else if (detector==76){sl76.setForeground(focus);onfocusl.setText(P22);}  else if (detector==77){sl77.setForeground(focus);onfocusl.setText(P22);}  else if (detector==78){sl78.setForeground(focus);onfocusl.setText(P22);}  else if (detector==79){sl79.setForeground(focus);onfocusl.setText(P22);}  else if (detector==80){sl80.setForeground(focus);onfocusl.setText(P22);}  
			else if (detector==81){sl81.setForeground(focus);onfocusl.setText(P22);}  else if (detector==82){sl82.setForeground(focus);onfocusl.setText(P22);}  else if (detector==83){sl83.setForeground(focus);onfocusl.setText(P22);}  else if (detector==84){sl84.setForeground(focus);onfocusl.setText(P22);}  else if (detector==85){sl85.setForeground(focus);onfocusl.setText(P22);}  else if (detector==86){sl86.setForeground(focus);onfocusl.setText(P22);}  else if (detector==87){sl87.setForeground(focus);onfocusl.setText(P22);}  else if (detector==88){sl88.setForeground(focus);onfocusl.setText(P22);}  else if (detector==89){sl89.setForeground(focus);onfocusl.setText(P22);}  else if (detector==90){sl90.setForeground(focus);onfocusl.setText(P22);}       
			else if (detector==91){sl91.setForeground(focus);onfocusl.setText(P22);}  else if (detector==92){sl92.setForeground(focus);onfocusl.setText(P22);}  else if (detector==93){sl93.setForeground(focus);onfocusl.setText(P22);}  else if (detector==94){sl94.setForeground(focus);onfocusl.setText(P22);}  else if (detector==95){sl95.setForeground(focus);onfocusl.setText(P22);}  else if (detector==96){sl96.setForeground(focus);onfocusl.setText(P22);}  else if (detector==97){sl97.setForeground(focus);onfocusl.setText(P22);}  else if (detector==98){sl98.setForeground(focus);onfocusl.setText(P22);}  else if (detector==99){sl99.setForeground(focus);onfocusl.setText(P22);}  else if (detector==100){sl100.setForeground(focus);onfocusl.setText(P22);}       
			else if (detector==101){sl101.setForeground(focus);onfocusl.setText(P22);}  else if (detector==102){sl102.setForeground(focus);onfocusl.setText(P22);}  else if (detector==103){sl103.setForeground(focus);onfocusl.setText(P22);}  else if (detector==104){sl104.setForeground(focus);onfocusl.setText(P22);}  else if (detector==105){sl105.setForeground(focus);onfocusl.setText(P22);}  else if (detector==106){sl106.setForeground(focus);onfocusl.setText(P22);}  else if (detector==107){sl107.setForeground(focus);onfocusl.setText(P22);}  else if (detector==108){sl108.setForeground(focus);onfocusl.setText(P22);}  else if (detector==109){sl109.setForeground(focus);onfocusl.setText(P22);}  else if (detector==110){sl110.setForeground(focus);onfocusl.setText(P22);}  
			else if (detector==111){sl111.setForeground(focus);onfocusl.setText(P22);}  else if (detector==112){sl112.setForeground(focus);onfocusl.setText(P22);}  else if (detector==113){sl113.setForeground(focus);onfocusl.setText(P22);}  else if (detector==114){sl114.setForeground(focus);onfocusl.setText(P22);}  else if (detector==115){sl115.setForeground(focus);onfocusl.setText(P22);}  else if (detector==116){sl116.setForeground(focus);onfocusl.setText(P22);}  else if (detector==117){sl117.setForeground(focus);onfocusl.setText(P22);}  else if (detector==118){sl118.setForeground(focus);onfocusl.setText(P22);}
			else if (detector==119){about.setForeground(focus);onfocusl.setText("About Me");}  else if (detector==120){test.setForeground(focus);onfocusl.setText("Test Yourself");}   else if (detector==121){exit.setForeground(focus);onfocusl.setText("Exit");}  
			
			     onfocusl.setForeground(Color.YELLOW);
		}
		
	public static void main(String args[]) {
		
		new Button();

}}