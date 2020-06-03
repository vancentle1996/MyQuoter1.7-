package myquoter_gui;

import java.awt.EventQueue;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.Box;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import java.awt.SystemColor;

public class MyQuoter1_7 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> patterns;
	private JButton add_btn_1;
	private JRadioButton upsRadioBtn;
	private Box shipping_methods;
	private JScrollPane scrollPane_for_textfield;
	private JRadioButton usps_mediumbox;
	private JRadioButton usps_standard_shipping;
	private JRadioButton usps_express_shipping;
	private JTextArea total;
	private JTextField ups_textField;
	private JComboBox<String> bundles_and_wigs_lengths;
	private JComboBox<String> closure_and_frontal_lengths;
	private Stack<String> orderStack = new Stack<String>();
	private Stack<Double> price = new Stack<Double>();
	private Stack<Integer> quan = new Stack<Integer>();
	private JButton clearBtn;
	private JButton gobackBtn;
	private JSpinner quantity_spinner;
	private JButton add_btn_2;
	private JRadioButton tax_btn;
	private Clip_In clip_In = new Clip_In();
	private Closure5x5 closure5x5 = new Closure5x5();
	private ClosuresPrice closures = new ClosuresPrice();
	private ClosureWigs closureWigs = new ClosureWigs();
	private FrontalPrice frontals = new FrontalPrice();
	private FrontalWigs frontalWigs = new FrontalWigs();
	private BundlesPrice bundle = new BundlesPrice();
	private int quantity;
	private double totalPrice;
	private double pricePerBundle;
	private String s;
	private JButton calculate_Btn;
	private double taxamount;
	private double mediumbox_shipping_fee = 15;
	private double usps_standard_shipping_fee = 8;
	private double usps_express_shipping_fee = 24;
	private double ups_fedex_shipping_fee;
	private String chosenShipping;
	private int totalQuantity = 0;
	private double totalWithoutFee;
	private double totalWithFee;
	private String totalOutWithFee; 
	private String totalOutWithoutFee; 
	private DecimalFormat myFormatter = new DecimalFormat("#,###,##0.00");
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyQuoter1_7 frame = new MyQuoter1_7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyQuoter1_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 665);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		quantity_spinner = new JSpinner();
		quantity_spinner.setBackground(Color.GRAY);
		quantity_spinner.setFont(new Font("Century", Font.PLAIN, 12));
		quantity_spinner.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		
		shipping_methods = Box.createVerticalBox();
		shipping_methods.setBackground(SystemColor.controlShadow);
		
		scrollPane_for_textfield = new JScrollPane();
		
		bundles_and_wigs_lengths = new JComboBox<String>();
		bundles_and_wigs_lengths.setMaximumRowCount(11);
		bundles_and_wigs_lengths.addItem("10\"");bundles_and_wigs_lengths.addItem("12\"");bundles_and_wigs_lengths.addItem("14\"");bundles_and_wigs_lengths.addItem("16\"");bundles_and_wigs_lengths.addItem("18\"");
		bundles_and_wigs_lengths.addItem("20\"");bundles_and_wigs_lengths.addItem("22\"");bundles_and_wigs_lengths.addItem("24\"");bundles_and_wigs_lengths.addItem("26\"");bundles_and_wigs_lengths.addItem("28\"");bundles_and_wigs_lengths.addItem("30\"");
		
		closure_and_frontal_lengths = new JComboBox<String>();
		closure_and_frontal_lengths.setMaximumRowCount(6);
		closure_and_frontal_lengths.addItem("10\"");closure_and_frontal_lengths.addItem("12\"");closure_and_frontal_lengths.addItem("14\"");
		closure_and_frontal_lengths.addItem("16\"");closure_and_frontal_lengths.addItem("18\"");closure_and_frontal_lengths.addItem("20\"");
		
		patterns = new JComboBox<>();
		patterns.setFont(new Font("Century", Font.PLAIN, 14));
		patterns.setMaximumRowCount(30);
		patterns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent choose) {
				try {
										
					if(patterns.getSelectedIndex() >= 0 && patterns.getSelectedIndex() <= 8) {
						bundles_and_wigs_lengths.setEnabled(true);
						closure_and_frontal_lengths.setEnabled(false);
					}
					if(patterns.getSelectedIndex() >= 9 && patterns.getSelectedIndex() <= 29) {
						closure_and_frontal_lengths.setEnabled(true);
						bundles_and_wigs_lengths.setEnabled(false);
					}
					if(patterns.getSelectedIndex() >= 30 && patterns.getSelectedIndex() <= 43) {
						bundles_and_wigs_lengths.setEnabled(true);
						closure_and_frontal_lengths.setEnabled(false);	
					}
					if(patterns.getSelectedIndex() >= 44 && patterns.getSelectedIndex() <= 46) {
						bundles_and_wigs_lengths.setEnabled(true);
						closure_and_frontal_lengths.setEnabled(false);
					}
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
						
		//bundles
		patterns.addItem("Straight");patterns.addItem("Loose Wave");patterns.addItem("Body Wave");patterns.addItem("Deep Wave");
		patterns.addItem("Rare Curly");patterns.addItem("Steam #1");patterns.addItem("Steam #2");patterns.addItem("Blonde");patterns.addItem("Grey");
		//closures 
		patterns.addItem("Straight Closure");patterns.addItem("Loose Wave Closure");patterns.addItem("Body Wave Closure");
		patterns.addItem("Deep Wave Closure");patterns.addItem("Rare Curly Closure");patterns.addItem("Steam #1 Closure");
		patterns.addItem("Steam #2 Closure");patterns.addItem("Blonde Closure");patterns.addItem("Grey Closure");
		
		patterns.addItem("Straight 5x5 Closure");patterns.addItem("Loose Wave 5x5 Closure");patterns.addItem("Body Wave 5x5 Closure");
		patterns.addItem("Deep Wave 5x5 Closure");patterns.addItem("Rare Curly 5x5 Closure");
		
		//frontals
		patterns.addItem("Straight Frontal");patterns.addItem("Loose Wave Frontal");patterns.addItem("Body Wave Frontal");
		patterns.addItem("Deep Wave Frontal");patterns.addItem("Rare Curly Frontal");patterns.addItem("Steam #1 Frontal");patterns.addItem("Steam #2 Frontal");
		patterns.addItem("Blonde Frontal");patterns.addItem("Grey Frontal");
		
		//wigs
		patterns.addItem("Straight Closure Wig");patterns.addItem("Loose Wave Closure Wig");patterns.addItem("Body Wave Closure Wig");
		patterns.addItem("Deep Wave Closure Wig");patterns.addItem("Rare Curly Closure Wig");patterns.addItem("Steam #1 Closure Wig");patterns.addItem("Steam #2 Closure Wig");
		
		patterns.addItem("Straight Frontal Wig");patterns.addItem("Loose Wave Frontal Wig");patterns.addItem("Body Wave Frontal Wig");
		patterns.addItem("Deep Wave Frontal Wig");patterns.addItem("Rare Curly Frontal Wig");patterns.addItem("Steam #1 Frontal Wig");patterns.addItem("Steam #2 Frontal Wig");
		
		//clip-in
		patterns.addItem("Body wave clip-in");patterns.addItem("Rare curly clip-in");patterns.addItem("Steam curly clip-in");
		
		add_btn_1 = new JButton("ADD"); //responsible for bundles_and_wigs_lengths combo box
		add_btn_1.setFont(new Font("Open Sans Extrabold", Font.BOLD, 12));
		add_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent add) {
				try {
					quantity = Integer.parseInt(quantity_spinner.getValue().toString());
					switch(patterns.getSelectedIndex()) {
						case 0:totalPrice += bundle.straight(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = bundle.straight(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 1:totalPrice += bundle.loose(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = bundle.loose(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 2:totalPrice += bundle.body(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = bundle.body(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 3:totalPrice += bundle.deep(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = bundle.deep(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 4:totalPrice += bundle.rare(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = bundle.rare(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 5:totalPrice += bundle.steam1(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = bundle.steam1(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 6:totalPrice += bundle.steam2(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = bundle.steam2(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 7:totalPrice += bundle.blonde(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = bundle.blonde(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 8:totalPrice += bundle.grey(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = bundle.grey(bundles_and_wigs_lengths.getSelectedIndex()); break;
						
						case 32:totalPrice += closureWigs.straightClosureWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = closureWigs.straightClosureWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 33:totalPrice += closureWigs.looseClosureWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = closureWigs.looseClosureWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 34:totalPrice += closureWigs.bodyClosureWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = closureWigs.bodyClosureWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 35:totalPrice += closureWigs.deepClosureWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = closureWigs.deepClosureWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 36:totalPrice += closureWigs.rareClosureWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = closureWigs.rareClosureWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 37:totalPrice += closureWigs.steam1ClosureWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = closureWigs.steam1ClosureWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 38:totalPrice += closureWigs.steam2ClosureWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = closureWigs.steam2ClosureWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						
						case 39:totalPrice += frontalWigs.straightFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontalWigs.straightFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 40:totalPrice += frontalWigs.looseFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontalWigs.looseFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 41:totalPrice += frontalWigs.bodyFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontalWigs.bodyFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 42:totalPrice += frontalWigs.deepFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontalWigs.deepFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 43:totalPrice += frontalWigs.rareFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontalWigs.rareFrontalWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 44:totalPrice += frontalWigs.steam1FrontalWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontalWigs.steam1FrontalWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 45:totalPrice += frontalWigs.steam2FrontalWig(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontalWigs.steam2FrontalWig(bundles_and_wigs_lengths.getSelectedIndex()); break;
						
						case 46:totalPrice += clip_In.bodyClip(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = clip_In.bodyClip(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 47:totalPrice += clip_In.rareClip(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = clip_In.rareClip(bundles_and_wigs_lengths.getSelectedIndex()); break;
						case 48:totalPrice += clip_In.steam1Clip(bundles_and_wigs_lengths.getSelectedIndex()) * quantity; pricePerBundle = clip_In.steam1Clip(bundles_and_wigs_lengths.getSelectedIndex()); break;
					}
					
					price.push(pricePerBundle);
					quan.push(quantity);
					
					s = Double.toString(pricePerBundle);

					if(!orderStack.contains(patterns.getItemAt(patterns.getSelectedIndex())))
					{
						orderStack.push(patterns.getItemAt(patterns.getSelectedIndex())); //pattern
						orderStack.push(bundles_and_wigs_lengths.getItemAt(bundles_and_wigs_lengths.getSelectedIndex()) + " x " + quantity_spinner.getValue().toString()
								+ " - " + s + "*" + quantity_spinner.getValue().toString()); //length" x quantity
						total.append(
								patterns.getItemAt(patterns.getSelectedIndex()) + "\n" +
								bundles_and_wigs_lengths.getItemAt(bundles_and_wigs_lengths.getSelectedIndex()) + " x " + quantity_spinner.getValue().toString()
								 + " - " + s + "*" + quantity_spinner.getValue().toString() + "\n");
					}
					else 
					{
						orderStack.push(bundles_and_wigs_lengths.getItemAt(bundles_and_wigs_lengths.getSelectedIndex()) + " x " + quantity_spinner.getValue().toString()
								+ " - " + s + "*" + quantity_spinner.getValue().toString()); //length" x quantity
						total.append(bundles_and_wigs_lengths.getItemAt(bundles_and_wigs_lengths.getSelectedIndex()) + " x " + quantity_spinner.getValue().toString() 
						+ " - " + s + "*" + quantity_spinner.getValue().toString() + "\n");
					}
					totalQuantity += quantity;					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		add_btn_2 = new JButton("ADD"); //responsible for closure_and_frontal_lengths combo box
		add_btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					quantity = Integer.parseInt(quantity_spinner.getValue().toString());
					switch(patterns.getSelectedIndex()) {
						case 9: totalPrice += closures.straightClosure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closures.straightClosure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 10: totalPrice += closures.looseClosure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closures.looseClosure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 11: totalPrice += closures.bodyClosure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closures.bodyClosure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 12: totalPrice += closures.deepClosure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closures.deepClosure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 13: totalPrice += closures.rareClosure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closures.rareClosure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 14: totalPrice += closures.steam1Closure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closures.steam1Closure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 15: totalPrice += closures.steam2Closure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closures.steam2Closure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 16: totalPrice += closures.blondeClosure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closures.blondeClosure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 17: totalPrice += closures.greyClosure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closures.greyClosure(closure_and_frontal_lengths.getSelectedIndex()); break;
						
						case 18: totalPrice += closure5x5.straight5x5Closure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closure5x5.straight5x5Closure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 19: totalPrice += closure5x5.loose5x5Closure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closure5x5.loose5x5Closure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 20: totalPrice += closure5x5.body5x5Closure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closure5x5.body5x5Closure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 21: totalPrice += closure5x5.deep5x5Closure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closure5x5.deep5x5Closure(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 22: totalPrice += closure5x5.rare5x5Closure(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = closure5x5.rare5x5Closure(closure_and_frontal_lengths.getSelectedIndex()); break;
						
						case 23: totalPrice += frontals.straightFrontal(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontals.straightFrontal(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 24: totalPrice += frontals.looseFrontal(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontals.looseFrontal(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 25: totalPrice += frontals.bodyFrontal(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontals.bodyFrontal(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 26: totalPrice += frontals.deepFrontal(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontals.deepFrontal(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 27: totalPrice += frontals.rareFrontal(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontals.rareFrontal(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 28: totalPrice += frontals.steam1Frontal(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontals.steam1Frontal(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 29: totalPrice += frontals.steam2Frontal(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontals.steam2Frontal(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 30: totalPrice += frontals.blondeFrontal(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontals.blondeFrontal(closure_and_frontal_lengths.getSelectedIndex()); break;
						case 31: totalPrice += frontals.greyFrontal(closure_and_frontal_lengths.getSelectedIndex()) * quantity; pricePerBundle = frontals.greyFrontal(closure_and_frontal_lengths.getSelectedIndex()); break;
					}
					
					price.push(pricePerBundle);
					quan.push(quantity);
					
					s = Double.toString(pricePerBundle);
					
					if(!orderStack.contains(patterns.getItemAt(patterns.getSelectedIndex())))
					{
						orderStack.push(patterns.getItemAt(patterns.getSelectedIndex()));
						orderStack.push(closure_and_frontal_lengths.getItemAt(closure_and_frontal_lengths.getSelectedIndex()) + " x " + quantity_spinner.getValue().toString()
								+ " - " + s + "*" + quantity_spinner.getValue().toString());
						total.append(
								patterns.getItemAt(patterns.getSelectedIndex()) + "\n" +
										closure_and_frontal_lengths.getItemAt(closure_and_frontal_lengths.getSelectedIndex()) + " x " + quantity_spinner.getValue().toString() 
										+ " - " + s + "*" + quantity_spinner.getValue().toString() + "\n");
					}
					else
					{
						orderStack.push(closure_and_frontal_lengths.getItemAt(closure_and_frontal_lengths.getSelectedIndex()) + " x " + quantity_spinner.getValue().toString()
								+ " - " + s + "*" + quantity_spinner.getValue().toString());
						total.append(closure_and_frontal_lengths.getItemAt(closure_and_frontal_lengths.getSelectedIndex()) + " x " + quantity_spinner.getValue().toString() 
						+ " - " + s + "*" + quantity_spinner.getValue().toString() + "\n");
					}
					totalQuantity += quantity;

					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		add_btn_2.setFont(new Font("Open Sans Extrabold", Font.BOLD, 12));
		
		ups_textField = new JTextField("");
		ups_textField.setFont(new Font("Century", Font.PLAIN, 13));
		ups_textField.setColumns(10);
		
		upsRadioBtn = new JRadioButton("UPS/FedEx");
		upsRadioBtn.setBackground(SystemColor.controlShadow);
		upsRadioBtn.setFont(new Font("Century", Font.PLAIN, 12));
		
		clearBtn = new JButton("CLEAR");
		clearBtn.setFont(new Font("Open Sans Extrabold", Font.BOLD, 14));
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patterns.setSelectedIndex(0);
				bundles_and_wigs_lengths.setSelectedIndex(0);
				closure_and_frontal_lengths.setSelectedIndex(0);
				bundles_and_wigs_lengths.setEnabled(true);
				closure_and_frontal_lengths.setEnabled(false);
				quantity_spinner.setValue(1);
				usps_mediumbox.setSelected(false);
				usps_standard_shipping.setSelected(false);
				usps_express_shipping.setSelected(false);
				ups_textField.setText(null);
				upsRadioBtn.setSelected(false);
				tax_btn.setSelected(false);
				total.setText(null);
				orderStack.removeAllElements();
				price.removeAllElements();
				quan.removeAllElements();
				totalPrice = 0;
				totalQuantity = 0;
			}
		});
		
		gobackBtn = new JButton("GO BACK");
		gobackBtn.setFont(new Font("Open Sans Extrabold", Font.BOLD, 12));
		gobackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double p = price.pop(); 
				int q = quan.pop();
				double newTotal;
				newTotal = totalPrice - (p * q);
				totalPrice = newTotal;
				orderStack.pop();
				total.setText(null);
				for(String str : orderStack) {
					total.append(str+"\n");
				}
			}
		});
		
		calculate_Btn = new JButton("CALCULATE");
		calculate_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(usps_mediumbox.isSelected()) {
					chosenShipping = Double.toString(mediumbox_shipping_fee) + " (Priority Mail - takes about 2-3 days)";
					totalPrice += mediumbox_shipping_fee;
				}
				if(usps_standard_shipping.isSelected()) {
					chosenShipping = Double.toString(usps_standard_shipping_fee) + " (Priority Mail - takes about 2-3 days)";
					totalPrice += usps_standard_shipping_fee;
				}
				if(usps_express_shipping.isSelected()) {
					chosenShipping = Double.toString(usps_express_shipping_fee) + " (Priority Express - takes about 1-2 day(s))";
					totalPrice += usps_express_shipping_fee;
				}
				if(upsRadioBtn.isSelected()) { 
					ups_fedex_shipping_fee = Double.parseDouble(ups_textField.getText());
					totalPrice += ups_fedex_shipping_fee;
					chosenShipping = Double.toString(ups_fedex_shipping_fee) + " (UPS/FedEx - takes about 1-2 day(s))";
				}
				if(tax_btn.isSelected()) {
					taxamount = totalPrice * .08;
					totalPrice += taxamount;
				}
				//with fee
				totalWithFee = (totalPrice + totalQuantity + .30) * 1.03;
				totalOutWithFee = myFormatter.format(totalWithFee);

				//without fee
				totalWithoutFee = totalPrice + totalQuantity;
				totalOutWithoutFee = myFormatter.format(totalWithoutFee);
				
				
				total.append("\nTotal Quantity: " + totalQuantity + " piece(s)\n"
						+ "Shipping Fee: $" + chosenShipping + "\n"
						+ "Total WITH PayPal fee: " + totalOutWithFee + "\n"
						+ "Total WITHOUT PayPal fee: " + totalOutWithoutFee + "\n"
						+ "\nPlease note that we add $1 apiece to the totals because that's the shipping fee of hair from Cambodia to the United States.\n"
						+ "---------------------------------------------\n"
						+ "Cash App ID: $joshswift12\n"
						+ "Zelle Info: 401-499-0419\n"
						+ "PayPal info: kingdomofwonder178@gmail.com\n"
						+ "---------------------------------------------\n"
						+ "NOTE 1 & 2: \n1. Please kindly send us your first & last name along with your shipping address and a screenshot of your payment(s) if you choose to pay via Cash App or Zelle. Thanks!\n"
						+ "2. If you're located in Georgia, you can send us your tax ID number to avoid the tax, otherwise we will charge you an 8% tax on the order.");
			}
		});
		calculate_Btn.setFont(new Font("Open Sans Extrabold", Font.BOLD, 25));
		
		tax_btn = new JRadioButton("Georgia Sale Tax (8%)");
		tax_btn.setBackground(SystemColor.controlShadow);
		tax_btn.setFont(new Font("Century", Font.PLAIN, 13));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_for_textfield, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(closure_and_frontal_lengths, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(bundles_and_wigs_lengths, 0, 82, Short.MAX_VALUE))
										.addGap(76)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(add_btn_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
											.addComponent(add_btn_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
									.addComponent(patterns, Alignment.TRAILING, 0, 238, Short.MAX_VALUE)
									.addComponent(calculate_Btn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(98)
									.addComponent(quantity_spinner, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
							.addGap(45)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tax_btn)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(ups_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(upsRadioBtn, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(shipping_methods, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(clearBtn, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
												.addComponent(gobackBtn, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
											.addGap(38)))))))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(patterns, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(add_btn_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(bundles_and_wigs_lengths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(quantity_spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(closure_and_frontal_lengths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(add_btn_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(shipping_methods, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(ups_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(upsRadioBtn))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tax_btn)))
					.addPreferredGap(ComponentPlacement.UNRELATED, 35, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(calculate_Btn, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(gobackBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(scrollPane_for_textfield, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		total = new JTextArea();
		total.setForeground(SystemColor.menu);
		total.setBackground(Color.DARK_GRAY);
		total.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));
		total.setWrapStyleWord(true);
		total.setLineWrap(true);
		scrollPane_for_textfield.setViewportView(total);
		
		usps_mediumbox = new JRadioButton("USPS Medium Box");
		usps_mediumbox.setBackground(SystemColor.controlShadow);
		usps_mediumbox.setFont(new Font("Century", Font.PLAIN, 12));
		shipping_methods.add(usps_mediumbox);
		
		usps_standard_shipping = new JRadioButton("USPS Standard Shipping ");
		usps_standard_shipping.setBackground(SystemColor.controlShadow);
		usps_standard_shipping.setFont(new Font("Century", Font.PLAIN, 12));
		shipping_methods.add(usps_standard_shipping);
		
		usps_express_shipping = new JRadioButton("USPS Express Shipping ");
		usps_express_shipping.setBackground(SystemColor.controlShadow);
		usps_express_shipping.setFont(new Font("Century", Font.PLAIN, 12));
		shipping_methods.add(usps_express_shipping);
		contentPane.setLayout(gl_contentPane);
				
	}
}
