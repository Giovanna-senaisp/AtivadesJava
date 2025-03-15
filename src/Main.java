
public class Main {
    public static void main(String[] args) {

        int num01 = 10;
        int num02 = 20;
        int num03 = 30;
        double media = (num01+num02+num03) /3.0;

        float media2 = (num01+num02+num03)/3.0f;
        long media3 = (num01+num02+num03)/3;


        System.out.println("A média é: " + media);
        System.out.println("A média do número real é: " + num01);
        System.out.println("A média do número float é: " + media2);
        System.out.println("A média do número long é: " + media3);

        System.out.println("--------------------------------------");

                long distancia = 149600000L;

                System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");

        System.out.println("--------------------------------------");

        char letra = 'A';
                int valorUnicode = letra;

                System.out.println("O valor Unicode de '" + letra + "' é: " + valorUnicode);

        System.out.println("--------------------------------------");

                int num = 15;
                boolean maiorQueDez = num > 10;

                System.out.println("O número " + num + " é maior que 10? " + maiorQueDez);

        System.out.println("--------------------------------------");

                int[] numeros = {10, 20, 30, 40, 50};
                System.out.println("Primeiro número: " + numeros[0]);
                System.out.println("Último número: " + numeros[numeros.length -1]);

        System.out.println("--------------------------------------");

                double largura = 5.0;
                double altura = 3.0;
                double area = largura * altura;

                System.out.println("A área do retângulo é: " + area);

        System.out.println("--------------------------------------");

                String nome = "Giovanna";
                System.out.println("Olá, " + nome + "! Bem-vindo ao curso de Java.");

        System.out.println("--------------------------------------");

        int numero = 8;
                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é par.");
                } else {
                    System.out.println("O número " + numero + " é ímpar.");
                }

        System.out.println("--------------------------------------");

        int a = 5;
        int b = a++;
        int c = ++a;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);

        System.out.println("--------------------------------------");

        int valor = 20;
        valor = valor + 5;
        valor = valor * 2;
        valor = valor - 3;
        valor = valor / 2;
        valor = valor % 4;
        System.out.println("Resultado final: " + valor);

        System.out.println("--------------------------------------");

        int senai = 210;
        int senai1 = 10;
        System.out.println("Resultado da soma é: "+ (senai+senai1));

        System.out.println("--------------------------------------");

        int ageYears = 32;
        int ageDays = ageYears * 365;
        long ageSeconds = ageYears * 365 * 24L * 60 * 60;
        System.out.println("Você já tem " + ageDays
                + " dias de idade.");

        System.out.println("Você já tem " + ageSeconds
                + " segundos de idade.");


    }
        }



