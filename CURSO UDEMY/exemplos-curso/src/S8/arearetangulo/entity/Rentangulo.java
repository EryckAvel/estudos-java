package S8.arearetangulo.entity;

public class Rentangulo {

    public double largura;
    public double altura;


    public double area(){
        return largura*altura;
    }

    public double perimetro(){
        return 2*(largura+altura);
    }

    public double diagonal(){
        return Math.sqrt(altura*largura + altura+largura);
    }

}
