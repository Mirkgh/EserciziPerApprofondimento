/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio10;

/**
 *
 * @author user
 */
public class rettangolo {
    
    //dichiarazione variabili
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double y1;
    private double y2;
    private double y3;
    private double y4;
    private double lato1;
    private double lato2;
    private double distanza;
    private double perimetro;
    private double area;
   

    // Metodo per calcolare la distanza tra due punti
    public void calcoloDistanza(double x1, double y1, double x2, double y2) {
        distanza = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Metodo per calcolare il perimetro del rettangolo
   public void calcolaPerimetro() {
        // Calcoliamo le lunghezze dei lati usando il 
        calcoloDistanza(x1, y1, x2, y2);  // Distanza tra il primo e il secondo punto
        double lato1 = distanza;
        
        calcoloDistanza(x2, y2, x3, y3);  // Distanza tra il secondo e il terzo punto
        double lato2 = distanza;

        //formula perimetro
        perimetro = 2 * (lato1 + lato2);

        
    }

    // Metodo per calcolare l'area 
    public void calcolaArea() {
       
        calcoloDistanza(x1, y1, x2, y2);  // Distanza tra il primo e il secondo punto
        double lato1 = distanza;
        
        calcoloDistanza(x2, y2, x3, y3);  // Distanza tra il secondo e il terzo punto
        double lato2 = distanza;

        //formula area
        area = lato1 * lato2;

      
    }
    }
