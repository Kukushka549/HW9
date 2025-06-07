import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int[] wastes = new int[5];
        wastes[0] = 13000;
        wastes[1] = 9000;
        wastes[2] = 19000;
        wastes[3] = 27000;
        wastes[4] = 4000;

        int perMonth = 0;

        for (int i : wastes) {
            perMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + perMonth + " рублей.");

        System.out.println("Task 2");

        int maxWeek = 0;
        int minWeek = 1_000_000;

        for (int i : wastes) {
            if (i > maxWeek) {
                maxWeek = i;
            }
        }

        for (int i : wastes) {
            if (i < minWeek){
                minWeek = i;
            }
        }

        System.out.println("Максимальная сумма трат за неделю составила " + maxWeek + " рублей. Минимальная сумма трат за неделю составила " + minWeek + " рублей");

        System.out.println("Task 3");

        int avgPerMonth = 0;

        for (int i : wastes) {
            avgPerMonth += i;
        }
        avgPerMonth /= wastes.length;

        System.out.println("Средняя сумма трат за месяц составила " + (float)avgPerMonth + " рублей");

        System.out.println("Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length/2; i++) {
            char a = reverseFullName[i];
            char b = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[i] = b;
            reverseFullName[reverseFullName.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(reverseFullName));

        }
    }