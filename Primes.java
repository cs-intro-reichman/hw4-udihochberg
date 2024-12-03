public class Primes {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int counter = 0;
        double percent;
        System.out.println("Prime numbers up to "+n+":"); 

        for (int i = 1; i <= n; i++)
        {
            if (IsPrime(i))
            {
                System.out.println(i);
                counter++;
            }
        }
        percent = (double)counter / (double)n * 100;
        System.out.println("There are "+ counter +" primes between 2 and "+ n +" ("+ (int)percent +"% are primes)");
    }

    public static boolean IsPrime(int n) {
        if (n < 2) { return false; }
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0) { return false; }
        }
        return true;
    }
}

