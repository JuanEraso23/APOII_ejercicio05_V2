package context;

import javax.swing.JOptionPane;

public class Main {

      public static void main(String[] args) {
    	  //Atributos
          String numInput = JOptionPane.showInputDialog("Ingrese un número:");
          int num = Integer.parseInt(numInput);

          String mensaje = "";
            
          //Menu
          switch (num) {
            
            case 1:
            mensaje = "Lunes";
            break;

            case 2:
            mensaje = "Martes";
            break;

            case 3:
            mensaje = "Miércoles";
            break;

            case 4:
            mensaje = "Jueves";
            break;

            case 5:
            mensaje = "Viernes";
            break;

            case 6:
            mensaje = "Sábado";
            break;

            case 7:
            mensaje = "Domingo";
            break;

            default:
            mensaje = "!ERROR!\n No coincide con un día de la semana";
            break;
        }
            //Resultados
            JOptionPane.showMessageDialog(null, mensaje);
      }
}