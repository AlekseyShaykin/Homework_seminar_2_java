package JAVA.Homework_seminar_2;

import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;

public class Task_2 {
    // 2.Реализуйте алгоритм сортировки пузырьком числового массива,
    // результат после каждой итерации запишите в лог-файл
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Task_2.class.getName());
        logger.setLevel(Level.INFO); // назначить уровень (INFO, DEBUG, ERROR, WARNING)
        ConsoleHandler ch = new ConsoleHandler(); // для вывода логгера в консоль
        logger.addHandler(ch); // добавляем логгер (для вывода в консоль)

        // отображение всех логов в файле:
        Handler fileHandler = new FileHandler(
                "C:\\Users\\Aleksey\\Documents\\DEVS\\JAVA\\Homework_seminar_2\\log1.txt");
        // FileHandler.append = true;
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);

        // ФОРМАТ выводы лога
        // Обычный, естественный язык:
        // SimpleFormatter sFormat = new SimpleFormatter();
        // ch.setFormatter(sFormat);

        // Технология логирования

        // logger.setLevel(Level.ALL);
        // logger.log(Level.INFO, "Проверка связи: запись лога с уровнем INFO
        // (предупреждение)");
        // logger.log(Level.WARNING, "Проверка связи: запись лога с уровнем WARNING
        // (предупреждение)");
        // logger.log(Level.SEVERE, "Проверка связи: запись лога с уровнем
        // SEVERE(серьезная ошибка)");

        int[] array = { 1, 5, 2, 4, 7, 3, 0, 25 };
        logger.log(Level.INFO, "Определили массив целых чисел");

        try {
            int count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                // внутренний цикл прохода
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                        count += 1;
                        logger.log(Level.INFO, "произвели перемещение элементов " + count + "-й раз");
                    }
                }

            }
            System.out.println(Arrays.toString(array));
            logger.log(Level.INFO, "Произвели вывод в консоль");
            
        } catch (Exception e) {
            logger.log(Level.WARNING, "Что-то пошло не так");
        }

    }
}
