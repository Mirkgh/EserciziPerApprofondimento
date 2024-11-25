/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio3;

/**
 *
 * Mirko Marcis 4INFD 25/11/2024
 * Definisci una classe Auto per rappresentare oggetti automobile con il nome della marca, il nome
del modello, la targa e l’anno di immatricolazione e con opportuni metodi d’istanza tra cui un
metodo del tipo String toString() per la sua descrizione.
 */
public class Auto {

   //dichiarazione della variabile nomeMarca
    private String nomeMarca;
    //dichiarazione della variabile nomeModello
    private String nomeModello;
    //dichiarazione della varaibile Targa
    private String Targa;
    //dichiarazione della varabile AnnoDiImmatricolazione
    private int AnnoDiImmatricolazione;
    
//creazione del costruttore dove gli passiamo tutte le nostre variabili 
    public Auto(String nomeMarca, String nomeModello, String Targa, int AnnoDiImmatricolazione){
     
    }
    //metodo set che setterà il valore di nomeMarca
    public void setnomeMarca(String Marca) {
        nomeMarca = Marca; //assegna il valore di Marca a nomeMarca
    }
    //metodo get che restituisce la stringa nomeMarca 
    public String getnomeMarca() {
        return nomeMarca;
    }
    //metodo set che setterà il valore di nomeModello
    public void setnomeModello(String Modello) {
        nomeModello = Modello; //assegna il valore di Modello a nomeModello
    }
    //metodo get che restituisce la stringa nomeModello
    public String getnomeModello() {
        return nomeModello;
    }
    //metodo set che setterà il valore di Targa
    public void setTarga(String targa) {
        Targa = targa; //assegna il valore di targa a Targa
    }
    //metodo get che restituisce la stringa Targa
    public String getTarga() {
        return Targa;
    }
    //metodo set che setterà il valore di AnnoDiImmatricolazione 
    public void setAnnoDiImmatricolazione(int Anno) {
        AnnoDiImmatricolazione = Anno;//assegna il valore di Anno a ANnoDiImmatricolazione 
    }
    //metodo get che restituisce l'intero AnnoDiImmatricolazione
    public int getAnnoDiImmatricolazione() {
        return AnnoDiImmatricolazione;
    }
    //metodo toString che ci permetto di visualizzare il nostro oggetto come stringa dove all'interno restituissce una stampa con tutti gli attributi
    public String ToString() {
        return "" + "l'auto è una " +nomeMarca + " il modello è " + nomeModello + " la targa è " + Targa + " immatricolata nel " +AnnoDiImmatricolazione;
    }
}
