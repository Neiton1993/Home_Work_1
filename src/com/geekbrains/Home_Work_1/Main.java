package com.geekbrains.Home_Work_1;

public class Main {

    public static void main(String[] args) {
	byte a = 10;
	short b = 2404;
	int c = 200000;
	long d = 15000L;
	float e = 120.0f;
	double f = 15.72775;
	boolean g = true;
	char h = 'A';

	System.out.println(calculate(5,6,7,10));
	System.out.println(task10and20(20, 6));
	isPositiveOrNegative(20);
	isNegative(7);
	privet("Медвед");
	HowYearIsIt(404);
	}

	public static int calculate(int a, int b , int c, int d){  // Метод вычисляющий выражение a * (b + (c / d)) и
    	return a * (b+(c/d));                                  // возвращающий результат, где a, b, c, d – входные
    }                                                          // параметры этого метода;

    public static boolean task10and20(int a, int b){           // Метод, принимающий на вход два числа, и проверяющий
    	int sum = a + b;                                       // что их сумма лежит в пределах от 10 до 20(включительно)
    	if (sum>=10&&sum<=20){
    		return true;
		}
    	return false;
	}

	public static void isPositiveOrNegative(int a){           // Метод, которому в качестве параметра передается целое
		if(a>=0){                                             // число, метод должен напечатать в консоль положительное
			System.out.println("Положительное");              // ли число передали, или отрицательное;
		}
		else {
			System.out.println("Отрицательное");
		}
	}

	public static boolean isNegative(int a){				 // Метод, которому в качестве параметра передается целое
    	if (a<0){                                            // число, метод должен вернуть true, если число
    		return true;                                     // отрицательное;
		}
		return false;
	}

	public static void privet(String name){
    	System.out.println("Привет, " + name  + "!");
	}

	public static void HowYearIsIt (int year){                 // Написать метод, который определяет является ли год
    	int ostatok;                                           // високосным, и выводит сообщение вконсоль. Каждый 4-й
    	if((ostatok = year%400) == 0){                         // год является високосным, кроме каждого 100-го, при этом
    		System.out.println(year + " - Високосный год");    // каждый 400-й –високосный.

		}else if ((ostatok = year%100) == 0){
    		 System.out.println(year + " - Невисокосный год");
    	}else if ((ostatok = year%4) == 0){
			System.out.println(year + " - Високосный год");
		}else {
			System.out.println(year + " - Невисокосный год");
		}

	}
}

