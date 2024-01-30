import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------Калькулятор здоровья----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой вес: ");
        int ves = scanner.nextInt();
        System.out.println("Введите свой рост в сантиметрах: ");
        int rost = scanner.nextInt();
        double rostdoubl = rost;
        System.out.println("Введите свой возраст: ");
        int age = scanner.nextInt();
        double imt_chela = ves / (Math.pow(rostdoubl/100,2));
        double ideal_ves = 24.9 * (Math.pow(rostdoubl/100,2));
        double imt_ideal = ideal_ves / (Math.pow(rostdoubl/100,2));
        System.out.println("Ваш иделаьный ИМТ: " + imt_ideal);
        System.out.println("Ваш ИМТ: " + imt_chela);
        double kallor = 655.1 + (9.6 * ves) + (1.85 * rostdoubl/100) - (age * 4.68);
        if (imt_chela > 24.9) {
            System.out.println("Рекомендуется снизить вес для достижения идеального веса.\n Идеальный вес: " + ideal_ves + ".\n Необходимо сбросить: " +  (ves - ideal_ves) + " кг.\n Рекомендуемый дневной прием калорий: " + (kallor - 500) + ".");
        }
        else if (imt_chela < 18.5) {
            System.out.println("Рекомендуется увеличить потребление пищи для набора веса.\n Идеальный вес: " + ideal_ves + ".\n Необходимо сбросить: " +  (ves - ideal_ves) + " кг.\n Рекомендуемый дневной прием калорий: " + (kallor + 500) + ".");
        }
        else {
            System.out.println("Ваш вес находится в пределах нормы.\n Идеальный вес: " + ideal_ves + ".\n Необходимо сбросить: " +  (ves - ideal_ves) + " кг.\n Рекомендуемый дневной прием калорий: " + kallor + ".");
        }
    }
}
