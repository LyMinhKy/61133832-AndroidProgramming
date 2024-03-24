import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhChinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;
	public ManHinhChinh() {
		setTitle("Giải phương trình bậc 2");
		setFont(new Font("Dialog", Font.PLAIN, 18));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(173, 96, 81, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số B");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSB.setBounds(173, 145, 81, 29);
		contentPane.add(lblNhpSB);
		
		JLabel lblNhpSC = new JLabel("Nhập số C");
		lblNhpSC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSC.setBounds(173, 197, 81, 29);
		contentPane.add(lblNhpSC);
		
		txtA = new JTextField();
		txtA.setBounds(286, 93, 214, 29);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(286, 142, 214, 29);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(286, 194, 214, 29);
		contentPane.add(txtC);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(173, 278, 81, 29);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setEnabled(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(286, 280, 214, 29);
		contentPane.add(txtKQ);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý phép toán ở đây
				PTB2();
			}
		});
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGiai.setBounds(345, 233, 85, 29);
		contentPane.add(btnGiai);
	}
	void PTB2() {
		//Lấy dữ liệu từ điều khiển
		String soA=txtA.getText();
		String soB=txtB.getText();
		String soC=txtC.getText();
		//Chuyển kiểu dữ liệu
		double A=Double.parseDouble(soA);
		double B=Double.parseDouble(soB);
		double C=Double.parseDouble(soC);
		//Tính Delta
		double delta=B*B-4*A*C;
		//Tính nghiệm
		if(delta>0) {
			double x1=(-B+Math.sqrt(delta))/(2*A);
			double x2=(-B-Math.sqrt(delta))/(2*A);
			txtKQ.setText("Nghiệm x1 = "+x1+", x2 = "+x2 );
		}else if(delta==0) {
			double x = -B/2*A;
			txtKQ.setText("Nghiệm kép x= "+x);
		}else {
			txtKQ.setText("Phương trình vô nghiệm");
		}
	}
}
