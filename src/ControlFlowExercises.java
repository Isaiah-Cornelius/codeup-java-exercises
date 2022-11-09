public class ControlFlowExercises {
    public static void main(String [] args){
        //Exercise 1a.
//        int a = 5;
//        while (a <= 15){
//            System.out.println(a);
//            a++;
//        }

        //Exercise 1b. bullet #1
//        int b = 0;
//        do {
//            System.out.println(b);
//            b += 2;
//        } while (b <= 100);

        //Exercise 1b. bullet #2
//        int c = 100;
//        do {
//            System.out.println(c);
//            c -= 5;
//        } while (c >= -10);

        //Exercise 1b. bullet #3
//        long d = 2;
//        do {
//            System.out.println(d);
//            d *= d;
//        } while (d < 1000000000);

        //Exercise 1c
//
//        for (int e = 100; e >= -10; e -=5) {
//            System.out.println(e);
//        }
//
//        for(long f = 2; f <1000000000; f *= f){
//            System.out.println(f);
//        }

        //2. Fizzbuzz
        int g;
        for (g = 1; g <= 100 ; g++){
            if (g % 3 == 0 && g % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (g % 3 == 0){
                System.out.println("Fizz");
            } else if (g % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(g);
            }
        }




    }
}
