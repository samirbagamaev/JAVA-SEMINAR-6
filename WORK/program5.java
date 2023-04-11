/*1.Создайте множество, в котором будут храниться экземпляры класса 
Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.

2.Создайте 2 или более котов с одинаковыми параметрами в полях. 
Поместите их во множество. Убедитесь, что все они сохранились во множество. 

3.Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
То есть, метод должен возвращать true, только если значения во всех 
полях сравниваемых объектов равны.

4.Выведите снова содержимое множества из пункта 2, убедитесь, 
что дубликаты удалились. */

package WORK;

import java.util.HashSet;
import java.util.Set;

/**
 * program3
 */
public class program5 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", "Иван", "Рыжий");
        Cat cat2 = new Cat("Барсик", "Петр", "Черный");
        Cat cat3 = new Cat("Киса", "Мария", "Белый");
        Cat cat4 = new Cat("Нюня", "Ольга", "Черный");

        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        System.out.println(set);

}
}



