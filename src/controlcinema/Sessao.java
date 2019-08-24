
package controlcinema;
//Classe com os cabeçalhos de sessão
public class Sessao {
    public int sessao(int sessao){
        int sala = sessao-100;
        return sala;
    }
    
    public String cat(int x){
        String cat[] = {"CodigoSessão\t","Gênero\t","Título\t","sala\t","Horário\t","Capacidade\t"};
        
        return cat[x];
    }
}
