    package exercicios;

    public class OrdenacaoBurbble {
        public static void main(String[] args) {

            int vetor[] = {5,3,2,4,7,1,0,6};
            int aux;
            int y = 0;
            while (y < (vetor.length - 1)){
                for(int i = 0; i < vetor.length; ++i){
                    for(int j = 0; j < (vetor.length - 1); ++j){
                        if(vetor[j] > vetor[j + 1]){
                            aux = vetor[j];
                            vetor[j] = vetor[j + 1];
                            vetor[j + 1] = aux;
                        }
                    }
                }
                y++;
            }
            for (int i = 0; i < vetor.length - 1; ++i) {
                for (int count: vetor){
                    System.out.print(vetor[count] + " ");
                }
                System.out.println("\n");
            }
        }
    }


