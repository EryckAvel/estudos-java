package S6.exercicios;

import java.util.Scanner;

public class EstruturaWhileEx {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int ex;
        System.out.println("Escolha um exemplo de 1 a 3 para testar!");
        System.out.println("Qual exemplo deseja ver:");
        ex = Integer.parseInt(entrada.nextLine());
        switch (ex){
            case 1:
                int senha;
                System.out.println("validar senha:");
                senha = Integer.parseInt(entrada.nextLine());
                while(senha !=2002){
                    System.out.println("Senha invalida!");
                    senha = Integer.parseInt(entrada.nextLine());
                }
                System.out.println("Senha correta!");
                break;
            case 2:
                int x, y;
                System.out.println("Buscando coordenadas num plano cartesiano");
                System.out.println("Digite a primeira coordenada:");
                x = Integer.parseInt(entrada.nextLine());
                System.out.println("Digite a segunda coordenada:");
                y = Integer.parseInt(entrada.nextLine());
                while (x != 0 && y !=0){
                    if (x > 0 && y > 0){
                        System.out.println("PRIMEIRO");
                    }else if (x < 0 && y > 0){
                        System.out.println("SEGUNDO");
                    } else if (x < 0 && y < 0){
                        System.out.println("TERCEIRO");
                    }else if (x > 0 && y < 0){
                        System.out.println("QUARTO");
                    }
                    System.out.println("Insira novas coordenadas:");
                    System.out.println("Digite a primeira coordenada:");
                    x = Integer.parseInt(entrada.nextLine());
                    System.out.println("Digite a segunda coordenada:");
                    y = Integer.parseInt(entrada.nextLine());
                }
                break;
            case 3:
                int cod, alcool = 0, gasolina = 0, diesel = 0;
                System.out.println("Pesquisa por tipo de combustivel!");
                System.out.println("Insira o codigo do tipo de combustivel:");
                cod = Integer.parseInt(entrada.nextLine());
                while(cod !=4){
                    if (cod == 1){
                        alcool += 1;
                    }else if (cod == 2){
                        gasolina += 1;
                    }else if (cod == 3){
                        diesel += 1;
                    }else{
                        System.out.println("Codigo invalido!");
                    }
                    System.out.println("Insira o codigo do tipo de combustivel:");
                    cod = Integer.parseInt(entrada.nextLine());
                }
                System.out.println("MUITO OBRIGADO!");
                System.out.println("ALCOOL : " + alcool);
                System.out.println("GASOLINA : " + gasolina);
                System.out.println("DIESEL : " + diesel);
                break;
            default:
                System.out.println("Exemplo não encontrado!");
        }

    }

}
