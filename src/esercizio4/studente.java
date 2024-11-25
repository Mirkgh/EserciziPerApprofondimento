/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio4;

/**
 *
 * Mirko Marcis 4INFD 25/11/2024
 * Definisci una classe Studente per rappresentare oggettistudente con il cognome, il nome, il codice
fiscale, il numero di matricola e con opportuni metodi d’istanza tra cui un metodo del tipo String
toString() per la sua descrizione.
 */
public class studente {
    //dichiarazione della variabile cognome
     private String cognome;
     //dichiarazione della variabile nome
    private String nome;
    //dichiarazione della variabile codicefiscale
    private String codicefiscale;
    //dichiarazione della variabile numeromatricola
    private int numeromatricola;
    
//creazione del costruttore dove gli passiamo tutti gli attributi
    public studente (String nome, String cognome, String codice fiscale, int numeromatricola){
     
    }
    //metodo set che settrà la variabile cognome
    public void setcognome(String cog) {
        cognome = cog;//assegna il valore di cog a cognome
    }
    //metood get che restituisce la stringa congome 
    public String getcognome() {
        return cognome;
    }
    //metodo set che settera il valore di nome
    public void setnome(String nom) {
        nome = nom; //assegna il valore di nom a nome
    }
    //metodo get che restituisce la stringa nome
    public String getnome() {
        return nome;
    }
    //metodo set che setta il valore di codice fiscale
    public void setcodicefiscale(String cf) {
        codicefiscale = cf; //assegna il valore di cf a codicefiscale
    }
    //metodo get che restituisce la stringa codicefiscale
    public String getcodicefiscale() {
        return codicefiscale;
    }
    //metodo set che setta il valore di numeromatricola
    public void setnumeromatricola(int nm) {
        numeromatricola = nm; //assegna il valore di nm a numeromatricola
    }
    //metodo get che restituisce l'intero numeromatricola
    public int getnumeromatricola() {
        return numeromatricola;
    }
    //metodo to string che visualizza l'oggetto come stringa al suo interno restituisce una stampa con gli attributi dell'oggetto
    public String ToString() {
        return "" + "l'auto è una " +cognome + " il modello è " + nome + " la targa è " + codicefiscale + " immatricolata nel " +numeromatricola;
    }
}

