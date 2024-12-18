import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tot = 0;
        String escolha = "";
        boolean continuar = true;

        while (continuar) {

            System.out.println("""
                    
                    Cardápio
                    
                    [1] Bebidas
                    [2] Pratos principais
                    [3] Sobremesas
                    [4] Sair
                    
                    """);
            int op = scanner.nextInt();

            switch (op) {

                case 1 -> {
                    boolean submenu = true;
                    while (submenu) {
                        System.out.println("""
                                
                                Menu de bebidas
                                
                                1 - Suco de manga - R$5,00
                                2- Suco de laranja - R$5,00
                                3- Sprite - R$3,00
                                4 - Voltar
                                5 - Sair
                                
                                """);

                        int n = scanner.nextInt();

                        switch (n) {

                            case 1 -> {
                                System.out.println("Boa escolha,suco de manga é top!");
                                escolha +=  "Suco de manga - R$5,00\n";
                                tot += 5;

                            }
                            case 2 -> {
                                System.out.println("Humm suco de laranja,delicia!");
                                escolha += "Suco de laranja - R$5,00\n";
                                tot += 5;
                            }

                            case 3 -> {
                                System.out.println("Meu refrigerante favorito");
                                escolha += "Sprite - R$3,00\n";
                                tot += 3;
                            }
                            case 4 -> submenu = false;
                            case 5 -> {
                                submenu = false;
                                continuar = false;
                            }

                            default -> System.out.println("opção inválida");

                        }
                    }
                }

                case 2 -> {
                    boolean submenu = true;
                    while(submenu) {
                        System.out.println("""
                                Pratos principais
                                
                                [1] Bife com fritas - R$20,00
                                [2] Lasanha a bolonhesa - R$15,00
                                [3] Big tasty - R$25,00
                                [4] Voltar
                                [5] Sair
                                
                                """);

                        int prato = scanner.nextInt();

                        switch (prato) {

                            case 1 -> {System.out.println("Bife com fritas,muito bom :p! ");
                                tot += 20;
                                escolha += "Bife com fritas - R$20,00\n";

                            }
                            case 2 -> {
                                System.out.println("Lasanha vindo diretamente da Itália!");
                                tot += 15;
                                escolha += "Lasanha a bolonhesa - R$15,00\n";
                            }
                            case 3 -> {
                                System.out.println("Big tasty!Meu hamburguer favorito!");
                                tot += 25;
                                escolha += "Big tasty - R$25,00\n";
                            }
                            case 4 -> submenu = false;
                            case 5 -> {
                                submenu = false;
                                continuar = false;
                            }
                            default -> System.out.println("Opção inválida");

                        }
                    }
                }

                case 3 -> {
                    boolean submenu = true;
                    while (submenu) {
                        System.out.println("""
                                 Sobremesas
                                
                                 [1] Açai - R$10,00
                                 [2] Kinder Bueno - R$6,00
                                 [3] Fini - R$7,00
                                 [4] Voltar
                                 [5] Sair
                                
                                """);

                        int sobremesa = scanner.nextInt();

                        switch (sobremesa) {

                            case 1 -> {
                                System.out.println("Açai é bom demais!");
                                tot += 10;
                                escolha += "Açai - R$10,00\n";

                            }
                            case 2 ->{ System.out.println("Humm!Kinder buenooo");
                                tot += 6;
                                escolha += "Kinder Bueno - R$6,00\n";
                            }
                            case 3 -> { System.out.println(" Fini é uma delícia!");
                                tot += 7;
                                escolha += "Fini - R$7,00\n";

                            }
                            case 4 -> submenu = false;
                            case 5 -> {
                                submenu = false;
                                continuar = false;
                            }

                            default -> System.out.println("Opção inválida");


                        }

                    }
                }

                case 4 -> {
                    continuar = false;


                }

                default -> {
                    System.out.println("Opção inválida");

                }


            }
        }
        System.out.println(escolha);
        System.out.println(" Total : " + tot);
        System.out.println("\n Volte sempre! ");
        scanner.close();

        }


    }
