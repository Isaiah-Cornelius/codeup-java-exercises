public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        int myFavoriteNumber = 144;

        System.out.println(myFavoriteNumber);

        String myString = "This is my string, there are many like it but this one is mine.";
//        myString = 'c'
//        myString = 3.14159;

        System.out.println(myString);

//        long myNumber;
//
//        myNumber = 3.14;
//
//        myNumber = 123L;
//
//        myNumber = 123;

        int myNumberInt = 3001;

        float myNumber = (float) 3.14;
        System.out.println(myNumber);
        myNumber = myNumber * 100;


        int myNumberToInt = (int) myNumber;


        double myNumberDouble = myNumberToInt;

        myNumberDouble = myNumberDouble / 100;


        System.out.println(myNumberDouble);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int class = 1;

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // cast conversion error

//        int three = (int) "three";
        // type converstion error

        // rewrite:
//        int x = 4;
//        x = x + 5;
//        int x = 4;
//        x += 5;
//        System.out.print(x);

        // rewrite
//        int x = 3;
//        int y = 4;
//        y = y * x;
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.print(y);

        //rewrite:
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.print(y);

//        byte num = 128;
        // incompatible types: lossy conversion from int to byte

//        byte num = 127;
//        num++;
//        System.out.print(num);
        // increment num at max byte value iterates value to lowest number in accepted range

    }
}
