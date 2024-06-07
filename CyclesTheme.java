public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int start = -10;
        int end = 21;
        int sumEvens = 0;
        int sumOdds = 0;
        int number = start;
        do {
            if (number % 2 == 0) {
                sumEvens += number;
            } else {
                sumOdds += number;
            }
            number++;
        } while (number <= 21);
        System.out.println("В отрезке [" + start + " ," + end + "] сумма четных чисел = " + sumEvens + 
                ", а нечетных = " + sumOdds);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания\n");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;
        if (b < min) {
            min = b;
        }
        if (b > max) {
            max = b;
        }
        if (c < min) {
            min = c;
        }
        if (c > max) {
            max = c;
        }
        System.out.print("Числа в интервале (" + min + ", " + max + ") в порядке убывания: ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");
        int originNumber = 1234;
        int sumOfDigits = 0;
        System.out.println("Исходное число: " + originNumber);
        int originNumberCopy = originNumber;
        System.out.print("Число в обратном порядке: ");
        while (originNumberCopy > 0) {
            int digit = originNumberCopy % 10;
            System.out.print(digit);
            sumOfDigits += digit;
            originNumberCopy /= 10;
        }
        System.out.println("\nСумма цифр: " + sumOfDigits);

        System.out.println("\n4. Вывод чисел в несколько строк\n");
        start = 1;
        end = 24;
        int count = 0;
        for (int i = start; i < end; i += 2) {
            if (count > 0 && count % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%4d ", i);
            count++;
        }
        int remaining = 5 - (count % 5);
        if (remaining != 5) {
            for (int i = 0; i < remaining; i++) {
                System.out.printf("%4d ", 0);
            }
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");
        originNumber = 3242592;
        count = 0;
        originNumberCopy = originNumber;
        while (originNumberCopy > 0) {
            if (originNumberCopy % 10 == 2) {
                count++;
            }
            originNumberCopy /= 10;
        }
        if (count % 2 == 0) {
            System.out.println("В " + originNumber + " четное (" + count + ") количество двоек");
        } else {
            System.out.println("В " + originNumber + " нечетное (" + count + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");
        int stars = 50;
        for (int i = 0; i < stars; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print("*");
        }
        System.out.println();
        double octothorps = 16;
        double height = 5;
        double row = 0;
        while (row < octothorps) {
            if (row == 0 || row % height != 0) {
                System.out.print("#");
            } else {
                System.out.println("#");
                height -= 0.5;
            }
            row++;
        }
        int floor = 1;
        boolean reverse = false;
        do {
            int row1 = 1;
            do {
                System.out.print("$");
                row1++;
            } while (row1 <= floor);
            System.out.println();
            
            if (floor == 3) {
                reverse = true;
            }
            if (reverse) {
                floor--;
            } else {
                floor++;
            }
        } while (floor > 0 && floor <= 3);

        System.out.println("\n7. Вывод ASCII-символов\n");
        System.out.printf("%-10s%-12s%-30s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int code = 33; code < 48; code += 2) {
            System.out.print("  ");
            printCharacterInfo(code);
        }
        for (int code = 97; code <= 122; code += 2) {
            System.out.print("  ");
            printCharacterInfo(code);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        originNumber = 1234321;
        originNumberCopy = originNumber;
        int reverseNumber = 0;
        int digit = 0;
        while (originNumber > 0) {
            digit = originNumber % 10;
            reverseNumber = reverseNumber * 10 + digit;
            originNumber /= 10;
        }
        if (originNumberCopy == reverseNumber) {
            System.out.println("Число " + originNumberCopy + " - палиндром");
        } else {
            System.out.println("Число " + originNumberCopy + " - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым\n");
        number = 123321;
        int firstHalf = number / 1000;
        int secondHalf = number % 1000;
        int sumFirstHalf = 0;
        while (firstHalf != 0) {
            sumFirstHalf += firstHalf % 10;
            firstHalf /= 10;
        }
        int sumSecondHalf = 0;
        while (secondHalf != 0) {
            sumSecondHalf += secondHalf % 10;
            secondHalf /= 10;
        }
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Число " + number + " - " + "счастливое");
        } else {
            System.out.println("Число " + number + " - " + "не счастливое");
        }
        System.out.println("Сумма цифр " + (number / 1000) + " = " + sumFirstHalf);
        System.out.println("Сумма " + (number % 1000) + " = " + sumSecondHalf);

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.println("ТАБЛИЦА ПИФАГОРА");
        System.out.print("    |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("----+-----------------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%4d|", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    private static void printCharacterInfo(int code) {
        char character = (char) code;
        String description = Character.getName(code);
        System.out.printf("%-12d%-13c%-30s%n", code, character, description);
    }
}