package exercicios;

public class Fatorial {
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        fatorial.fatorial(5);
    }
    public void fatorial(int num){
        int fat = num;
        if (num == 0){
            num += 1;
            System.out.println(num);
        }
        for (int i = 1 ; i < num; i++) {
                fat = fat * i;
            }
        System.out.println("O valor fatorial do número inserido " + num + " é: " + fat );
        }

    }


