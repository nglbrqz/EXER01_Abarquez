/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyThings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Angela
 */
public class story extends javax.swing.JFrame {

     private int storyPart = 0;
    private int userProgress = 0; 
    private Timer typingTimer;
    private int textIndex = 0;
    private boolean[] yellowKeysCollected = new boolean[3];
    private boolean[] whiteKeysCollected = new boolean[3];
    
    public story() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        displayNextText();
    }
    
    // Method to display the next part of the story
    private void displayNextText() {
        String storyText = getStoryText(storyPart);
        ImageIcon image = null;

        // Set image for current story part
        switch (storyPart) {
            case 0:
                image = new ImageIcon(getClass().getResource("/MyImages/meWow.png"));
                break;
            case 1:
                image = new ImageIcon(getClass().getResource("/MyImages/meHungry.png"));
                break;
            case 2:
                image = new ImageIcon(getClass().getResource("/MyImages/meFull.png"));
                break;
            // Add more cases for additional story parts
        }

        
        textIndex = 0;
        startTypingAnimation(storyText);
        // Set image for current story part
        label1.setIcon(image);
    }
    
    private String getStoryText(int storyPart) {
        switch (storyPart) {
            case 0:
                return "Manuel: Wow. How was that possible?";
            case 1:
                return "Manuel: Anyways, I'm starving...";
            case 2:
                return "Manuel: Ahh I’m full! Now, what should I do?\n- Become a mermaid\n- Get high in Baguio\n- Become a radical dictator\n- Become Santa Clause\n- Ride a Ferris Wheel in 2015";
            default:
                return ""; // Handle other parts
        }
    }
    
    // Method to start text typing animation
    private void startTypingAnimation(String text) {
        typingTimer = new Timer(60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textIndex <= text.length()) {
                    // Display text up to current index
                    textfield1.setText(text.substring(0, textIndex));
                    textIndex++;
                } else {
                    // Stop timer when animation completes
                    typingTimer.stop();
                }
            }
        });
        // Start the typing animation timer
        typingTimer.start();
    }
    
    // Method to handle choice selection
    private void handleChoice(String choice) {
        // Process the choice and update story accordingly
        switch (choice) {
            case "Become a mermaid":
                // Handle becoming a mermaid choice
                break;
            case "Get high in Baguio":
                // Handle getting high in Baguio choice
                break;
            // Add cases for other choices
        }
        // Update story part after choice
        storyPart++;
        // Display next part of the story
        displayNextText();
    }
    
    private void checkEndings() {
        // Check if all yellow keys collected
        boolean allYellowKeysCollected = true;
        for (boolean keyCollected : yellowKeysCollected) {
            if (!keyCollected) {
                allYellowKeysCollected = false;
                break;
            }
        }

        if (allYellowKeysCollected) {
            // Display Food ending
            JOptionPane.showMessageDialog(this, "Food ending");
            // Give white key
            whiteKeysCollected[0] = true;
        }

        // Check if all white keys collected
        boolean allWhiteKeysCollected = true;
        for (boolean keyCollected : whiteKeysCollected) {
            if (!keyCollected) {
                allWhiteKeysCollected = false;
                break;
            }
        }

        if (allWhiteKeysCollected) {
            // Display Real ending
            JOptionPane.showMessageDialog(this, "Real ending");
            // Reset progress
            resetGame();
        }
    }

    private void resetGame() {
        // Reset story
        storyPart = 0;
        userProgress = 0;
        // Reset key collections
        for (int i = 0; i < yellowKeysCollected.length; i++) {
            yellowKeysCollected[i] = false;
            whiteKeysCollected[i] = false;
        }
        displayNextText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        textfield1 = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));

        textfield1.setBackground(new java.awt.Color(0, 0, 0));
        textfield1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        textfield1.setForeground(new java.awt.Color(255, 255, 255));
        textfield1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textfield1.setText("jTextField1");
        textfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        textfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("jLabel1");

        nextButton.setBackground(new java.awt.Color(0, 0, 0));
        nextButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nextButton)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label1)
                        .addComponent(textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(18, 18, 18)
                .addComponent(textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        storyPart++;
        displayNextText();
    }//GEN-LAST:event_nextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new story().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField textfield1;
    // End of variables declaration//GEN-END:variables
}
