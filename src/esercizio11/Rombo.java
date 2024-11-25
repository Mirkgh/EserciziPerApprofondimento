/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio11;

/**
 *
 * @author user
 */
public class Rombo {
    
    //dichiarazione variabili
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double y1;
    private double y2;
    private double y3;
    private double y4;
    private double perimetro;
    private double area;
    private double distanza;
    private double l1;
    private double l2;

  

    // Metodo per calcolare la distanza tra due punti e stamparla
    private void calcoloDistanza(double x1, double y1, double x2, double y2) {
        // Calcola la distanza tra i due punti
        distanza = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

       
    }

    // Metodo per calcolare il perimetro 
    public void calcolaPerimetro() {
     
        calcoloDistanza(x1, y1, x2, y2);  // Distanza tra il primo e il secondo punto
        double lato = distanza;  // Poiché tutti i lati del rombo sono uguali

        //formula perimetro
        perimetro = 4 * lato;

        
    }

    // Metodo per calcolare l'area 
    public void calcolaArea() {
        
        calcoloDistanza(x1, y1, x3, y3);  // Diagonale principale (tra il primo e il terzo punto)
         l1 = distanza;
        
        calcoloDistanza(x2, y2, x4, y4);  // Diagonale secondaria (tra il secondo e il quarto punto)
         l2 = distanza;

        //formula area
        area = (l1 * l2) / 2;

       
    }
}
