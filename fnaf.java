package jogo;
//Dupla: Vinicius e Guilherme Felipe

import java.util.Scanner;
import java.util.Random;

public class fnaf {
        final static Scanner LER = new Scanner(System.in);
        final static Random RANDOMIZER = new Random();

        public static void main(String[] args) {
                char[][] matrizFnafMapa = {
                                "                                          _____________________________                                               "
                                                .toCharArray(),
                                "                                         |                             |                                              "
                                                .toCharArray(),
                                "                                         |                             |                                              "
                                                .toCharArray(),
                                "                                         |    B         7        C     |                                              "
                                                .toCharArray(),
                                "                                         |                             |                                              "
                                                .toCharArray(),
                                "                                         |                             |                                              "
                                                .toCharArray(),
                                "       __________    ____________________|                             |___________________                           "
                                                .toCharArray(),
                                "      |          |  |                                                                      |                          "
                                                .toCharArray(),
                                "      |          ||||                                                                      |                          "
                                                .toCharArray(),
                                "      |     0                                                                              |   _____                  "
                                                .toCharArray(),
                                "      |          ||||                  E                                                   |  |     |                 "
                                                .toCharArray(),
                                "      |          |  |                                                         A            ||||     |                 "
                                                .toCharArray(),
                                "      |          |  |                                                                            D  |                 "
                                                .toCharArray(),
                                "      |          |  |                                                                      ||||     |    __________   "
                                                .toCharArray(),
                                "      |          |  |                                                                      |  |     |   |          |  "
                                                .toCharArray(),
                                "      |    L     |  |                                                                      |  |     |||||          |  "
                                                .toCharArray(),
                                "      |__________|  |                                                                      |  |              K     |  "
                                                .toCharArray(),
                                "                    |                                                                      |  |     |||||          |  "
                                                .toCharArray(),
                                "          __________|                                  X                                   |  |     |   |__________|  "
                                                .toCharArray(),
                                "         |          |                                                                      |  |     |                 "
                                                .toCharArray(),
                                "         |          |                                                                      |  |     |                 "
                                                .toCharArray(),
                                "         |                                                                                 |  |     |    __________   "
                                                .toCharArray(),
                                "         |     F                   Y                                                       |  |     |   |          |  "
                                                .toCharArray(),
                                "         |                                                                    M            |  |  1  |||||          |  "
                                                .toCharArray(),
                                "         |          |                                                                      |  |               I    |  "
                                                .toCharArray(),
                                "         |__________|                                                                      |  |     |||||          |  "
                                                .toCharArray(),
                                "                    |________________    __________________________    ___________    _____|  |_____|   |__________|  "
                                                .toCharArray(),
                                "                                    ||  ||                        ||  ||         ||  ||                               "
                                                .toCharArray(),
                                "                                  __||  ||__                    __||  ||__     __||  ||_____________                  "
                                                .toCharArray(),
                                "                                 |          |                  |          |   |                     |                 "
                                                .toCharArray(),
                                "                     _________   |          |                  |          |   |                     |                 "
                                                .toCharArray(),
                                "                    |         |  |          |                  |          |   |             3       |                 "
                                                .toCharArray(),
                                "                    |    N    |  |          |                  |          |   |                     |                 "
                                                .toCharArray(),
                                "                    |         |  |          |                  |          |   |                     |                 "
                                                .toCharArray(),
                                "                    |         |  |          |                  |          |   |                     |                 "
                                                .toCharArray(),
                                "                    |         ||||          |                  |          |   |                     |                 "
                                                .toCharArray(),
                                "                    |                       |                  |          |   |       H             |                 "
                                                .toCharArray(),
                                "                    |         ||||          |                  |          |   |                     |                 "
                                                .toCharArray(),
                                "                    |         |  |          |                  |          |   |                     |                 "
                                                .toCharArray(),
                                "                    |         |  |          |                  |          |   |_____________________|                 "
                                                .toCharArray(),
                                "                    |    O    |  |          |    ___________   |          |                                           "
                                                .toCharArray(),
                                "                    |_________|  |          |   |           |  |          |                                           "
                                                .toCharArray(),
                                "                                 |          |||||           ||||          |                                           "
                                                .toCharArray(),
                                "                                 |                                   R    |                                           "
                                                .toCharArray(),
                                "                                 |          |||||     P     ||||          |                                           "
                                                .toCharArray(),
                                "                                 |__________|   |___________|  |__________|                                           "
                                                .toCharArray()
                };
                final char[][] COPIAMATRIZFNAFMAPA = matrizFnafMapa;
                char[][] matrizMenu = {
                                " ███████╗███╗   ██╗ █████╗ ███████╗    ██████╗  ██████╗  ██████╗ ███╗   ███╗                        "
                                                .toCharArray(),
                                "██╔════╝████╗  ██║██╔══██╗██╔════╝    ██╔══██╗██╔═══██╗██╔═══██╗████╗ ████║                        "
                                                .toCharArray(),
                                "█████╗  ██╔██╗ ██║███████║█████╗      ██║  ██║██║   ██║██║   ██║██╔████╔██║                        "
                                                .toCharArray(),
                                "██╔══╝  ██║╚██╗██║██╔══██║██╔══╝      ██║  ██║██║   ██║██║   ██║██║╚██╔╝██║                        "
                                                .toCharArray(),
                                "██║     ██║ ╚████║██║  ██║██║         ██████╔╝╚██████╔╝╚██████╔╝██║ ╚═╝ ██║                        "
                                                .toCharArray(),
                                "╚═╝     ╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝         ╚═════╝  ╚═════╝  ╚═════╝ ╚═╝     ╚═╝                        "
                                                .toCharArray(),
                                "                                                                                                    "
                                                .toCharArray(),
                                " ██╗              ██████╗ ██╗      █████╗ ██╗   ██╗                                                "
                                                .toCharArray(),
                                "███║              ██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝                                                "
                                                .toCharArray(),
                                "╚██║    █████╗    ██████╔╝██║     ███████║ ╚████╔╝                                                 "
                                                .toCharArray(),
                                " ██║    ╚════╝    ██╔═══╝ ██║     ██╔══██║  ╚██╔╝                                                  "
                                                .toCharArray(),
                                " ██║              ██║     ███████╗██║  ██║   ██║                                                   "
                                                .toCharArray(),
                                " ╚═╝              ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝                                                   "
                                                .toCharArray(),
                                "                                                                                                    "
                                                .toCharArray(),
                                "██████╗               ██████╗  █████╗ ███╗   ██╗██╗  ██╗███████╗                                   "
                                                .toCharArray(),
                                "╚════██╗              ██╔══██╗██╔══██╗████╗  ██║██║ ██╔╝██╔════╝                                   "
                                                .toCharArray(),
                                " █████╔╝    █████╗    ██████╔╝███████║██╔██╗ ██║█████╔╝ ███████╗                                   "
                                                .toCharArray(),
                                "██╔═══╝     ╚════╝    ██╔══██╗██╔══██║██║╚██╗██║██╔═██╗ ╚════██║                                   "
                                                .toCharArray(),
                                "███████╗              ██║  ██║██║  ██║██║ ╚████║██║  ██╗███████║                                   "
                                                .toCharArray(),
                                "╚══════╝              ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝                                   "
                                                .toCharArray(),
                                "                                                                                                   "
                                                .toCharArray(),
                                "██████╗                ██████╗ ██████╗ ███╗   ██╗████████╗██████╗  ██████╗ ██╗     ███████╗███████╗"
                                                .toCharArray(),
                                "╚════██╗              ██╔════╝██╔═══██╗████╗  ██║╚══██╔══╝██╔══██╗██╔═══██╗██║     ██╔════╝██╔════╝"
                                                .toCharArray(),
                                " █████╔╝    █████╗    ██║     ██║   ██║██╔██╗ ██║   ██║   ██████╔╝██║   ██║██║     █████╗  ███████╗"
                                                .toCharArray(),
                                " ╚═══██╗    ╚════╝    ██║     ██║   ██║██║╚██╗██║   ██║   ██╔══██╗██║   ██║██║     ██╔══╝  ╚════██║"
                                                .toCharArray(),
                                "██████╔╝              ╚██████╗╚██████╔╝██║ ╚████║   ██║   ██║  ██║╚██████╔╝███████╗███████╗███████║"
                                                .toCharArray(),
                                "╚═════╝                ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚══════╝╚══════╝"
                                                .toCharArray(),
                };
                String[][] matrizRanks = new String[3][5];
                char[][] matrizTelaMorte = {
                                " ██╗   ██╗ ██████╗  ██████╗███████╗    ███╗   ███╗ ██████╗ ██████╗ ██████╗ ███████╗██╗   ██╗██╗"
                                                .toCharArray(),
                                "██║   ██║██╔═══██╗██╔════╝██╔════╝    ████╗ ████║██╔═══██╗██╔══██╗██╔══██╗██╔════╝██║   ██║██║"
                                                .toCharArray(),
                                "██║   ██║██║   ██║██║     █████╗      ██╔████╔██║██║   ██║██████╔╝██████╔╝█████╗  ██║   ██║██║"
                                                .toCharArray(),
                                "╚██╗ ██╔╝██║   ██║██║     ██╔══╝      ██║╚██╔╝██║██║   ██║██╔══██╗██╔══██╗██╔══╝  ██║   ██║╚═╝"
                                                .toCharArray(),
                                " ╚████╔╝ ╚██████╔╝╚██████╗███████╗    ██║ ╚═╝ ██║╚██████╔╝██║  ██║██║  ██║███████╗╚██████╔╝██╗"
                                                .toCharArray(),
                                "  ╚═══╝   ╚═════╝  ╚═════╝╚══════╝    ╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝"
                                                .toCharArray(),
                };
                int[] posicaoPersonagem = new int[2];
                int[][] posicoesInimigosMatriz = new int[4][2];
                char[][] matrizControles = {
                                "  █████╗                ██████╗██╗███╗   ███╗ █████╗                                     "
                                                .toCharArray(),
                                "██╔══██╗              ██╔════╝██║████╗ ████║██╔══██╗                                    "
                                                .toCharArray(),
                                "╚█████╔╝    █████╗    ██║     ██║██╔████╔██║███████║                                    "
                                                .toCharArray(),
                                "██╔══██╗    ╚════╝    ██║     ██║██║╚██╔╝██║██╔══██║                                    "
                                                .toCharArray(),
                                "╚█████╔╝              ╚██████╗██║██║ ╚═╝ ██║██║  ██║                                    "
                                                .toCharArray(),
                                " ╚════╝                ╚═════╝╚═╝╚═╝     ╚═╝╚═╝  ╚═╝                                    "
                                                .toCharArray(),
                                "                                                                                        "
                                                .toCharArray(),
                                "██████╗               ██████╗  █████╗ ██╗██╗  ██╗ ██████╗                               "
                                                .toCharArray(),
                                "╚════██╗              ██╔══██╗██╔══██╗██║╚██╗██╔╝██╔═══██╗                              "
                                                .toCharArray(),
                                " █████╔╝    █████╗    ██████╔╝███████║██║ ╚███╔╝ ██║   ██║                              "
                                                .toCharArray(),
                                "██╔═══██╗    ╚════╝   ██╔══██╗██╔══██║██║ ██╔██╗ ██║   ██║                              "
                                                .toCharArray(),
                                "███████╗              ██████╔╝██║  ██║██║██╔╝ ██╗╚██████╔╝                              "
                                                .toCharArray(),
                                "╚══════╝              ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝ ╚═════╝                               "
                                                .toCharArray(),
                                "                                                                                        "
                                                .toCharArray(),
                                " ██████╗               ██████╗ ██╗██████╗ ███████╗██╗████████╗ █████╗                   "
                                                .toCharArray(),
                                "██╔════╝               ██╔══██╗██║██╔══██╗██╔════╝██║╚══██╔══╝██╔══██╗                  "
                                                .toCharArray(),
                                "███████╗     █████╗    ██║  ██║██║██████╔╝█████╗  ██║   ██║   ███████║                  "
                                                .toCharArray(),
                                "██╔═══██╗    ╚════╝    ██║  ██║██║██╔══██╗██╔══╝  ██║   ██║   ██╔══██║                  "
                                                .toCharArray(),
                                "╚██████╔╝              ██████╔╝██║██║  ██║███████╗██║   ██║   ██║  ██║                  "
                                                .toCharArray(),
                                " ╚═════╝               ╚═════╝ ╚═╝╚═╝  ╚═╝╚══════╝╚═╝   ╚═╝   ╚═╝  ╚═╝                  "
                                                .toCharArray(),
                                "                                                                                        "
                                                .toCharArray(),
                                "██╗  ██╗              ███████╗███████╗ ██████╗ ██╗   ██╗███████╗██████╗ ██████╗  █████╗ "
                                                .toCharArray(),
                                "██║  ██║              ██╔════╝██╔════╝██╔═══██╗██║   ██║██╔════╝██╔══██╗██╔══██╗██╔══██╗"
                                                .toCharArray(),
                                "███████║    █████╗    █████╗  ███████╗██║   ██║██║   ██║█████╗  ██████╔╝██║  ██║███████║"
                                                .toCharArray(),
                                "╚════██║    ╚════╝    ██╔══╝  ╚════██║██║▄▄ ██║██║   ██║██╔══╝  ██╔══██╗██║  ██║██╔══██║"
                                                .toCharArray(),
                                "     ██║              ███████╗███████║╚██████╔╝╚██████╔╝███████╗██║  ██║██████╔╝██║  ██║"
                                                .toCharArray(),
                                "     ╚═╝              ╚══════╝╚══════╝ ╚══▀▀═╝  ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝"
                                                .toCharArray()
                };
                int contador = 0;
                boolean agro = false;
                String corAzul = "\033[0;34m";
                String corAmarelo = "\033[0;33m";
                String corVermelho = "\033[0;31m";
                String corRoxo = "\033[0;35m";
                String corBranco = "\033[0;37m";
                String corCiano = "\033[0;36m";

                posicaoPersonagem[0] = 44;
                posicaoPersonagem[1] = 54;

                for (int i = 0; i < matrizRanks.length; i++) {
                        for (int j = 0; j < matrizRanks[i].length; j++) {
                                matrizRanks[i][j] = " ";
                        }
                }

                for (int i = 0; i < 3; i++) {
                        matrizRanks[i][2] = "0";
                        matrizRanks[i][0] = "Top - " + Integer.valueOf(i + 1).toString() + " ";
                        matrizRanks[i][1] = " ";
                        matrizRanks[i][3] = "s";
                }
                for (;;) {
                        imprimirMatrizes(matrizMenu);
                        int x = LER.nextInt();

                        if (x == 1) {
                                matrizRanks = verificarJogador(matrizRanks);
                                System.out.print("\033[0;0H");
                                posicoesInimigosMatriz = gerarInimigos(matrizFnafMapa, posicoesInimigosMatriz);
                                matrizFnafMapa = limparMatrizes(matrizFnafMapa, posicaoPersonagem,
                                                posicoesInimigosMatriz);
                                matrizFnafMapa = colocarInimigosMapa(matrizFnafMapa, posicoesInimigosMatriz);
                                for (;;) {
                                        contador++;
                                        imprimirMatrizesColorida(matrizFnafMapa, posicaoPersonagem,
                                                        posicoesInimigosMatriz, corAzul, corBranco, corRoxo,
                                                        corVermelho, corAmarelo);
                                        matrizFnafMapa = moverPersonagem(matrizFnafMapa, posicaoPersonagem);
                                        posicaoPersonagem = localizarPersonagem(matrizFnafMapa,
                                                        posicaoPersonagem);
                                        if (matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] == '*') {
                                                boolean sair = false;
                                                for (int i = 0; i < 5; i++) {
                                                        System.out.println();
                                                }
                                                imprimirMatrizes(matrizTelaMorte);
                                                for (int i = 0; i < 10; i++) {
                                                        System.out.println();
                                                }
                                                do {
                                                        System.out.println(
                                                                        "Digite: Ok ou continuar ou sim. Para continuar ");
                                                        String z = LER.nextLine();
                                                        if (z.equals("Ok") || z.equals("ok") || z.equals("continuar")
                                                                        || z.equals("sim")) {
                                                                sair = true;
                                                        }
                                                } while (!(sair));
                                                break;
                                        }
                                        if (!(agro)) {
                                                matrizFnafMapa = moverEnemies(matrizFnafMapa, posicoesInimigosMatriz);
                                        } else {
                                                matrizFnafMapa = moverEnemiesAgrado(matrizFnafMapa, posicaoPersonagem,
                                                                posicoesInimigosMatriz);
                                        }
                                        posicoesInimigosMatriz = localizarInimigos(matrizFnafMapa,
                                                        posicoesInimigosMatriz);
                                        if (matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] == '*') {
                                                boolean sair = false;
                                                imprimirMatrizesColorida(matrizFnafMapa, posicaoPersonagem,
                                                                posicoesInimigosMatriz, corAzul, corBranco, corRoxo,
                                                                corVermelho, corAmarelo);
                                                for (int i = 0; i < 5; i++) {
                                                        System.out.println();
                                                }
                                                imprimirMatrizes(matrizTelaMorte);
                                                for (int i = 0; i < 10; i++) {
                                                        System.out.println();
                                                }
                                                do {
                                                        System.out.println(
                                                                        "Digite: Ok ou continuar ou sim. Para continuar ");
                                                        String z = LER.nextLine();
                                                        if (z.equals("Ok") || z.equals("ok") || z.equals("continuar")
                                                                        || z.equals("sim")) {
                                                                sair = true;
                                                        }
                                                } while (!(sair));

                                                break;
                                        }
                                        agro = verificarAgro(matrizFnafMapa, posicaoPersonagem);

                                        limparTerminal();
                                }
                                matrizRanks = rankiarJogadores(matrizRanks, contador);
                                for (int i = 0; i < 3; i++) {
                                        System.out.println();
                                }
                                System.out.print(corCiano);
                                System.out.println("Tabela de Líderes: ");
                                System.out.print(corBranco);
                                imprimirRankes(matrizRanks);
                                matrizFnafMapa = COPIAMATRIZFNAFMAPA;
                                posicaoPersonagem[0] = 44;
                                posicaoPersonagem[1] = 54;
                                contador = 0;
                                agro = false;
                                boolean sair = false;
                                do {
                                        System.out.println("Digite: Ok ou continuar ou sim. Para continuar ");
                                        String z = LER.nextLine();
                                        if ((z.equals("Ok") || z.equals("ok") || z.equals("continuar")
                                                        || z.equals("sim"))) {
                                                sair = true;
                                        }
                                } while (!(sair));
                                for (int i = 0; i < 4; i++) {
                                        System.out.println();
                                }
                        } else if (x == 2) {
                                imprimirRankes(matrizRanks);
                        } else if (x == 3) {
                                boolean esc = false;
                                for (int i = 0; i < 8; i++) {
                                        System.out.println();
                                }

                                imprimirMatrizes(matrizControles);
                                do {
                                        System.out.println("Para sair digite: (sair), (esc) ou (voltar)");
                                        String entrada = LER.nextLine();
                                        if (entrada.equals("esc") || entrada.equals("voltar")
                                                        || entrada.equals("sair")) {
                                                esc = true;
                                        }

                                } while (!(esc));
                                for (int i = 0; i < 8; i++) {
                                        System.out.println();
                                }

                        }

                }
        }

        public static void imprimirMatrizes(char[][] matriz) {
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                                if (!(j + 1 < matriz[i].length)) {
                                        System.out.println(matriz[i][j]);

                                }
                                System.out.print(matriz[i][j]);
                        }
                }
                System.out.println();
        }

        public static void imprimirRankes(String[][] Ranks) {
                String corVerde = "\033[0;32m";
                String corAmarelo = "\033[0;33m";
                String corVermelho = "\033[0;31m";
                String corBranco = "\033[0;37m";
                for (int i = 0; i < Ranks.length; i++) {
                        for (int j = 0; j < Ranks[i].length - 1; j++) {
                                if (i == 0) {
                                        System.out.print(corVerde);
                                        if (!(j + 1 < Ranks[i].length - 1)) {
                                                System.out.println(Ranks[i][j]);
                                        } else {
                                                System.out.print(Ranks[i][j]);
                                        }
                                        System.out.print(corBranco);
                                } else if (i == 1) {
                                        System.out.print(corAmarelo);
                                        if (!(j + 1 < Ranks[i].length - 1)) {
                                                System.out.println(Ranks[i][j]);
                                        } else {
                                                System.out.print(Ranks[i][j]);
                                        }
                                        System.out.print(corBranco);
                                } else {
                                        System.out.print(corVermelho);
                                        if (!(j + 1 < Ranks[i].length - 1)) {
                                                System.out.println(Ranks[i][j]);
                                        } else {
                                                System.out.print(Ranks[i][j]);
                                        }
                                        System.out.print(corBranco);
                                }

                        }
                }
                System.out.println();
        }

        public static String[][] verificarJogador(String[][] matrizRanks) {
                System.out.println("Digite seu nome: ");
               // String y = LER.nextLine();
                String h = LER.nextLine();
                for (int i = 0; i < matrizRanks.length; i++) {
                        if (!(h.equals(matrizRanks[i][1]))) {
                                matrizRanks[0][4] = h;
                                break;
                        }
                }
                return matrizRanks;
        }

        public static void imprimirMatrizesColorida(char[][] matrizFnafMapa, int[] posicaoPersonagem,
                        int[][] posicoesInimigosMatriz, String corAzul, String corBranco,
                        String corRoxo, String corVermelho, String corAmarelo) {
                for (int i = 0; i < matrizFnafMapa.length; i++) {
                        for (int j = 0; j < matrizFnafMapa[i].length; j++) {
                                if (i == posicaoPersonagem[0] && j == posicaoPersonagem[1]) {
                                        System.out.print(corAzul);
                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = 'P';
                                        System.out.print(matrizFnafMapa[i][j]);
                                        System.out.print(corBranco);
                                } else if (i == posicoesInimigosMatriz[0][0] && j == posicoesInimigosMatriz[0][1]) {
                                        System.out.print(corRoxo);
                                        System.out.print(matrizFnafMapa[i][j]);
                                        System.out.print(corBranco);
                                } else if (i == posicoesInimigosMatriz[1][0] && j == posicoesInimigosMatriz[1][1]) {
                                        System.out.print(corAmarelo);
                                        System.out.print(matrizFnafMapa[i][j]);
                                        System.out.print(corBranco);
                                } else if (i == posicoesInimigosMatriz[2][0] && j == posicoesInimigosMatriz[2][1]) {
                                        System.out.print(corVermelho);
                                        System.out.print(matrizFnafMapa[i][j]);
                                        System.out.print(corBranco);
                                } else if (i == posicoesInimigosMatriz[3][0] && j == posicoesInimigosMatriz[3][1]) {
                                        System.out.print(matrizFnafMapa[i][j]);
                                } else {
                                        System.out.print(matrizFnafMapa[i][j]);
                                }

                        }
                        System.out.println();
                }
                System.out.println();
        }

        public static char[][] colocarInimigosMapa(char[][] matrizFnafMapa, int[][] posicoesInimigosMatriz) {
                for (int i = 0; i < matrizFnafMapa.length; i++) {
                        for (int j = 0; j < matrizFnafMapa[i].length; j++) {
                                if (i == posicoesInimigosMatriz[0][0] && j == posicoesInimigosMatriz[0][1]) {
                                        matrizFnafMapa[i][j] = 'B';
                                } else if (i == posicoesInimigosMatriz[1][0] && j == posicoesInimigosMatriz[1][1]) {
                                        matrizFnafMapa[i][j] = 'C';
                                } else if (i == posicoesInimigosMatriz[2][0] && j == posicoesInimigosMatriz[2][1]) {
                                        matrizFnafMapa[i][j] = 'X';
                                } else if (i == posicoesInimigosMatriz[3][0] && j == posicoesInimigosMatriz[3][1]) {
                                        matrizFnafMapa[i][j] = 'F';
                                }

                        }
                }
                return matrizFnafMapa;
        }

        public static int[][] gerarInimigos(char[][] matrizFnafMapa, int[][] posicoesInimigosMatriz) {
                char[] bonny = { 'B', 'O', 'N', 'M', 'Y' };
                char[] chica = { 'C', 'H', 'I', 'K', 'A' };
                char[] foxy = { 'F', '0', 'X', '1' };
                char[] freedy = { '7', 'R', 'E', '3', 'D', 'L' };

                int[] vetorArmazenarPosicoes = new int[4];
                for (int i = 0; i < vetorArmazenarPosicoes.length; i++) {
                        if (i < 2) {
                                vetorArmazenarPosicoes[i] = RANDOMIZER.nextInt(5);
                        } else if (i == 2) {
                                vetorArmazenarPosicoes[i] = RANDOMIZER.nextInt(4);
                        } else {
                                vetorArmazenarPosicoes[i] = RANDOMIZER.nextInt(6);
                        }
                }
                char spawnBonny = bonny[vetorArmazenarPosicoes[0]];
                char spawnChica = chica[vetorArmazenarPosicoes[1]];
                char spawnFoxy = foxy[vetorArmazenarPosicoes[2]];
                char spawnFreedy = freedy[vetorArmazenarPosicoes[3]];

                for (int i = 0; i < matrizFnafMapa.length; i++) {
                        for (int j = 0; j < matrizFnafMapa[i].length; j++) {
                                if (matrizFnafMapa[i][j] == spawnBonny) {
                                        posicoesInimigosMatriz[0][0] = i;
                                        posicoesInimigosMatriz[0][1] = j;
                                } else if (matrizFnafMapa[i][j] == spawnChica) {
                                        posicoesInimigosMatriz[1][0] = i;
                                        posicoesInimigosMatriz[1][1] = j;
                                } else if (matrizFnafMapa[i][j] == spawnFoxy) {
                                        posicoesInimigosMatriz[2][0] = i;
                                        posicoesInimigosMatriz[2][1] = j;
                                } else if (matrizFnafMapa[i][j] == spawnFreedy) {
                                        posicoesInimigosMatriz[3][0] = i;
                                        posicoesInimigosMatriz[3][1] = j;
                                }
                        }
                }

                return posicoesInimigosMatriz;
        }

        public static char[][] limparMatrizes(char[][] matriz, int[] posicaoPersonagem,
                        int[][] posicoesInimigosMatriz) {
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                                if (i != posicaoPersonagem[0] && j != posicaoPersonagem[1]
                                                && matriz[i][j] != '|'
                                                && matriz[i][j] != '_') {
                                        matriz[i][j] = ' ';
                                }
                        }
                }
                return matriz;
        }

        public static int[] localizarPersonagem(char[][] matrizFnafMapa, int[] posicaoPersonagem) {
                for (int i = 0; i < matrizFnafMapa.length; i++) {
                        for (int j = 0; j < matrizFnafMapa[i].length; j++) {
                                if (matrizFnafMapa[i][j] == 'P') {
                                        posicaoPersonagem[0] = i;
                                        posicaoPersonagem[1] = j;
                                }
                        }
                }
                return posicaoPersonagem;
        }

        public static int[][] localizarInimigos(char[][] matrizFnafMapa, int[][] posicoesInimigosMatriz) {
                for (int i = 0; i < matrizFnafMapa.length; i++) {
                        for (int j = 0; j < matrizFnafMapa[i].length; j++) {
                                if (matrizFnafMapa[i][j] == 'B') {
                                        posicoesInimigosMatriz[0][0] = i;
                                        posicoesInimigosMatriz[0][1] = j;
                                } else if (matrizFnafMapa[i][j] == 'C') {
                                        posicoesInimigosMatriz[1][0] = i;
                                        posicoesInimigosMatriz[1][1] = j;
                                } else if (matrizFnafMapa[i][j] == 'X') {
                                        posicoesInimigosMatriz[2][0] = i;
                                        posicoesInimigosMatriz[2][1] = j;
                                } else if (matrizFnafMapa[i][j] == 'F') {
                                        posicoesInimigosMatriz[3][0] = i;
                                        posicoesInimigosMatriz[3][1] = j;
                                }
                        }
                }

                return posicoesInimigosMatriz;
        }

        public static char[][] moverPersonagem(char[][] matrizFnafMapa, int[] posicaoPersonagem) {
                int tecla = LER.nextInt();

                switch (tecla) {
                        case 8:
                                if (matrizFnafMapa[posicaoPersonagem[0] - 1][posicaoPersonagem[1]] != '|'
                                                && matrizFnafMapa[posicaoPersonagem[0]
                                                                - 1][posicaoPersonagem[1]] != '_'
                                                && matrizFnafMapa[posicaoPersonagem[0]
                                                                - 1][posicaoPersonagem[1]] == ' ') {

                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = ' ';
                                        matrizFnafMapa[posicaoPersonagem[0] - 1][posicaoPersonagem[1]] = 'P';
                                        posicaoPersonagem = localizarPersonagem(matrizFnafMapa,
                                                        posicaoPersonagem);
                                } else if (matrizFnafMapa[posicaoPersonagem[0] - 1][posicaoPersonagem[1]] == 'B'
                                                || matrizFnafMapa[posicaoPersonagem[0] - 1][posicaoPersonagem[1]] == 'C'
                                                || matrizFnafMapa[posicaoPersonagem[0] - 1][posicaoPersonagem[1]] == 'X'
                                                || matrizFnafMapa[posicaoPersonagem[0]
                                                                - 1][posicaoPersonagem[1]] == 'F') {
                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                }
                                break;

                        case 2:
                                if (matrizFnafMapa[posicaoPersonagem[0] + 1][posicaoPersonagem[1]] != '|'
                                                && matrizFnafMapa[posicaoPersonagem[0]
                                                                + 1][posicaoPersonagem[1]] != '_'
                                                && matrizFnafMapa[posicaoPersonagem[0]
                                                                + 1][posicaoPersonagem[1]] == ' ') {

                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = ' ';
                                        matrizFnafMapa[posicaoPersonagem[0]
                                                        + 1][posicaoPersonagem[1]] = 'P';
                                        posicaoPersonagem = localizarPersonagem(matrizFnafMapa,
                                                        posicaoPersonagem);
                                } else if (matrizFnafMapa[posicaoPersonagem[0] + 1][posicaoPersonagem[1]] == 'B'
                                                || matrizFnafMapa[posicaoPersonagem[0] + 1][posicaoPersonagem[1]] == 'C'
                                                || matrizFnafMapa[posicaoPersonagem[0] + 1][posicaoPersonagem[1]] == 'X'
                                                || matrizFnafMapa[posicaoPersonagem[0]
                                                                + 1][posicaoPersonagem[1]] == 'F') {
                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                }
                                break;
                        case 6:
                                if (matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                + 1] != '|'
                                                && matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                                + 1] != '_'
                                                && matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                                + 1] == ' ') {
                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = ' ';
                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                        + 1] = 'P';
                                        posicaoPersonagem = localizarPersonagem(matrizFnafMapa,
                                                        posicaoPersonagem);
                                } else if (matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1] + 1] == 'B'
                                                || matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1] + 1] == 'C'
                                                || matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1] + 1] == 'X'
                                                || matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                                + 1] == 'F') {
                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                }
                                break;
                        case 4:
                                if (matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                - 1] != '|'
                                                && matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                                - 1] != '_'
                                                && matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                                - 1] == ' ') {

                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = ' ';
                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                        - 1] = 'P';
                                        posicaoPersonagem = localizarPersonagem(matrizFnafMapa,
                                                        posicaoPersonagem);
                                } else if (matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1] - 1] == 'B'
                                                || matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1] - 1] == 'C'
                                                || matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1] - 1] == 'X'
                                                || matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]
                                                                - 1] == 'F') {
                                        matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                }
                                break;

                }
                return matrizFnafMapa;
        }

        public static char[][] moverEnemies(char[][] matrizFnafMapa, int[][] posicoesInimigosMatriz) {
                for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 1; j++) {
                                float y = RANDOMIZER.nextFloat();
                                if (y <= 0.8) {
                                        int x = RANDOMIZER.nextInt(4);
                                        switch (i) {
                                                case 0:
                                                        switch (x) {
                                                                case 0:
                                                                        if (posicoesInimigosMatriz[0][0] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        - 1][posicoesInimigosMatriz[0][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        - 1][posicoesInimigosMatriz[0][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        - 2][posicoesInimigosMatriz[0][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        - 2][posicoesInimigosMatriz[0][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                - 2][posicoesInimigosMatriz[0][1]] = 'B';

                                                                        } else if (posicoesInimigosMatriz[0][0] < matrizFnafMapa.length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        + 1][posicoesInimigosMatriz[0][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        + 1][posicoesInimigosMatriz[0][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        + 2][posicoesInimigosMatriz[0][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        + 2][posicoesInimigosMatriz[0][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                + 2][posicoesInimigosMatriz[0][1]] = 'B';

                                                                        }

                                                                        break;
                                                                case 1:
                                                                        if (posicoesInimigosMatriz[0][0] < matrizFnafMapa.length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        + 1][posicoesInimigosMatriz[0][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        + 1][posicoesInimigosMatriz[0][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        + 2][posicoesInimigosMatriz[0][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        + 2][posicoesInimigosMatriz[0][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                + 2][posicoesInimigosMatriz[0][1]] = 'B';

                                                                        } else if (posicoesInimigosMatriz[0][0] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        - 1][posicoesInimigosMatriz[0][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        - 1][posicoesInimigosMatriz[0][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        - 2][posicoesInimigosMatriz[0][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                        - 2][posicoesInimigosMatriz[0][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]
                                                                                                - 2][posicoesInimigosMatriz[0][1]] = 'B';
                                                                        }

                                                                        break;

                                                                case 2:
                                                                        if (posicoesInimigosMatriz[0][1] < matrizFnafMapa[0].length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        + 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        + 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        + 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        + 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                + 2] = 'B';

                                                                        } else if (posicoesInimigosMatriz[0][1] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        - 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        - 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        - 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        - 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                - 2] = 'B';
                                                                        }
                                                                        break;
                                                                case 3:
                                                                        if (posicoesInimigosMatriz[0][1] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        - 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        - 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        - 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        - 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                - 2] = 'B';

                                                                        } else if (posicoesInimigosMatriz[0][1] < matrizFnafMapa[0].length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        + 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        + 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        + 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                        + 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[0][0]][posicoesInimigosMatriz[0][1]
                                                                                                + 2] = 'B';

                                                                        }
                                                                        break;

                                                        }
                                                        break;
                                                case 1:
                                                        switch (x) {
                                                                case 0:
                                                                        if (posicoesInimigosMatriz[1][0] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        - 1][posicoesInimigosMatriz[1][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        - 1][posicoesInimigosMatriz[1][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        - 2][posicoesInimigosMatriz[1][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        - 2][posicoesInimigosMatriz[1][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                - 2][posicoesInimigosMatriz[1][1]] = 'C';

                                                                        } else if (posicoesInimigosMatriz[1][0] < matrizFnafMapa.length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        + 1][posicoesInimigosMatriz[1][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        + 1][posicoesInimigosMatriz[1][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        + 2][posicoesInimigosMatriz[1][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        + 2][posicoesInimigosMatriz[1][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                + 2][posicoesInimigosMatriz[1][1]] = 'C';
                                                                        }

                                                                        break;
                                                                case 1:
                                                                        if (posicoesInimigosMatriz[1][0] < matrizFnafMapa.length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        + 1][posicoesInimigosMatriz[1][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        + 1][posicoesInimigosMatriz[1][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        + 2][posicoesInimigosMatriz[1][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        + 2][posicoesInimigosMatriz[1][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                + 2][posicoesInimigosMatriz[1][1]] = 'C';

                                                                        } else if (posicoesInimigosMatriz[1][0] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        - 1][posicoesInimigosMatriz[1][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        - 1][posicoesInimigosMatriz[1][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        - 2][posicoesInimigosMatriz[1][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                        - 2][posicoesInimigosMatriz[1][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]
                                                                                                - 2][posicoesInimigosMatriz[1][1]] = 'C';
                                                                        }

                                                                        break;

                                                                case 2:
                                                                        if (posicoesInimigosMatriz[1][1] < matrizFnafMapa[0].length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        + 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        + 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        + 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        + 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                + 2] = 'C';

                                                                        } else if (posicoesInimigosMatriz[1][1] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        - 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        - 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        - 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        - 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                - 2] = 'C';
                                                                        }
                                                                        break;
                                                                case 3:
                                                                        if (posicoesInimigosMatriz[1][1] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        - 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        - 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        - 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        - 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                - 2] = 'C';

                                                                        } else if (posicoesInimigosMatriz[1][1] < matrizFnafMapa[0].length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        + 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        + 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        + 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                        + 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[1][0]][posicoesInimigosMatriz[1][1]
                                                                                                + 2] = 'C';

                                                                        }
                                                                        break;

                                                        }
                                                        break;

                                                case 2:
                                                        switch (x) {
                                                                case 0:
                                                                        if (posicoesInimigosMatriz[2][0] >= 3
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 1][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 1][posicoesInimigosMatriz[2][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 2][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 2][posicoesInimigosMatriz[2][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 3][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 3][posicoesInimigosMatriz[2][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                - 3][posicoesInimigosMatriz[2][1]] = 'X';

                                                                        } else if (posicoesInimigosMatriz[2][0] < matrizFnafMapa.length
                                                                                        - 3
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 1][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 1][posicoesInimigosMatriz[2][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 2][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 2][posicoesInimigosMatriz[2][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 3][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 3][posicoesInimigosMatriz[2][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                + 3][posicoesInimigosMatriz[2][1]] = 'X';
                                                                        }

                                                                        break;
                                                                case 1:
                                                                        if (posicoesInimigosMatriz[2][0] < matrizFnafMapa.length
                                                                                        - 3
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 1][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 1][posicoesInimigosMatriz[2][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 2][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 2][posicoesInimigosMatriz[2][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 3][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        + 3][posicoesInimigosMatriz[2][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                + 3][posicoesInimigosMatriz[2][1]] = 'X';

                                                                        } else if (posicoesInimigosMatriz[2][0] >= 3
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 1][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 1][posicoesInimigosMatriz[2][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 2][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 2][posicoesInimigosMatriz[2][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 3][posicoesInimigosMatriz[2][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                        - 3][posicoesInimigosMatriz[2][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]
                                                                                                - 3][posicoesInimigosMatriz[2][1]] = 'X';
                                                                        }

                                                                        break;

                                                                case 2:
                                                                        if (posicoesInimigosMatriz[2][1] < matrizFnafMapa[0].length
                                                                                        - 3
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 2] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 3] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 3] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                + 3] = 'X';

                                                                        } else if (posicoesInimigosMatriz[2][1] >= 3
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 2] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 3] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 3] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                - 3] = 'X';
                                                                        }
                                                                        break;
                                                                case 3:
                                                                        if (posicoesInimigosMatriz[2][1] >= 3
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 2] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 3] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        - 3] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                - 3] = 'X';

                                                                        } else if (posicoesInimigosMatriz[2][1] < matrizFnafMapa[0].length
                                                                                        - 3
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 2] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 3] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                        + 3] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[2][0]][posicoesInimigosMatriz[2][1]
                                                                                                + 3] = 'X';

                                                                        }
                                                                        break;

                                                        }
                                                        break;
                                                case 3:
                                                        switch (x) {
                                                                case 0:
                                                                        if (posicoesInimigosMatriz[3][0] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        - 1][posicoesInimigosMatriz[3][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        - 1][posicoesInimigosMatriz[3][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        - 2][posicoesInimigosMatriz[3][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        - 2][posicoesInimigosMatriz[3][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                - 2][posicoesInimigosMatriz[3][1]] = 'F';

                                                                        } else if (posicoesInimigosMatriz[3][0] < matrizFnafMapa.length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        + 1][posicoesInimigosMatriz[3][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        + 1][posicoesInimigosMatriz[3][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        + 2][posicoesInimigosMatriz[3][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        + 2][posicoesInimigosMatriz[3][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                + 2][posicoesInimigosMatriz[3][1]] = 'F';
                                                                        }

                                                                        break;
                                                                case 1:
                                                                        if (posicoesInimigosMatriz[3][0] < matrizFnafMapa.length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        + 1][posicoesInimigosMatriz[3][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        + 1][posicoesInimigosMatriz[3][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        + 2][posicoesInimigosMatriz[3][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        + 2][posicoesInimigosMatriz[3][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                + 2][posicoesInimigosMatriz[3][1]] = 'F';

                                                                        } else if (posicoesInimigosMatriz[3][0] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        - 1][posicoesInimigosMatriz[3][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        - 1][posicoesInimigosMatriz[3][1]] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        - 2][posicoesInimigosMatriz[3][1]] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                        - 2][posicoesInimigosMatriz[3][1]] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]
                                                                                                - 2][posicoesInimigosMatriz[3][1]] = 'F';
                                                                        }

                                                                        break;

                                                                case 2:
                                                                        if (posicoesInimigosMatriz[3][1] < matrizFnafMapa[0].length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        + 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        + 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        + 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        + 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                + 2] = 'F';

                                                                        } else if (posicoesInimigosMatriz[3][1] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        - 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        - 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        - 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        - 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                - 2] = 'F';
                                                                        }
                                                                        break;
                                                                case 3:
                                                                        if (posicoesInimigosMatriz[3][1] >= 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        - 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        - 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        - 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        - 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                - 2] = 'F';

                                                                        } else if (posicoesInimigosMatriz[3][1] < matrizFnafMapa[0].length
                                                                                        - 2
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        + 1] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        + 1] != '_'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        + 2] != '|'
                                                                                        && matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                        + 2] != '_') {

                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]] = ' ';
                                                                                matrizFnafMapa[posicoesInimigosMatriz[3][0]][posicoesInimigosMatriz[3][1]
                                                                                                + 2] = 'F';

                                                                        }
                                                                        break;

                                                        }
                                                        break;
                                        }
                                }
                        }

                }

                return matrizFnafMapa;

        }

        public static boolean verificarAgro(char[][] matrizFnafMapa, int[] posicaoPersonagem) {
                boolean agro = false;
                for (int i = 7; i > -15; i--) {
                        for (int j = 7; j > -15; j--) {
                                if (posicaoPersonagem[0] + i < matrizFnafMapa.length && posicaoPersonagem[0] + i > 0
                                                && posicaoPersonagem[1] + j < matrizFnafMapa[0].length
                                                && posicaoPersonagem[1] + j > 0
                                                && matrizFnafMapa[posicaoPersonagem[0] + i][posicaoPersonagem[1]
                                                                + j] != '_'
                                                && matrizFnafMapa[posicaoPersonagem[0] + i][posicaoPersonagem[1]
                                                                + j] != '|'
                                                && matrizFnafMapa[posicaoPersonagem[0] + i][posicaoPersonagem[1]
                                                                + j] != 'P'
                                                && matrizFnafMapa[posicaoPersonagem[0] + i][posicaoPersonagem[1]
                                                                + j] != ' ') {
                                        agro = true;
                                        break;
                                }
                        }
                }
                return agro;
        }

        public static char[][] moverEnemiesAgrado(char[][] matrizFnafMapa, int[] posicaoPersonagem,
                        int[][] posicoesInimigosMatriz) {
                int distanciaX = 0;
                int distanciaY = 0;
                char[] inimigosAgrados = new char[4];
                for (int i = 0; i < inimigosAgrados.length; i++) {
                        inimigosAgrados[i] = ' ';
                }
                for (int i = 7; i > -15; i--) {
                        for (int j = 7; j > -15; j--) {
                                if (posicaoPersonagem[0] + i < matrizFnafMapa.length && posicaoPersonagem[0] + i > 0
                                                && posicaoPersonagem[1] + j < matrizFnafMapa[0].length
                                                && posicaoPersonagem[1] + j > 0
                                                && matrizFnafMapa[posicaoPersonagem[0] + i][posicaoPersonagem[1]
                                                                + j] == 'B') {
                                        inimigosAgrados[0] = 'B';
                                }
                                if (posicaoPersonagem[0] + i < matrizFnafMapa.length && posicaoPersonagem[0] + i > 0
                                                && posicaoPersonagem[1] + j < matrizFnafMapa[0].length
                                                && posicaoPersonagem[1] + j > 0
                                                && matrizFnafMapa[posicaoPersonagem[0] + i][posicaoPersonagem[1]
                                                                + j] == 'C') {
                                        inimigosAgrados[1] = 'C';
                                }
                                if (posicaoPersonagem[0] + i < matrizFnafMapa.length && posicaoPersonagem[0] + i > 0
                                                && posicaoPersonagem[1] + j < matrizFnafMapa[0].length
                                                && posicaoPersonagem[1] + j > 0
                                                && matrizFnafMapa[posicaoPersonagem[0] + i][posicaoPersonagem[1]
                                                                + j] == 'X') {
                                        inimigosAgrados[2] = 'X';
                                }
                                if (posicaoPersonagem[0] + i < matrizFnafMapa.length && posicaoPersonagem[0] + i > 0
                                                && posicaoPersonagem[1] + j < matrizFnafMapa[0].length
                                                && posicaoPersonagem[1] + j > 0
                                                && matrizFnafMapa[posicaoPersonagem[0] + i][posicaoPersonagem[1]
                                                                + j] == 'F') {
                                        inimigosAgrados[3] = 'F';
                                }
                        }
                }

                for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                                if (inimigosAgrados[i] != ' ') {
                                        distanciaX = posicaoPersonagem[1] - posicoesInimigosMatriz[i][1];
                                        distanciaY = posicaoPersonagem[0] - posicoesInimigosMatriz[i][0];
                                        if (i == 2) {
                                                if (distanciaX <= -3
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 2] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 2] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 3] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 3] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] - 3;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                } else if (distanciaX == -2
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 2] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 2] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] - 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                } else if (distanciaX == -1
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] - 1;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                }
                                                if (distanciaX >= 3
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 2] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 2] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 3] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 3] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] + 3;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                } else if (distanciaX == 2
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 2] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 2] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] + 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                } else if (distanciaX == 1
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] + 1;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                }
                                                if (distanciaY <= -3
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 2][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 2][posicoesInimigosMatriz[i][1]] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 3][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 3][posicoesInimigosMatriz[i][1]] != '_') {

                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0] - 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                } else if (distanciaY == -2
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 2][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 2][posicoesInimigosMatriz[i][1]] != '_') {

                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0] - 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                } else if (distanciaY == -1
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '_') {

                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0] - 1;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                }
                                                if (distanciaY >= 3
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 2][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 2][posicoesInimigosMatriz[i][1]] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 3][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 3][posicoesInimigosMatriz[i][1]] != '_') {

                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0] + 3;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                } else if (distanciaY == 2
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 2][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 2][posicoesInimigosMatriz[i][1]] != '_') {

                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0] + 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                }
                                                if (distanciaY == 1
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '_') {

                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0] + 1;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                }
                                        } else {

                                                if (distanciaX <= -2
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 2] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 2] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] - 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                } else if (distanciaX == -1
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                - 1] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] - 1;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                } else if (distanciaX >= 2
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 2] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 2] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] + 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                } else if (distanciaX == 1
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 1] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 2] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]
                                                                                + 2] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][1] = posicoesInimigosMatriz[i][1] + 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }

                                                }

                                                if (distanciaY <= -2
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 2][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 2][posicoesInimigosMatriz[i][1]] != '_') {

                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0]
                                                                        - 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                } else if (distanciaY == -1
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                - 1][posicoesInimigosMatriz[i][1]] != '_') {
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0]
                                                                        - 1;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                } else if (distanciaY >= 2
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '_'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 2][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 2][posicoesInimigosMatriz[i][1]] != '_') {

                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0] + 2;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                } else if (distanciaY == 1
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '|'
                                                                && matrizFnafMapa[posicoesInimigosMatriz[i][0]
                                                                                + 1][posicoesInimigosMatriz[i][1]] != '_') {

                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = ' ';
                                                        posicoesInimigosMatriz[i][0] = posicoesInimigosMatriz[i][0] + 1;
                                                        matrizFnafMapa[posicoesInimigosMatriz[i][0]][posicoesInimigosMatriz[i][1]] = inimigosAgrados[i];
                                                        if (posicoesInimigosMatriz[i][0] == posicaoPersonagem[0]
                                                                        && posicoesInimigosMatriz[i][1] == posicaoPersonagem[1]) {
                                                                matrizFnafMapa[posicaoPersonagem[0]][posicaoPersonagem[1]] = '*';
                                                        }
                                                }
                                        }
                                }
                        }
                }
                return matrizFnafMapa;
        }

        public static void limparTerminal() {

                System.out.print("\033[0;0H");
        }

        public static String[][] rankiarJogadores(String[][] matrizRanks, int contador) {
                for (int i = 0; i < matrizRanks.length; i++) {
                        int tempo = Integer.parseInt(matrizRanks[i][2]);
                        if (contador > tempo) {
                                matrizRanks[i][2] = Integer.valueOf(contador).toString();
                                matrizRanks[i][1] = matrizRanks[0][4] + " ";
                                matrizRanks[0][4] = " ";
                                break;
                        }
                }
                return matrizRanks;
        }
// oi ;-
}