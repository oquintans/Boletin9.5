package ejercicio5;

import javax.swing.JOptionPane;

/*
 * @author Oscar
 */
public class SerieNum {

    private long num = this.pedirNum();

    public long pedirNum() {

        do {
            String dato = JOptionPane.showInputDialog("Introducir número de Elementos");
            num = Long.parseLong(dato);
        } while (num <= 0);
        return num;
    }

    public String seriePar() {

        long par = 0;
        String seriepar = "";

        for (int i = 0; i < num; i++) {
            par = par + 2;
            seriepar += " " + par;
        }
        return seriepar;
    }

    public String serieImparPar() {

        String serie = "";

        for (int i = 1; i < num + 1; i++) {
            if (i % 2 == 0) {
                serie = serie + "+" + i;
            }
            if (i % 2 == 1) {
                serie += "-" + i;
            }
        }
        return serie;
    }

    public String serieFibonacci() {

        long fib1 = 0;
        long fib2 = 1;
        long fib3 = 0;
        String serie = fib1 + "," + fib2;

        for (int i = 2; i < num; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            serie += "," + fib3;

        }
        return serie;
    }

    public void calcularSeries() {
        String serie = ("Serie 1: " + this.seriePar() + "\nSerie 2: " + this.serieImparPar() + "\nSerie 3: " + this.serieFibonacci());
        JOptionPane.showMessageDialog(null, serie);
    }
}
