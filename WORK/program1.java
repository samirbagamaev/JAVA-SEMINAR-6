/*
1.Создайте HashSet, заполните его следующими числами: 
{1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.

2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.

3.Создайте TreeSet, заполните его следующими числами: 
{1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
*/

package WORK;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * program1
 */
public class program1 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 3, 2, 1, 4, 5, 6, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}

/* 
ОТВЕТ:
[1, 2, 3, 4, 5, 6]
[2, 3, 1, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
*/