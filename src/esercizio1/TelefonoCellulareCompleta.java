/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esercizio1;

/**
     * Mirko Marcis 4infd 25/11/2024
     * Definisci la classe TelefonoCellulare dandone la rappresentazione completa.
     */
public class TelefonoCellulareCompleta {
    //dichiarazione della variabile contentente la marca del telefono
   private String MarcaTelefono;
   //dichiarazione della variabile contentente il modello del telefono
    private String ModelloTelefono; 
    //dichiarazione della varaibile contentente il prezzo del telefono
    private int PrezzoTelefono; 

    //metodo set per settare il valore della variabile MarcaTelefono
    public void setMarcaTelefono(String Marca) {
        MarcaTelefono = Marca; // Assegna il valore di Marca a MarcaTelefono
    }

    //metodo get che restituisce la stringa MarcaTelefono
    public String getMarcaTelefono() {
        return MarcaTelefono; 
    }

    //metodo set per settare il valore della variabile ModelloTelefono
    public void setModelloTelefono(String Modello) {
        ModelloTelefono = Modello; // Assegna il valore di Modello a ModelloTelefono
    }

    //metodo get che restituisce la stringa ModelloTelefono
    public String getModelloTelefono() {
        return ModelloTelefono; 
    }

    //metodo set per settare il valore della variabile PrezzoTelefono
    public void setPrezzoTelefono(int Prezzo) {
        PrezzoTelefono = Prezzo; // Assegna il valore di Prezzo a PrezzoTelefono
    }

    //metodo get che restituisce l'intero PrezzoTelefono
    public int getPrezzoTelefono() {
        return PrezzoTelefono; 
    }

    //metodo per stampare le informazioni del telefono
    public void stampa() {
        System.out.println("La marca del telefono è " + MarcaTelefono); 
        System.out.println("Il telefono è un " + ModelloTelefono); 
        System.out.println("Il prezzo del telefono è " + PrezzoTelefono); 
    }
}
