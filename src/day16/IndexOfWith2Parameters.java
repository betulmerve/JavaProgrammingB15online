package day16;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {

        //get the second Java from the sentences
        //you already know there is 4 Java in this sentence
        //second means the Java showed up after first Java

        // first, where is the location of first Java showed up?
        // search from right after the location you found first Java
        //then it will give you the index of second java

        //indexOf has 2 versions. v1 expects 1 external data. v2 expects 2 external data
        //ilkinde aramaya en bastan basliyor biz extra birsey soylemiyoruz
        //fakat ikincisinde aramaya bizim dedigim lokasyondan basliyor

        //           012345678901234567890123456789012
        String name="I love Java I love Java Java Java";

        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java",8)); //yani ilk Javanin oldugu indexten bir fazlasi oluyor 8
        System.out.println(name.indexOf("Java",29)); //third Java icin

        // how do i start from the location that get past first Java
        //basically starting

        int firstJavaLocation=name.indexOf("Java");  //7
        int startingPointToSearchSecondJava=firstJavaLocation+1; //or you can start +4 (Java 4 harf)
        // you can start searching +word.length()
        int secondJavaLocation=name.indexOf("Java",startingPointToSearchSecondJava);

        System.out.println("secondJavaLocation = " + secondJavaLocation);

        //i dont know how many words in this sentence, i only know 3+ words
        // i just want to know what is second word
        //from the first space till second space
        //and there is only one space between words

        int firstSpace=name.indexOf(" ");
        System.out.println("firstSpace = " + firstSpace);
        int secondSpace=name.indexOf(" ",firstSpace+1);
        System.out.println("secondSpace = " + secondSpace);
        String secondWord=name.substring(firstSpace+1,secondSpace);
        System.out.println("secondWord = " + secondWord);


    }
}
