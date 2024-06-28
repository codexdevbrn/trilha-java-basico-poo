package user;

import java.util.Scanner;

import aparelho.Iphone;

public class Usuario {
    public static void main(String[] args) {

        Iphone phone = new Iphone();

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha sua ação");
        System.out.println("1 - Utilizar funções de telefone");
        System.out.println("2 - Escutar musica");
        System.out.println("3 - Navegar na internet");
        int select = sc.nextInt();

        if (select > 3 && select <= 0) {
            System.out.println("Escolha uma opção válida");
        }
        switch (select) {
            case 1:
                System.out.println("O que deseja fazer? 1- Ligar / 2- Atender / 3- Escutar o correio de voz");
                int value = sc.nextInt();
                if (value == 1) {
                    System.out.println("Disque o número para ligar");
                    String request = sc.next();
                    phone.ligar(request);
                } else if (value == 2) {
                    phone.atender();
                } else {
                    phone.iniciarCorreioVoz();
                }
                break;
            case 2:
                System.out.println("O que deseja fazer? 1- Tocar música / 2- Pausar / 3- Selecionar uma música");
                value = sc.nextInt();
                if (value == 1) {
                    phone.tocar();
                } else if (value == 2) {
                    phone.pausar();
                } else {
                    System.out.println("Digite o nome da música:");
                    String request = sc.next();
                    phone.selecionarMusica(request);
                }
                break;
            case 3:
                System.out.println(
                        "O que deseja fazer? 1- Exibir uma página / 2- Abrir uma nova aba / 3- Atualizar a página");
                value = sc.nextInt();
                if (value == 1) {
                    System.out.println("Digite a URL:");
                    String request = sc.next();
                    phone.exibirPagina(request);
                } else if (value == 2) {
                    phone.adicionarNovaAba();
                } else {
                    phone.atualizarPagina();
                }
                break;
            default:
                break;
        }
        sc.close();
    }
}
