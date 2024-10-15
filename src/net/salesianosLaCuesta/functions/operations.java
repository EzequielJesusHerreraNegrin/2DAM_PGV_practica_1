package net.salesianosLaCuesta.functions;

public class operations {
    public static void main(String[] args) {
        String phrase = args[0];

        String[] words = phrase.split(",");

        String name = words[0];
        String height = words[1];
        String weight = words[2];

        float imc = Float.parseFloat(weight) / (Float.parseFloat(height) * 2) ;

        System.out.println(name + " con una altura de "+ height +" un peso de "+ weight +" tiene un IMC de: " + imc);

    }

}
