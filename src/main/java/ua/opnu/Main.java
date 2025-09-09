package ua.opnu;

/**
 * Головний клас для демонстрації різних методів.
 */
public final class Main {

    /**
     * Головний метод програми.
     *
     * @param args аргументи командного рядка
     */
    public static void main(final String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========

    /**
     * Перевіряє, чи одна температура нижче 0, а інша вище 100.
     *
     * @param temp1 перша температура
     * @param temp2 друга температура
     * @return true, якщо одна температура нижче 0, а інша вище 100
     */
    public boolean icyHot(final int temp1, final int temp2) {
        final int freezingPoint = 0;
        final int boilingPoint = 100;
        return (temp1 < freezingPoint && temp2 > boilingPoint)
                || (temp2 < freezingPoint && temp1 > boilingPoint);
    }

    /**
     * Перевіряє, чи хоча б одне число знаходиться в діапазоні 10-20.
     *
     * @param a перше число
     * @param b друге число
     * @return true, якщо хоча б одне число в діапазоні 10-20
     */
    public boolean in1020(final int a, final int b) {
        final int minRange = 10;
        final int maxRange = 20;
        return (a >= minRange && a <= maxRange)
                || (b >= minRange && b <= maxRange);
    }

    /**
     * Перевіряє, чи є хоча б один підліток серед трьох чисел.
     *
     * @param a перше число
     * @param b друге число
     * @param c третє число
     * @return true, якщо хоча б одне число в діапазоні 13-19
     */
    public boolean hasTeen(final int a, final int b, final int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    /**
     * Перевіряє, чи число належить до діапазону підлітків.
     *
     * @param n число для перевірки
     * @return true, якщо число в діапазоні 13-19
     */
    private boolean isTeen(final int n) {
        final int minTeen = 13;
        final int maxTeen = 19;
        return n >= minTeen && n <= maxTeen;
    }

    // ======== Boolean expressions ========

    /**
     * Перевіряє, чи можна спати.
     *
     * @param weekday чи будній день
     * @param vacation чи відпустка
     * @return true, якщо можна спати
     */
    public boolean sleepIn(final boolean weekday, final boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * Перевіряє, чи мавпи створюють проблеми.
     *
     * @param aSmile чи посміхається перша мавпа
     * @param bSmile чи посміхається друга мавпа
     * @return true, якщо мавпи створюють проблеми
     */
    public boolean monkeyTrouble(final boolean aSmile, final boolean bSmile) {
        return aSmile == bSmile;
    }

    /**
     * Перевіряє умови для позитивних/негативних чисел.
     *
     * @param a перше число
     * @param b друге число
     * @param negative чи мають обидва числа бути негативними
     * @return результат перевірки
     */
    public boolean posNeg(final int a, final int b, final boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    // ======== Loops and Arrays ========

    /**
     * Рахує кількість дев'яток у масиві.
     *
     * @param nums масив чисел
     * @return кількість дев'яток
     */
    public int arrayCount9(final int[] nums) {
        int count = 0;
        final int targetNumber = 9;
        for (int n : nums) {
            if (n == targetNumber) {
                count++;
            }
        }
        return count;
    }

    /**
     * Перевіряє, чи є дев'ятка в перших чотирьох елементах масиву.
     *
     * @param nums масив чисел
     * @return true, якщо є дев'ятка в перших чотирьох елементах
     */
    public boolean arrayFront9(final int[] nums) {
        final int maxIndex = 4;
        final int targetNumber = 9;
        final int end = Math.min(nums.length, maxIndex);
        for (int i = 0; i < end; i++) {
            if (nums[i] == targetNumber) {
                return true;
            }
        }
        return false;
    }

    /**
     * Перевіряє, чи містить масив послідовність 1, 2, 3.
     *
     * @param nums масив чисел
     * @return true, якщо містить послідовність 1, 2, 3
     */
    public boolean array123(final int[] nums) {
        final int sequenceLength = 3;
        for (int i = 0; i < nums.length - (sequenceLength - 1); i++) {
            final int firstNumber = 1;
            final int secondNumber = 2;
            final int thirdNumber = 3;
            if (nums[i] == firstNumber
                    && nums[i + 1] == secondNumber
                    && nums[i + 2] == thirdNumber) {
                return true;
            }
        }
        return false;
    }

    // ======== Strings ========

    /**
     * Формує привітання з іменем.
     *
     * @param name ім'я
     * @return привітання
     */
    public String helloName(final String name) {
        return "Hello " + name + "!";
    }

    /**
     * Міняє місцями два останні символи рядка.
     *
     * @param str вхідний рядок
     * @return рядок з переставленими останніми символами
     */
    public String lastTwo(final String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2)
                + str.charAt(str.length() - 1)
                + str.charAt(str.length() - 2);
    }

    /**
     * Повертає два середні символи рядка.
     *
     * @param str вхідний рядок
     * @return два середні символи
     */
    public String middleTwo(final String str) {
        final int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }

}
