public class PrimeOrNot {
    public static void main(String []args){
        int n=10;
        boolean isPrime=false;
        for(int i=2; i<n; i++){
            if(n%i==0){
                isPrime=true;
            }
        }
        if(isPrime){
            System.out.println(n+" is Not Prime Number");
        }
        else{
            System.out.println(n+" is Prime Number");
        }
    }
}
