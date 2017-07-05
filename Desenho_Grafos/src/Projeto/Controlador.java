/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.util.ArrayList;
import javax.swing.JTextField;


/**
 *
 * @author Ruan
 */
public class Controlador {
    public ArrayList<Vertice> x=new ArrayList<>();
    public ArrayList<Aresta> y=new ArrayList<>();
    
    public static Controlador instance=null;
    public static Controlador getInstance(){
        if(instance==null){
            instance = new Controlador();
        }
        return instance;
    } 
    public void adicionar(Vertice v){
        x.add(v);
    }
    public void adicionar(Aresta a){
        y.add(a);
    }
    public void imprimirVertice(){
        for(Vertice Vertice : x){
            System.out.println(Vertice.getX()+" - "+Vertice.getY());
        }
    }
    public void imprimirAresta(){
        for(Aresta Aresta : y){
            System.out.println(Aresta.getA()+" - "+Aresta.getB());
        }
    }
    
    
}
