package fr.larsouille.wglauncher;

import fr.theshark34.swinger.Swinger;

import javax.swing.*;

public class LauncherFrame extends JFrame
{
    private static LauncherFrame instance;
    private static LauncherPanel launcherPanel;

    public LauncherFrame()
    {
        this.setTitle("WhitherGate Launcher");
        this.setSize(959, 482);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(Swinger.getResource("icon.png"));
        this.setResizable(false);
        this.setContentPane(launcherPanel = new LauncherPanel());

        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        System.out.println("[WhitherGate Launcher] Le launcher est une commande sur Affects Dev Labs, il a été développé à 100% par Larsouille#1594 !");
        Swinger.setSystemLookNFeel();
        Swinger.setResourcePath("/assets");
        instance = new LauncherFrame();
    }

    public static LauncherFrame getInstance()
    {
        return instance;
    }

    public static LauncherPanel getLauncherPanel()
    {
        return launcherPanel;
    }
}
