/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author keiran
 */
class AdEnvironment extends Environment {

    Image logo;
    
    public AdEnvironment() {
        this.setBackground(Color.black);
        logo = ResourceTools.loadImageFromResource("drawstuff/retrologo.png");
    }

    @Override
    public void initializeEnvironment() {
        
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 693, 520);
        
        graphics.setColor(new Color(252, 101, 25));       
        graphics.fillOval(30, -65, 100, 100);
        graphics.setColor(new Color(255, 38, 147));
        graphics.fillOval(150, -30, 100, 100);
        graphics.setColor(new Color(38, 176, 255, 200));
        graphics.fillOval(265, 41, 100, 100);
        graphics.setColor(new Color(219, 219, 219));
        graphics.fillOval(369, -15, 100, 100);
        graphics.setColor(Color.white);
        graphics.fillOval(375, -8, 87, 87);
        graphics.setColor(new Color(129, 222, 255, 200));
        graphics.fillOval(540, -45, 100, 100);
        graphics.setColor(new Color(219, 219, 219));
        graphics.fillOval(605, 63, 100, 100);
        graphics.setColor(Color.white);
        graphics.fillOval(612, 70, 87, 87);
        graphics.setColor(new Color(185, 20, 255, 140));
        graphics.fillOval(633, 123, 100, 100);
        
        graphics.setColor(new Color(219, 219, 219));
        graphics.fillOval(-32, 155, 100, 100);
        graphics.setColor(Color.white);
        graphics.fillOval(-26, 161, 87, 87);
        
        graphics.setColor(new Color(255, 239, 0));
        graphics.fillOval(97, 180, 100, 100);
        
        graphics.setColor(new Color(40, 239, 170));
        graphics.fillOval(190, 114, 100, 100);
        
        graphics.setColor(new Color(90, 0, 180, 80));
        graphics.fillOval(326, 55, 100, 100);
        
        graphics.setColor(new Color(255, 239, 0));
        graphics.fillOval(495, 85, 100, 100);
        graphics.setColor(new Color(240, 81, 80));
        graphics.fillOval(533, 190, 100, 100);
        
        graphics.setColor(new Color(255, 180, 0, 120));
        graphics.fillOval(480, 147, 100, 100);
        
        graphics.setColor(new Color(8, 57, 255, 10));
        graphics.fillOval(300, 139, 100, 100);
        
        graphics.setColor(new Color(0, 220, 255, 80));
        graphics.fillOval(260, 159, 100, 100);
        graphics.setColor(new Color(0, 195, 250, 90));
        
        graphics.fillOval(355, 137, 100, 100);
        
        graphics.setColor(new Color(147, 64, 255, 130));
        graphics.fillOval(29, 287, 100, 100);
        
        graphics.setColor(new Color(44, 255, 143, 200));
        graphics.fillOval(127, 353, 100, 100);
        graphics.setColor(new Color(44, 214, 255, 230));
        graphics.fillOval(235, 268, 100, 100);
        
        graphics.setColor(new Color(184, 14, 235, 140));
        graphics.fillOval(295, 271, 100, 100);
        
        graphics.setColor(new Color(255, 179, 0, 180));
        graphics.fillOval(331, 335, 100, 100);
        
        graphics.setColor(new Color(227, 255, 40, 215));
        graphics.fillOval(383, 220, 100, 100);
        
        graphics.setColor(new Color(3, 168, 250, 140));
        graphics.fillOval(453, 310, 100, 100);
        
        graphics.setColor(new Color(219, 219, 219));
        graphics.fillOval(483, 355, 100, 100);
        graphics.setColor(Color.white);
        graphics.fillOval(488, 361, 87, 87);
        
        graphics.setColor(new Color(0, 0, 0, 120));
        graphics.setFont(new Font("Calibri", Font.PLAIN, 28));
        graphics.drawString("This should brighten everyone's day.", 125, 500);
     
        if (logo != null) {
            graphics.drawImage(logo, 294, 145, 130, 152, this);
        }
        
    }

}
