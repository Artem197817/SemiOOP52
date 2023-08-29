package semiTest;

import java.util.List;

public class HomeWork {

    /**
     * Реализовать и протестировать методы, описанные в данном классе.
     *
     * Чтобы тесты заработали, необходимо:
     * 1. Создать maven-проект (File -> new -> project -> Maven project)
     * 2. Подключить в pom.xml зависимость на junit https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0
     * 3. Создать класс HomeworkTest в директории src/test/java в том же пакете
     *
     * В качестве ДЗ прислать 2 класса: Homework и HomeworkTest (или ссылку на Github-проект, где эти классы находятся).
     */

    /**
     * Возвращает сумму чисел.
     * Протестировать следующие сценарии:
     * 1. Список пустой (тогда возвращаем 0)
     * 2. Список не пустой
     */
    public int sum(List<Integer> ints) {
        // FIXME Реализовать
        if (ints.isEmpty()) return 0;
        return ints.stream().mapToInt(Integer::intValue).sum();

    }

    /**
     * Проверяет, что список содержит только 1 элемент.
     * Протестировать сценарии:
     * 1. Список содержит один элемент и он совпадает с item
     * 2. Список содержит один элемент и он НЕ совпадает с item
     * 3. Список содержит несколько элементов, среди которых есть item
     * 4. Список пустой
     */
    public boolean hasExactly(List<String> items, String item) {
        // FIXME Реализовать
     //   if (items.isEmpty()) return false;
      //  if (items.size() == 1 && !items.contains(item)) return false;
      //  if (items.size() != 1 && items.contains(item)) return false;
        return items.contains(item) && items.size() ==1;
    }

    /**
     * Задача со здвездочкой**
     * Перекидывает из source в target все элементы
     * Протестировать сценарии:
     * 1. Оба списка не пустые
     * 2. Первый список пустой, второй нет
     * 3. Второй список пустой, первый нет
     * 4. Оба списка пустые
     */
    public <T> void copy(List<? extends T> source, List<? super T> target) {
        // FIXME Реализовать
        target.addAll(source);
        source.clear();
    }

}
