import java.util.*; 
/**
 * Aggiungi qui una descrizione della classe LIbreria
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Libreria
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private static final int MAX = 100;  
    HashMap<Integer, Libro> libreria; 
    /**
     * Costruttore degli oggetti di classe  LIbreria
     */
    public Libreria(){
        libreria = new HashMap<Integer, Libro>(MAX); 
    }
    public void aggiungiLibro(Libro libro) throws CloneNotSupportedException, ProdottoEsistente, TroppiProdotti{
        if(libreria.size() >= MAX){
            throw new TroppiProdotti();
        }
        if(libreria.containsKey(libro.getCodice())){
            throw new ProdottoEsistente();
        }
        libreria.put(libro.getCodice(), libro.clone()); 
    }
    public void eliminaProdotto(int anno) throws ProdottoInesistente{
        if(libreria.isEmpty() || !libreria.containsKey(anno)){
            throw new ProdottoInesistente(); 
        }
        libreria.remove(anno); 
    }
    public Libro ricercaLibro(int codice) throws CloneNotSupportedException, ProdottoInesistente{
        for(Libro libro : libreria.values()){
            if(libro.getCodice() == codice){
                return libro.clone(); 
            } 
        }
        throw new ProdottoInesistente();
    }
    public Libro[] elencaLibreria(){
        Libro[] tmp = (Libro[])libreria.values().toArray();
        return tmp; 
    }
}
