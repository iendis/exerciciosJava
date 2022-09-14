package CarangoVelho;

import java.util.Scanner;

public class kkkj {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Carros uno =  new Carros();
        uno.setNome("Uno");
        uno.setAno(1998);
        uno.setPreco(10000.0f);

        Carros civic = new Carros();
        civic.setNome("Honda Civic");
        civic.setAno(2015);
        civic.setPreco(60000.0f);

        Carros parati = new Carros();
        parati.setNome("Parati");
        parati.setAno(1990);
        parati.setPreco(7000.0f);

        Carros monza = new Carros();
        monza.setNome("Monza");
        monza.setAno(1987);
        monza.setPreco(8000.0f);

        Carros ka = new Carros();
        ka.setNome("Ford Ka");
        ka.setAno(2014);
        ka.setPreco(40000.0f);


        char desejaContinuar = 's';


        while(desejaContinuar == 'S' || desejaContinuar == 's'){

            System.out.println("Você quer as informações de qual carro? 1 - Uno / 2 - Parati / 3 - Monza / 4 - Civic / 5 - Ford KA");
            int qualCarro = scan.nextInt();

            switch(qualCarro){
                case 1:
                System.out.println("\n" + "Nome: " + uno.getNome() + "\n" + "Ano: " + uno.getAno() + "\n" + "Preço: " + uno.getPreco() + "\n" + "Valor do desconto: " + (uno.getPreco() * 0.12));
                break;
                case 2:
                System.out.println("\n" + "Nome: " + parati.getNome() + "\n" + "Ano: " + parati.getAno() + "\n" + "Preço: " + parati.getPreco() + "\n" + "Valor do desconto: " + (parati.getPreco() * 0.12));
                break;
                case 3:
                System.out.println("\n" + "Nome: " + monza.getNome() + "\n" + "Ano: " + monza.getAno() + "\n" + "Preço: " + monza.getPreco() + "\n" + "Valor do desconto: " + (monza.getPreco() * 0.12));
                break;
                case 4:
                System.out.println("\n" + "Nome: " + civic.getNome() + "\n" + "Ano: " + civic.getAno() + "\n" + "Preço: " + civic.getPreco() + "\n" + "Valor do desconto: " + (civic.getPreco() * 0.07));
                break;
                case 5:
                System.out.println("\n" + "Nome: " + civic.getNome() + "\n" + "Ano: " + ka.getAno() + "\n" + "Preço: " + ka.getPreco() + "\n" + "Valor do desconto: " + (ka.getPreco() * 0.07));
                break;
                default:
                System.out.println("\n" + "Carro não encontrado no nosso estoque!");
                break;


            }


            System.out.println("\n" + "Deseja continuar?");
            desejaContinuar = scan.next().charAt(0);
            }

            
        }
     
        
    }
    