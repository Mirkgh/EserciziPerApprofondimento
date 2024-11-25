/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio5;

/**
 *
 * Mirko Marcis 4INFD 25/11/2024
 * Definisci una classe Contatore che permetta di incrementare e decrementare una variabile di una
singola unità.
 */
public class contatore {
    //dichiarazione della variabile x
    private int x;
    //metodo set che setta il valore di x
    public void setx(int x_) {
        x = x_; //assegna il valore x_ a x
    }
    //metodo get che ci restituisce l'intero x
    public int getx() {
        return x;
    }
    //metodo per l'incremento
    public void incremento(){
        for(int i=0; i<1; i++) { //ciclo for che arriva fino ad uno ed esce
            x = x++; //incremento di un unità su x
        }
    }
    //metodo per il decremento
    public void decremento(){
        for(int i=0; i<1; i++) { //ciclo for che arriva fino ad uno e poi esce
            x = x--; //decremento di un unita di x 
        }
    }
}
