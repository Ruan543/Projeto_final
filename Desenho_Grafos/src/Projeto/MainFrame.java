/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;
import Projeto.CanvasPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class MainFrame extends JFrame {
    public MainFrame()
    {
        setTitle("Java 2D");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new CanvasPanel());
        setSize(2000, 2000);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
        new MainFrame().setVisible(true);
        }
        });
    }
    public static MainFrame instance=null;
    public static MainFrame getInstance(){
        if(instance==null){
            instance = new MainFrame();
        }
        return instance;
    } 
}
