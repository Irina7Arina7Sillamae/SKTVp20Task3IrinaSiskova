
package sktvp20task3irinasiskova;

import java.util.Scanner;




public class SKTVp20Task3IrinaSiskova {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Введите Ваше имя:  " );
	String phrase1 = sc.nextLine();
        
        System.out.println("Введите Вашу фамилию:  " );
        String phrase2 = sc.nextLine();
        
        System.out.println("Введите день Вашего рождения:  " );
        String phrase3 = sc.nextLine();
        
        System.out.println("Введите месяц вашего рождения:  " );
        String phrase4 = sc.nextLine();
        
        System.out.println("Ведите год вашего рождения:  " );
        String phrase5 = sc.nextLine();
        
        
        
	System.out.println(phrase1 + " " + phrase2 + " дата Вашего рождения: " + 
                phrase3 + " " + phrase4 + " " + phrase5 + " год.\n" + "            ВОТ!!!");
        
        
      
    }
    
}
