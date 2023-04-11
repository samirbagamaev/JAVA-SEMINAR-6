/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24. 

2. Создайте метод, в который передайте заполненный выше массив и
с помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных
чисел * 100 / общее количество чисел в массиве.
*/

package WORK;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * program2
 */
public class program2 {

    public static void main(String[] args) {
        Integer[] arr = createArray(10, 5, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println(uniqPercent(arr));
    }
    static double uniqPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double uniq = set.size() * 100.0 / arr.length;
        return uniq;
    }
    static Integer[] createArray(int count, int min, int max){
        Integer[] arr = new Integer[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (max-min+1) + min);
        }
        return arr;
    }
}

/* 
ОТВЕТ:
[8, 7, 9, 10, 10, 7, 6, 8, 8, 6]
50.0
*/