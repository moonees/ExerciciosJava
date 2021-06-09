package exercicios;

public class ExercicioVoto {
    public static void main(String[] args) {
        ExercicioVoto exercicioVoto = new ExercicioVoto();
        exercicioVoto.calculaPercentualVotosValidos();
        exercicioVoto.calculaPercentualVotosBrancos();
        exercicioVoto.calculaPercentualVotosNulos();
    }

    private Double totalEleitores = 1000.0;
    private Double validos = 800.0;
    private Double votosBrancos = 150.0;
    private Double nulos = 50.0;

    public ExercicioVoto(){

    }

    public ExercicioVoto(Double totalEleitores, Double validos, Double votosBrancos, Double nulos) {
        this.totalEleitores = totalEleitores;
        this.validos = validos;
        this.votosBrancos = votosBrancos;
        this.nulos = nulos;
    }

    public Double getTotalEleitores() {
        return totalEleitores;
    }

    public Double getValidos() {
        return validos;
    }

    public Double getVotosBrancos() {
        return votosBrancos;
    }

    public Double getNulos() {
        return nulos;
    }
    public Double reutiliza(Double doubleCem){
        return  (doubleCem * 100);
    }

    public void calculaPercentualVotosValidos(){
        Double votosValidos = getValidos()/getTotalEleitores();
        System.out.println(reutiliza(votosValidos) + "%");
    }

    public void calculaPercentualVotosBrancos(){
        Double votosBrancos = getVotosBrancos()/getTotalEleitores();
        System.out.println(reutiliza(votosBrancos) + "%");
    }

    public void calculaPercentualVotosNulos(){
        Double votosNulos = getNulos()/getTotalEleitores();
        System.out.println(reutiliza(votosNulos) + "%");
    }



}
