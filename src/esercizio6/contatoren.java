/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio6;

/**
 *
 * Mirko Marcis 4INFD 25/11/2024
 * Definisci una classe Contatore moduloNche permetta di incrementare e decrementare una variabile
di una singola unità fino al raggiungimento del valore N:successivamente il conteggio riparte da 0.
 */
public class contatoren {
    //dichiarazione della variabile n
    private int n;
    //dichiarazione della variabile x
    private int x;
    //metodo set che setta il valore di n
    public void setn(int n_) {
        n = n_; //assegna il valore di n_ a n
    }
    //metodo get che ci restituisce l'intero n
    public int getn() {
        return n;
    }
    //metodo set che setta il valore di x
    public void setx(int x_) {
        x = x_; //assegna il valore di x_ a x
    }
    //metodo get che restituisce l'intero x
    public int getx() {
        return x;
    }
    //metodo che incrementa o decrementa in base alla condizione sottostante
    public void contatoreN(){
        if(x<n) { //se x è minore di n x aumenta di uno finche non raggiunge il valore di n
            do {
                x++;
            }while(x != n);
            x=0;        
        }else { //sennò se x è maggiore di n x decrementa di uno fino ad arrivare al valore di n
            do {
                x--;
            }while(x != n);
            x=0;
        }
    }
}
