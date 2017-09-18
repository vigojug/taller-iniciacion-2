# Exercicio da biblioteca

O obxetivo de este exercicio e simular a xesión básica dunha biblioteca. A biblioteca contén exemplares (copias) de obras (libros) de autores. O exercicio consiste en modelar cada un de eses elementos no teu programa.

## Descrición

O código `Biblio.java` crea autores, libros de esos autores, e garda copias de esos libros. Despois:
 
- Lista todas as copias.
- Mostra o nome de todos os autores que teñan un premio e hai unha copia do seu libro na biblioteca.
- Mostra o número de copias de un determinado libro.

Unha posible execución do programa móstrase o final deste documento.

A definición das clases Autor, Obra, Exemplar e Biblioteca están sen facer. O obxetivo é facelas.

**A clase Autor** 
 
Un *Actor* está caracterizado polo seu nome (un `String`) e unha indicación de si foi ou non premiado. 

Os métodos que son específicos de esta clase y son parte da interface son:

* constructores que seguen o indicado no método `main` ca seguinte orden dos parámetros: o nome e o indicador de si foi premiado ou non;
* un método `getNome` devolvendo o nome do autor;
* un método `getPremio` devolvendo `true` se o autor foi premiado.

**A clase Obra**

A clase Obra está caracterizada polo seu título (de tipo `String`), (unha referencia o) autor que a escribiu e a linguaxe na que foi escrita (de tipo `String`).

Os métodos que son específicos a esta clase e son parte da sua interface de usuario son:

* constructores que seguen o indicado no método `main` ca seguinte orden dos parámetros: o título, o autor e a linguaxe. Se a linguaxe non foi proporcionada, usarase o valor por defecto `francés`;
* un método `getTitulo` devolvendo o título da obra;
* un método `getAutor` devolvendo o autor (e posible aquí devolver directamente a referencia o autor);
* un método `getLingua`devolvendo a linguaxe do libro;
* un método `mostrar` que imprime as características do libro respetando o seguinte orde de forma estricta: <título>, <nome do autor>, en <lingua> donde `<título>` é replazado con título do libro, `<nome do autor>` é replazado co nome do autor e `<lingua> pola linguaxe;

Nos consideramos aquí que unha Obra non pode ser copiada.

Mira a execución de exemplo o final para máis detalles da impresión. 

**A clase Exemplar** 

A clase Exemplar modela a copia dun libro.  Unha instancia desta clase é caracterizada por (unha referencia) a un libro do cal é unha copia. Os métodos que son específicos da clase `Exemplar` é que deberían ser parte da sua interface de usuario son:

* un constructor tomando coma argumento a referencia a unha `Obra` e mostrando unha mensaxe que repete estrictamente o seguinte formato: `Novo exemplar -> <título>, <nome do autor>, en <lingua> seguido dun `End Of Line`;
* un constructor de copia mostrando unha mensaxe respetando estrictamente o seguinte formato: Copia dun exemplar de -> <título>, <nome do autor>, en <lingua> seguido dun `End Of Line`;
* un método `getObra`devolvendo o libro (Obra);
* e un método `mostrar` imprimindo a descripción da copia respetando estricamente o seguinte formato: Un exemplar de <títutlo>, <nome do autor>, en <lingua> sen `End Of Line`. O método `mostrar` da clase `Obra` será utilizado para producir esta mensaxe.

**A clase biblioteca**

A clase Biblioteca está caracterizada polo seu nome e contén un listado de copias (Exemplares). A lista de copias será modelada utilizando unha tabla dinámica (`ArrayList`). Este atributo débese chamar `exemplares` obrigatoriamente. Os métodos que son específicos a clase Biblioteca e son parte da sua interface de usuario son:

* un constructor que sigue as reglas do método `main` e imprime a mensaxe: `A biblioteca <nome> está aberta !` seguida dun `End of Line`, onde `nome` é replazado con nome da biblioteca.;
* un método `getNome` devolvendo o nome da biblioteca;
* un método `getNbExemplares` devolvendo o número de copias almacenadas na biblioteca;
* un método `gardar`permitindo gardar unha o múltiples copias (Exemplar) dun libro da biblioteca ; debería seguir o proporcionado no método `main`, con seguinte orden de parámetros : a referencia o libro e o número `n` de copias a añadir ; este método añadirá a la lista da librería de Exemplar, `n Exemplar` da correspondente `Obra`, que debe ser construida. Se o número de copias non é proporcionado, usarase o valor `1` por defecto. **Importante**: as copias debe añadirse o final da tabla dinámica (o método `add` do `ArrayList`).
* un método `listarExemplares` devolvendo un `ArrayList` con todas as copias dos libros escritos nunha linguaxe; se ningunha linguaxe é proporcionada (un `String` vacío), devolvera todas as copias; Un método utilitario é proporcionado que permite mostrar o contido da tabla dinámica devolta por `listarExemplares` (ver a execución de exemplo o final).
* un método `contarExemplares` devolvendo o número de copias de un libro pasado coma parámetro;
* un método `imprimirAutor` con un párametro de tipo `boolean` o sin parámetro, que mostrar os nomes dos autores cunha copia gardada na biblioteca. Se o `boolean` é proporcionado e é `true`, soamente os autores premiados serán mostrados. Se é `false`, soamente os autores non premiados. Se non é proporcionado, se mostrarán os autores premiados. O nome do autor será mostrado tantas veces coma copias escritas polo autor. O final de cada nome imprimirase un `End Of Line`.


## Saída de exemplo


```
A biblioteca do concello está aberta !
Novo exemplar -> Les Miserables, Victor Hugo, en francés
Novo exemplar -> Les Miserables, Victor Hugo, en francés
Novo exemplar -> L’Homme qui rit, Victor Hugo, en francés
Novo exemplar -> Le Comte de Monte-Cristo, Alexandre Dumas, en francés
Novo exemplar -> Le Comte de Monte-Cristo, Alexandre Dumas, en francés
Novo exemplar -> Le Comte de Monte-Cristo, Alexandre Dumas, en francés
Novo exemplar -> Zazie dans le metro, Raymond Queneau, en francés
Novo exemplar -> The count of Monte-Cristo, Alexandre Dumas, en inglés
A biblioteca do concello ofrece 
Un exemplar de Les Miserables, Victor Hugo, en francés
Un exemplar de Les Miserables, Victor Hugo, en francés
Un exemplar de L’Homme qui rit, Victor Hugo, en francés
Un exemplar de Le Comte de Monte-Cristo, Alexandre Dumas, en francés
Un exemplar de Le Comte de Monte-Cristo, Alexandre Dumas, en francés
Un exemplar de Le Comte de Monte-Cristo, Alexandre Dumas, en francés
Un exemplar de Zazie dans le metro, Raymond Queneau, en francés
Un exemplar de The count of Monte-Cristo, Alexandre Dumas, en inglés
Os exemplares en inglés son
Un exemplar de The count of Monte-Cristo, Alexandre Dumas, en inglés
Os autores premiados son
Raymond Queneau
Hai tres exemplares de Le Comte de Monte-Cristo
```

**Importante**: para facer o exercicio un pouco máis divertido, pode que haxa algunha errata ;-)
