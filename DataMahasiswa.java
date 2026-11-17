// import javax.swing.*;
// import javax.swing.table.DefaultTableModel;
// import java.awt.*;

// public class DataMahasiswa extends JFrame {
//     public DataMahasiswa() {
//         super("Data Mahasiswa");

//         JTextField tfNim = new JTextField(15);
//         JTextField tfNama = new JTextField(15);
//         JTextField tfJurusan = new JTextField(15);
//         JTextField tfIpk = new JTextField(15);

//         DefaultTableModel model = new DefaultTableModel(new String[]{"NIM", "Nama", "Jurusan", "IPK"}, 0);
//         JTable tabel = new JTable(model);
//         JScrollPane scroll = new JScrollPane(tabel);

//         JButton btnTambah = new JButton("Tambah");
//         JButton btnUbah = new JButton("Ubah");
//         JButton btnHapus = new JButton("Hapus");
//         JLabel hasil = new JLabel("Silakan isi data");

//         // klik baris tabel -> isi form dengan data baris itu
//         tabel.getSelectionModel().addListSelectionListener(e -> {
//             int baris = tabel.getSelectedRow();
//             if (baris != -1) {
//                 tfNim.setText(model.getValueAt(baris, 0).toString());
//                 tfNama.setText(model.getValueAt(baris, 1).toString());
//                 tfJurusan.setText(model.getValueAt(baris, 2).toString());
//                 tfIpk.setText(model.getValueAt(baris, 3).toString());
//             }
//         });

//         btnTambah.addActionListener(e -> {
//             String nim = tfNim.getText().trim();
//             String nama = tfNama.getText().trim();
//             String jurusan = tfJurusan.getText().trim();
//             String ipkText = tfIpk.getText().trim().replace(",", ".");

//             if (nim.isEmpty() || nama.isEmpty() || jurusan.isEmpty() || ipkText.isEmpty()) {
//                 hasil.setText("Semua data wajib diisi!");
//             } else {
//                 try {
//                     double ipk = Double.parseDouble(ipkText);
//                     if (ipk < 0 || ipk > 4) {
//                         hasil.setText("IPK harus antara 0 - 4!");
//                     } else {
//                         model.addRow(new Object[]{nim, nama, jurusan, ipk});
//                         hasil.setText(nama + " berhasil ditambahkan");
//                         tfNim.setText(""); tfNama.setText(""); tfJurusan.setText(""); tfIpk.setText("");
//                     }
//                 } catch (NumberFormatException ex) {
//                     hasil.setText("IPK harus berupa angka!");
//                 }
//             }
//         });

//         btnUbah.addActionListener(e -> {
//             int baris = tabel.getSelectedRow();
//             String nim = tfNim.getText().trim();
//             String nama = tfNama.getText().trim();
//             String jurusan = tfJurusan.getText().trim();
//             String ipkText = tfIpk.getText().trim().replace(",", ".");

//             if (baris == -1) {
//                 hasil.setText("Pilih dulu data di tabel!");
//             } else if (nim.isEmpty() || nama.isEmpty() || jurusan.isEmpty() || ipkText.isEmpty()) {
//                 hasil.setText("Semua data wajib diisi!");
//             } else {
//                 try {
//                     double ipk = Double.parseDouble(ipkText);
//                     if (ipk < 0 || ipk > 4) {
//                         hasil.setText("IPK harus antara 0 - 4!");
//                     } else {
//                         model.setValueAt(nim, baris, 0);
//                         model.setValueAt(nama, baris, 1);
//                         model.setValueAt(jurusan, baris, 2);
//                         model.setValueAt(ipk, baris, 3);
//                         hasil.setText("Data " + nama + " berhasil diubah");
//                     }
//                 } catch (NumberFormatException ex) {
//                     hasil.setText("IPK harus berupa angka!");
//                 }
//             }
//         });

//         btnHapus.addActionListener(e -> {
//             int baris = tabel.getSelectedRow();
//             if (baris == -1) {
//                 hasil.setText("Pilih dulu data di tabel!");
//             } else {
//                 model.removeRow(baris);
//                 tfNim.setText(""); tfNama.setText(""); tfJurusan.setText(""); tfIpk.setText("");
//                 hasil.setText("Data berhasil dihapus");
//             }
//         });

//         // panel form
//         JPanel panelForm = new JPanel(new GridLayout(0, 2, 10, 10));
//         panelForm.add(new JLabel("NIM:"));     panelForm.add(tfNim);
//         panelForm.add(new JLabel("Nama:"));    panelForm.add(tfNama);
//         panelForm.add(new JLabel("Jurusan:")); panelForm.add(tfJurusan);
//         panelForm.add(new JLabel("IPK:"));     panelForm.add(tfIpk);

//         // panel tombol
//         JPanel panelTombol = new JPanel(new FlowLayout());
//         panelTombol.add(btnTambah); panelTombol.add(btnUbah); panelTombol.add(btnHapus);

//         // panel atas = form + tombol + hasil
//         JPanel panelAtas = new JPanel(new GridLayout(0, 1, 10, 10));
//         panelAtas.add(panelForm); panelAtas.add(panelTombol); panelAtas.add(hasil);

//         ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 14));
//         setLayout(new BorderLayout(10, 10));
//         add(panelAtas, BorderLayout.NORTH);
//         add(scroll, BorderLayout.CENTER);
//         pack();
//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new DataMahasiswa().setVisible(true));
//     }
// }