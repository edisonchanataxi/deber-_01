package ec.edu.iser.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Edison Chanataxi
 */
public class Lista {

    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista crearLista() {
        int x;
        primero = null;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato para "
                    + "el nodo"));
            if (x != -1) {
                primero = new Nodo(x, primero);
            }
        } while (x != -1);
        return this;
    }

    public void imprimir(){
        Nodo n;
        n = primero;
        String acu="";
        while (n != null){
            acu += n.dato + " ";
            n = n.enlace;  
        }
        JOptionPane.showMessageDialog(null, acu);
    }
    
    public void menu(){
        int opcion=1;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que se desea realizar:"
                + "\n1) Llenar la lista"
                + "\n2) Imprimir la lista"
                + "\n3) Salir"));
        if(opcion!=3){
            switch (opcion){
                case 1:
                    crearLista();
                    break;
                case 2:
                    imprimir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta!!");
            }
            menu();             
        }
        else
            JOptionPane.showMessageDialog(null,"Adios!!");
    }
}