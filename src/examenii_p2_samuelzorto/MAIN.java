/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenii_p2_samuelzorto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

/**
 *
 * @author szorto
 */
public class MAIN extends javax.swing.JFrame {

    /**
     * Creates new form MAIN
     */
    public MAIN() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearPartido = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_crearPartidas = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jd_crearTorneo = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_crearTorneo = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_torneos = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jb_crearDeporte = new javax.swing.JButton();
        jb_crearDeporte1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jScrollPane2.setViewportView(jl_crearPartidas);

        jButton3.setText("Elegir");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearPartidoLayout = new javax.swing.GroupLayout(jd_crearPartido.getContentPane());
        jd_crearPartido.getContentPane().setLayout(jd_crearPartidoLayout);
        jd_crearPartidoLayout.setHorizontalGroup(
            jd_crearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearPartidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addContainerGap())
        );
        jd_crearPartidoLayout.setVerticalGroup(
            jd_crearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearPartidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jl_crearTorneo);

        jButton5.setText("Elegir");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearTorneoLayout = new javax.swing.GroupLayout(jd_crearTorneo.getContentPane());
        jd_crearTorneo.getContentPane().setLayout(jd_crearTorneoLayout);
        jd_crearTorneoLayout.setHorizontalGroup(
            jd_crearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearTorneoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addContainerGap())
        );
        jd_crearTorneoLayout.setVerticalGroup(
            jd_crearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearTorneoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Torneos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q4");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q5");
        treeNode1.add(treeNode2);
        jt_torneos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_torneos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jb_crearDeporte.setText("Crear Deporte");
        jb_crearDeporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearDeporteMouseClicked(evt);
            }
        });

        jb_crearDeporte1.setText("Cargar Deporte");
        jb_crearDeporte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearDeporte1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_crearDeporte)
                    .addComponent(jb_crearDeporte1))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jb_crearDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jb_crearDeporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Crear Equipo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Crear Partido");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton4.setText("Crear Torneo");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearDeporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearDeporteMouseClicked
        nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del deporte");
        periodo = JOptionPane.showInputDialog(this, "Ingrese el periodo");

        boolean a = true;
        for (Deporte t : listaDeporte) {
            if (t.getNombre().equals(nombre)) {
                a = false;
                JOptionPane.showMessageDialog(this, "Ese deporte ya existe");
            }
        }

        if (a) {
            dep = new Deporte(nombre);
            listaDeporte.add(dep);

            DefaultTreeModel m = (DefaultTreeModel) jt_torneos.getModel();

            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

            DefaultMutableTreeNode nodoo = new DefaultMutableTreeNode(dep);
            ((DefaultMutableTreeNode) raiz.getChildAt(0)).add(nodoo);
            ((DefaultMutableTreeNode) raiz.getChildAt(1)).add((MutableTreeNode) nodoo.clone());
            ((DefaultMutableTreeNode) raiz.getChildAt(2)).add((MutableTreeNode) nodoo.clone());
            ((DefaultMutableTreeNode) raiz.getChildAt(3)).add((MutableTreeNode) nodoo.clone());
            m.reload();

            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter(
                            "yoyo", "sz");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showSaveDialog(this);

            ad = new adminDeporte("./" + nombre + ".sz");
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                try {

                    File fichero = null;
                    if (jfc.getFileFilter().getDescription().equals(
                            "yoyo")) {
                        fichero
                                = new File(jfc.getSelectedFile().getPath() + ".sz");
                    } else {
                        fichero = jfc.getSelectedFile();
                    }
                    ad.setD(dep);
                    ad.escribirArchivo();

                    JOptionPane.showMessageDialog(this,
                            "Archivo guardado exitosamente");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }

    }//GEN-LAST:event_jb_crearDeporteMouseClicked

    private void jb_crearDeporte1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearDeporte1MouseClicked
        File fichero = null;
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter(
                            "yoyo", "sz");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jfc.getSelectedFile();
                String nombreArchivo = selectedFile.getName();
                ad = new adminDeporte("./" + nombreArchivo + ".sz");
                ad.cargarArchivo();
                dep = ad.getD();
                DefaultTreeModel m = (DefaultTreeModel) jt_torneos.getModel();

                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

                DefaultMutableTreeNode nodoo = new DefaultMutableTreeNode(dep);
                ((DefaultMutableTreeNode) raiz.getChildAt(0)).add(nodoo);
                ((DefaultMutableTreeNode) raiz.getChildAt(1)).add((MutableTreeNode) nodoo.clone());
                ((DefaultMutableTreeNode) raiz.getChildAt(2)).add((MutableTreeNode) nodoo.clone());
                ((DefaultMutableTreeNode) raiz.getChildAt(3)).add((MutableTreeNode) nodoo.clone());
                m.reload();

            } //fin if

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb_crearDeporte1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        nombreEquipo = JOptionPane.showInputDialog(this, "Nombre");
        puntos = Integer.parseInt(JOptionPane.showInputDialog(this, "Puntos"));
        equi = new Equipo(nombreEquipo, puntos);
        listaEquipos.add(equi);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (listaEquipos.size() < 2) {
            JOptionPane.showMessageDialog(this, "Debe tener al menos dos equipos creados");
        } else {
            equi1 = null;
            DefaultListModel m = new DefaultListModel();
            for (Equipo t : listaEquipos) {
                m.addElement(t);
            }
            jl_crearPartidas.setModel(m);

            jd_crearPartido.setModal(true);
            jd_crearPartido.pack();
            jd_crearPartido.setLocationRelativeTo(this);
            jd_crearPartido.setVisible(true);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (equi1 == null) {
            equi1 = jl_crearPartidas.getSelectedValue();
        } else {
            equi2 = jl_crearPartidas.getSelectedValue();
            jd_crearPartido.dispose();
            Partido par = new Partido(equi1.getNombre(), equi2.getNombre(), equi1.getPuntos(), equi2.getPuntos());
            listaPartidos.add(par);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            nombreTorneo = JOptionPane.showInputDialog(this, "Ingrese Nombre");

            tor = new Torneo(nombreTorneo);
            do {
                nombreEquipo = JOptionPane.showInputDialog(this, "Ingrese el nombre de un equipo");
                for (Equipo l : listaEquipos) {
                    if (l.getNombre().equalsIgnoreCase(nombreEquipo)) {
                        tor.getListaEquipo().add(l);
                        JOptionPane.showMessageDialog(this, "Equipo Agregado");
                    }
                }
                g = JOptionPane.showInputDialog(this, "Desea ingresar mas equipos? s/n");
            } while (g.equals("s") || g.equals("S"));

            do {
                DefaultListModel mm = new DefaultListModel();
                for (Partido l : listaPartidos) {
                    for (Equipo e : tor.getListaEquipo()) {
                        if (e.getNombre().equals(l.getNombre1()) || e.getNombre().equals(l.getNombre1())) {
                            if (tor.getListaPartido().equals(l)) {
                            } else {
                                mm.addElement(l);
                            }
                        }
                    }
                }
                jl_crearTorneo.setModel(mm);
                jd_crearTorneo.setModal(true);
                jd_crearTorneo.pack();
                jd_crearTorneo.setLocationRelativeTo(this);
                jd_crearTorneo.setVisible(true);

            } while (g.equals("s") || g.equals("S"));

//            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(nodo);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if (jl_crearTorneo.getSelectedIndex() != -1) {
            par = jl_crearTorneo.getSelectedValue();
            tor.getListaPartido().add(par);

        }

        g = JOptionPane.showInputDialog(this, "Desea ingresar mas equipos? s/n");
        if (g.equals("s") || g.equals("S")) {
            jd_crearTorneo.dispose();

            jd_crearTorneo.setModal(true);
            jd_crearTorneo.pack();
            jd_crearTorneo.setLocationRelativeTo(this);
            jd_crearTorneo.setVisible(true);
        } else {
            jd_crearTorneo.dispose();

            Object v1 = jt_torneos.getSelectionPath().getLastPathComponent();
            nodo = (DefaultMutableTreeNode) v1;
            DefaultTreeModel m = (DefaultTreeModel) jt_torneos.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            ((DefaultMutableTreeNode)raiz.getChildAt(nodo.getParent().getIndex(nodo))).add(nodo);

        }
    }//GEN-LAST:event_jButton5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_crearDeporte;
    private javax.swing.JButton jb_crearDeporte1;
    private javax.swing.JDialog jd_crearPartido;
    private javax.swing.JDialog jd_crearTorneo;
    private javax.swing.JList<Equipo> jl_crearPartidas;
    private javax.swing.JList<Partido> jl_crearTorneo;
    private javax.swing.JTree jt_torneos;
    // End of variables declaration//GEN-END:variables
    private String periodo, nombre;
    private ArrayList<Deporte> listaDeporte = new ArrayList();
    private ArrayList<Equipo> listaEquipos = new ArrayList();
    private ArrayList<Partido> listaPartidos = new ArrayList();
    DefaultMutableTreeNode nodo;
    adminDeporte ad;
    Deporte dep;
    private String nombreEquipo, nombreTorneo;
    private int puntos;
    private Equipo equi, equi1, equi2;
    String g;
    Partido par;
    Torneo tor;
}
