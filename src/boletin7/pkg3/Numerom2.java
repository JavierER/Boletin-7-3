package boletin7.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Numerom2 {
    static public int pedirNumeroPositivo(){
   int numero;
   String res = JOptionPane.showInputDialog("Teclea el Numero :");
   numero=Integer.parseInt(res);
   return numero;
}
   static public void numeropositivo (int num1){
           if (num1>0)
           System.out.println("+");
           else if (0==num1)
           System.out.println("0");
           else if (0>num1)
           System.out.println("-");
}
}
