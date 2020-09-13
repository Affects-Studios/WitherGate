package fr.larsouille.wglauncher;

import fr.theshark34.openlauncherlib.util.Saver;
import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.textured.STexturedButton;

import javax.swing.*;
import java.awt.*;

public class LauncherPanel extends JPanel
{
    private Image Background = Swinger.getResource("background.png");
    
    public static final Saver WG_SAVER = new Saver(Launcher.WG_DIR);
    
    private JTextField usernameField = new JTextField(WG_SAVER.get("username"));
    private JPasswordField passwordField = new JPasswordField();

    private STexturedButton playButton = new STexturedButton(Swinger.getResource("buttons/play.png"));
    
    public LauncherPanel()
    {
        this.setLayout(null);
        // Les TextFields :

        //usernameField :
        usernameField.setBounds(15, 348, 191, 29);
        usernameField.setOpaque(false);
        usernameField.setBorder(null);
        usernameField.setForeground(Color.WHITE);
        usernameField.setFont(usernameField.getFont().deriveFont(18F));
        usernameField.setCaretColor(Color.WHITE);

        //passwordField :
        passwordField.setBounds(15, 418, 191, 29);
        passwordField.setOpaque(false);
        passwordField.setBorder(null);
        passwordField.setForeground(Color.WHITE);
        passwordField.setFont(passwordField.getFont().deriveFont(18F));
        passwordField.setCaretColor(Color.WHITE);

        //playButton :
        playButton.setBounds(0, 0);

        //Ajout des composants dans le LauncherPanel :
        this.add(usernameField);
        this.add(passwordField);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawImage(Background, 0,0, this.getWidth(), this.getHeight(), this);
    }

}
