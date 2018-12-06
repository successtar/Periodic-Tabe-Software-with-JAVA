package periodic_table;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JWindow;
import javax.swing.SwingConstants;




public class Periodic_table extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	
	
	
	//Declaration of panels
	public JPanel main_container,sub_container1,sub_container2,sub_container02,detail,detail1,detail2,detail_short,detail_long,detail_long1,detail_long12,detail_long2,detail_long3,detail3,detail_long30,detail_long31,dlong,sub_container5,sub_container6,sub_container21,sub_container22,sub_container23,sub_container24,sub_container24a,sub_container24a1,sub_container24a2,sub_container24b,sub_container24b1,sub_container24b2,sub_container23a,sub_container23ab,sub_container221,sub_container222,sub_container31,sub_container32,sub_container33,sub_container211,sub_container212,sub_container2112,sub_container2122,sub_container2221,sub_container22211,sub_container22212,sub_container22213,sub_container22214,sub_container22215,sub_container22216,sub_container22217,sub_container22218,sub_container22219,sub_container222110,sub_container21_flow,space,p30,p40,p50,p60,p70,p80,p90,p100,p110,p120,
	flow,flows,flowss,key,aboutp,exitp,testp,tester,test1,test2,test3,welcomep,welcomeps,testpanel,testpager,testpagerm,testpagerq,testpagerr,optp,nextp,onfocusp;
	//Declaration of labels
	public JLabel header,label,labela,group1,group2,group3,group4,group5,group6,group7,group8,group9,group10,group11,group12,group13,group14,group15,group16,group17,group18,groupa,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,l51,l52,l53,l54,l55,l56,l57,l58,l59,l60,l61,l62,l63,l64,l65,l66,l67,l68,l69,l70,l71,l72,l73,l74,l75,l76,l77,l78,l79,l80,l81,l82,l83,l84,l85,l86,l87,l88,l89,l90,l91,l92,l93,l94,l95,l96,l97,l98,l99,l100,l101,l102,l103,l104,l105,l106,l107,l108,l109,l110,l111,l112,l113,l114,l115,l116,l117,l118,la,
	al1,al2,al3,al4,al5,al6,al7,al8,al9,al10,al11,al12,al13,al14,al15,al16,al17,al18,al19,al20,al21,al22,al23,al24,al25,al26,al27,al28,al29,al30,al31,al32,al33,al34,al35,al36,al37,al38,al39,al40,al41,al42,al43,al44,al45,al46,al47,al48,al49,al50,al51,al52,al53,al54,al55,al56,al57,al58,al59,al60,al61,al62,al63,al64,al65,al66,al67,al68,al69,al70,al71,al72,al73,al74,al75,al76,al77,al78,al79,al80,al81,al82,al83,al84,al85,al86,al87,al88,al89,al90,al91,al92,al93,al94,al95,al96,al97,al98,al99,al100,al101,al102,al103,al104,al105,al106,al107,al108,al109,al110,al111,al112,al113,al114,al115,al116,al117,al118,ala,onfocusl,
	sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10,sl11,sl12,sl13,sl14,sl15,sl16,sl17,sl18,sl19,sl20,sl21,sl22,sl23,sl24,sl25,sl26,sl27,sl28,sl29,sl30,sl31,sl32,sl33,sl34,sl35,sl36,sl37,sl38,sl39,sl40,sl41,sl42,sl43,sl44,sl45,sl46,sl47,sl48,sl49,sl50,sl51,sl52,sl53,sl54,sl55,sl56,sl57,sl58,sl59,sl60,sl61,sl62,sl63,sl64,sl65,sl66,sl67,sl68,sl69,sl70,sl71,sl72,sl73,sl74,sl75,sl76,sl77,sl78,sl79,sl80,sl81,sl82,sl83,sl84,sl85,sl86,sl87,sl88,sl89,sl90,sl91,sl92,sl93,sl94,sl95,sl96,sl97,sl98,sl99,sl100,sl101,sl102,sl103,sl104,sl105,sl106,sl107,sl108,sl109,sl110,sl111,sl112,sl113,sl114,sl115,sl116,sl117,sl118,sla,about,exit,test,back,
	p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p31,p32,p33,p34,p35,p36,p37,p38,p39,p41,p42,p43,p44,p45,p46,p47,p48,p49,p51,p52,p53,p54,testpagerl;
	//Declaration of buttons
	public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96,b97,b98,b99,b100,b101,b102,b103,b104,b105,b106,b107,b108,b109,b110,b111,b112,b113,b114,b115,b116,b117,b118,aboutb,exitb,testb,backb,start,next,again;
	public String P1,P2,P3,P4,P5,P6,P7,P8,P9,P10,P11,P12,P13,P14,P15,P16,P17,P18,P19,P20,P21,P22,Intro1,Intro2,Extract,Elecat,Source,Comp1,Comp2,Uses1,Uses2,Uses3,Uses4,Label3,Label4,a,a1,a2,a3,a4,ans,comment,Command3;
	public JTextArea intro1,intro2,intro3,intro4,ques,g;
	
	public int detect,detector,detector1,ansp=0,count,pick,res;
	
	
	
	
	public Font f1=new Font("Maiandra GD", Font.PLAIN, 7);
	public Font f2=new Font("MS Sans Serif", Font.BOLD, 14);
	public Font f3=new Font("Algerian", Font.BOLD, 20);
	public Font f4=new Font("Courier", Font.BOLD, 16);
	public Font f5=new Font("Algerian", Font.BOLD, 25);
	
	

	
	
	
	
	String M="PERIODIC TABLE !!!";
	
	
	public Periodic_table(){
		
		JWindow wa=new JWindow();
		wa.setSize(182, 228);
		wa.setAlwaysOnTop(true);
		//wa.setResizable(false);
		//wa.setEnabled(false);
		//wa.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//wa.setExtendedState(MAXIMIZED_BOTH);

		wa.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		ImageIcon usIcon = new ImageIcon("src/picon.gif");
		wa.add(labela=new JLabel(usIcon,SwingConstants.CENTER));	
		//labela.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
		wa.setBackground(Color.BLACK);
		wa.setLocationRelativeTo(null);
		wa.setVisible(true);

		
		
		//Frame properties and terms
		ImageIcon imageIcon = new ImageIcon("src/picon.gif");	
	//	JFrame g=new JFrame();
		//g.
		setIconImage(imageIcon.getImage());
				add(main_container=new JPanel());				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setTitle("Periodic Table");
				main_container.setBackground(Color.BLACK);
				main_container.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
				//main_container.setOrientation(OrientationEnum.LANDSCAPE);
	//	this.setIconImage(new ImageIcon("image/wale.jpg"));
				



				//main_container additives	
				main_container.setLayout(new BorderLayout());
				
		main_container.add(sub_container1=new JPanel(), BorderLayout.NORTH);
		main_container.add(sub_container02=new JPanel(), BorderLayout.CENTER);
		main_container.add(sub_container5=new JPanel(), BorderLayout.SOUTH);
			//main_container.setBackground(Color.MAGENTA);
				
				//sub_container1 stuffs
		
		sub_container1.setLayout(new FlowLayout());
		sub_container1.add(header=new JLabel(M));
		//titl.setAlignmentY(SwingConstants.CENTER);;
		header.setForeground(Color.ORANGE);
		header.setFont(new Font("Courier", Font.BOLD, 38));
		sub_container1.setBackground(Color.black);
		
		
		//sub_container2 stuffs
		
		sub_container02.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));sub_container02.add(sub_container2 = new JPanel());sub_container02.setBackground(Color.black);sub_container02.doLayout();//sub_container02.CENTER_ALIGNMENT
		sub_container2.add(sub_container21_flow = new JPanel(), BorderLayout.WEST);sub_container2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));sub_container2.setLayout(new BorderLayout());sub_container2.setBackground(Color.MAGENTA);
		
		//sub_container21 things  WEST
        sub_container2.add(sub_container21_flow = new JPanel(), BorderLayout.WEST);sub_container21_flow.setLayout(new FlowLayout());
        sub_container21_flow.add(sub_container21=new JPanel());sub_container21_flow.setBackground(Color.MAGENTA);sub_container21.setLayout(new GridLayout(1,2));
        sub_container21.add(sub_container211=new JPanel());sub_container211.setBackground(Color.GREEN);sub_container211.setLayout(new BorderLayout());
        
        
        //Group 1
        sub_container211.add(group1=new JLabel("1"), BorderLayout.NORTH);group1.setHorizontalAlignment(SwingConstants.CENTER);
        
        sub_container211.add(sub_container2112=new JPanel(), BorderLayout.CENTER);sub_container2112.setBackground(Color.GREEN);sub_container2112.setLayout(new GridLayout(7,1));
        sub_container2112.add(b1=new JButton());  b1.setLayout(new BorderLayout()); b1.add(al1=new JLabel("1"), BorderLayout.NORTH);al1.setFont(f1);al1.setForeground(Color.RED);  b1.add(sl1=new JLabel("H"), BorderLayout.CENTER);sl1.setHorizontalAlignment(SwingConstants.CENTER);sl1.setForeground(Color.RED);sl1.setFont(f2);  b1.add(l1=new JLabel("Hydrogen"), BorderLayout.SOUTH);l1.setFont(f1);l1.setForeground(Color.RED);l1.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2112.add(b3=new JButton());  b3.setLayout(new BorderLayout()); b3.add(al3=new JLabel("3"), BorderLayout.NORTH);al3.setFont(f1);al3.setForeground(Color.BLUE);  b3.add(sl3=new JLabel("Li"), BorderLayout.CENTER);sl3.setHorizontalAlignment(SwingConstants.CENTER);sl3.setForeground(Color.BLUE);sl3.setFont(f2);  b3.add(l3=new JLabel("Lithium"), BorderLayout.SOUTH);l3.setFont(f1);l3.setForeground(Color.BLUE);l3.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2112.add(b11=new JButton());  b11.setLayout(new BorderLayout()); b11.add(al11=new JLabel("11"), BorderLayout.NORTH);al11.setFont(f1);al11.setForeground(Color.BLUE);  b11.add(sl11=new JLabel("Na"), BorderLayout.CENTER);sl11.setHorizontalAlignment(SwingConstants.CENTER);sl11.setForeground(Color.BLUE);sl11.setFont(f2);  b11.add(l11=new JLabel("Sodium"), BorderLayout.SOUTH);l11.setFont(f1);l11.setForeground(Color.BLUE);l11.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2112.add(b19=new JButton());  b19.setLayout(new BorderLayout()); b19.add(al19=new JLabel("19"), BorderLayout.NORTH);al19.setFont(f1);al19.setForeground(Color.BLUE);  b19.add(sl19=new JLabel("K"), BorderLayout.CENTER);sl19.setHorizontalAlignment(SwingConstants.CENTER);sl19.setForeground(Color.BLUE);sl19.setFont(f2);  b19.add(l19=new JLabel("Potassium"), BorderLayout.SOUTH);l19.setFont(f1);l19.setForeground(Color.BLUE);l19.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2112.add(b37=new JButton());  b37.setLayout(new BorderLayout()); b37.add(al37=new JLabel("37"), BorderLayout.NORTH);al37.setFont(f1);al37.setForeground(Color.BLUE);  b37.add(sl37=new JLabel("Rb"), BorderLayout.CENTER);sl37.setHorizontalAlignment(SwingConstants.CENTER);sl37.setForeground(Color.BLUE);sl37.setFont(f2);  b37.add(l37=new JLabel("Rubidium"), BorderLayout.SOUTH);l37.setFont(f1);l37.setForeground(Color.BLUE);l37.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2112.add(b55=new JButton());  b55.setLayout(new BorderLayout()); b55.add(al55=new JLabel("55"), BorderLayout.NORTH);al55.setFont(f1);al55.setForeground(Color.BLUE);  b55.add(sl55=new JLabel("Cs"), BorderLayout.CENTER);sl55.setHorizontalAlignment(SwingConstants.CENTER);sl55.setForeground(Color.BLUE);sl55.setFont(f2);  b55.add(l55=new JLabel("Cesium"), BorderLayout.SOUTH);l55.setFont(f1);l55.setForeground(Color.BLUE);l55.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2112.add(b87=new JButton());  b87.setLayout(new BorderLayout()); b87.add(al87=new JLabel("87"), BorderLayout.NORTH);al87.setFont(f1);al87.setForeground(Color.BLUE);  b87.add(sl87=new JLabel("Fr"), BorderLayout.CENTER);sl87.setHorizontalAlignment(SwingConstants.CENTER);sl87.setForeground(Color.BLUE);sl87.setFont(f2);  b87.add(l87=new JLabel("Francium"), BorderLayout.SOUTH);l87.setFont(f1);l87.setForeground(Color.BLUE);l87.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        
              
        
        //Group 2
        sub_container21.add(sub_container212=new JPanel());sub_container212.setBackground(Color.GREEN);sub_container212.setLayout(new BorderLayout());
        sub_container212.add(sub_container2122=new JPanel(), BorderLayout.CENTER);sub_container2122.setBackground(Color.GREEN);sub_container2122.setLayout(new GridLayout(7,1));
        sub_container212.add(group2=new JLabel("2"), BorderLayout.NORTH);group2.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2122.add(space=new JPanel());space.setBackground(Color.MAGENTA);
          
        sub_container2122.add(b4=new JButton());  b4.setLayout(new BorderLayout()); b4.add(al4=new JLabel("4"), BorderLayout.NORTH);al4.setFont(f1);al4.setForeground(Color.BLUE);  b4.add(sl4=new JLabel("Be"), BorderLayout.CENTER);sl4.setHorizontalAlignment(SwingConstants.CENTER);sl4.setForeground(Color.BLUE);sl4.setFont(f2);  b4.add(l4=new JLabel("Berylium"), BorderLayout.SOUTH);l4.setFont(f1);l4.setForeground(Color.BLUE);l4.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2122.add(b12=new JButton());  b12.setLayout(new BorderLayout());b12.add(al12=new JLabel("12"), BorderLayout.NORTH);al12.setFont(f1);al12.setForeground(Color.BLUE);  b12.add(sl12=new JLabel("Mg"), BorderLayout.CENTER);sl12.setHorizontalAlignment(SwingConstants.CENTER);sl12.setForeground(Color.BLUE);sl12.setFont(f2);  b12.add(l12=new JLabel("Magnesium"), BorderLayout.SOUTH);l12.setFont(f1);l12.setForeground(Color.BLUE);l12.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2122.add(b20=new JButton());  b20.setLayout(new BorderLayout()); b20.add(al20=new JLabel("20"), BorderLayout.NORTH);al20.setFont(f1);al20.setForeground(Color.BLUE);  b20.add(sl20=new JLabel("Ca"), BorderLayout.CENTER);sl20.setHorizontalAlignment(SwingConstants.CENTER);sl20.setForeground(Color.BLUE);sl20.setFont(f2);  b20.add(l20=new JLabel("Calcium"), BorderLayout.SOUTH);l20.setFont(f1);l20.setForeground(Color.BLUE);l20.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2122.add(b38=new JButton());  b38.setLayout(new BorderLayout()); b38.add(al38=new JLabel("38"), BorderLayout.NORTH);al38.setFont(f1);al38.setForeground(Color.BLUE);  b38.add(sl38=new JLabel("Sr"), BorderLayout.CENTER);sl38.setHorizontalAlignment(SwingConstants.CENTER);sl38.setForeground(Color.BLUE);sl38.setFont(f2);  b38.add(l38=new JLabel("Strontiu"), BorderLayout.SOUTH);l38.setFont(f1);l38.setForeground(Color.BLUE);l38.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2122.add(b56=new JButton());  b56.setLayout(new BorderLayout()); b56.add(al56=new JLabel("56"), BorderLayout.NORTH);al56.setFont(f1);al56.setForeground(Color.BLUE);  b56.add(sl56=new JLabel("Ba"), BorderLayout.CENTER);sl56.setHorizontalAlignment(SwingConstants.CENTER);sl56.setForeground(Color.BLUE);sl56.setFont(f2);  b56.add(l56=new JLabel("Barium"), BorderLayout.SOUTH);l56.setFont(f1);l56.setForeground(Color.BLUE);l56.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container2122.add(b88=new JButton());  b88.setLayout(new BorderLayout()); b88.add(al88=new JLabel("88"), BorderLayout.NORTH);al88.setFont(f1);al88.setForeground(Color.BLUE);  b88.add(sl88=new JLabel("Ra"), BorderLayout.CENTER);sl88.setHorizontalAlignment(SwingConstants.CENTER);sl88.setForeground(Color.BLUE);sl88.setFont(f2);  b88.add(l88=new JLabel("Radium"), BorderLayout.SOUTH);l88.setFont(f1);l88.setForeground(Color.BLUE);l88.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        
        
        
      //sub_container22 things   CENTER
        sub_container2.add(sub_container22 = new JPanel(), BorderLayout.CENTER);sub_container22.setLayout(new BorderLayout());
        
        sub_container22.add(sub_container221 = new JPanel(), BorderLayout.CENTER);sub_container221.setBackground(Color.MAGENTA);sub_container221.setLayout(new BorderLayout());
        sub_container221.add(labela=new JLabel("Click on any of the elements to reveal it's basic details."), BorderLayout.CENTER);labela.setForeground(Color.WHITE);labela.setHorizontalAlignment(SwingConstants.CENTER);labela.setFont(f4);
        sub_container221.add(onfocusp=new JPanel(), BorderLayout.SOUTH);onfocusp.setLayout(new GridLayout(2,1));onfocusp.setBackground(Color.MAGENTA);
        onfocusp.add(onfocusl=new JLabel("Hydrogen"));onfocusl.setHorizontalAlignment(SwingConstants.CENTER);onfocusl.setFont(new Font("Algerian", Font.BOLD, 20));onfocusl.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 10));onfocusl.setForeground(Color.MAGENTA);
        onfocusp.add(labela=new JLabel("TRANSITION ELEMENTS"));labela.setForeground(Color.WHITE);labela.setHorizontalAlignment(SwingConstants.CENTER);labela.setFont(f3);labela.setVerticalAlignment(SwingConstants.BOTTOM);
        
        
        sub_container22.add(sub_container222 = new JPanel(), BorderLayout.SOUTH);sub_container222.setBackground(Color.MAGENTA);sub_container222.setLayout(new FlowLayout());
        
        sub_container222.add(sub_container2221=new JPanel()); sub_container2221.setLayout(new GridLayout(1,10));
        
        //first sub_container2221 components  Group 3
        sub_container2221.add(p30=new JPanel());p30.setLayout(new BorderLayout());p30.setBackground(Color.GREEN);
        p30.add(group3=new JLabel("3"), BorderLayout.NORTH);group3.setHorizontalAlignment(SwingConstants.CENTER);
        p30.add(sub_container22211=new JPanel(), BorderLayout.CENTER);sub_container22211.setLayout(new GridLayout(4,1));
        sub_container22211.add(b21=new JButton());  b21.setLayout(new BorderLayout()); b21.add(al21=new JLabel("21"), BorderLayout.NORTH);al21.setFont(f1);al21.setForeground(Color.BLUE);  b21.add(sl21=new JLabel("Sc"), BorderLayout.CENTER);sl21.setHorizontalAlignment(SwingConstants.CENTER);sl21.setForeground(Color.BLUE);sl21.setFont(f2);  b21.add(l21=new JLabel("Scandium"), BorderLayout.SOUTH);l21.setFont(f1);l21.setForeground(Color.BLUE);l21.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22211.add(b39=new JButton());  b39.setLayout(new BorderLayout()); b39.add(al39=new JLabel("39"), BorderLayout.NORTH);al39.setFont(f1);al39.setForeground(Color.BLUE);  b39.add(sl39=new JLabel("Y"), BorderLayout.CENTER);sl39.setHorizontalAlignment(SwingConstants.CENTER);sl39.setForeground(Color.BLUE);sl39.setFont(f2);  b39.add(l39=new JLabel("Yttrium"), BorderLayout.SOUTH);l39.setFont(f1);l39.setForeground(Color.BLUE);l39.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22211.add(b57=new JButton());  b57.setLayout(new BorderLayout()); b57.add(al57=new JLabel("57"), BorderLayout.NORTH);al57.setFont(f1);al57.setForeground(Color.BLUE);  b57.add(sl57=new JLabel("La"), BorderLayout.CENTER);sl57.setHorizontalAlignment(SwingConstants.CENTER);sl57.setForeground(Color.BLUE);sl57.setFont(f2);  b57.add(l57=new JLabel("Lanthanu"), BorderLayout.SOUTH);l57.setFont(f1);l57.setForeground(Color.BLUE);l57.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22211.add(b89=new JButton());  b89.setLayout(new BorderLayout()); b89.add(al89=new JLabel("89"), BorderLayout.NORTH);al89.setFont(f1);al89.setForeground(Color.BLUE);  b89.add(sl89=new JLabel("Ac"), BorderLayout.CENTER);sl89.setHorizontalAlignment(SwingConstants.CENTER);sl89.setForeground(Color.BLUE);sl89.setFont(f2);  b89.add(l89=new JLabel("Actinium"), BorderLayout.SOUTH);l89.setFont(f1);l89.setForeground(Color.BLUE);l89.setHorizontalAlignment(SwingConstants.CENTER);
       
        
        
        //second sub_container222 components   Group 4
        sub_container2221.add(p40=new JPanel());p40.setLayout(new BorderLayout());p40.setBackground(Color.GREEN);
        p40.add(group4=new JLabel("4"), BorderLayout.NORTH);group4.setHorizontalAlignment(SwingConstants.CENTER);
        p40.add(sub_container22212=new JPanel());sub_container22212.setLayout(new GridLayout(4,1));
        sub_container22212.add(b22=new JButton());  b22.setLayout(new BorderLayout()); b22.add(al22=new JLabel("22"), BorderLayout.NORTH);al22.setFont(f1);al22.setForeground(Color.BLUE);  b22.add(sl22=new JLabel("Ti"), BorderLayout.CENTER);sl22.setHorizontalAlignment(SwingConstants.CENTER);sl22.setForeground(Color.BLUE);sl22.setFont(f2);  b22.add(l22=new JLabel("Titanium"), BorderLayout.SOUTH);l22.setFont(f1);l22.setForeground(Color.BLUE);l22.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22212.add(b40=new JButton());  b40.setLayout(new BorderLayout()); b40.add(al40=new JLabel("40"), BorderLayout.NORTH);al40.setFont(f1);al40.setForeground(Color.BLUE);  b40.add(sl40=new JLabel("Zr"), BorderLayout.CENTER);sl40.setHorizontalAlignment(SwingConstants.CENTER);sl40.setForeground(Color.BLUE);sl40.setFont(f2);  b40.add(l40=new JLabel("Zirconium"), BorderLayout.SOUTH);l40.setFont(f1);l40.setForeground(Color.BLUE);l40.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22212.add(b72=new JButton()); b72.setLayout(new BorderLayout()); b72.add(al72=new JLabel("72"), BorderLayout.NORTH);al72.setFont(f1);al72.setForeground(Color.BLUE);  b72.add(sl72=new JLabel("Hf"), BorderLayout.CENTER);sl72.setHorizontalAlignment(SwingConstants.CENTER);sl72.setForeground(Color.BLUE);sl72.setFont(f2);  b72.add(l72=new JLabel("Hafnium"), BorderLayout.SOUTH);l72.setFont(f1);l72.setForeground(Color.BLUE);l72.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22212.add(b104=new JButton());  b104.setLayout(new BorderLayout()); b104.add(al104=new JLabel("104"), BorderLayout.NORTH);al104.setFont(f1);al104.setForeground(Color.BLUE);  b104.add(sl104=new JLabel("Rf"), BorderLayout.CENTER);sl104.setHorizontalAlignment(SwingConstants.CENTER);sl104.setForeground(Color.BLUE);sl104.setFont(f2);  b104.add(l104=new JLabel("Rutherfor"), BorderLayout.SOUTH);l104.setFont(f1);l104.setForeground(Color.BLUE);l104.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        
        //Third sub_container222 components   Group 5
        sub_container2221.add(p50=new JPanel());p50.setLayout(new BorderLayout());p50.setBackground(Color.GREEN);
        p50.add(group5=new JLabel("5"), BorderLayout.NORTH);group5.setHorizontalAlignment(SwingConstants.CENTER);
        p50.add(sub_container22213=new JPanel());sub_container22213.setLayout(new GridLayout(4,1));
        sub_container22213.add(b23=new JButton());  b23.setLayout(new BorderLayout()); b23.add(al23=new JLabel("23"), BorderLayout.NORTH);al23.setFont(f1);al23.setForeground(Color.BLUE);  b23.add(sl23=new JLabel("V"), BorderLayout.CENTER);sl23.setHorizontalAlignment(SwingConstants.CENTER);sl23.setForeground(Color.BLUE);sl23.setFont(f2);  b23.add(l23=new JLabel("Vanadium"), BorderLayout.SOUTH);l23.setFont(f1);l23.setForeground(Color.BLUE);l23.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22213.add(b41=new JButton());  b41.setLayout(new BorderLayout()); b41.add(al41=new JLabel("41"), BorderLayout.NORTH);al41.setFont(f1);al41.setForeground(Color.BLUE);  b41.add(sl41=new JLabel("Nb"), BorderLayout.CENTER);sl41.setHorizontalAlignment(SwingConstants.CENTER);sl41.setForeground(Color.BLUE);sl41.setFont(f2);  b41.add(l41=new JLabel("Niobium"), BorderLayout.SOUTH);l41.setFont(f1);l41.setForeground(Color.BLUE);l41.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22213.add(b73=new JButton()); b73.setLayout(new BorderLayout()); b73.add(al73=new JLabel("73"), BorderLayout.NORTH);al73.setFont(f1);al73.setForeground(Color.BLUE);  b73.add(sl73=new JLabel("Ta"), BorderLayout.CENTER);sl73.setHorizontalAlignment(SwingConstants.CENTER);sl73.setForeground(Color.BLUE);sl73.setFont(f2);  b73.add(l73=new JLabel("Tantalum"), BorderLayout.SOUTH);l73.setFont(f1);l73.setForeground(Color.BLUE);l73.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22213.add(b105=new JButton());  b105.setLayout(new BorderLayout()); b105.add(al105=new JLabel("105"), BorderLayout.NORTH);al105.setFont(f1);al105.setForeground(Color.BLUE);  b105.add(sl105=new JLabel("Db"), BorderLayout.CENTER);sl105.setHorizontalAlignment(SwingConstants.CENTER);sl105.setForeground(Color.BLUE);sl105.setFont(f2);  b105.add(l105=new JLabel("Dubnium"), BorderLayout.SOUTH);l105.setFont(f1);l105.setForeground(Color.BLUE);l105.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        
        //Fourth sub_container222 components   Group 6
        sub_container2221.add(p60=new JPanel());p60.setLayout(new BorderLayout());p60.setBackground(Color.GREEN);
        p60.add(group6=new JLabel("6"), BorderLayout.NORTH);group6.setHorizontalAlignment(SwingConstants.CENTER);
        p60.add(sub_container22214=new JPanel());sub_container22214.setLayout(new GridLayout(4,1));
        sub_container22214.add(b24=new JButton());  b24.setLayout(new BorderLayout()); b24.add(al24=new JLabel("24"), BorderLayout.NORTH);al24.setFont(f1);al24.setForeground(Color.BLUE);  b24.add(sl24=new JLabel("Cr"), BorderLayout.CENTER);sl24.setHorizontalAlignment(SwingConstants.CENTER);sl24.setForeground(Color.BLUE);sl24.setFont(f2);  b24.add(l24=new JLabel("Chromium"), BorderLayout.SOUTH);l24.setFont(f1);l24.setForeground(Color.BLUE);l24.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22214.add(b42=new JButton());  b42.setLayout(new BorderLayout()); b42.add(al42=new JLabel("42"), BorderLayout.NORTH);al42.setFont(f1);al42.setForeground(Color.BLUE);  b42.add(sl42=new JLabel("Mo"), BorderLayout.CENTER);sl42.setHorizontalAlignment(SwingConstants.CENTER);sl42.setForeground(Color.BLUE);sl42.setFont(f2);  b42.add(l42=new JLabel("Molybdeni"), BorderLayout.SOUTH);l42.setFont(f1);l42.setForeground(Color.BLUE);l42.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22214.add(b74=new JButton()); b74.setLayout(new BorderLayout()); b74.add(al74=new JLabel("74"), BorderLayout.NORTH);al74.setFont(f1);al74.setForeground(Color.BLUE);  b74.add(sl74=new JLabel("W"), BorderLayout.CENTER);sl74.setHorizontalAlignment(SwingConstants.CENTER);sl74.setForeground(Color.BLUE);sl74.setFont(f2);  b74.add(l74=new JLabel("Tungsten"), BorderLayout.SOUTH);l74.setFont(f1);l74.setForeground(Color.BLUE);l74.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22214.add(b106=new JButton());  b106.setLayout(new BorderLayout()); b106.add(al106=new JLabel("106"), BorderLayout.NORTH);al106.setFont(f1);al106.setForeground(Color.BLUE);  b106.add(sl106=new JLabel("Sg"), BorderLayout.CENTER);sl106.setHorizontalAlignment(SwingConstants.CENTER);sl106.setForeground(Color.BLUE);sl106.setFont(f2);  b106.add(l106=new JLabel("Seaborgi"), BorderLayout.SOUTH);l106.setFont(f1);l106.setForeground(Color.BLUE);l106.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        
        //fifth sub_container222 components   Group 7
        sub_container2221.add(p70=new JPanel());p70.setLayout(new BorderLayout());p70.setBackground(Color.GREEN);
        p70.add(group7=new JLabel("7"), BorderLayout.NORTH);group7.setHorizontalAlignment(SwingConstants.CENTER);
        p70.add(sub_container22215=new JPanel());sub_container22215.setLayout(new GridLayout(4,1));
        sub_container22215.add(b25=new JButton());  b25.setLayout(new BorderLayout()); b25.add(al25=new JLabel("25"), BorderLayout.NORTH);al25.setFont(f1);al25.setForeground(Color.BLUE);  b25.add(sl25=new JLabel("Mn"), BorderLayout.CENTER);sl25.setHorizontalAlignment(SwingConstants.CENTER);sl25.setForeground(Color.BLUE);sl25.setFont(f2);  b25.add(l25=new JLabel("Manganes"), BorderLayout.SOUTH);l25.setFont(f1);l25.setForeground(Color.BLUE);l25.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22215.add(b43=new JButton());  b43.setLayout(new BorderLayout()); b43.add(al43=new JLabel("43"), BorderLayout.NORTH);al43.setFont(f1);al43.setForeground(Color.BLUE);  b43.add(sl43=new JLabel("Tc"), BorderLayout.CENTER);sl43.setHorizontalAlignment(SwingConstants.CENTER);sl43.setForeground(Color.BLUE);sl43.setFont(f2);  b43.add(l43=new JLabel("Technet"), BorderLayout.SOUTH);l43.setFont(f1);l43.setForeground(Color.BLUE);l43.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22215.add(b75=new JButton()); b75.setLayout(new BorderLayout()); b75.add(al75=new JLabel("75"), BorderLayout.NORTH);al75.setFont(f1);al75.setForeground(Color.BLUE);  b75.add(sl75=new JLabel("Re"), BorderLayout.CENTER);sl75.setHorizontalAlignment(SwingConstants.CENTER);sl75.setForeground(Color.BLUE);sl75.setFont(f2);  b75.add(l75=new JLabel("Rhenium"), BorderLayout.SOUTH);l75.setFont(f1);l75.setForeground(Color.BLUE);l75.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22215.add(b107=new JButton());  b107.setLayout(new BorderLayout()); b107.add(al107=new JLabel("107"), BorderLayout.NORTH);al107.setFont(f1);al107.setForeground(Color.BLUE);  b107.add(sl107=new JLabel("Bh"), BorderLayout.CENTER);sl107.setHorizontalAlignment(SwingConstants.CENTER);sl107.setForeground(Color.BLUE);sl107.setFont(f2);  b107.add(l107=new JLabel("Bohrium"), BorderLayout.SOUTH);l107.setFont(f1);l107.setForeground(Color.BLUE);l107.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        //sixth sub_container222 components   Group 8
        sub_container2221.add(p80=new JPanel());p80.setLayout(new BorderLayout());p80.setBackground(Color.GREEN);
        p80.add(group8=new JLabel("8"), BorderLayout.NORTH);group8.setHorizontalAlignment(SwingConstants.CENTER);
        p80.add(sub_container22216=new JPanel());sub_container22216.setLayout(new GridLayout(4,1));
        sub_container22216.add(b26=new JButton());  b26.setLayout(new BorderLayout()); b26.add(al26=new JLabel("26"), BorderLayout.NORTH);al26.setFont(f1);al26.setForeground(Color.BLUE);  b26.add(sl26=new JLabel("Fe"), BorderLayout.CENTER);sl26.setHorizontalAlignment(SwingConstants.CENTER);sl26.setForeground(Color.BLUE);sl26.setFont(f2);  b26.add(l26=new JLabel("Iron"), BorderLayout.SOUTH);l26.setFont(f1);l26.setForeground(Color.BLUE);l26.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22216.add(b44=new JButton());  b44.setLayout(new BorderLayout()); b44.add(al44=new JLabel("44"), BorderLayout.NORTH);al44.setFont(f1);al44.setForeground(Color.BLUE);  b44.add(sl44=new JLabel("Ru"), BorderLayout.CENTER);sl44.setHorizontalAlignment(SwingConstants.CENTER);sl44.setForeground(Color.BLUE);sl44.setFont(f2);  b44.add(l44=new JLabel("Rutheni"), BorderLayout.SOUTH);l44.setFont(f1);l44.setForeground(Color.BLUE);l44.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22216.add(b76=new JButton()); b76.setLayout(new BorderLayout()); b76.add(al76=new JLabel("76"), BorderLayout.NORTH);al76.setFont(f1);al76.setForeground(Color.BLUE);  b76.add(sl76=new JLabel("Os"), BorderLayout.CENTER);sl76.setHorizontalAlignment(SwingConstants.CENTER);sl76.setForeground(Color.BLUE);sl76.setFont(f2);  b76.add(l76=new JLabel("Osmium"), BorderLayout.SOUTH);l76.setFont(f1);l76.setForeground(Color.BLUE);l76.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22216.add(b108=new JButton());  b108.setLayout(new BorderLayout()); b108.add(al108=new JLabel("108"), BorderLayout.NORTH);al108.setFont(f1);al108.setForeground(Color.BLUE);  b108.add(sl108=new JLabel("Hs"), BorderLayout.CENTER);sl108.setHorizontalAlignment(SwingConstants.CENTER);sl108.setForeground(Color.BLUE);sl108.setFont(f2);  b108.add(l108=new JLabel("Hassium"), BorderLayout.SOUTH);l108.setFont(f1);l108.setForeground(Color.BLUE);l108.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        //seventh sub_container222 components   Group 9
        sub_container2221.add(p90=new JPanel());p90.setLayout(new BorderLayout());p90.setBackground(Color.GREEN);
        p90.add(group9=new JLabel("9"), BorderLayout.NORTH);group9.setHorizontalAlignment(SwingConstants.CENTER);
        p90.add(sub_container22217=new JPanel());sub_container22217.setLayout(new GridLayout(4,1));
        sub_container22217.add(b27=new JButton());  b27.setLayout(new BorderLayout()); b27.add(al27=new JLabel("27"), BorderLayout.NORTH);al27.setFont(f1);al27.setForeground(Color.BLUE);  b27.add(sl27=new JLabel("Co"), BorderLayout.CENTER);sl27.setHorizontalAlignment(SwingConstants.CENTER);sl27.setForeground(Color.BLUE);sl27.setFont(f2);  b27.add(l27=new JLabel("Cobalt"), BorderLayout.SOUTH);l27.setFont(f1);l27.setForeground(Color.BLUE);l27.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22217.add(b45=new JButton());  b45.setLayout(new BorderLayout()); b45.add(al45=new JLabel("45"), BorderLayout.NORTH);al45.setFont(f1);al45.setForeground(Color.BLUE);  b45.add(sl45=new JLabel("Rh"), BorderLayout.CENTER);sl45.setHorizontalAlignment(SwingConstants.CENTER);sl45.setForeground(Color.BLUE);sl45.setFont(f2);  b45.add(l45=new JLabel("Rhodium"), BorderLayout.SOUTH);l45.setFont(f1);l45.setForeground(Color.BLUE);l45.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22217.add(b77=new JButton()); b77.setLayout(new BorderLayout()); b77.add(al77=new JLabel("77"), BorderLayout.NORTH);al77.setFont(f1);al77.setForeground(Color.BLUE);  b77.add(sl77=new JLabel("Ir"), BorderLayout.CENTER);sl77.setHorizontalAlignment(SwingConstants.CENTER);sl77.setForeground(Color.BLUE);sl77.setFont(f2);  b77.add(l77=new JLabel("Iridium"), BorderLayout.SOUTH);l77.setFont(f1);l77.setForeground(Color.BLUE);l77.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22217.add(b109=new JButton());  b109.setLayout(new BorderLayout()); b109.add(al109=new JLabel("109"), BorderLayout.NORTH);al109.setFont(f1);al109.setForeground(Color.BLUE);  b109.add(sl109=new JLabel("Mt"), BorderLayout.CENTER);sl109.setHorizontalAlignment(SwingConstants.CENTER);sl109.setForeground(Color.BLUE);sl109.setFont(f2);  b109.add(l109=new JLabel("Mettneri"), BorderLayout.SOUTH);l109.setFont(f1);l109.setForeground(Color.BLUE);l109.setHorizontalAlignment(SwingConstants.CENTER);
        
        
      //eight sub_container222 components   Group 10
        sub_container2221.add(p100=new JPanel());p100.setLayout(new BorderLayout());p100.setBackground(Color.GREEN);
        p100.add(group10=new JLabel("10"), BorderLayout.NORTH);group10.setHorizontalAlignment(SwingConstants.CENTER);
        p100.add(sub_container22218=new JPanel());sub_container22218.setLayout(new GridLayout(4,1));
        sub_container22218.add(b28=new JButton());  b28.setLayout(new BorderLayout()); b28.add(al28=new JLabel("28"), BorderLayout.NORTH);al28.setFont(f1);al28.setForeground(Color.BLUE);  b28.add(sl28=new JLabel("Ni"), BorderLayout.CENTER);sl28.setHorizontalAlignment(SwingConstants.CENTER);sl28.setForeground(Color.BLUE);sl28.setFont(f2);  b28.add(l28=new JLabel("Nickel"), BorderLayout.SOUTH);l28.setFont(f1);l28.setForeground(Color.BLUE);l28.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22218.add(b46=new JButton());  b46.setLayout(new BorderLayout()); b46.add(al46=new JLabel("46"), BorderLayout.NORTH);al46.setFont(f1);al46.setForeground(Color.BLUE);  b46.add(sl46=new JLabel("Pd"), BorderLayout.CENTER);sl46.setHorizontalAlignment(SwingConstants.CENTER);sl46.setForeground(Color.BLUE);sl46.setFont(f2);  b46.add(l46=new JLabel("Palladiu"), BorderLayout.SOUTH);l46.setFont(f1);l46.setForeground(Color.BLUE);l46.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22218.add(b78=new JButton()); b78.setLayout(new BorderLayout()); b78.add(al78=new JLabel("78"), BorderLayout.NORTH);al78.setFont(f1);al78.setForeground(Color.BLUE);  b78.add(sl78=new JLabel("Pt"), BorderLayout.CENTER);sl78.setHorizontalAlignment(SwingConstants.CENTER);sl78.setForeground(Color.BLUE);sl78.setFont(f2);  b78.add(l78=new JLabel("Platinum"), BorderLayout.SOUTH);l78.setFont(f1);l78.setForeground(Color.BLUE);l78.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22218.add(b110=new JButton());  b110.setLayout(new BorderLayout()); b110.add(al110=new JLabel("110"), BorderLayout.NORTH);al110.setFont(f1);al110.setForeground(Color.BLUE);  b110.add(sl110=new JLabel("Ds"), BorderLayout.CENTER);sl110.setHorizontalAlignment(SwingConstants.CENTER);sl110.setForeground(Color.BLUE);sl110.setFont(f2);  b110.add(l110=new JLabel("Darmstadt"), BorderLayout.SOUTH);l110.setFont(f1);l110.setForeground(Color.BLUE);l110.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        //ninth sub_container222 components   Group 11
        sub_container2221.add(p110=new JPanel());p110.setLayout(new BorderLayout());p110.setBackground(Color.GREEN);
        p110.add(groupa=new JLabel("11"), BorderLayout.NORTH);groupa.setHorizontalAlignment(SwingConstants.CENTER);
        p110.add(sub_container22219=new JPanel());sub_container22219.setLayout(new GridLayout(4,1));
        sub_container22219.add(b29=new JButton());  b29.setLayout(new BorderLayout()); b29.add(ala=new JLabel("29"), BorderLayout.NORTH);b29.add(sl29=new JLabel("Cu"), BorderLayout.CENTER);b29.add(la=new JLabel("Copper"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl29.setHorizontalAlignment(SwingConstants.CENTER);sl29.setForeground(Color.BLUE);sl29.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22219.add(b47=new JButton());  b47.setLayout(new BorderLayout()); b47.add(ala=new JLabel("47"), BorderLayout.NORTH);b47.add(sl47=new JLabel("Ag"), BorderLayout.CENTER);b47.add(la=new JLabel("Silver"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl47.setHorizontalAlignment(SwingConstants.CENTER);sl47.setForeground(Color.BLUE);sl47.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22219.add(b79=new JButton());  b79.setLayout(new BorderLayout()); b79.add(ala=new JLabel("79"), BorderLayout.NORTH);b79.add(sl79=new JLabel("Au"), BorderLayout.CENTER);b79.add(la=new JLabel("Gold"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl79.setHorizontalAlignment(SwingConstants.CENTER);sl79.setForeground(Color.BLUE);sl79.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container22219.add(b111=new JButton()); b111.setLayout(new BorderLayout()); b111.add(ala=new JLabel("111"), BorderLayout.NORTH);b111.add(sl111=new JLabel("Rg"), BorderLayout.CENTER);b111.add(la=new JLabel("Roentige"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl111.setHorizontalAlignment(SwingConstants.CENTER);sl111.setForeground(Color.BLUE);sl111.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        //tenth sub_container222 components   Group 12
        sub_container2221.add(p120=new JPanel());p120.setLayout(new BorderLayout());p120.setBackground(Color.GREEN);
        p120.add(groupa=new JLabel("12"), BorderLayout.NORTH);groupa.setHorizontalAlignment(SwingConstants.CENTER);
        p120.add(sub_container222110=new JPanel());sub_container222110.setLayout(new GridLayout(4,1));
        sub_container222110.add(b30=new JButton());  b30.setLayout(new BorderLayout()); b30.add(ala=new JLabel("30"), BorderLayout.NORTH);b30.add(sl30=new JLabel("Zn"), BorderLayout.CENTER);b30.add(la=new JLabel("Zinc"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl30.setHorizontalAlignment(SwingConstants.CENTER);sl30.setForeground(Color.BLUE);sl30.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container222110.add(b48=new JButton());  b48.setLayout(new BorderLayout()); b48.add(ala=new JLabel("48"), BorderLayout.NORTH);b48.add(sl48=new JLabel("Cd"), BorderLayout.CENTER);b48.add(la=new JLabel("Cadmium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl48.setHorizontalAlignment(SwingConstants.CENTER);sl48.setForeground(Color.BLUE);sl48.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container222110.add(b80=new JButton());  b80.setLayout(new BorderLayout()); b80.add(ala=new JLabel("80"), BorderLayout.NORTH);b80.add(sl80=new JLabel("Hg"), BorderLayout.CENTER);b80.add(la=new JLabel("Mercury"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLACK); sl80.setHorizontalAlignment(SwingConstants.CENTER);sl80.setForeground(Color.BLACK);sl80.setFont(f2); la.setFont(f1);la.setForeground(Color.BLACK);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container222110.add(b112=new JButton());  b112.setLayout(new BorderLayout()); b112.add(ala=new JLabel("112"), BorderLayout.NORTH);b112.add(sl112=new JLabel("Cn"), BorderLayout.CENTER);b112.add(la=new JLabel("Copernic"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl112.setHorizontalAlignment(SwingConstants.CENTER);sl112.setForeground(Color.BLUE);sl112.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        
        
        
        
      //sub_container23 things   EAST
        sub_container2.add(sub_container23=new JPanel(), BorderLayout.EAST);sub_container23.setLayout(new FlowLayout());sub_container23.setBackground(Color.MAGENTA);
        sub_container23.add(flow= new JPanel());flow.setLayout(new GridLayout(1,6));
        
        
        //Group 13
        flow.add(sub_container23a=new JPanel());sub_container23a.setLayout(new BorderLayout());sub_container23a.setBackground(Color.GREEN);
        sub_container23a.add(groupa=new JLabel("13"), BorderLayout.NORTH);groupa.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23a.add(sub_container23ab=new JPanel());sub_container23ab.setLayout(new GridLayout(7,1));
        sub_container23ab.add(space=new JPanel());space.setBackground(Color.MAGENTA);
        sub_container23ab.add(b5=new JButton());  b5.setLayout(new BorderLayout()); b5.add(ala=new JLabel("5"), BorderLayout.NORTH);b5.add(sl5=new JLabel("B"), BorderLayout.CENTER);b5.add(la=new JLabel("Boron"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl5.setHorizontalAlignment(SwingConstants.CENTER);sl5.setForeground(Color.BLUE);sl5.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b13=new JButton());  b13.setLayout(new BorderLayout()); b13.add(ala=new JLabel("13"), BorderLayout.NORTH);b13.add(sl13=new JLabel("Al"), BorderLayout.CENTER);b13.add(la=new JLabel("Alumini"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl13.setHorizontalAlignment(SwingConstants.CENTER);sl13.setForeground(Color.BLUE);sl13.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b31=new JButton());  b31.setLayout(new BorderLayout()); b31.add(ala=new JLabel("31"), BorderLayout.NORTH);b31.add(sl31=new JLabel("Ga"), BorderLayout.CENTER);b31.add(la=new JLabel("Gallium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl31.setHorizontalAlignment(SwingConstants.CENTER);sl31.setForeground(Color.BLUE);sl31.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b49=new JButton());  b49.setLayout(new BorderLayout()); b49.add(ala=new JLabel("49"), BorderLayout.NORTH);b49.add(sl49=new JLabel("In"), BorderLayout.CENTER);b49.add(la=new JLabel("Indium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl49.setHorizontalAlignment(SwingConstants.CENTER);sl49.setForeground(Color.BLUE);sl49.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b81=new JButton());  b81.setLayout(new BorderLayout()); b81.add(ala=new JLabel("81"), BorderLayout.NORTH);b81.add(sl81=new JLabel("Tl"), BorderLayout.CENTER);b81.add(la=new JLabel("Thallium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl81.setHorizontalAlignment(SwingConstants.CENTER);sl81.setForeground(Color.BLUE);sl81.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b113=new JButton());  b113.setLayout(new BorderLayout()); b113.add(ala=new JLabel("113"), BorderLayout.NORTH);b113.add(sl113=new JLabel("Uut"), BorderLayout.CENTER);b113.add(la=new JLabel("Ununtri"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl113.setHorizontalAlignment(SwingConstants.CENTER);sl113.setForeground(Color.BLUE);sl113.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        //Group 14
        flow.add(sub_container23a=new JPanel());sub_container23a.setLayout(new BorderLayout());sub_container23a.setBackground(Color.GREEN);
        sub_container23a.add(groupa=new JLabel("14"), BorderLayout.NORTH);groupa.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23a.add(sub_container23ab=new JPanel());sub_container23ab.setLayout(new GridLayout(7,1));
        sub_container23ab.add(space=new JPanel());space.setBackground(Color.MAGENTA);
        sub_container23ab.add(b6=new JButton());  b6.setLayout(new BorderLayout()); b6.add(ala=new JLabel("6"), BorderLayout.NORTH);b6.add(sl6=new JLabel("C"), BorderLayout.CENTER);b6.add(la=new JLabel("Carbon"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl6.setHorizontalAlignment(SwingConstants.CENTER);sl6.setForeground(Color.BLUE);sl6.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b14=new JButton());  b14.setLayout(new BorderLayout()); b14.add(ala=new JLabel("14"), BorderLayout.NORTH);b14.add(sl14=new JLabel("Si"), BorderLayout.CENTER);b14.add(la=new JLabel("Silicon"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl14.setHorizontalAlignment(SwingConstants.CENTER);sl14.setForeground(Color.BLUE);sl14.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b32=new JButton());  b32.setLayout(new BorderLayout()); b32.add(ala=new JLabel("32"), BorderLayout.NORTH);b32.add(sl32=new JLabel("Ge"), BorderLayout.CENTER);b32.add(la=new JLabel("Germani"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl32.setHorizontalAlignment(SwingConstants.CENTER);sl32.setForeground(Color.BLUE);sl32.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b50=new JButton());  b50.setLayout(new BorderLayout()); b50.add(ala=new JLabel("50"), BorderLayout.NORTH);b50.add(sl50=new JLabel("Sn"), BorderLayout.CENTER);b50.add(la=new JLabel("Tin"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl50.setHorizontalAlignment(SwingConstants.CENTER);sl50.setForeground(Color.BLUE);sl50.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b82=new JButton());  b82.setLayout(new BorderLayout()); b82.add(ala=new JLabel("82"), BorderLayout.NORTH);b82.add(sl82=new JLabel("Pb"), BorderLayout.CENTER);b82.add(la=new JLabel("Lead"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl82.setHorizontalAlignment(SwingConstants.CENTER);sl82.setForeground(Color.BLUE);sl82.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b114=new JButton());  b114.setLayout(new BorderLayout()); b114.add(ala=new JLabel("114"), BorderLayout.NORTH);b114.add(sl114=new JLabel("Fl"), BorderLayout.CENTER);b114.add(la=new JLabel("Flerovi"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl114.setHorizontalAlignment(SwingConstants.CENTER);sl114.setForeground(Color.BLUE);sl114.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        
       
        //Group 15
        flow.add(sub_container23a=new JPanel());sub_container23a.setLayout(new BorderLayout());sub_container23a.setBackground(Color.GREEN);
        sub_container23a.add(groupa=new JLabel("15"), BorderLayout.NORTH);groupa.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23a.add(sub_container23ab=new JPanel());sub_container23ab.setLayout(new GridLayout(7,1));
        sub_container23ab.add(space=new JPanel());space.setBackground(Color.MAGENTA);
        sub_container23ab.add(b7=new JButton());  b7.setLayout(new BorderLayout()); b7.add(ala=new JLabel("7"), BorderLayout.NORTH);b7.add(sl7=new JLabel("N"), BorderLayout.CENTER);b7.add(la=new JLabel("Nitrogen"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl7.setHorizontalAlignment(SwingConstants.CENTER);sl7.setForeground(Color.RED);sl7.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b15=new JButton());  b15.setLayout(new BorderLayout()); b15.add(ala=new JLabel("15"), BorderLayout.NORTH);b15.add(sl15=new JLabel("P"), BorderLayout.CENTER);b15.add(la=new JLabel("Phosphor"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl15.setHorizontalAlignment(SwingConstants.CENTER);sl15.setForeground(Color.BLUE);sl15.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b33=new JButton());  b33.setLayout(new BorderLayout()); b33.add(ala=new JLabel("33"), BorderLayout.NORTH);b33.add(sl33=new JLabel("As"), BorderLayout.CENTER);b33.add(la=new JLabel("Arsenic"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl33.setHorizontalAlignment(SwingConstants.CENTER);sl33.setForeground(Color.BLUE);sl33.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b51=new JButton());  b51.setLayout(new BorderLayout()); b51.add(ala=new JLabel("51"), BorderLayout.NORTH);b51.add(sl51=new JLabel("Sb"), BorderLayout.CENTER);b51.add(la=new JLabel("Antimony"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl51.setHorizontalAlignment(SwingConstants.CENTER);sl51.setForeground(Color.BLUE);sl51.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b83=new JButton());  b83.setLayout(new BorderLayout()); b83.add(ala=new JLabel("83"), BorderLayout.NORTH);b83.add(sl83=new JLabel("Bi"), BorderLayout.CENTER);b83.add(la=new JLabel("Bismuth"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl83.setHorizontalAlignment(SwingConstants.CENTER);sl83.setForeground(Color.BLUE);sl83.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b115=new JButton());  b115.setLayout(new BorderLayout()); b115.add(ala=new JLabel("115"), BorderLayout.NORTH);b115.add(sl115=new JLabel("Uup"), BorderLayout.CENTER);b115.add(la=new JLabel("Ununpent"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl115.setHorizontalAlignment(SwingConstants.CENTER);sl115.setForeground(Color.BLUE);sl115.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        //Group 16
        flow.add(sub_container23a=new JPanel());sub_container23a.setLayout(new BorderLayout());sub_container23a.setBackground(Color.GREEN);
        sub_container23a.add(groupa=new JLabel("16"), BorderLayout.NORTH);groupa.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23a.add(sub_container23ab=new JPanel());sub_container23ab.setLayout(new GridLayout(7,1));
        sub_container23ab.add(space=new JPanel());space.setBackground(Color.MAGENTA);
        sub_container23ab.add(b8=new JButton());  b8.setLayout(new BorderLayout()); b8.add(ala=new JLabel("8"), BorderLayout.NORTH);b8.add(sl8=new JLabel("O"), BorderLayout.CENTER);b8.add(la=new JLabel("Oxygen"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl8.setHorizontalAlignment(SwingConstants.CENTER);sl8.setForeground(Color.RED);sl8.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b16=new JButton());  b16.setLayout(new BorderLayout()); b16.add(ala=new JLabel("16"), BorderLayout.NORTH);b16.add(sl16=new JLabel("S"), BorderLayout.CENTER);b16.add(la=new JLabel("Sulphur"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl16.setHorizontalAlignment(SwingConstants.CENTER);sl16.setForeground(Color.BLUE);sl16.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b34=new JButton());  b34.setLayout(new BorderLayout()); b34.add(ala=new JLabel("34"), BorderLayout.NORTH);b34.add(sl34=new JLabel("Se"), BorderLayout.CENTER);b34.add(la=new JLabel("Selenium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl34.setHorizontalAlignment(SwingConstants.CENTER);sl34.setForeground(Color.BLUE);sl34.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b52=new JButton());  b52.setLayout(new BorderLayout()); b52.add(ala=new JLabel("52"), BorderLayout.NORTH);b52.add(sl52=new JLabel("Te"), BorderLayout.CENTER);b52.add(la=new JLabel("Telluri"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl52.setHorizontalAlignment(SwingConstants.CENTER);sl52.setForeground(Color.BLUE);sl52.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b84=new JButton());  b84.setLayout(new BorderLayout()); b84.add(ala=new JLabel("84"), BorderLayout.NORTH);b84.add(sl84=new JLabel("Po"), BorderLayout.CENTER);b84.add(la=new JLabel("Polonium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl84.setHorizontalAlignment(SwingConstants.CENTER);sl84.setForeground(Color.BLUE);sl84.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b116=new JButton());  b116.setLayout(new BorderLayout()); b116.add(ala=new JLabel("116"), BorderLayout.NORTH);b116.add(sl116=new JLabel("Lv"), BorderLayout.CENTER);b116.add(la=new JLabel("Livermor"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl116.setHorizontalAlignment(SwingConstants.CENTER);sl116.setForeground(Color.BLUE);sl116.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
   
        
        //Group 17
        flow.add(sub_container23a=new JPanel());sub_container23a.setLayout(new BorderLayout());sub_container23a.setBackground(Color.GREEN);
        sub_container23a.add(groupa=new JLabel("17"), BorderLayout.NORTH);groupa.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23a.add(sub_container23ab=new JPanel());sub_container23ab.setLayout(new GridLayout(7,1));
        sub_container23ab.add(space=new JPanel());space.setBackground(Color.MAGENTA);
        sub_container23ab.add(b9=new JButton());  b9.setLayout(new BorderLayout()); b9.add(ala=new JLabel("9"), BorderLayout.NORTH);b9.add(sl9=new JLabel("F"), BorderLayout.CENTER);b9.add(la=new JLabel("Fluorine"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl9.setHorizontalAlignment(SwingConstants.CENTER);sl9.setForeground(Color.RED);sl9.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b17=new JButton());  b17.setLayout(new BorderLayout()); b17.add(ala=new JLabel("17"), BorderLayout.NORTH);b17.add(sl17=new JLabel("Cl"), BorderLayout.CENTER);b17.add(la=new JLabel("Chlorine"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl17.setHorizontalAlignment(SwingConstants.CENTER);sl17.setForeground(Color.RED);sl17.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b35=new JButton());  b35.setLayout(new BorderLayout()); b35.add(ala=new JLabel("35"), BorderLayout.NORTH);b35.add(sl35=new JLabel("Br"), BorderLayout.CENTER);b35.add(la=new JLabel("Bromine"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLACK); sl35.setHorizontalAlignment(SwingConstants.CENTER);sl35.setForeground(Color.BLACK);sl35.setFont(f2); la.setFont(f1);la.setForeground(Color.BLACK);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b53=new JButton());  b53.setLayout(new BorderLayout()); b53.add(ala=new JLabel("53"), BorderLayout.NORTH);b53.add(sl53=new JLabel("I"), BorderLayout.CENTER);b53.add(la=new JLabel("Iodine"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl53.setHorizontalAlignment(SwingConstants.CENTER);sl53.setForeground(Color.BLUE);sl53.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b85=new JButton());  b85.setLayout(new BorderLayout()); b85.add(ala=new JLabel("85"), BorderLayout.NORTH);b85.add(sl85=new JLabel("At"), BorderLayout.CENTER);b85.add(la=new JLabel("Astatine"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl85.setHorizontalAlignment(SwingConstants.CENTER);sl85.setForeground(Color.BLUE);sl85.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b117=new JButton());  b117.setLayout(new BorderLayout()); b117.add(ala=new JLabel("117"), BorderLayout.NORTH);b117.add(sl117=new JLabel("Uus"), BorderLayout.CENTER);b117.add(la=new JLabel("Ununsept"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl117.setHorizontalAlignment(SwingConstants.CENTER);sl117.setForeground(Color.BLUE);sl117.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
        
        
      //Group 18
        flow.add(sub_container23a=new JPanel());sub_container23a.setLayout(new BorderLayout());sub_container23a.setBackground(Color.GREEN);
        sub_container23a.add(groupa=new JLabel("18"), BorderLayout.NORTH);groupa.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23a.add(sub_container23ab=new JPanel());sub_container23ab.setLayout(new GridLayout(7,1));
        sub_container23ab.add(b2=new JButton());  b2.setLayout(new BorderLayout()); b2.add(ala=new JLabel("2"), BorderLayout.NORTH);b2.add(sl2=new JLabel("He"), BorderLayout.CENTER);b2.add(la=new JLabel("Helium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl2.setHorizontalAlignment(SwingConstants.CENTER);sl2.setForeground(Color.RED);sl2.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b10=new JButton());  b10.setLayout(new BorderLayout()); b10.add(ala=new JLabel("10"), BorderLayout.NORTH);b10.add(sl10=new JLabel("Ne"), BorderLayout.CENTER);b10.add(la=new JLabel("Neon"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl10.setHorizontalAlignment(SwingConstants.CENTER);sl10.setForeground(Color.RED);sl10.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b18=new JButton());  b18.setLayout(new BorderLayout()); b18.add(ala=new JLabel("18"), BorderLayout.NORTH);b18.add(sl18=new JLabel("Ar"), BorderLayout.CENTER);b18.add(la=new JLabel("Argon"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl18.setHorizontalAlignment(SwingConstants.CENTER);sl18.setForeground(Color.RED);sl18.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b36=new JButton());  b36.setLayout(new BorderLayout()); b36.add(ala=new JLabel("36"), BorderLayout.NORTH);b36.add(sl36=new JLabel("Kr"), BorderLayout.CENTER);b36.add(la=new JLabel("Krypton"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl36.setHorizontalAlignment(SwingConstants.CENTER);sl36.setForeground(Color.RED);sl36.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b54=new JButton());  b54.setLayout(new BorderLayout()); b54.add(ala=new JLabel("54"), BorderLayout.NORTH);b54.add(sl54=new JLabel("Xe"), BorderLayout.CENTER);b54.add(la=new JLabel("Xenon"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl54.setHorizontalAlignment(SwingConstants.CENTER);sl54.setForeground(Color.RED);sl54.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b86=new JButton());  b86.setLayout(new BorderLayout()); b86.add(ala=new JLabel("86"), BorderLayout.NORTH);b86.add(sl86=new JLabel("Rn"), BorderLayout.CENTER);b86.add(la=new JLabel("Radon"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl86.setHorizontalAlignment(SwingConstants.CENTER);sl86.setForeground(Color.RED);sl86.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
        sub_container23ab.add(b118=new JButton());  b118.setLayout(new BorderLayout()); b118.add(ala=new JLabel("118"), BorderLayout.NORTH);b118.add(sl118=new JLabel("Uuo"), BorderLayout.CENTER);b118.add(la=new JLabel("Ununoct"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.RED); sl118.setHorizontalAlignment(SwingConstants.CENTER);sl118.setForeground(Color.RED);sl118.setFont(f2); la.setFont(f1);la.setForeground(Color.RED);la.setHorizontalAlignment(SwingConstants.CENTER);
    
        
        
        
        
      
        
        
        sub_container2.add(flows=new JPanel(), BorderLayout.SOUTH);flows.setLayout(new BorderLayout());
        flows.setBackground(Color.MAGENTA);flows.add(flow=new JPanel(), BorderLayout.EAST);flow.setLayout(new FlowLayout());flow.setBackground(Color.MAGENTA);
      
        
        
		
		flow.add(flow=new JPanel());flow.setLayout(new FlowLayout());flow.setBackground(Color.GREEN);
		
		flow.add(sub_container24=new JPanel());sub_container24.setLayout(new BorderLayout());
		sub_container24.add(sub_container24a=new JPanel(), BorderLayout.WEST);sub_container24a.setLayout(new GridLayout(4,1));sub_container24a.setBackground(Color.MAGENTA);
		sub_container24.add(sub_container24b=new JPanel(), BorderLayout.EAST);sub_container24b.setLayout(new GridLayout(2,14));
		
		
		
		//Lanthanide Series
		sub_container24a.add(label=new JLabel("LANTHANIDE"));label.setBorder(BorderFactory.createLineBorder(Color.GREEN));label.setFont(new Font("Courier", Font.BOLD, 12));label.setForeground(Color.WHITE);
		sub_container24a.add(label=new JLabel("SERIES"));label.setBorder(BorderFactory.createLineBorder(Color.GREEN));label.setHorizontalAlignment(SwingConstants.CENTER);label.setFont(new Font("Courier", Font.BOLD, 12));label.setForeground(Color.WHITE);
		sub_container24b.add(b58=new JButton());  b58.setLayout(new BorderLayout()); b58.add(ala=new JLabel("58"), BorderLayout.NORTH);b58.add(sl58=new JLabel("Ce"), BorderLayout.CENTER);b58.add(la=new JLabel("Cerium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl58.setHorizontalAlignment(SwingConstants.CENTER);sl58.setForeground(Color.BLUE);sl58.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b59=new JButton());  b59.setLayout(new BorderLayout()); b59.add(ala=new JLabel("59"), BorderLayout.NORTH);b59.add(sl59=new JLabel("Pr"), BorderLayout.CENTER);b59.add(la=new JLabel("Praseody"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl59.setHorizontalAlignment(SwingConstants.CENTER);sl59.setForeground(Color.BLUE);sl59.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b60=new JButton());  b60.setLayout(new BorderLayout()); b60.add(ala=new JLabel("60"), BorderLayout.NORTH);b60.add(sl60=new JLabel("Nd"), BorderLayout.CENTER);b60.add(la=new JLabel("Neodymium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl60.setHorizontalAlignment(SwingConstants.CENTER);sl60.setForeground(Color.BLUE);sl60.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b61=new JButton());  b61.setLayout(new BorderLayout()); b61.add(ala=new JLabel("61"), BorderLayout.NORTH);b61.add(sl61=new JLabel("Pm"), BorderLayout.CENTER);b61.add(la=new JLabel("Promethium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl61.setHorizontalAlignment(SwingConstants.CENTER);sl61.setForeground(Color.BLUE);sl61.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b62=new JButton());  b62.setLayout(new BorderLayout()); b62.add(ala=new JLabel("62"), BorderLayout.NORTH);b62.add(sl62=new JLabel("Sm"), BorderLayout.CENTER);b62.add(la=new JLabel("Samarium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl62.setHorizontalAlignment(SwingConstants.CENTER);sl62.setForeground(Color.BLUE);sl62.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b63=new JButton());  b63.setLayout(new BorderLayout()); b63.add(ala=new JLabel("63"), BorderLayout.NORTH);b63.add(sl63=new JLabel("Eu"), BorderLayout.CENTER);b63.add(la=new JLabel("Europium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl63.setHorizontalAlignment(SwingConstants.CENTER);sl63.setForeground(Color.BLUE);sl63.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b64=new JButton());  b64.setLayout(new BorderLayout()); b64.add(ala=new JLabel("64"), BorderLayout.NORTH);b64.add(sl64=new JLabel("Gd"), BorderLayout.CENTER);b64.add(la=new JLabel("Gadolinium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl64.setHorizontalAlignment(SwingConstants.CENTER);sl64.setForeground(Color.BLUE);sl64.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b65=new JButton());  b65.setLayout(new BorderLayout()); b65.add(ala=new JLabel("65"), BorderLayout.NORTH);b65.add(sl65=new JLabel("Tb"), BorderLayout.CENTER);b65.add(la=new JLabel("Terbium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl65.setHorizontalAlignment(SwingConstants.CENTER);sl65.setForeground(Color.BLUE);sl65.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b66=new JButton());  b66.setLayout(new BorderLayout()); b66.add(ala=new JLabel("66"), BorderLayout.NORTH);b66.add(sl66=new JLabel("Dy"), BorderLayout.CENTER);b66.add(la=new JLabel("Dysprosium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl66.setHorizontalAlignment(SwingConstants.CENTER);sl66.setForeground(Color.BLUE);sl66.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b67=new JButton());  b67.setLayout(new BorderLayout()); b67.add(ala=new JLabel("67"), BorderLayout.NORTH);b67.add(sl67=new JLabel("Ho"), BorderLayout.CENTER);b67.add(la=new JLabel("Holmium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl67.setHorizontalAlignment(SwingConstants.CENTER);sl67.setForeground(Color.BLUE);sl67.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b68=new JButton());  b68.setLayout(new BorderLayout()); b68.add(ala=new JLabel("68"), BorderLayout.NORTH);b68.add(sl68=new JLabel("Er"), BorderLayout.CENTER);b68.add(la=new JLabel("Erbium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl68.setHorizontalAlignment(SwingConstants.CENTER);sl68.setForeground(Color.BLUE);sl68.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b69=new JButton());  b69.setLayout(new BorderLayout()); b69.add(ala=new JLabel("69"), BorderLayout.NORTH);b69.add(sl69=new JLabel("Tm"), BorderLayout.CENTER);b69.add(la=new JLabel("Thulium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl69.setHorizontalAlignment(SwingConstants.CENTER);sl69.setForeground(Color.BLUE);sl69.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b70=new JButton());  b70.setLayout(new BorderLayout()); b70.add(ala=new JLabel("70"), BorderLayout.NORTH);b70.add(sl70=new JLabel("Yb"), BorderLayout.CENTER);b70.add(la=new JLabel("Ytterbium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl70.setHorizontalAlignment(SwingConstants.CENTER);sl70.setForeground(Color.BLUE);sl70.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b71=new JButton());  b71.setLayout(new BorderLayout()); b71.add(ala=new JLabel("71"), BorderLayout.NORTH);b71.add(sl71=new JLabel("Lu"), BorderLayout.CENTER);b71.add(la=new JLabel("Luthenium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl71.setHorizontalAlignment(SwingConstants.CENTER);sl71.setForeground(Color.BLUE);sl71.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		sub_container24a.add(label=new JLabel("ACTINIDE"));label.setBorder(BorderFactory.createLineBorder(Color.GREEN));label.setFont(new Font("Courier", Font.BOLD, 12));label.setHorizontalAlignment(SwingConstants.CENTER);label.setForeground(Color.WHITE);
		sub_container24a.add(label=new JLabel("SERIES"));label.setBorder(BorderFactory.createLineBorder(Color.GREEN));label.setHorizontalAlignment(SwingConstants.CENTER);label.setFont(new Font("Courier", Font.BOLD, 12));label.setForeground(Color.WHITE);
		
		//Actinide Series
		sub_container24b.add(b90=new JButton());  b90.setLayout(new BorderLayout()); b90.add(ala=new JLabel("90"), BorderLayout.NORTH);b90.add(sl90=new JLabel("Th"), BorderLayout.CENTER);b90.add(la=new JLabel("Thorium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl90.setHorizontalAlignment(SwingConstants.CENTER);sl90.setForeground(Color.BLUE);sl90.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b91=new JButton());  b91.setLayout(new BorderLayout()); b91.add(ala=new JLabel("91"), BorderLayout.NORTH);b91.add(sl91=new JLabel("Pa"), BorderLayout.CENTER);b91.add(la=new JLabel("Protactium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl91.setHorizontalAlignment(SwingConstants.CENTER);sl91.setForeground(Color.BLUE);sl91.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b92=new JButton());  b92.setLayout(new BorderLayout()); b92.add(ala=new JLabel("92"), BorderLayout.NORTH);b92.add(sl92=new JLabel("U"), BorderLayout.CENTER);b92.add(la=new JLabel("Uranium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl92.setHorizontalAlignment(SwingConstants.CENTER);sl92.setForeground(Color.BLUE);sl92.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b93=new JButton());  b93.setLayout(new BorderLayout()); b93.add(ala=new JLabel("93"), BorderLayout.NORTH);b93.add(sl93=new JLabel("Np"), BorderLayout.CENTER);b93.add(la=new JLabel("Neptunium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl93.setHorizontalAlignment(SwingConstants.CENTER);sl93.setForeground(Color.BLUE);sl93.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b94=new JButton());  b94.setLayout(new BorderLayout()); b94.add(ala=new JLabel("94"), BorderLayout.NORTH);b94.add(sl94=new JLabel("Pu"), BorderLayout.CENTER);b94.add(la=new JLabel("Plutonium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl94.setHorizontalAlignment(SwingConstants.CENTER);sl94.setForeground(Color.BLUE);sl94.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b95=new JButton());  b95.setLayout(new BorderLayout()); b95.add(ala=new JLabel("95"), BorderLayout.NORTH);b95.add(sl95=new JLabel("Am"), BorderLayout.CENTER);b95.add(la=new JLabel("Americium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl95.setHorizontalAlignment(SwingConstants.CENTER);sl95.setForeground(Color.BLUE);sl95.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b96=new JButton());  b96.setLayout(new BorderLayout()); b96.add(ala=new JLabel("96"), BorderLayout.NORTH);b96.add(sl96=new JLabel("Cm"), BorderLayout.CENTER);b96.add(la=new JLabel("Curium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl96.setHorizontalAlignment(SwingConstants.CENTER);sl96.setForeground(Color.BLUE);sl96.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b97=new JButton());  b97.setLayout(new BorderLayout()); b97.add(ala=new JLabel("97"), BorderLayout.NORTH);b97.add(sl97=new JLabel("Bk"), BorderLayout.CENTER);b97.add(la=new JLabel("Berkelium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl97.setHorizontalAlignment(SwingConstants.CENTER);sl97.setForeground(Color.BLUE);sl97.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b98=new JButton());  b98.setLayout(new BorderLayout()); b98.add(ala=new JLabel("98"), BorderLayout.NORTH);b98.add(sl98=new JLabel("Cf"), BorderLayout.CENTER);b98.add(la=new JLabel("Carliforni"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl98.setHorizontalAlignment(SwingConstants.CENTER);sl98.setForeground(Color.BLUE);sl98.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b99=new JButton());  b99.setLayout(new BorderLayout()); b99.add(ala=new JLabel("99"), BorderLayout.NORTH);b99.add(sl99=new JLabel("Es"), BorderLayout.CENTER);b99.add(la=new JLabel("Einsteini"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl99.setHorizontalAlignment(SwingConstants.CENTER);sl99.setForeground(Color.BLUE);sl99.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b100=new JButton());  b100.setLayout(new BorderLayout()); b100.add(ala=new JLabel("100"), BorderLayout.NORTH);b100.add(sl100=new JLabel("Fm"), BorderLayout.CENTER);b100.add(la=new JLabel("Fermium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl100.setHorizontalAlignment(SwingConstants.CENTER);sl100.setForeground(Color.BLUE);sl100.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b101=new JButton());  b101.setLayout(new BorderLayout()); b101.add(ala=new JLabel("101"), BorderLayout.NORTH);b101.add(sl101=new JLabel("Md"), BorderLayout.CENTER);b101.add(la=new JLabel("Mendelevi"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl101.setHorizontalAlignment(SwingConstants.CENTER);sl101.setForeground(Color.BLUE);sl101.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b102=new JButton());  b102.setLayout(new BorderLayout()); b102.add(ala=new JLabel("102"), BorderLayout.NORTH);b102.add(sl102=new JLabel("No"), BorderLayout.CENTER);b102.add(la=new JLabel("Nobelium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl102.setHorizontalAlignment(SwingConstants.CENTER);sl102.setForeground(Color.BLUE);sl102.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		sub_container24b.add(b103=new JButton());  b103.setLayout(new BorderLayout()); b103.add(ala=new JLabel("103"), BorderLayout.NORTH);b103.add(sl103=new JLabel("Lr"), BorderLayout.CENTER);b103.add(la=new JLabel("Lawrencium"), BorderLayout.SOUTH);  ala.setFont(f1);ala.setForeground(Color.BLUE); sl103.setHorizontalAlignment(SwingConstants.CENTER);sl103.setForeground(Color.BLUE);sl103.setFont(f2); la.setFont(f1);la.setForeground(Color.BLUE);la.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Key
		flows.add(flowss=new JPanel(), BorderLayout.WEST);flowss.setLayout(new FlowLayout());flowss.setBackground(Color.MAGENTA);flowss.add(key=new JPanel());key.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));key.setLayout(new FlowLayout());key.setBackground(Color.GREEN);key.add(key=new JPanel());key.setLayout(new FlowLayout());key.setBackground(Color.MAGENTA);
		key.add(key=new JPanel());key.setLayout(new GridLayout(5,1));key.setBackground(Color.MAGENTA);
		key.add(label=new JLabel("       KEY           "));label.setFont(new Font("Algerian", Font.BOLD, 12));label.setForeground(Color.WHITE);
		key.add(label=new JLabel());label.setLayout(new BorderLayout());label.add(flows=new JPanel(), BorderLayout.WEST);flows.setBackground(Color.BLUE);flows.add(labela=new JLabel("     "));label.add(labela=new JLabel(" Solid"), BorderLayout.CENTER);labela.setForeground(Color.BLUE);labela.setFont(new Font("Courier", Font.BOLD, 14));
		key.add(label=new JLabel());label.setLayout(new BorderLayout());label.add(flows=new JPanel(), BorderLayout.WEST);flows.setBackground(Color.RED);flows.add(labela=new JLabel("     "));label.add(labela=new JLabel(" Gas"), BorderLayout.CENTER);labela.setForeground(Color.RED);labela.setFont(new Font("Courier", Font.BOLD, 14));
		key.add(label=new JLabel());label.setLayout(new BorderLayout());label.add(flows=new JPanel(), BorderLayout.WEST);flows.setBackground(Color.BLACK);flows.add(labela=new JLabel("     "));label.add(labela=new JLabel(" Liquid"), BorderLayout.CENTER);labela.setForeground(Color.BLACK);labela.setFont(new Font("Courier", Font.BOLD, 14));
		key.add(label=new JLabel());label.setLayout(new BorderLayout());label.add(flows=new JPanel(), BorderLayout.WEST);flows.setBackground(Color.ORANGE);flows.add(labela=new JLabel("     "));label.add(labela=new JLabel(" On Focus"), BorderLayout.CENTER);labela.setForeground(Color.ORANGE);labela.setFont(new Font("Courier", Font.BOLD, 14));
		
		
		
			
		//JFrame s= new JFrame();
		//s.setPreferredSize(getMaximumSize());
	//s.setIconImage( new ImageIcon("image/wale.jpg"));	
		//JWindow g= new JWindow();
	//g.
	//setBounds(getMaximizedBounds());
	
	
		
		//setMaximumSize(getMaximumSize());;
	//setExtendedState(MAXIMIZED_BOTH);
	//setBounds(getMaximizedBounds());
	
	//	setSize(getMaximumSize());
	
		
		//setSize(getHeight( MAXIMIZED_HORIZ), getWidth(MAXIMIZED_VERT));
	//setSize(MAXIMIZED_VERT, MAXIMIZED_HORIZ);
	//setSize(getPreferredSize());	
		
		
		
		//sub_container4 stuffs
		
		
		sub_container5.setLayout(new BorderLayout());sub_container5.setBackground(Color.BLACK);
		sub_container5.add(flows=new JPanel(), BorderLayout.EAST);flows.setLayout(new FlowLayout());flows.setBackground(Color.BLACK);flows.add(exitp=new JPanel());exitp.setLayout(new FlowLayout());exitp.setBackground(Color.BLACK);exitp.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
		exitp.add(exitb=new JButton());exitb.add(exit=new JLabel("  EXIT  "));exit.setForeground(Color.MAGENTA);exit.setFont(new Font("Algerian", Font.BOLD, 12));
		sub_container5.add(flows=new JPanel(), BorderLayout.WEST);flows.setLayout(new FlowLayout());flows.setBackground(Color.BLACK);flows.add(aboutp=new JPanel());aboutp.setLayout(new FlowLayout());aboutp.setBackground(Color.BLACK);aboutp.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
		aboutp.add(aboutb=new JButton());aboutb.add(about=new JLabel("ABOUT ME"));about.setForeground(Color.MAGENTA);about.setFont(new Font("Algerian", Font.BOLD, 12));
		sub_container5.add(flows=new JPanel(), BorderLayout.CENTER);flows.setLayout(new FlowLayout());flows.setBackground(Color.BLACK);flows.add(testp=new JPanel());testp.setLayout(new FlowLayout());testp.setBackground(Color.BLACK);testp.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
		testp.add(testb=new JButton());testb.add(test=new JLabel("TEST YOURSELF"));test.setForeground(Color.MAGENTA);test.setFont(new Font("Algerian", Font.BOLD, 12));
		testp.add(backb=new JButton());backb.add(back=new JLabel("BACK TO TABLE"));back.setForeground(Color.MAGENTA);back.setFont(new Font("Algerian", Font.BOLD, 12));backb.setVisible(false);
	
		sub_container5.add(flows=new JPanel(), BorderLayout.SOUTH);flows.setLayout(new BorderLayout());flows.add(g=new JTextArea(1,1),BorderLayout.WEST);g.setFont(new Font("", Font.PLAIN, 1));flows.add(flows=new JPanel(),BorderLayout.CENTER);flows.setLayout(new FlowLayout());
		flows.add(labela=new JLabel("....www.getfact.blogspot.com"));labela.setForeground(Color.ORANGE);flows.setBackground(Color.BLACK);labela.setToolTipText("www.getfact.blogspot.com");
		
		
		//sub_container5 stuffs
	//	sub_container5.setLayout(new BorderLayout());
		
		
		
		
		
		//sub_container6 stuffs
		//sub_container6.setLayout(new BorderLayout());
		
		
		
		
		//setSize(1000,150);
		
		
	//setSize(3000, 4000);
	//setSize(getMinimumSize());
		pack();
		
		setResizable(false);
		setLocationRelativeTo(null);
		wa.setVisible(false);
		setVisible(true);
		
		//setEnabled(false);
		//setExtendedState(getExtendedState());
		//setExtendedState(MAXIMIZED_BOTH);
	//System.exit(0);	
		//main_container.resize(getMinimumSize());
	/*	b1.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e) {
			//System.exit(0);
			remove(main_container);
			
		}});}
	
	
	
		
	
	
	
	
	public static void main(String args[]) {
		
		new Periodic_table();
		 

		}*/
			
	}
	

}
