import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		 
        int k = 0, counter = 0, sum=0, average;
         
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        k = input.nextInt();
        
        for(int i =1; i < k ; i++){
        
            if(i%12 == 0) {
                counter += i;
                sum++;
            }
        }
        
        average = counter / sum;
        
        System.out.print("Toplam " + sum + " sayinin ortalamasi : " + average);
    }
}
