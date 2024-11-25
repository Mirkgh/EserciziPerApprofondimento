/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio8;

/**
 *
 * Mirko Marcis 4INFD
 * Definisci una classe Punto che permetta di individuare un punto nel piano cartesiano, calcolando la
sua distanza dall’origine.
 */
public class punto {
    //dichiarazione della variabile x
    private int x;
    //dichiarazione della variabile y
    private int y;
    //dichiarazione della variabile originex con valore 0
    private int originex=0;
    //dichiarazione della variabile originey con valore 0
    private int originey=0;
    //dichiarazione della variabile distanza 
    private double distanza;
    
    //metodo set che setta il valore di x
    public void setx(int x_) {
        x = x_; //assegna il valore di x_ a x
    }
    //metodo get che restituisce l'intero x
    public int getx() {
        return x;
    }
    //metodo set che setta il valore di y
    public void sety(int y_) {
        y = y_; //assegna il valore di y_ a y
    }
    //metodo get che ci restituisce l'intero y
    public int gety() {
        return y;
    }
    //metodo che ci setta il valore di originex a 0
    public void setoriginex(int originex) {
        originex = 0;
    }
    //metodo get che ci restituisce l'intero originex
    public int getoriginex() {
        return originex;
    }
    //metodo set che setta il valore di originey a 0
    public void setoriginey(int originey) {
        originey = 0;
    }
    //metodo get che ci restituisce l'intero originey
    public int getoriginey() {
        return originey;
    }
    //metodo che ci calola la distanza dall'origine
    public void calcolodistanza(){
        //formula generale per calcolare la distanza dall'origine(il metodo sqrt restituisce sempre un double quindi distanza è di tipo double
        distanza =  Math.sqrt(x*x + y*y); 
    }
}
