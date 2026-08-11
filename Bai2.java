import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Bai2 extends JFrame {
    private final JTextField txtSo1;
    private final JTextField txtSo2;
    private final JLabel lblKetQua;

    public Bai2() {
        setTitle("Bai 2 - Tinh tong hai so");
        setSize(420, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel panelNhap = new JPanel(new GridLayout(2, 2, 8, 8));
        panelNhap.add(new JLabel("Nhap so thu nhat:"));
        txtSo1 = new JTextField();
        panelNhap.add(txtSo1);

        panelNhap.add(new JLabel("Nhap so thu hai:"));
        txtSo2 = new JTextField();
        panelNhap.add(txtSo2);

        JButton btnTinhTong = new JButton("Tinh tong");
        btnTinhTong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tinhTong();
            }
        });

        lblKetQua = new JLabel("Ket qua: ", SwingConstants.CENTER);

        JPanel panelGiua = new JPanel(new BorderLayout(8, 8));
        panelGiua.add(panelNhap, BorderLayout.CENTER);
        panelGiua.add(btnTinhTong, BorderLayout.SOUTH);

        add(panelGiua, BorderLayout.CENTER);
        add(lblKetQua, BorderLayout.SOUTH);
    }

    private void tinhTong() {
        String input1 = txtSo1.getText().trim();
        String input2 = txtSo2.getText().trim();

        try {
            double so1 = Double.parseDouble(input1);
            double so2 = Double.parseDouble(input2);
            double tong = so1 + so2;
            lblKetQua.setText("Ket qua: " + tong);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                this,
                "Du lieu nhap khong hop le. Vui long nhap so.",
                "Loi nhap lieu",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Bai2().setVisible(true);
            }
        });
    }
}
