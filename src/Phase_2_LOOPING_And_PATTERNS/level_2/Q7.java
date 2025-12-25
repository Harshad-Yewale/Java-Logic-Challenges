package Phase_2_LOOPING_And_PATTERNS.level_2;

public class Q7 {

    //Q) Print all prime numbers between 1 and 100.

    public static void main(String[] args) {
        boolean isPrime=true;


        System.out.println("Prime Numbers from 1 to 100 : ");


        for(int i=2;i<=100;i++){
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
            isPrime=true;
        }

    }
}
