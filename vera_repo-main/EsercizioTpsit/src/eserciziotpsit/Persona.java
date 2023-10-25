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
    private int[] durataIscrizione;
    
    Persona(String nome, String cognome, boolean genere, int[] dataDiNascita, int[] dataDiIscrizione, int[] durataIscrizione){//, boolean genere, int[] dataDiNascita, int[] dataDiIscrizione, String durataIscrizione){
        this.nome=nome;
        this.cognome=cognome;
        this.genere=genere;
        this.dataDiNascita=dataDiNascita;
        this.dataDiIscrizione=dataDiIscrizione;
        this.durataIscrizione=durataIscrizione;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getCognome(){
        return cognome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public boolean getGenere(){
        return genere;
    }
    public void setGenere(boolean genere){
        this.genere=genere;
    }
    public int[] getDataDiNascita(){
        return dataDiNascita;
    }
    public void setDataDiNascita(int[] dataDiNascita){
        this.dataDiNascita=dataDiNascita;
    }
    public int[] getDataDiIscrizione(){
        return dataDiIscrizione;
    }
    public void setDataDiIscrizione(int[] dataDiIscrizione){
        this.dataDiIscrizione=dataDiIscrizione;
    }
    public int[] getDurataIscrizione(){
        return durataIscrizione;
    }
    public void setDurataIscrizione(int[] durataIscrizione){
        this.durataIscrizione=durataIscrizione;
    }
    
    
    
  
}
