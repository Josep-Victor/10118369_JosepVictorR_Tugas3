/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provis9.prak1;
import javax.swing.JFrame;
/**
 *
 * @author Josep
 */
public class Frameutama extends JFrame {
    public Frameutama()
    {
        this.setSize(300, 300);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void tampil(){
        this.setVisible(true);
    }
    
    //override atau overload method
    
    public void tampil(String nama){
        this.setTitle(nama);
        this.setVisible(true);
    }
}
