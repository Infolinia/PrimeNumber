
package com.mycompany.primenumber;

public class PrimeNumber {

    static boolean isPrime(int number){
        if(number < 2)
            return false;
        
        if(number == 2)
            return true;
        
        return number % 2 != 0;
    }
    
    public static void main(String[] args) {
        
       Integer[] numbers = new Integer[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
       
        for (Integer number : numbers) {
            if(isPrime(number) == true){
                System.out.println(number + " to liczba pierwsza.");
            }else{
                System.out.println(number + " to nie liczba pierwsza.");
            }
        }
    }
   
}
