/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veriodev3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.util.HashMap;
import java.util.Map;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;


/**
 *
 * @author Sameet Acar
 */
public class İnterfaces extends javax.swing.JFrame {
    /**
     * Creates new form İnterfaces
     */ 
    public İnterfaces() {
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

        jLabel1 = new javax.swing.JLabel();
        dugumSayisi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kenarAgırlıkları = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kenarlar = new javax.swing.JTextField();
        Cizdir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        baslangic = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("dugum sayisi");

        dugumSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugumSayisiActionPerformed(evt);
            }
        });

        jLabel2.setText("kenar ağırlıkları");

        kenarAgırlıkları.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kenarAgırlıklarıActionPerformed(evt);
            }
        });

        jLabel3.setText("kenarlar");

        kenarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kenarlarActionPerformed(evt);
            }
        });

        Cizdir.setText("Cizdir");
        Cizdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CizdirActionPerformed(evt);
            }
        });

        jLabel4.setText("baslangic dugumu");

        baslangic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslangicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baslangic))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(kenarlar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(Cizdir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(28, 28, 28)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(dugumSayisi))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kenarAgırlıkları, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dugumSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kenarlar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kenarAgırlıkları, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baslangic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addComponent(Cizdir)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kenarAgırlıklarıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kenarAgırlıklarıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kenarAgırlıklarıActionPerformed

    private void dugumSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugumSayisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dugumSayisiActionPerformed

    private void kenarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kenarlarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kenarlarActionPerformed

    private void baslangicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslangicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baslangicActionPerformed

    private void CizdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CizdirActionPerformed
        int dugumSayısı = Integer.parseInt(dugumSayisi.getText());
        int baslangicDugumu=Integer.parseInt(baslangic.getText());
        // Kullanıcıdan alınan kenarları ve kenar ağırlıklarını oku
        String kenarlar1 = kenarlar.getText();
        String kenarAgırlıkları1 = kenarAgırlıkları.getText();
        String[] kenarlarArray = kenarlar1.split(",");
        String[] kenarAgırlıklarıArray = kenarAgırlıkları1.split(",");
        // Komşuluk matrisini oluştur
        int[][] adjacencyMatrix = new int[dugumSayısı][dugumSayısı];
        for (int i = 0; i < kenarlarArray.length; i++) {
            int n1 = Integer.parseInt(kenarlarArray[i].split("-")[0]);
            int n2 = Integer.parseInt(kenarlarArray[i].split("-")[1]);
            int weight = Integer.parseInt(kenarAgırlıklarıArray[i]);
            adjacencyMatrix[n1][n2] = weight;
            adjacencyMatrix[n2][n1] = weight; // Graf yönsüz olduğu için ikili bağlantı eklenir
        }
        // Komşuluk matrisini ekrana yazdır
        System.out.println("Komsuluk Matrisi:");
        System.out.print("\t");
        for (int i = 0; i < dugumSayısı; i++) {
            if (i == 0) {
    
                for (int k = 0; k < dugumSayısı; k++) {
                    System.out.print((k) + "\t");
                }
                System.out.println();
            }
            System.out.print((i)+"\t");
            for (int j = 0; j<dugumSayısı; j++) {
                System.out.print(adjacencyMatrix[i][j] + "\t");
            }
            System.out.println();
        }
Dijkstra dijkstra=new Dijkstra(adjacencyMatrix, dugumSayısı, baslangicDugumu);
dijkstra.runDijkstra();

mxGraph graph = new mxGraph();
Object parent = graph.getDefaultParent();
graph.getModel().beginUpdate();
graph.setCellsDisconnectable(false);
try
{
    // Grafta düğümleri ve kenarları ekledik
    // hash map Yapısını Kullandım.
    Map<Integer, Object> vertexMap = new HashMap<>();
    for(int i = 0; i < dugumSayısı; i++){
        if(i%2==0){
            vertexMap.put(i, graph.insertVertex(parent, null, i, 80*i+20, 20*i+20, 80, 30));
        }
        else{
            vertexMap.put(i, graph.insertVertex(parent, null, i, 80*i+20, 80*i+50, 80, 30));
        }
    }
    for (int i = 0; i < kenarlarArray.length; i++) {
            int n1 = Integer.parseInt(kenarlarArray[i].split("-")[0]);
            int n2 = Integer.parseInt(kenarlarArray[i].split("-")[1]);
            int weight = Integer.parseInt(kenarAgırlıklarıArray[i]);
            graph.insertEdge(parent, null, weight, vertexMap.get(n1), vertexMap.get(n2));
    }
}
finally
{
    graph.getModel().endUpdate();
}

mxGraphComponent graphComponent = new mxGraphComponent(graph);
JFrame frame = new JFrame();
frame.getContentPane().add(graphComponent);
frame.pack();
frame.setVisible(true);

    }//GEN-LAST:event_CizdirActionPerformed
    
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
            java.util.logging.Logger.getLogger(İnterfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(İnterfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(İnterfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(İnterfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new İnterfaces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cizdir;
    private javax.swing.JTextField baslangic;
    private javax.swing.JTextField dugumSayisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kenarAgırlıkları;
    private javax.swing.JTextField kenarlar;
    // End of variables declaration//GEN-END:variables
}
