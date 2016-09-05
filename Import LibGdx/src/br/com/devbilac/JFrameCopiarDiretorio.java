package br.com.devbilac;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class JFrameCopiarDiretorio extends javax.swing.JFrame {

    public JFrameCopiarDiretorio() {
        initComponents();
    }
    public void Importar(){
    	try {
    		String origem = JTxt_Import.getText();
    		String destino = JTxt_Destino.getText();
            java.io.File dirOrigem;
            java.io.File dirdestino;
            boolean Radios[] = {JRBtn_Android.isSelected(),JRBtn_Core.isSelected(),JRBtn_Desktop.isSelected(),JRBtn_Html.isSelected()};
            if(Radios[0] == true){//Android
            	dirOrigem = new java.io.File(origem+"\\android\\bin");
            	dirdestino = new java.io.File(destino+"\\android\\bin");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            	dirOrigem = new java.io.File(origem+"\\android\\assets");
            	dirdestino = new java.io.File(destino+"\\android\\assets");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            	dirOrigem = new java.io.File(origem+"\\android\\src");
            	dirdestino = new java.io.File(destino+"\\android\\src");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            }
            if(Radios[1] == true){//Core
            	dirOrigem = new java.io.File(origem+"\\core\\bin");
            	dirdestino = new java.io.File(destino+"\\core\\bin");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            	dirOrigem = new java.io.File(origem+"\\core\\assets");
            	dirdestino = new java.io.File(destino+"\\core\\assets");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            	dirOrigem = new java.io.File(origem+"\\core\\src");
            	dirdestino = new java.io.File(destino+"\\core\\src");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            }
            if(Radios[2] == true){
            	dirOrigem = new java.io.File(origem+"\\desktop\\src");
            	dirdestino = new java.io.File(destino+"\\desktop\\src");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            	dirOrigem = new java.io.File(origem+"\\desktop\\bin");
            	dirdestino = new java.io.File(destino+"\\desktop\\bin");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            }
            if(Radios[3] == true){
            	dirOrigem = new java.io.File(origem+"\\html\\bin");
            	dirdestino = new java.io.File(destino+"\\html\\bin");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            	dirOrigem = new java.io.File(origem+"\\html\\src");
            	dirdestino = new java.io.File(destino+"\\html\\src");
            	CopiaArquivos.copyAll(dirOrigem, dirdestino, true);
            }
            JOptionPane.showMessageDialog(rootPane, "Import realiado com sucesso!");
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(rootPane, "Ocorreu um Erro!");
            e.printStackTrace();   //insira o tratamento de erros que preferir
        }
    }
    @SuppressWarnings("unchecked")                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JRBtn_Android = new javax.swing.JRadioButton();
        JRBtn_Core = new javax.swing.JRadioButton();
        JRBtn_Desktop = new javax.swing.JRadioButton();
        JRBtn_Html = new javax.swing.JRadioButton();
        JLbl_Import = new javax.swing.JLabel();
        JLbl_Destino = new javax.swing.JLabel();
        JBtn_Browse1 = new javax.swing.JButton();
        JBtn_Browse2 = new javax.swing.JButton();
        JTxt_Import = new javax.swing.JTextField();
        JTxt_Destino = new javax.swing.JTextField();
        JLbl_Titulo = new javax.swing.JLabel();
        JBtn_Importar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu_Sobre = new javax.swing.JMenu();
        JMItem_Dev = new javax.swing.JMenuItem();
        JMenu_Ajuda = new javax.swing.JMenu();
        JMItem_Utilizar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Importação LibGDX");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Import"));

        JRBtn_Android.setText("Android");

        JRBtn_Core.setText("Core");

        JRBtn_Desktop.setText("Desktop");

        JRBtn_Html.setText("Html");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBtn_Android)
                    .addComponent(JRBtn_Core)
                    .addComponent(JRBtn_Desktop)
                    .addComponent(JRBtn_Html))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRBtn_Android)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JRBtn_Core)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRBtn_Desktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JRBtn_Html))
        );

        JLbl_Import.setText("Projeto Import:");

        JLbl_Destino.setText("Projeto:");

        JBtn_Browse1.setText("Browse");
        JBtn_Browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_Browse1ActionPerformed(evt);
            }
        });

        JBtn_Browse2.setText("Browse");
        JBtn_Browse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_Browse2ActionPerformed(evt);
            }
        });

        JLbl_Titulo.setFont(new java.awt.Font("Tahoma", 0, 18));
        JLbl_Titulo.setText("Sistema de Importação de LibGDX");

        JBtn_Importar.setText("Importar");
        JBtn_Importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_ImportarActionPerformed(evt);
            }
        });

        JMenu_Sobre.setText("Sobre");

        JMItem_Dev.setText("Ferramenta");
        JMItem_Dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItem_DevActionPerformed(evt);
            }
        });
        JMenu_Sobre.add(JMItem_Dev);

        jMenuBar1.add(JMenu_Sobre);

        JMenu_Ajuda.setText("Ajuda");

        JMItem_Utilizar.setText("Como Utilizar");
        JMItem_Utilizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItem_UtilizarActionPerformed(evt);
            }
        });
        JMenu_Ajuda.add(JMItem_Utilizar);

        jMenuBar1.add(JMenu_Ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLbl_Destino)
                            .addComponent(JLbl_Import))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTxt_Destino, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBtn_Browse2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JTxt_Import)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBtn_Browse1)))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(JBtn_Importar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(JLbl_Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JLbl_Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLbl_Import)
                            .addComponent(JBtn_Browse1)
                            .addComponent(JTxt_Import, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLbl_Destino)
                            .addComponent(JBtn_Browse2)
                            .addComponent(JTxt_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(JBtn_Importar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }              

    private void JBtn_Browse1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
 JFileChooser file = new JFileChooser(); 
          file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
          int i= file.showSaveDialog(null);
        if (i==1){
            JTxt_Import.setText("");
        } else {
            File arquivo = file.getSelectedFile();
           JTxt_Import.setText(arquivo.getPath());
        }
    }                                            

    private void JBtn_Browse2ActionPerformed(java.awt.event.ActionEvent evt) {                                             
     JFileChooser file = new JFileChooser(); 
          file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
          int i= file.showSaveDialog(null);
        if (i==1){
            JTxt_Destino.setText("");
        } else {
            File arquivo = file.getSelectedFile();
           JTxt_Destino.setText(arquivo.getPath());
        }
    }                                            

    private void JBtn_ImportarActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if(JTxt_Import.getText().equals("") || JTxt_Destino.getText().equals("")){
    		JOptionPane.showMessageDialog(null, "Você precis inserir o Projeto Import e Projeto Destino.");
    	}else{Importar();}
    }                                             

    private void JMItem_UtilizarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        JOptionPane.showMessageDialog(null,""
        		+ "Para Utilizar siga as instruções:"
        		+ "\n"
        		+ "\nAtenção: Faça um backup antes da Importação."
        		+ "\nCrie um Projeto no Gdx-Setup com o mesmo nome do"
        		+ "\nprojeto que deseja importar."
        		+ "\nEx: com.mygdx.game"
        		+ "\n"
        		+ "\nProjeto Import = Projeto que deseja importar"
        		+ "\nProjeto Destino = Projeto criado no Gdx-Setup"
        		+ "\n"
        		+ "\nSelecione os Tipos de Projeto que serão importados"
        		+ "\n"
        		+ "\nClique em Importar"
        		+ "\nVá no Eclipe e Importe o Projeto Destino.");
    }                                               

    private void JMItem_DevActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JOptionPane.showMessageDialog(null,""
        		+ "Esta Ferramenta foi desenvolvida devido a dificuldade em importar \nprojetos da LibGDX, esta ferramenta não é 100% funcional, ela só \nimporta pastas pré programadas."
        		+ "\n\nLista de Pastas Pré-Programadas:\n"
        		+ "\nandroid/bin\nandroid/assets\nandroid/src"
        		+ "\ncore/bin\ncore/assets\ncore/src"
        		+ "\ndesktop/bin\ndesktop/src"
        		+ "\nhtml/bin\nhtml/src\n"
        		+ "\nDesenvolvido por Luiz Otávio."
        		+ "\n04/09/2016");
    }                                          

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
            java.util.logging.Logger.getLogger(JFrameCopiarDiretorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCopiarDiretorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCopiarDiretorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCopiarDiretorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCopiarDiretorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton JBtn_Browse1;
    private javax.swing.JButton JBtn_Browse2;
    private javax.swing.JButton JBtn_Importar;
    private javax.swing.JLabel JLbl_Destino;
    private javax.swing.JLabel JLbl_Import;
    private javax.swing.JLabel JLbl_Titulo;
    private javax.swing.JMenuItem JMItem_Dev;
    private javax.swing.JMenuItem JMItem_Utilizar;
    private javax.swing.JMenu JMenu_Ajuda;
    private javax.swing.JMenu JMenu_Sobre;
    public javax.swing.JRadioButton JRBtn_Android;
    public javax.swing.JRadioButton JRBtn_Core;
    public javax.swing.JRadioButton JRBtn_Desktop;
    public javax.swing.JRadioButton JRBtn_Html;
    private javax.swing.JTextField JTxt_Destino;
    private javax.swing.JTextField JTxt_Import;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
