/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minesweeper;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ahmad
 */
public class myJLabel extends JLabel{

    private MainSweep2 parent;
    private int x;
    private int y;

    public myJLabel(MainSweep2 parent, int x, int y) {
        super();

        this.x = x;
        this.y = y;
        this.parent = parent;

        setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        setForeground(new java.awt.Color(0, 51, 204));
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MousePressed(evt);
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MouseReleased(evt);
            }
        });
    }

    private void MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.setIcon(parent.iconDown);
    }

    private void MouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.setIcon(parent.iconUp);
        parent.open(x, y);
        System.out.println(this.x + "," + this.y + " clicked");
    }
}
