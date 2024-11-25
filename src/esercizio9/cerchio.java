/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio9;

/**
 *
 * Mirko Marcis 4INFD 25/11/2024
 * Definisci una classe Cerchio che permetta di calcolare l’area e il perimetro di un cerchio con centro
di coordinate xc e yc
.
 */
public class cerchio {
   //dichiarazione variabile xc
   private int xc;
   //dichiarazione variabile yc
   private int yc;
   //dichiarazione della variabile raggio
   private int raggio;
   //dichiarazione della variabile area
   private double area;
   //dichiarazione variabile perimetro
   private double perimetro;
   
   
   //metodo set che setta il valore di xc
   public void setxc(int xc_) {
       xc = xc_; //assegna il valore di xc_ a xc
   }
    
//metodo get che restituisce l'intero xc
   public int getxc() {
   return xc;
}
   //metodo set che setta il valore di yc
    public void setyc(int yc_) {
        yc = yc_; //assegna il valore di yc_ a yc
    }
    
//metodo get che restituisce l'intero yc
   public int getyc() {
return yc;
}
//metodo set che setta il valore del raggio 
 public void setraggio(int raggio_) {
     raggio = raggio_; //assegna il valore di raggio_ a raggio
 }
    
//metodo get che restituisce l'intero raggio
   public int getraggio() {
return raggio;
}

 //metodo get che restituisce l'area
   public double getarea() {
    return area;
}


//metodo get che restituisce il perimetro
   public double getperimetro() {
       return perimetro;
   }
   //metodo che calcola il valore dell'area
   public void calcoloarea() {
       area = Math.PI * raggio * raggio; //formula del calcolo dell'area del cerchio(area dichiarata come double perchè il metodo pi restituisce un double
   }
   //metodo che calcola il valore del perimetro
   public void calcoloperimetro() {
       perimetro = Math.PI *raggio; //formula del calcolo del perimetro (perimetro dichiarata come area per il motivo detto al commento sopra
   }
}


