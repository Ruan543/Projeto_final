/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;


import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import javax.swing.JPanel;
import static sun.font.FontManagerNativeLibrary.load;

/**
 *
 * @author Ruan
 */
public class CanvasPanel extends JPanel implements Runnable{
    public CanvasPanel(){
        setDoubleBuffered(true);
        setFocusable(true);
        load();
        new Thread(this).start();
    }
    @Override
    public void paintComponent(Graphics g){
        int vet[], vety[], ares[];
        vet = new int[10];
        vety = new int[10];
        ares =new int[10];
        int i = 0;
        int j = 1;
        super.paintComponent(g);
        for(Vertice vertice : Controlador.getInstance().x){
                draw(g, vertice.getX(),vertice.getY());
            }
        i=0;
        for(Vertice vertice : Controlador.getInstance().x){
            vet[i] = vertice.getX();
            vety[i] = vertice.getY();
            i++;
        }
        i=0;
        ares[0]=-1;
        for(Aresta aresta : Controlador.getInstance().y){
            ares[i]=aresta.getA();
            ares[i+1]=aresta.getB();
            i=i+2;
            j++;
        }
        int w ,q;
        
        if(ares[0]!=-1){
            
            for(i=0;i<j;i++){
                w=ares[i];
                q=ares[i+1];
                
                Linha(g,vet[w-1] , vety[w-1], vet[q-1], vety[q-1]);
            }
        }
    }
    @Override
    public void run(){
        double btime, dtime = 0;
        btime = System.currentTimeMillis();
        while(true){
            update(dtime/1000);
            repaint();
            try {
                Thread.sleep(1);
            } 
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            dtime = (System.currentTimeMillis() - btime);
            btime = System.currentTimeMillis();
        }
    }
    private void load(){
        setBackground(Color.WHITE);
    }
    private void update(double dt){
        
    }
    private void gerar(){
        Graphics g = new Graphics() {
            @Override
            public Graphics create() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void translate(int i, int i1) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Color getColor() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setColor(Color color) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setPaintMode() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setXORMode(Color color) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Font getFont() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setFont(Font font) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public FontMetrics getFontMetrics(Font font) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Rectangle getClipBounds() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void clipRect(int i, int i1, int i2, int i3) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setClip(int i, int i1, int i2, int i3) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Shape getClip() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setClip(Shape shape) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void copyArea(int i, int i1, int i2, int i3, int i4, int i5) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void drawLine(int i, int i1, int i2, int i3) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void fillRect(int i, int i1, int i2, int i3) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void clearRect(int i, int i1, int i2, int i3) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void drawRoundRect(int i, int i1, int i2, int i3, int i4, int i5) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void fillRoundRect(int i, int i1, int i2, int i3, int i4, int i5) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void drawOval(int i, int i1, int i2, int i3) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void fillOval(int i, int i1, int i2, int i3) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void drawArc(int i, int i1, int i2, int i3, int i4, int i5) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void fillArc(int i, int i1, int i2, int i3, int i4, int i5) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void drawPolyline(int[] ints, int[] ints1, int i) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void drawPolygon(int[] ints, int[] ints1, int i) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void fillPolygon(int[] ints, int[] ints1, int i) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void drawString(String string, int i, int i1) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void drawString(AttributedCharacterIterator aci, int i, int i1) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, ImageObserver io) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, int i2, int i3, ImageObserver io) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, Color color, ImageObserver io) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, int i2, int i3, Color color, ImageObserver io) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, ImageObserver io) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, Color color, ImageObserver io) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
       //  for(Vertice vertice : Controlador.getInstance().x){
       //      draw(g, vertice.getX(),vertice.getY());
       //  }
    }
    private void draw(Graphics g, int x, int y){
        
    
        Graphics2D g2d = (Graphics2D)g;
       // g2d.draw(new Ellipse2D.Double(350,350,100,100));
        //g2d.fill(new Ellipse2D.Double(350, 250, 100, 100));
        
        g2d.draw(new Ellipse2D.Double(x, y, 100, 100));
        g2d.fill(new Ellipse2D.Double(x, y, 100, 100));
        

    }
    private void Linha(Graphics g, int x1, int y1,int x2, int y2){
        Graphics2D g2d = (Graphics2D)g;
        g2d.draw(new Line2D.Double(x1+50, y1+50, x2+50, y2+50));
    }
}
