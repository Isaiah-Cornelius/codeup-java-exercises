public class MethodsExercises {

    public static int additionMethod(int x, int y){
        System.out.println(x+y);
        return x + y;
    }

    public static int subtractionMethod(int x, int y){
        System.out.println(x-y);
        return x - y;
    }

    public static int multiplicationMethod(int x, int y){

        int result = x;
        for (int i = y; i > 1; i--){
            result += x;
        }
        System.out.println(result);
        return result;
    }

    public static int recursionMultiplicationMethod(int x, int y){
        switch (y){
            case 0:
                return 0;
            case 1:
                return x;
            case 2:
                return x + x;
            default:
                return x + recursionMultiplicationMethod(x, y-1);
        }

    }

    public static double divisionMethod(double x, double y){
        System.out.println(x/y);
        return x / y;
    }

    public static int modulusMethod(int x, int y){
        System.out.println(x % y);
        return x % y;
    }





    public static void main(String [] args){
        System.out.println(recursionMultiplicationMethod(4,5));

    }
}
