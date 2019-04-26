package cal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalDemo extends JFrame{
	
	 public static void main(String[] args) {    
	        // 创建 JFrame 实例
	        JFrame frame = new JFrame("调整参数");
	        // Setting the width and height of frame
	        frame.setSize(400, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        /* 创建面板，这个类似于 HTML 的 div 标签
	         * 我们可以创建多个面板并在 JFrame 中指定位置
	         * 面板中我们可以添加文本字段，按钮及其他组件。
	         */
	        JPanel panel = new JPanel();    
	        // 添加面板
	        frame.add(panel);
	        /* 
	         * 调用用户定义的方法并添加组件到面板
	         */
	        placeComponents(panel);

	        // 设置界面可见
	        frame.setVisible(true);
	    }

	    private static void placeComponents(JPanel panel) {

	        /* 布局部分我们这边不多做介绍
	         * 这边设置布局为 null
	         */
	        panel.setLayout(null);

	        // 创建 JLabel
	        JLabel label1 = new JLabel("税后经营性资产价值:");
	        /* 这个方法定义了组件的位置。
	         * setBounds(x, y, width, height)
	         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
	         */
	        label1.setBounds(10,20,150,25);
	        panel.add(label1);

	        /* 
	         * 创建文本域用于用户输入
	         */
	        final JTextField Text1 = new JTextField(20);
	        Text1.setBounds(150,20,165,25);
	        panel.add(Text1);

	        //b1
	        JLabel JLabel2= new JLabel("第一期:");
	        JLabel2.setBounds(10,50,150,25);
	        panel.add(JLabel2);

	        final JTextField Text2 = new JTextField(20);
	        Text2.setBounds(150,50,165,25);
	        panel.add(Text2);
	        
	        //b2
	        JLabel JLabel3 = new JLabel("第二期:");
	        JLabel3.setBounds(10,80,150,25);
	        panel.add(JLabel3);

	        final JTextField Text3 = new JTextField(20);
	        Text3.setBounds(150,80,165,25);
	        panel.add(Text3);
	        
	        //b3
	        JLabel Jlabel4 = new JLabel("第三期:");
	        Jlabel4.setBounds(10,110,150,25);
	        panel.add(Jlabel4);

	        final JTextField Text4 = new JTextField(20);
	        Text4.setBounds(150,110,165,25);
	        panel.add(Text4);
	        
	        //b4
	        JLabel Jlabel5 = new JLabel("第四期:");
	        Jlabel5.setBounds(10,140,150,25);
	        panel.add(Jlabel5);

	        final JTextField Text5 = new JTextField(20);
	        Text5.setBounds(150,140,165,25);
	        panel.add(Text5);
	        
	        //b5
	        JLabel Jlabel6 = new JLabel("第五期:");
	        Jlabel6.setBounds(10,170,150,25);
	        panel.add(Jlabel6);

	        final JTextField Text6 = new JTextField(20);
	        Text6.setBounds(150,170,165,25);
	        panel.add(Text6);
	        
//	        //b6
//	        JLabel Jlabel7 = new JLabel("第六期:");
//	        Jlabel7.setBounds(10,200,150,25);
//	        panel.add(Jlabel7);
//
//	        final JTextField Text7 = new JTextField(20);
//	        Text7.setBounds(150,200,165,25);
//	        panel.add(Text7);
	        
	        //7
	        JLabel Jlabel8 = new JLabel("永续期:");
	        Jlabel8.setBounds(10,200,150,25);
	        panel.add(Jlabel8);

	        final JTextField Text8 = new JTextField(20);
	        Text8.setBounds(150,200,165,25);
	        panel.add(Text8);
	      
	        
//	        //W
//	        JLabel Jlabel9 = new JLabel("税后折现率:");
//	        Jlabel9.setBounds(10,260,150,25);
//	        panel.add(Jlabel9);
//
//	        final JTextField Text9 = new JTextField(20);
//	        Text9.setBounds(150,260,165,25);
//	        panel.add(Text9);
//	        
//	        
//	        //T
//	        JLabel Jlabel10 = new JLabel("企业所得税:");
//	        Jlabel10.setBounds(10,290,150,25);
//	        panel.add(Jlabel10);
//
//	        final JTextField Text10 = new JTextField(20);
//	        Text10.setBounds(150,290,165,25);
//	        panel.add(Text10);
	        
	        //n
	        JLabel Jlabel11 = new JLabel("首期折现年份:");
	        Jlabel11.setBounds(10,230,150,25);
	        panel.add(Jlabel11);

	        final JTextField Text11 = new JTextField(20);
	        Text11.setBounds(150,230,165,25);
	        panel.add(Text11);
	        
	        //scale
	        JLabel JlabelScale1 = new JLabel("差异率:");
	        JlabelScale1.setBounds(10,260,150,25);
	        panel.add(JlabelScale1);
	        
	        final JTextField TextScale = new JTextField(20);
	        TextScale.setBounds(150,260,25,25);
	        panel.add(TextScale);
	        
	        JLabel JlabelScale2 = new JLabel("位小数");
	        JlabelScale2.setBounds(180,260,80,25);
	        panel.add(JlabelScale2);
	        
	        // 创建登录按钮
	        JButton button = new JButton("推导");
	        button.setBounds(10,290,150,25);
	        panel.add(button);
	        
	        //W1
	        JLabel Jlabel12 = new JLabel("税前折现率:");
	        Jlabel12.setBounds(10,320,150,25);
	        panel.add(Jlabel12);

	        final JTextField Text12 = new JTextField(20);
	        Text12.setBounds(100,320,165,25);
	        panel.add(Text12);
	        
	        
	        button.addActionListener(new ActionListener() {    //添加一个按钮触发装置，这里只要点击一下anniu就会将文本框中的内容输入到文件中
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	double D=Double.valueOf(Text1.getText());
	            	//(b1-c)*1/(1+w1)^0.5+(b2-c)*1/(1+w1)^1.5+(b3-c)*1/(1+w1)^2.5+(b4-c)*1/(1+w1)^3.5+(b5-c)*1/(1+w1)^4.5+(b6-c)*1/(1+w1)^5.5+(b7-c)*1/w1(1+w1)^5.5
	            	double b1=Double.valueOf(Text2.getText());
	            	double b2=Double.valueOf(Text3.getText());
	            	double b3=Double.valueOf(Text4.getText());
	            	double b4=Double.valueOf(Text5.getText());
	            	double b5=Double.valueOf(Text6.getText());
//	            	double b6=Double.valueOf(Text7.getText());
	            	double b7=Double.valueOf(Text8.getText());
//	            	double W=Double.valueOf(Text9.getText());
//	            	double T=Double.valueOf(Text10.getText());
	            	double n=Double.valueOf(Text11.getText());
	            	if (null==TextScale.getText()||"".equals(TextScale.getText())) {
	            		Text12.setText("差异率未填写!");
					}else {
						int scale=Integer.valueOf(TextScale.getText());
						String scaleStr="0.";
						for (int i = 0; i < scale; i++) {
							scaleStr+="0";
						}
						scaleStr+="1";
						double scaleDouble=Double.valueOf(scaleStr);
						
						//double s=-0.1;
						//double w1=new BigDecimal(W).divide(new BigDecimal(1-T),6, BigDecimal.ROUND_HALF_UP).doubleValue()+s;
						double w1=0.00000001;
						boolean ifFind=false;
						double calNum=0d;
						while (w1<=0.3) {
							calNum=(new BigDecimal(b1).divide(new BigDecimal(Math.pow((1+w1),n)),6, BigDecimal.ROUND_HALF_UP)).doubleValue()
									+(new BigDecimal(b2).divide(new BigDecimal(Math.pow((1+w1),(n*2+0.5))),6, BigDecimal.ROUND_HALF_UP)).doubleValue()
									+(new BigDecimal(b3).divide(new BigDecimal(Math.pow((1+w1),(n*2+1.5))),6, BigDecimal.ROUND_HALF_UP)).doubleValue()
									+(new BigDecimal(b4).divide(new BigDecimal(Math.pow((1+w1),(n*2+2.5))),6, BigDecimal.ROUND_HALF_UP)).doubleValue()
									+(new BigDecimal(b5).divide(new BigDecimal(Math.pow((1+w1),(n*2+3.5))),6, BigDecimal.ROUND_HALF_UP)).doubleValue()
//								+(new BigDecimal(b6).divide(new BigDecimal(Math.pow((1+w1),(n*2+4.5))),6, BigDecimal.ROUND_HALF_UP)).doubleValue()
									+(new BigDecimal(b7).divide(new BigDecimal(w1),6,BigDecimal.ROUND_HALF_UP).divide(new BigDecimal(Math.pow((1+w1),(n*2+3.5))),6, BigDecimal.ROUND_HALF_UP)).doubleValue();
							
							if (calNum>=(D-D*scaleDouble)&&calNum<=(D+D*scaleDouble)) {
								w1=new BigDecimal(w1).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
								Text12.setText(String.valueOf(w1));
								ifFind=true;
								break;
							}else {
								w1+=0.00000001;
							}
						}
						
						if(!ifFind) {
							Text12.setText("差异率过大!");
						}
						
					}
	            	
	            }
	        });
	        
	    }
}
