package assignment_palindromechecker;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame
{
    Stack stacks = new Stack();
    Queue queue = new LinkedList();
    String testString;
    
    public Main() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textInput = new javax.swing.JTextField();
        CheckBtn = new javax.swing.JButton();
        stacksBtn = new javax.swing.JRadioButton();
        queuesBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textInput.setToolTipText("Enter your word here");

        CheckBtn.setText("CHECK");
        CheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBtnActionPerformed(evt);
            }
        });

        stacksBtn.setText("Use Stacks");
        stacksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stacksBtnActionPerformed(evt);
            }
        });

        queuesBtn.setText("Use Queues");
        queuesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queuesBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PALINDROME CHECKER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(CheckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(stacksBtn)
                        .addGap(82, 82, 82)
                        .addComponent(queuesBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(90, 90, 90)
                .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stacksBtn)
                    .addComponent(queuesBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(CheckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBtnActionPerformed
        if(stacksBtn.isSelected())
        {
            String temp = textInput.getText();
            this.testString =  temp.toUpperCase();
            /*The user text is converted to uppercase letters so words like "Madam"
              are read as a palindrome.(Per the question)*/
            StackClass();
            
        }
        else if (queuesBtn.isSelected())
        {   
            String temp = textInput.getText();
            this.testString =  temp.toUpperCase();            
            /*The user text is converted to uppercase letters so words like "Madam"
              are read as a palindrome.(Per the question)*/
            QueueClass();
        }
    }//GEN-LAST:event_CheckBtnActionPerformed

    private void queuesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queuesBtnActionPerformed
        stacksBtn.setSelected(false);
    }//GEN-LAST:event_queuesBtnActionPerformed

    private void stacksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stacksBtnActionPerformed
        queuesBtn.setSelected(false);
    }//GEN-LAST:event_stacksBtnActionPerformed

    public static void main(String args[])
    {
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton queuesBtn;
    private javax.swing.JRadioButton stacksBtn;
    private javax.swing.JTextField textInput;
    // End of variables declaration//GEN-END:variables

    private void StackClass()
    {
              
        for(int i = 0; i < testString.length(); i++)
            {
                stacks.push(testString.charAt(i));
            }

        String reverseString = "";
        while (!stacks.isEmpty())
            {
                reverseString = reverseString+stacks.pop();
            }

        if (testString.equals(reverseString))
            {
                JOptionPane.showMessageDialog(null,"Your text is a palindrome.","Note", JOptionPane.INFORMATION_MESSAGE);
                textInput.setText("");
            }
          else
            {
                JOptionPane.showMessageDialog(null,"Your text is not a palindrome.","Note", JOptionPane.INFORMATION_MESSAGE);
                textInput.setText("");
            }

       }

    private void QueueClass()
    {
        for (int i = testString.length()-1; i >=0; i--)
        {
            queue.add(testString.charAt(i));
        }

        String reverseString = "";
        while (!queue.isEmpty())
        {
            reverseString = reverseString+queue.remove();
        }
        
        if (testString.equals(reverseString))
        {
            JOptionPane.showMessageDialog(null,"Your text is a palindrome.","Note", JOptionPane.INFORMATION_MESSAGE);
            textInput.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Your text is not a palindrome.","Note", JOptionPane.INFORMATION_MESSAGE);
            textInput.setText("");
        }
    }
}
