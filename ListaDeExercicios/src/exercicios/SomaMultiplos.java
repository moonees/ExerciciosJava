package exercicios;


public class SomaMultiplos {

    public static void main (String[] args) {
        SomaMultiplos sm = new SomaMultiplos();
        sm.soma(20);
    }

    public void soma(int x){
        int smMultiplos = 0;
        for(int i = 1; i < x; i++){
            if(i % 3 == 0 || i % 5 == 0){
                smMultiplos += i;
            }
        }
        System.out.println(smMultiplos);

    }
}


