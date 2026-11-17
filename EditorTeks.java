// import javax.swing.*;
// import java.awt.*;
// import java.io.*;

// public class EditorTeks extends JFrame {
//     public EditorTeks() {
//         super("Editor Teks");

//         JTextArea area = new JTextArea(20, 50);
//         JScrollPane scroll = new JScrollPane(area);      // JTextArea dalam JScrollPane
//         JFileChooser fc = new JFileChooser();

//         // menu File
//         JMenuItem miBaru = new JMenuItem("Baru");
//         JMenuItem miBuka = new JMenuItem("Buka");
//         JMenuItem miSimpan = new JMenuItem("Simpan");
//         JMenuItem miKeluar = new JMenuItem("Keluar");

//         // menu Edit
//         JMenuItem miPotong = new JMenuItem("Potong");
//         JMenuItem miSalin = new JMenuItem("Salin");
//         JMenuItem miTempel = new JMenuItem("Tempel");

//         // pintasan keyboard
//         miBaru.setAccelerator(KeyStroke.getKeyStroke("control N"));
//         miBuka.setAccelerator(KeyStroke.getKeyStroke("control O"));
//         miSimpan.setAccelerator(KeyStroke.getKeyStroke("control S"));
//         miPotong.setAccelerator(KeyStroke.getKeyStroke("control X"));
//         miSalin.setAccelerator(KeyStroke.getKeyStroke("control C"));
//         miTempel.setAccelerator(KeyStroke.getKeyStroke("control V"));

//         // toolbar
//         JButton btnBaru = new JButton("Baru");
//         JButton btnBuka = new JButton("Buka");
//         JButton btnSimpan = new JButton("Simpan");
//         JButton btnPotong = new JButton("Potong");
//         JButton btnSalin = new JButton("Salin");
//         JButton btnTempel = new JButton("Tempel");

//         // aksi menu File
//         miBaru.addActionListener(e -> area.setText(""));

//         miBuka.addActionListener(e -> {
//             if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
//                 try (FileReader fr = new FileReader(fc.getSelectedFile())) {
//                     area.read(fr, null);
//                 } catch (IOException ex) {
//                     JOptionPane.showMessageDialog(this, "Gagal membuka file!");
//                 }
//             }
//         });

//         miSimpan.addActionListener(e -> {
//             if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
//                 try (FileWriter fw = new FileWriter(fc.getSelectedFile())) {
//                     area.write(fw);
//                 } catch (IOException ex) {
//                     JOptionPane.showMessageDialog(this, "Gagal menyimpan file!");
//                 }
//             }
//         });

//         miKeluar.addActionListener(e -> System.exit(0));

//         // aksi menu Edit
//         miPotong.addActionListener(e -> area.cut());
//         miSalin.addActionListener(e -> area.copy());
//         miTempel.addActionListener(e -> area.paste());

//         // tombol toolbar memakai aksi menu yang sama
//         btnBaru.addActionListener(e -> miBaru.doClick());
//         btnBuka.addActionListener(e -> miBuka.doClick());
//         btnSimpan.addActionListener(e -> miSimpan.doClick());
//         btnPotong.addActionListener(e -> area.cut());
//         btnSalin.addActionListener(e -> area.copy());
//         btnTempel.addActionListener(e -> area.paste());

//         // susun menu
//         JMenu menuFile = new JMenu("File");
//         menuFile.add(miBaru); menuFile.add(miBuka); menuFile.add(miSimpan);
//         menuFile.addSeparator();
//         menuFile.add(miKeluar);

//         JMenu menuEdit = new JMenu("Edit");
//         menuEdit.add(miPotong); menuEdit.add(miSalin); menuEdit.add(miTempel);

//         JMenuBar menuBar = new JMenuBar();
//         menuBar.add(menuFile); menuBar.add(menuEdit);
//         setJMenuBar(menuBar);

//         // susun toolbar
//         JToolBar toolBar = new JToolBar();
//         toolBar.add(btnBaru); toolBar.add(btnBuka); toolBar.add(btnSimpan);
//         toolBar.addSeparator();
//         toolBar.add(btnPotong); toolBar.add(btnSalin); toolBar.add(btnTempel);

//         setLayout(new BorderLayout());
//         add(toolBar, BorderLayout.NORTH);
//         add(scroll, BorderLayout.CENTER);
//         pack();
//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new EditorTeks().setVisible(true));
//     }
// }