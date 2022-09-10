/* На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
- команда 1 (к1): увеличить в с раза, а умножается на c
- команда 2 (к2): увеличить на d, к a прибавляется d
написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, 
что это невозможно
*/
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите число А:");
        int a = read.nextInt();
        System.out.println("Введите число В:");
        int b = read.nextInt();
    read.close();
    System.out.println("Ваши команды:\n k1 - *2 \n k2 - +1");
    int count = 0;
    if (a>=b) {
        System.out.println("Преобразование невозможно!");
    } else {
        if (b%a==0) {
            while (a!=b) {
                int temp = b/a;
                int temp2= temp - a;
                temp2 = 
                
                count++;
                a = a*2;
                System.out.println(a);
                System.out.println(count);
            }
            
            // System.out.println(b / a * "k2");

        } else {
            
        }
    }
    // System.out.println(a);
    // System.out.println(b);
    }

}
