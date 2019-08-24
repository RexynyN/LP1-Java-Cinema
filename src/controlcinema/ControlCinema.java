package controlcinema;

import java.util.Scanner;
public class ControlCinema {
//Classe main, que chama os demais métodos de outras classes, e maneja como o programa é executado
    public static void main(String[] args) {
        SessoesGeral tabela = new SessoesGeral();
        Hora h = new Hora();
        Scanner in = new Scanner (System.in);
        int menu = 1;
        
        do{  
            System.out.println("Bem-Vindo ao CINEMANIA!");
            System.out.println("\n(1) para Comprar um Ingresso \n(0) para Sair do programa \nEscolha uma opção:  ");
            menu = in.nextInt();
        
        switch(menu){
            case 1:{ 
                System.out.println("O horário atual: " + h.getHora());
                tabela.gerarTabela(10);
                tabela.comprar();
        break;}
          
            case 0:{
                System.exit(0);
        }
        
        default:{
            System.out.println("Opção inválida! Digite uma opção válida! \n\n");
            ControlCinema.main(args);
            break;
        }
        }
        }while(menu != 0);
        
        
    
}
}