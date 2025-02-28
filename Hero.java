import java.util.Scanner;
public class Hero extends Person{

 public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    Person p = new Person();

    String novonome = "";
    int novaclasse;       

    System.out.println("Digite o nome do personagem:");
     novonome = entrada.nextLine();

     p.nome = novonome;
     System.out.println("Seja Bem-vindo jogador(a):"+novonome);

     System.out.println("Por favor "+novonome+" escolha uma das classes para começar o jogo: 1-barbaro; 2-mago; 3-arqueiro; 4-cavaleiro; 5-assassino; 6-ladrão");
     novaclasse = entrada.nextInt();
    p.classe = novaclasse;

    switch (novaclasse) {
        case 1:
             {
                if (novaclasse == 1) {
                    System.out.println("Você escolheu a classe barbaro");
                }
            }
            break;
            case 2:
            {
               if (novaclasse == 2) {
                   System.out.println("Você escolheu a classe mago");
               }
           }
           break;
           case 3:
             {
                if (novaclasse == 3) {
                    System.out.println("Você escolheu a classe arqueiro");
                }
            }
            break;
            case 4:
             {
                if (novaclasse == 4) {
                    System.out.println("Você escolheu a classe cavaleiro");
                }
            }
            break;
            case 5:
             {
                if (novaclasse == 5) {
                    System.out.println("Você escolheu a classe assassino");
                }
            }
            break;
            case 6:
             {
                if (novaclasse == 6) {
                    System.out.println("Você escolheu a classe ladrao");
                }
            }
            break;
        default:
            break;
    }

}
 }

@Override
public String toString() {
    return "Hero []";
}   
}
