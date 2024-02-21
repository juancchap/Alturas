package alturas;

import javax.swing.JOptionPane;

public class Alturas {

    public static void main(String[] args) {
        int edad, sumaEdad = 0, ConteoMayor18 = 0, ContadorMayor175 = 0;
        float altura, sumaAltura = 0, mediaEdad, mediaAltura;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digita la edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Digita tu altura: "));
            sumaEdad = sumaEdad + edad;
            sumaAltura = sumaAltura + altura;

            if (edad > 18) {
                ConteoMayor18++;
            }

            if (altura > 1.75) {
                ContadorMayor175++;
            }

        }
        mediaEdad = (float) sumaEdad / 5;
        mediaAltura = (float) sumaAltura / 5;

        System.out.println("La edad Priomedio es: " + mediaEdad);
        System.out.println("La altura promedio es: " + mediaAltura);
        System.out.println("La cantidad de  mayores de 18 son:" + ConteoMayor18);
        System.out.println("Los alumnos que miden mas de 175 son: " + ContadorMayor175);

    }

}
