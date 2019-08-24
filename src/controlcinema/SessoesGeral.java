
package controlcinema;

import java.util.Scanner;

//Classe que junta as várias informações de outras classes, e também que cria o ingresso
public class SessoesGeral extends Sala{
    public String [][]tabela=new String[6][11];
    int capacidadereal[] = new int [10];
    
    public String[][] getTabela(){   
        return this.tabela;
    }
    //Método para convergir todas as informações de outras classes, para criar uma tabela
    public void gerarTabela(int qtdSessoes){ 
        Ingresso sessao = new Ingresso(); 
        Sala sala = new Sala();
        Filme filme = new Filme();
        Genero genre = new Genero();
        Sessao categorias = new Sessao();
        
        for (int cont=0;cont<qtdSessoes+1;cont++){
            tabela[0][cont]= sessao.ingresso(cont)+"\t";
            tabela[1][cont]= genre.getGenero(cont)+"\t";
            tabela[2][cont]= filme.getTitulo(cont)+"\t";
            tabela[3][cont]= Integer.toString(cont)+"\t";
            tabela[4][cont]= filme.getDuracao(cont)+"\t";
            tabela[5][cont]= sala.nroSala(cont)+"\t";
        }
        
        for (int cont=0;cont<6;cont++){
            tabela[cont][0] = categorias.cat(cont) + "\t";
        }
        
        //Loop para imprimir a tabela para o usuário 
        for(int cont=0;cont<qtdSessoes+1;cont++){
            for(int cont2=0;cont2<6;cont2++){
                System.out.print(tabela[cont2][cont]+"\t\t\t");
            }
            System.out.print("\n");
        }
    }
    
    //Classe para executar a compra do ingresso
    public void comprar(){
        Scanner in = new Scanner(System.in);
        Sala sala = new Sala();
        Filme f = new Filme();
        int sessi=0,ingQtd=0, scont = 0, pgto = 0, ingQtd2 = 0;
        
        while(sessi < 101 || sessi > 110){
            System.out.println("\n\nPor favor digite o código da  sessão desejada:");
            sessi=in.nextInt();}
        
        scont = sessi -100;

          while(pgto > 3 || pgto < 1){
            System.out.println("\n\nPor favor digite a forma de pagamento desejada: \n(1)Dinheiro\n(2)Cartão de Crédito\n(3)Cartão de Débito");
            pgto=in.nextInt();}
          
            System.out.println("\nDigite a quantidade de ingressos inteiros:");
            ingQtd=in.nextInt();
            
            System.out.println("\nDigite a quantidade de meio ingressos:");
            ingQtd2=in.nextInt();    
            
            //Exceção para caso a sessão esteja cheia 
            while(checkIng(scont, ingQtd, ingQtd2) == 1){
                System.out.println("Desculpe, a sessão não possui assentos para essa quantidade de ingressos!");
                System.out.println("O lotamento atual dessa sessão é de " + capacidadereal[scont - 1] + " assento reservados");
                System.out.println("Digite outra quantidade de ingressos: ");
                ingQtd=in.nextInt();
                System.out.println("\nDigite outra quantidade de meio ingressos:");
                ingQtd2=in.nextInt();
            }
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        //Criação do ingresso, imprimindo as informações da sessão, preços e total
        for (int cont=0;cont<6;cont++){
            System.out.print(tabela[cont][0]+":   ");
            System.out.print(tabela[cont][sessi-100]+"\n");
        }
        if(pgto == 1){
            System.out.println("Tipo de pagamento:    Dinheiro");
            System.out.println("Quantidade de ingressos Inteiros: "+ ingQtd + " x R$30,00");
            System.out.println("Quantidade de ingressos Meia-Entrada: "+ ingQtd2 + " x R$15,00");
            System.out.println("Subtotal: R$" + (ingQtd * 30 + ingQtd2 * 15));
            System.out.println("Obrigado pela compra, e bom filme!");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }else{if(pgto == 2){
            System.out.println("Tipo de pagamento:    Cartão de Crédito");
            System.out.println("Quantidade de ingressos Inteiros: "+ ingQtd + " x R$30,00");
            System.out.println("Quantidade de ingressos Meia-Entrada: "+ ingQtd2 + " x R$15,00");
            System.out.println("Subtotal: R$" + (ingQtd * 30 + ingQtd2 * 15));
            System.out.println("Obrigado pela compra, e bom filme!");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }else{if(pgto == 3)
            System.out.println("Tipo de pagamento:    Cartão de Débito");
            System.out.println("Quantidade de ingressos Inteiros: " + ingQtd + " x R$30,00");
            System.out.println("Quantidade de ingressos Meia-Entrada: "+ ingQtd2 + " x R$15,00");
            System.out.println("Subtotal: R$" + (ingQtd * 30 + ingQtd2 * 15));
            System.out.println("Obrigado pela compra, e bom filme!");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        
        
}
        
    }
    

            
    public void attCapacidade (int sessao, int acrescimo){
        capacidadereal[sessao] += acrescimo;     
    }
    //Método para checar se a capacidade de uma sala aguenta a quantidade de ingressos pedidos
    public int checkIng(int sessao, int ing1, int ing2){
        int s = sessao - 1;
        int ings = ing1 + ing2; 
        int check = capacidadereal[s] + ings;
        if(check <= capacidade[sessao]){
            attCapacidade(s, ings);
            return 2;
        }else{
            return 1;
        }
        
    }
    
    
   
}
