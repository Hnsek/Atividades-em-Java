
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        // QUESTÂO 1 //
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o ano de nascimento:");
        int anoNascimento = scan.nextInt();
        
        System.out.println("Insira o ano atual");
        int anoAtual = scan.nextInt();
        
        int idade = anoAtual - anoNascimento;
        
        System.out.print("Idade:");
        System.out.println(idade);
    
        // QUESTÂO 2
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro lado do triângulo:");
        int lado1 = scan.nextInt();
        
        System.out.println("Insira o segundo lado do triângulo:");
        int lado2 = scan.nextInt();
        
        System.out.println("Insira o terceiro lado do triângulo:");
        int lado3 = scan.nextInt();
        
        if((lado1 == lado2) && (lado2 == lado3) )
        {
            System.out.println("Equilátero");
        }
        else if((lado1 != lado2) &&  (lado2 != lado3))
        {
            System.out.println("Escaleno");
        }
        else
        {
            System.out.println("Isóceles");
        }
        
        
        // QUESTÃO 3
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a altura da primeira pessoa:");
        int altura1 = scan.nextInt();
        
        System.out.println("Insira a altura da segunda pessoa:");
        int altura2 = scan.nextInt();
        
        System.out.println("Insira a altura da terceira pessoa:");
        int altura3 = scan.nextInt();
        
        float media = (altura1 + altura2 + altura3) / 3;
        
        System.out.println(media);
        
        //QUESTÃO 4
        
        Scanner scan = new Scanner(System.in);
        
        int num[] = new int[3];
        
        System.out.println("Insira o primeiro número:");
        num[0] = scan.nextInt();
        
        System.out.println("Insira o segundo número:");
        num[1] = scan.nextInt();
        
        System.out.println("Insira o terceiro número:");
        num[2] = scan.nextInt();
        
        
        int maior = 0;
        
        for(int i = 0; i < 3; i++)
        {
            if((num[i] >= num[0]) && (num[i] >= num[1]) && (num[i] >= num[2]))
            {
                maior = num[i];
            }
        }
        
        System.out.print("Maior:");
        System.out.println(maior);
    }

    
    // QUESTÃO 5
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Insira um número:");
    int num = scan.nextInt();
    
    if(num % 2 == 0 )
    {
        System.out.print("Par");
    }
    else
    {
        System.out.print("Ímpar");
    }
    
    // QUESTÃO 6

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Insira o primeiro número:");
    int num1 = scan.nextInt();
    
    System.out.print("Insira o primeiro número:");
    int num2 = scan.nextInt();
    
    System.out.print("1 - soma \n2 - subtração \n3 - multiplicação \n4 - divisão \nInsira a operação:");
    int opcao = scan.nextInt();
    
    int resultado = 0; 
    
    switch(opcao)
    {
        case 1:
            resultado = num1 + num2;
            break;
        case 2:
            resultado = num1 - num2;
            break;
        case 3:
            resultado = num1 * num2;
            break;
        case 4:
            resultado = num1 / num2;
            break;
    }
    
        System.out.print("Resultado:");
        System.out.print(resultado);
        
    }    
}
