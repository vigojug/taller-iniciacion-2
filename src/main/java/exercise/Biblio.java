import java.util.ArrayList;

class Autor {

    /*******************************************
     * Completar o programa a partir de aquí
     *******************************************/
	// Completar a clase Autor aquí
}

class Obra
{
 	// Completar a clase Obra aquí

}

// completar as outras clases aquí


/*******************************************
 * Non modificar despois de esta liña, é para axudar cos vosos tests
 *******************************************/

public class Biblio {

    public static void introducirExemplares(ArrayList<Exemplar> exemplares) {
        for (Exemplar exemplare : exemplares) {
            System.out.print("\t");
            exemplare.mostrar();
        }
    }

    public static void main(String[] args) {
        // Crear e gardar todos os examplares
        Autor a1 = new Autor("Victor Hugo", false);
        Autor a2 = new Autor("Alexandre Dumas", false);
        Autor a3 = new Autor("Raymond Queneau", true);

        Obra o1 = new Obra("Les Miserables", a1, "francés");
        Obra o2 = new Obra("L\'Homme qui rit", a1, "francés");
        Obra o3 = new Obra("Le Comte de Monte-Cristo", a2, "francés");
        Obra o4 = new Obra("Zazie dans le metro", a3, "francés");
        Obra o5 = new Obra("The count of Monte-Cristo", a2, "inglés");

        Biblioteca biblio = new Biblioteca("do concello");
        biblio.gardar(o1, 2);
        biblio.gardar(o2);
        biblio.gardar(o3, 3);
        biblio.gardar(o4);
        biblio.gardar(o5);

        // ...
        System.out.println("A biblioteca " + biblio.getNome() + " ofrece ");
        introducirExemplares(biblio.listarExemplares());
        String lingua = "inglés";
        System.out.println("Os exemplares en " + lingua + " son  ");
        introducirExemplares(biblio.listarExemplares(lingua));
        System.out.println("Os autores premiados son: ");
        biblio.mostrarAutor();
        System.out.print("Hai " + biblio.contarExemplares(o3) + " exemplares");
        System.out.println(" de  " + o3.getTitulo());
    }
}

