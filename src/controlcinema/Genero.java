
package controlcinema;
//Classe para armazenar as informações de gênero de filme
public class Genero {
    private String genero [] = {"","Terror     ", "Animação       ", "Comédia      ", "Ação         ", "Terror        ", "Ação/Suspense", "Fic. científica",
        "Ação / Comédia", "Hist. / Drama", "Aventura/Ação"};

    public String getGenero(int genero){
        return this.genero[genero];
    }

}
