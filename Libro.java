
/**
 * Aggiungi qui una descrizione della classe Libro
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Libro implements cloneable  
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private String autore;
    private String titolo; 
    private int anno; 
    private int codice; 

    /**
     * Costruttore degli oggetti di classe  Libro
     */
    public Libro()
    {
        autore = "";
        titolo = "";
        anno = 0; 
        codice = 0; 
    }
    public Libro(String autore, String titolo, int anno, int codice){
        this.autore = autore; 
        this.titolo = titolo; 
        this.anno = anno; 
        this.codice = codice; 
    }
    public String getAutore(){return autore;}
    public String getTitolo(){return titolo;}
    public int getAnno(){return anno;}
    public int getCodice(){return codice;}
    public void setAutore(String autore){this.autore = autore;}
    public void setTitolo(String titolo){this.titolo = titolo;}
    public void setAnno(int anno){this.anno = anno;}
    public void setCodice(int codice){this.codice = codice;}
    
    public String toString(){return "autore: "+autore+" titolo: "+titolo+" anno: "+anno+" dodice: "+codice;}
    public boolean equals(Libro l){return getAutore().equals(l.getAutore()) && getTitolo().equals(l.getTitolo()) && getAnno() == l.getAnno() && getCodice() == l.getCodice();}
    public Libro clone() throws CloneNotSupportedException {
        return (Libro)super.clone(); 
    }
}
