/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HotKeys.java
 *
 * Created on Jan 25, 2011, 4:25:29 PM
 */

package userInterface;

/**
 *
 * @author Kyle
 */
public class HotKeys extends javax.swing.JFrame {
    /** Creates new form HotKeys */
    public HotKeys(int _parentX, int _parentY, int _parentWidth, int _parentHeight) {
        initComponents();
        //set the screen location of this dialog
        //current rule: same center as parents'
        int width = this.getWidth();
        int height = this.getHeight();
        int x = _parentX + (int) ((-width + _parentWidth) / 2);
        int y = _parentY + (int) ((-height + _parentHeight) / 2);
        setLocation(x, y);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hot Keys");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("res/documents_48.png"))); // NOI18N
        jPanel1.add(jLabel9, java.awt.BorderLayout.LINE_START);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18));
        jLabel10.setText("HOTKEYS");
        jPanel1.add(jLabel10, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(10, 0, 10, 10));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel1.setText("With Annotation Selected:");
        jPanel3.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("res/delete.png"))); // NOI18N
        jLabel2.setText("<html><b>Ctrl+D</b> - Delete annotation</html>");
        jPanel4.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("res/span_rl.png"))); // NOI18N
        jLabel6.setText("<html><b>Alt+Left Arrow</b> - Move end of span to the left</html>");
        jPanel5.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("res/span_rr.png"))); // NOI18N
        jLabel5.setText("<html><b>Alt+Right Arrow</b> - Move end of span to the right</html>");
        jPanel8.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("res/span_ll.png"))); // NOI18N
        jLabel4.setText("<html><b>Ctrl+Left Arrow</b> - Move start of span to the left</html>");
        jPanel6.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("res/span_lr.png"))); // NOI18N
        jLabel3.setText("<html><b>Ctrl+Right Arrow</b> - Move start of span to the right</html>");
        jPanel7.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("res/nextb.png"))); // NOI18N
        jLabel12.setText("<html><b>Left Arrow/Up Arrow</b> - Move to previous annotation</html>");
        jPanel11.add(jLabel12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("res/back.png"))); // NOI18N
        jLabel11.setText("<html><b>Right Arrow/Down Arrow</b> - Move to next annotation</html>");
        jPanel13.add(jLabel11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel7.setText("Other:");
        jPanel9.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("res/media-seek-backward-16.png"))); // NOI18N
        jLabel8.setText("<html><b>Ctrl+Z</b> - Undo previous annotation deletion</html>");
        jPanel10.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel12, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

}
