import javax.swing.JOptionPane;
public class Estaciones {
    public static void main(String[] args) {
        String opcionTexto = JOptionPane.showInputDialog("Ingresa un numero: ");
            int opcion = Integer.parseInt(opcionTexto);
            switch (opcion) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
                    break;
                default:
                    System.out.println("Invalid Month");
            }

    }
}
