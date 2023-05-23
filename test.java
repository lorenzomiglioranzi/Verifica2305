
/**
 * Aggiungi qui una descrizione della classe test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class test
{
    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    public static void main(String[] args) throws TroppiProdotti,ProdottoEsistente,CloneNotSupportedException{
        Libro l1 = new Libro("lorenzo", "il nano", 2005, 90898);
        Libreria li1 = new Libreria(); 
        li1.aggiungiLibro(l1); 
        li1.elencaLibreria();
    }
}
