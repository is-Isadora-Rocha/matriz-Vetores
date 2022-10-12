import java.util.*;
public class Vetores {
    public static void main(String[] args) {

        //o length é para o vetor usar o seu próprio
        //tamanho, ao invés de determinar

        Scanner scan = new Scanner(System.in);

//        1) Escreva um programa que leia 20 valores inteiros e os armazene em um vetor.
//         Depois de ler os 20 valores, o programa deve percorrer o vetor
//         e mostrar na tela apenas os números pares que foram armazenados.

//        int[] vetor = new int[20];

//        for (int i = 0; i < vetor.length; i++) {
//            vetor[i] = (i);
//            if (i % 2 == 0) {
//                System.out.println("numeross pares: " + i);
//            }
//        }

//----------------------------------------------------------------------------------------------------------------------
//      // 2) Faça um programa que leia 10 valores e os armazene em um vetor. Depois, o programa deve somar todos os
//      // valores do vetor e apresentar o resultado.

//        int [] valores = new int[10];
//        int soma = 0;

//        for (int i = 0; i < valores.length; i++){
//            valores[i] = (i);
//            soma += valores[i];
//            System.out.println("valores: " +i);
//        }

//        System.out.println("a soma dos valores são: "+soma);
//----------------------------------------------------------------------------------------------------------------------
//        //3) Faça um programa que leia 10 valores e os armazene em um vetor.
//        // Depois, imprima o vetor na ordem inversa.

//        int [] valores = new int[10];

//        for (int i = valores.length-1; i >= 0; i--){
//            valores[i] = (i + 1);
//            System.out.println(i);
//        }
//----------------------------------------------------------------------------------------------------------------------
        //4) Faça um programa que leia duas sequências de 10 valores inteiros em dois vetores distintos
        // e depois verifique se os dois vetores são idênticos.

//        int [] vetor1 = new int[10];
//        int [] vetor2 = new int[10];

//        System.out.println("digite seus valores: ");
//        for (int i = 0; i <= 10; i++){
//            if (vetor1 == vetor2){
//                System.out.println("são distintos");
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
//        //5) Faça um programa que carregue um vetor com sete números inteiros, calcule e mostre:
//        //a. Os números múltiplos de 2
//        //b. Os números múltiplos de 3;
//        //c. Os números múltiplos de 2 e de 3.
//        //Obs: Informar para o usuário caso não tenha números múltiplos em questão.

//        int [] vetor = new int[7];

//        for (int i = 0; i < vetor.length; i++){
//            vetor[i] = i;
//            if (vetor[i] % 2 == 0){
//                System.out.println("multiplos de 2: " +vetor[i]);
//            }

//            if (vetor[i] % 3 == 0){
//                System.out.println("multiplos de 3: " +vetor[i]);
//            }

//            if (vetor[i] % 2 == 0 && vetor[i] % 3 == 0){
//                System.out.println("multiplos de 2 e 3: " +vetor[i]);
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
//        //6) Faça um programa que LEIA um vetor de 10 elementos e em seguida ache a posição do elemento m
//        // (dado pelo usuário) no vetor. Caso o elemento não exista no vetor informe ao usuário.

//        int [] vetor = new int [10];
//        for (int i = 0; i < 10; i++){
//            vetor[i] = i;
//            System.out.println("vetor: [" +vetor[i]+ "]");
//
////            System.out.println("insira um valor no vetor "+i+ " :");
////            vetor[i] = scan.nextInt();
//        }

//        for (int f = 0; f < 10; f++){
//            System.out.println("digite a posição do vetor: ");
//            f = scan.nextInt();
//            System.out.println("na posição "+f+" tem o vetor " +vetor[f-1]);
//            if (f > 10){
//                System.out.println("vetor inválido!");
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
//        //7) Faça um programa que calcule a soma dos vetores, elemento a elemento, em um terceiro vetor.
//        // O tamanho do vetor deverá ser 4.

//        int[] vetor = new int[4];

//        for (int i = 0; i < 4; i++){
//            System.out.println("digite 3 valores");
//            vetor[0] = scan.nextInt();
//            vetor[1] = scan.nextInt();
//            vetor[2] = scan.nextInt();
//            System.out.println("digitados: "+vetor[0]+" + "+vetor[1]+" + "+vetor[2]);
//            vetor[3] = vetor[0]+vetor[1]+vetor[2];
//            System.out.println(vetor[3]);
//        }

//        int[] vetor2 = {0,1,2,3};
//        int soma = 0;
//        for (int i = 0; i < 4; i++){
//            System.out.println(vetor2[i]);
//            soma += vetor2[i]; // soma = vetor2[i]+soma;
//        }

//        System.out.println("soma: "+soma);

