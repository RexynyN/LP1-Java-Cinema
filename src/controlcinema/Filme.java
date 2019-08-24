
package controlcinema;
//Classe para armazenar as informações de titulo e duração do filme
public class Filme {
    private String titulo [] = {"","A mão que balança o berço ", "Mazingher Z: Infinity      ", "Oito Mulheres e um Segredo", "Olho do Furacão              ",
    "Os Estranhos - Caçada Noturna", "Um Dia Para Viver            ", "Han Solo:Uma História Star Wars", "Deadpool 2                  ","Paulo, Apóstolo de Cristo", 
    "Vingadores: Guerra Infinita"}; 
    private String duracao [] = {"","18:00", "21:15", "19:10", "21:00", "22:00 ", "22:30", "19:00", "20:30", "18:30", "17:30"};

    public String getTitulo (int filme){
       return this.titulo[filme];
    }

    public String getDuracao (int dura){
        return this.duracao[dura];
    }

}
