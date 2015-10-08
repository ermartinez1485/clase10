
import clases.Cuadrado;
import inter.IFiurasGeometricas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric Martinez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        IFiurasGeometricas figura = new Cuadrado();
        System.out.println("area igual " + figura.calcularArea());
        
        
        
        
    }
    
}
