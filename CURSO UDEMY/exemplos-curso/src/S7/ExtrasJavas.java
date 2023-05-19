package S7;

public class ExtrasJavas {

    //todo forma correta de se nomear variaveis em java

    int _5minutos;
    int salario;
    int salarioDoFuncionario;

    //todo forma errada de nomear variaveis

    //int 5minutos;
    //int salário;
    //int salario do funcionario

    //TODO funções para string

    public static void main(String[] args) {
        String original = " abcde FGHIJ ABC abc DEFG     ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace("a", "x");
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("ToLowerCase: -" + s01 + "-");
        System.out.println("ToUpperCase: -" + s02 + "-");
        System.out.println("Trim: -" + s03 + "-");
        System.out.println("SubString(2): -" + s04 + "-");
        System.out.println("SubString(2,9): -" + s05 + "-");
        System.out.println("Replace('a', 'x'): -" + s06 + "-");
        System.out.println("Replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String v1 = vect[0];
        String v2 = vect[1];
        String v3 = vect[2];
        System.out.println(s);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        //todo Comentarios em java

        //comentario de linh!

        /*
        Comentario de bloco!
         */

        //todo funções

        double x = Math.sqrt(25.0);
        System.out.println(x);



    }




}
