
////8) Escreva um algoritmo para ler as dimens�es de um tri�ngulo (base e altura), calcular e escrever a �rea do tri�ngulo. Dica a=b.h/2
import java.util.Scanner;

public class Exercicio08 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor da base do tri�ngulo");

int base= sc.nextInt();

System.out.println("Digite o valor da altura do tri�ngulo");

int altura= sc.nextInt();

System.out.println(base*altura/2);
}}
