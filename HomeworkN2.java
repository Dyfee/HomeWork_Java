/**
* Java 1. Homework №2
* @author Александрова Мария
* @version 10.02.2022
*/
class HomeworkN2 {
    public static void main(String[] args) {
        System.out.println(checkSum(10, 15));
        isPositiveorNegative(67);
        System.out.println(isNegative(-55));
        PrintLineTimes("Я хочу в отпуск", 3);
    }
    
    static boolean checkSum (int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }
    
    static void isPositiveorNegative(int c) {
        System.out.println(c >= 0? "Число положительное" : "Число отрицательное"); 
    }
    
    static boolean isNegative(int x) {
        if (x >= 0) {
            return false;
        } else {
            return true;
        }
    }
    
    static void PrintLineTimes(String line, int times) {
        for (times = 0; times < 3; times++) {
            System.out.println(line);
        }
    }
}
