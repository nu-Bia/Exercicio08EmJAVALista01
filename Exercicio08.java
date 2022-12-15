
////8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2
import java.util.Scanner;

public class Exercicio08 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor da base do triângulo");

int base= sc.nextInt();

System.out.println("Digite o valor da altura do triângulo");

int altura= sc.nextInt();

System.out.println(base*altura/2);
}}
