/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eserciziotpsit;

/**
 *
 * @author stefano.casti
 */
public class Persona {
    private String nome;
    private String cognome;
    private boolean genere;
    private int[] dataDiNascita;
    private int[] dataDiIscrizione;
    private String durataIscrizione;
    
    Persona(String nome, String cognome, boolean genere, int[] dataDiNascita, int[] dataDiIscrizione, String durataIscrizione){
        this.nome=nome;
        this.cognome=cognome;
        this.genere=genere;
        this.dataDiNascita=dataDiNascita;
        this.dataDiIscrizione=dataDiIscrizione;
        this.durataIscrizione=durataIscrizione;
    }
  
}
