/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio7;

/**
 *
 * Mirko Marcis 4INFD 25/11/2024
 * Definisci una classe Contatore moduloNche permetta di incrementare e decrementare una variabile
di un passo P fino al raggiungimento del valore N: successivamente il conteggio riparte da 0.
 */
public class contatorep {
    //dichiarazione della variabile n
    private int n;
    //dichiarazione della variabile x
    private int x;
    //dichiarazione della variabile p
    private int p;
    
    //metodo set che setta il valore di n
    public void setn(int n_) {
        n = n_; //assegna il valore di n_ a n
    } 
    //metodo get che restituisce l'intero n 
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
    //metodo set che setta il valore di p 
    public void setp(int p_) {
        p = p_; //assegna il valore di p_ a p
    }
    //metodo get che restituisce l'intero p
    public int getp() {
        return p;
    }
    //metodo che incrementa o decrementa in base a una condizione
    public void contatoreNP(){
        if(x<n) { //se x è minore di n a x gli sommiamo p finchè x è uguale a n e x minore di n
            do {
                x = x + p;
            }while(x != n || x > n);
            x=0;        
        }else { //se x è maggiore di n a x gli sommiamo p fiche x è uguale a n e x maggiore di n
            do {
               x = x - p;
            }while(x != n || x < n);
            x=0;
        }
  
}
}
