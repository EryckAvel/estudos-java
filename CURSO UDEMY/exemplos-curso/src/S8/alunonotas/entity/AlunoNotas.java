package S8.alunonotas.entity;

public class AlunoNotas {

    public String nome;
    public double notaum;
    public double notadois;
    public double notatres;

    public double notaFinal(){
        return notaum + notadois + notatres;
    }

    public double validarPontos(){
        if (notaFinal() < 60.0){
            return 60 - notaFinal();
        }else{
            return 0;
        }
    }

}
