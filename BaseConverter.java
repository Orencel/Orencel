import java.util.Scanner;

public class BaseConverter
{

public static void main(String[] args) {
	  
	System.out.println("Укажите число в диапозоне от 0 до 10000");
    System.out.println("Выберите 1, 2 или 3 вариант преобразования:");

    System.out.println("1: преобразование из 10 в 2 с/с ");
    System.out.println("2: преобразование из 10 в 16 с/с ");
	System.out.println("3: преобразование из 2 в 10 с/с ");
      
    Scanner in = new Scanner(System.in);

    int choice = in.nextInt();

    String string = in.nextLine();
	
    String output= "";
	int binary_output=0;

    System.out.println("Пожалуйста, укажите число для преобразования:");

    int input = in.nextInt();

    if (choice == 1){
		output = Integer.toString(input, 2);
	}
    else if (choice == 2){
        output = Integer.toString(input, 16);
	}
	else if (choice == 3){
		output = Integer.toString(input,10);
		binary_output = Integer.parseInt(output, 2);
	}
	else {
      System.out.println("Некорректное значение");
	}
	if (input >= 0 && input <= 10000){
		if(binary_output == 0) {
			System.out.println("Итог=" + output);
			}
		else {
			System.out.println("Итог=" + binary_output);
			}
	}
	else {
		System.out.println("Значение не в указанном диапазоне");
	}
  }
}
	
