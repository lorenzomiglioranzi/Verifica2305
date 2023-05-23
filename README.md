# CONSEGNA DELLA VERIFICA
Crea una classe Libro passandogli autore, titolo, anno di pubblicazione e codice.
Poi crea una classe libreria con la collezione che ti sembra più adatta e fai un eliminazione attraverso l’anno di pubblicazione e una ricerca attraverso il codice del Libro.
Successivamente stampa l’intera libreria

# SCHEMA UML
 ![codice1](codice1.JPG)
# CLASSE LIBRO
 ![comandi2](comandi2.JPG)
nella classe `Libro`, ci sono i metodi `Libro` che è il costruttore e ho fatt oanche il costruttore di copia
ci sono tutti i `set` per memorizzare il valroe della variabile e i `get` per poter returnae il valore
nel metodo `toString` stampo tutte le vaibili con una picocla descrizione, poi ho `equals` per controllare se due oggetti sono uguali
e `clone` per poter clonare l'oggetto

# CLASSE LIBRERIA
 ![codice3](codice3.JPG) 
nella classe `Libreria`, il metodo `Libreria` che è il costruttore, poi il metodo `aggiungiLibro` per aggiungere un'oggetto Libro alla Libreria 
`eliminaProdotto` per eliminare un libro dalla libreria, `ricercaLibro` per cercare un libro tramite codice visto che ho deciso di usare una HasMap, che è stata importata con import java.util.*`, 
`elencaLibreria` per stampare l'intera libreria,  
# ECCEZIONI
 ![codice4](codice4.JPG)
`prodttoEsistente`, `ProdottoInesistente`, `TroppiProdotti` tutti eccezioni che verrano lanciati se ci saranno troppi prodotti, prodotti inesisten o il prodtto sia gia esistente 

# COMANDI GIT 
`cd $home/<percorso>/<nomeCartella>`: sincronizzo la mia cartella

# comandi usati per inserire il README.md su git
 git init --> inzializza la repository locale 
 git add README.md --> inseriento del file README.md nell'areea di stagign 
 git commit -m "first commit" --> creazione del primo commit, che serve a sinconizzare 
 git branch -M main --> ceazione del branch main, da usare con default 
 git remotr add origing https://github.com/>username>/<nomeEs> --> connetto a git 
 gti push -u origin main --> sincronizzare del repository remoto con quello locael 
 
 
 gti push https.//<username>:<token>@github.com/<username>/<reponame>.git
 
# altri comandi git
` : inserimento deliminìtato 
<>: citazione
# : permette di fare i titoli e quindi dividere la repository 

!img[](img.pgn)
 