// No.1
// import javax.swing.*;
// import java.awt.*;

// public class FormDaftar extends JFrame {
//     public FormDaftar() {
//         super("Form Pendaftaran");

//         JTextField tfNama = new JTextField(20);
//         JTextField tfEmail = new JTextField(20);
//         JPasswordField pfPassword = new JPasswordField(20);
//         JRadioButton rbLaki = new JRadioButton("Laki-laki");
//         JRadioButton rbPerempuan = new JRadioButton("Perempuan");
//         ButtonGroup bg = new ButtonGroup();
//         bg.add(rbLaki); bg.add(rbPerempuan);
//         JTextField tfJurusan = new JTextField(20);
//         JTextField tfHobi = new JTextField(20);
//         JButton btn = new JButton("Daftar");
//         JLabel hasil = new JLabel("Silakan isi data");

//         btn.addActionListener(e -> {
//             String nama = tfNama.getText().trim();
//             String email = tfEmail.getText().trim();
//             String password = new String(pfPassword.getPassword()).trim();
//             String gender = rbLaki.isSelected() ? "Laki-laki" : rbPerempuan.isSelected() ? "Perempuan" : "";
//             String jurusan = tfJurusan.getText().trim();
//             String hobi = tfHobi.getText().trim();

//             if (nama.isEmpty() || email.isEmpty() || password.isEmpty() || gender.isEmpty()
//                     || jurusan.isEmpty() || hobi.isEmpty()) {
//                 hasil.setText("Semua data wajib diisi!");
//             } else if (password.length() < 6) {
//                 hasil.setText("Password minimal 6 karakter!");
//             } else {
//                 hasil.setText(nama + " (" + gender + ") - " + jurusan + " | Hobi: " + hobi);
//             }
//         });

//         ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 14));
//         setLayout(new GridLayout(0, 1, 10, 10));
//         add(new JLabel("Pendaftaran Mahasiswa Baru. Isi data:"));
//         add(new JLabel("Nama:"));          add(tfNama);
//         add(new JLabel("Email:"));         add(tfEmail);
//         add(new JLabel("Password:"));      add(pfPassword);
//         add(new JLabel("Jenis Kelamin:")); add(rbLaki); add(rbPerempuan);
//         add(new JLabel("Jurusan:"));       add(tfJurusan);
//         add(new JLabel("Hobi:"));          add(tfHobi);
//         add(btn); add(hasil);
//         pack();
//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new FormDaftar().setVisible(true));
//     }
// }
// No.2

