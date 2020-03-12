Пиво
1. Подумай, какой из двух интерфейсов нужно реализовать в классе BeerLover.
2. Добавь к классу BeerLover этот интерфейс и реализуй все его методы.
3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.


Требования:
1. Класс BeerLover должен реализовывать(implements) интерфейс Alcoholic.
2. Класс BeerLover не должен реализовывать интерфейс Drinker напрямую(только опосредованно через Alcoholic)
3. В классе BeerLover должны быть реализованы все методы интерфейса Alcoholic.
4. В классе BeerLover должны быть реализованы все методы интерфейса Drinker.
5. Метод isReadyToGoHome должен возвращать значение переменной READY_TO_GO_HOME.*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {

        @Override
        public void askForMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {

        }
    }
}
Пиво-2. Возвращение
Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.


Требования:
1. Класс AlcoholicBeer должен реализовывать(implements) интерфейс Drink.
2. В классе AlcoholicBeer должны быть реализованы все методы интерфейса Drink.
3. В классе AlcoholicBeer должно содержаться только два метода.
4. Метод isAlcoholic должен возвращать true, т.к. пиво содержит алкоголь.
5. Программа должна выводить на экран тип напитка в зависимости от того что возвращает метод isAlcoholic.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
}
package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
Не забудь реализовать методы!


Требования:
1. Класс Screen должен реализовывать(implements) интерфейс Selectable.
2. Класс Screen должен реализовывать(implements) интерфейс Updatable.
3. В классе Screen должен быть реализованы методы интерфейса Selectable.
4. В классе Screen должен быть реализованы методы интерфейса Updatable.*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
    //напишите тут ваш класс
}
/* 
Четыре ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.


Требования:
1. Переменные объявленные в интерфейсе могут иметь только самый широкий уровень доступа(public).
2. Унаследоваться(extends) можно только от класса, для реализации интерфейсов используется ключевое слово implements.
3. Класс Hobby должен быть объявлен с модификатором доступа static.
4. Для доступа к переменной HOBBY нет необходимости создавать объект Dream.
5. Объявления интерфейсов не изменять.*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

   static class Hobby implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
/* 
Баг в initializeIdAndName
1. Подумать, что в программе неправильно.
2. Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Поправить программу, чтобы компилировалась и работала.


Требования:
1. Интерфейс DBObject должен содержать только объявление метода initializeIdAndName без реализации.
2. Реализуй метод initializeIdAndName в классе User.
3. Метод initializeIdAndName в классе User должен иметь тип возвращаемого значения User.
4. Метод initializeIdAndName должен присваивать значения полям id и name объекта типа User в соответствии с переданными ему параметрами и возвращать этот объект.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }


        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }
    }

}
/* 
Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.


Требования:
1. Класс StringObject должен реализовывать интерфейс SimpleObject.
2. Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
3. В классе StringObject реализовать метод getInstance интерфейса SimpleObject.
4. Дополнительные классы или интерфейсы создавать нельзя.*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>
    {
        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }
}
Эй, ты там живой?
1. Создай интерфейс Person.
2. Добавь в него метод isAlive(), который проверяет, жив человек или нет.
3. Подумай, какой тип должен возвращать этот метод.
4. Создай интерфейс Presentable.
5. Унаследуй интерфейс Presentable от интерфейса Person.


Требования:
1. В классе Solution должен быть объявлен интерфейс Person.
2. В классе Solution должен быть объявлен интерфейс Presentable.
3. Интерфейс Presentable должен наследоваться от интерфейса Person.
4. В интерфейсе Person должен быть объявлен метод isAlive.
5. Тип возвращаемого значения метода isAlive может иметь только два значения.*/

public class Solution {
    public interface Person{
        boolean isAlive();

    }
    public interface Presentable extends Person {

    }
    public static void main(String[] args) throws Exception {
    }
}
/* 
Всё, что движется
1. Создай интерфейс CanMove с методом speed.
2. Метод speed должен возвращать значение типа Double и не должен ничего принимать в качестве аргументов.
3. Создай и унаследуй интерфейс CanFly от интерфейса CanMove.
4. Добавь в интерфейс CanFly метод speed.
5. Метод speed должен возвращать значение типа Double и принимать один параметр типа CanFly.


Требования:
1. В классе Solution должен быть объявлен интерфейс CanMove.
2. В классе Solution должен быть объявлен интерфейс CanFly.
3. Интерфейс CanFly должен наследоваться от интерфейса CanMove.
4. В интерфейсе CanMove должен быть объявлен метод speed без параметров и с типом возвращаемого значения Double.
5. В интерфейсе CanFly должен быть объявлен метод speed c одним аргументом типа CanFly и с типом возвращаемого значения Double.*/

public class Solution {

    public interface CanMove {
        Double speed();
    }

    public interface CanFly extends CanMove {

        Double speed(CanFly canFly);
    }


    public static void main(String[] args) throws Exception {
    }
}
/* 
Это кто там такой умный?
1. Добавь интерфейсы Secretary и Boss к классам CleverMan и SmartGirl. По одному на каждый. Подумай, кому какой.
2. Унаследуй интерфейсы Secretary и Boss от интерфейсов Person и Workable так,
чтобы все методы у классов CleverMan и SmartGirl оказались объявленными в каком-то интерфейсе.


Требования:
1. Класс CleverMan должен реализовывать подходящий ему интерфейс(Secretary или Boss).
2. Класс SmartGirl должен реализовывать подходящий ему интерфейс(Secretary или Boss).
3. Секретарь(Secretary) является человеком(Person).
4. Начальник(Boss) является человеком(Person), а также любит много работать(Workable).*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface Workable {
        boolean wantsToGetExtraWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person, Workable {
    }

    class CleverMan implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean wantsToGetExtraWork() {
            return true;
        }
    }

    class SmartGirl implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
Нанимаем переводчика
1. Создать класс EnglishTranslator, который наследуется от Translator.
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского" путем вызова метода translate у объекта типа EnglishTranslator.


Требования:
1. Класс EnglishTranslator должен быть объявлен внутри класса Solution.
2. Класс EnglishTranslator должен наследоваться от класса Translator.
3. В классе EnglishTranslator должны быть реализованы все унаследованные от класса Translator абстрактные методы.
4. Метод getLanguage должен возвращать строку, которая позволит выполнить условие задачи.
5. Метод main должен выводить на экран строку "Я переводчик с английского" путем вызова метода translate у объекта типа EnglishTranslator.*/

public class Solution {
    public static class EnglishTranslator extends Translator {

        @Override
        public String getLanguage() {
            return "английского";
        }
    }
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

}
Лисица — это такое животное
1. Реализуй в классе Fox интерфейс Animal.
2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
3. Создавать дополнительные классы и удалять методы нельзя!


Требования:
1. Интерфейс Animal должен быть реализован в классе Fox.
2. В классе Fox должен быть реализован только один метод(getName).
3. В интерфейсе Animal должен быть объявлен метод getColor.
4. Дополнительные классы или интерфейсы создавать нельзя.*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
Большая лисица — это такая лисица
1. Исправь класс BigFox так, чтобы программа компилировалась.


Требования:
1. Интерфейс Animal должен быть реализован в классе Fox.
2. В классе Fox должен быть реализован только один метод(getName).
3. В интерфейсе Animal должен быть объявлен метод getColor.
4. Класс BigFox должен быть потомком класса Fox.*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        @Override
        public Color getColor() {
            return Color.GRAY;
        }

        }

}
/* 
Некорректные строки
Удали все некорректные строки в интерфейсе Button.


Требования:
1. Интерфейс SimpleObject должен быть объявлен внутри класса Solution.
2. Интерфейс Button должен быть объявлен внутри класса Solution.
3. Метод main менять нельзя.
4. В интерфейсе Button должно остаться объявление константы NAME.
5. В интерфейсе Button должно остаться корректное объявление метода onPress.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";


        String onPress(Object o);


    }
} 
/* 
The weather is fine
1. В классе Today реализовать интерфейс Weather.
2. Подумай, как связан параметр type с методом getWeatherType().
3. Интерфейсы Weather и WeatherType уже реализованы в отдельных файлах.


Требования:
1. Интерфейс Weather должен быть реализован в классе Today.
2. В классе Today должен быть реализован метод getWeatherType объявленный в интерфейсе Weather.
3. Тип возвращаемого значения метода getWeatherType должен быть String.
4. Метод getWeatherType должен возвращать значение переменной type.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return this.type;
        }
    }
}

Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
       reader.close();
        InputStream inStream = new FileInputStream(sourceFileName);
        while (inStream.available() > 0)
        {
            int data = inStream.read();
            char ch = (char) data;
            System.out.print(ch);
        }
        inStream.close();

        // напишите тут ваш код
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            File fileName =  new File(reader.readLine());


            FileWriter fileWriter = new FileWriter(fileName); // поток, который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter

            String line = reader.readLine();
            while(true) {
                bufferedWriter.write(line + "\n");
                if (line.equals("exit")) break;
            }

            reader.close();
            bufferedWriter.close();
            fileWriter.close();// закрываем поток
        }
    }
/* 
Neo
1. Реализовать интерфейс DBObject в классе User.
2. Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран "The user's name is Neo, id = 1".
3. Метод toString и метод main менять нельзя.
4. Подумай, что должен возвращать метод initializeIdAndName в классе User.


Требования:
1. Интерфейс DBObject должен быть реализован в классе User.
2. Метод initializeIdAndName должен возвращать корректный объект типа User, объект на котором производится вызов метода("этот" объект).
3. Метод initializeIdAndName должен устанавливать значения полей id и name согласно переданным ему параметрам.
4. Программа должна выводить на экран: "The user's name is Neo, id = 1"
5. Метод toString не менять.
6. Метод main не менять.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        public User initializeIdAndName(long id, String name){
            this.id = id;
            this.name = name;
            return this;
        }
    }
}
Исправление ошибок
1. Переделай наследование в классах и интерфейсах так, чтобы программа компилировалась и продолжала делать то же самое.
2. Класс Hobby должен наследоваться от интерфейсов Desire, Dream.


Требования:
1. Интерфейс Desire должен быть реализован в классе Hobby.
2. Интерфейс Dream должен быть реализован в классе Hobby.
3. Класс Hobby должен содержать статическую переменную INDEX.
4. Метод toString в классе Hobby должен инкрементировать и возвращать переменную INDEX в виде строки.*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
/* 
Интерфейс SimpleObject
1. Создай класс StringObject.
2. В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
3. Программа должна компилироваться.


Требования:
1. Класс StringObject должен реализовывать интерфейс SimpleObject.
2. Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
3. В классе StringObject реализовать метод getInstance интерфейса SimpleObject.
4. Класс StringObject должен существовать в классе Solution.
5. Класс StringObject должен быть статическим.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
    public static class StringObject<T> implements SimpleObject {

        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }

}
/* 
Один метод в классе
1. Унаследовать Fox от интерфейса Animal.
2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
3. Методы удалять нельзя!


Требования:
1. Интерфейс Animal должен быть реализован в классе Fox.
2. В классе Fox должен быть реализован только один метод(getName).
3. В интерфейсе Animal должен быть объявлен метод getColor.
4. Дополнительные классы или интерфейсы создавать нельзя.*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();


    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
Компиляция программы
1. Исправь классы Fox и BigFox так, чтобы программа компилировалась.
Задача не предполагает создания экземпляров базового класса.
2. Метод main менять нельзя.


Требования:
1. Интерфейс Animal должен быть реализован в классе Fox.
2. В классе Fox должен быть реализован только один метод(getName).
3. В интерфейсе Animal должен быть объявлен метод getColor.
4. Класс BigFox должен быть потомком класса Fox.
5. Класс Fox должен быть абстрактным.*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public  static class BigFox extends Fox {

        @Override
        public Color getColor() {
            return null;
        }
    }

}
/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = filereader.readLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        filereader.close();

        ArrayList<Integer> nums = new ArrayList<>();

        while(reader.ready()){
            int number = Integer.parseInt(reader.readLine());
            if(number % 2 == 0)
                nums.add(number);
        }
        Collections.sort(nums);
        for (int i : nums){
            System.out.println(i);
        }

        reader.close();

    }
}
/*Писатель в файл с консоли
        1. Прочесть с консоли имя файла.
        2. Считывать строки с консоли, пока пользователь не введет строку "exit".
        3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


        Требования:
        1. Программа должна считывать c консоли имя файла.
        2. Создай и используй объект типа BufferedWriter.
        3. Программа не должна ничего читать из файловой системы.
        4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
        5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
        6. Метод main должен закрывать объект типа BufferedWriter после использования.
        7. Метод main не должен выводить данные на экран.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileWriter fileWriter = new FileWriter(fileName); // поток, который подключается к текстовому файлу
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter

        while(true) {
            String line = reader.readLine();
            bufferedWriter.write(line + "\n");
            if (line.equals("exit")) break;
        }

        reader.close();
        bufferedWriter.close();
        fileWriter.close();// закрываем поток
    }
}


/* 
Репка
Сказка Репка:
1. Реализовать интерфейс RepkaItem в классе Person.
2. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'.

Пример:
Бабка за Дедку
Дедка за Репку

3. Исправить логическую ошибку цикла в методе tell класса RepkaStory.
4. Выполнить метод main и наслаждаться сказкой!


Требования:
1. Интерфейс RepkaItem должен быть реализован в классе Person.
2. В классе Person должен быть реализован метод pull c одним параметром типа Person.
3. Метод pull в классе Person должен выводить на экран фразу типа '<name> за <person>'. Например: Бабка за Дедку.
4. В результате выполнения метода main на экран должен быть выведен краткий вариант сказки про Репку.*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}
public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull (Person person) {
        System.out.println(this.name + " за " + person.namePadezh);
    }
}

public interface RepkaItem {
    public String getNamePadezh();
}

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i);
            second = items.get(i-1);
            first.pull(second);
        }
    }
}
package com.javarush.task.task13.task1328;

/* 
Битва роботов
1. Разобраться в том, что тут написано.
2. Смириться со своей участью и продолжить разбираться в коде.
3. ...
4. Порадоваться, что мы все поняли.
5. Изменить код согласно новой архитектуре и добавить новую логику:
5.1. Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot.
5.2. Отредактировать класс Robot учитывая AbstractRobot.
5.3. Расширить класс BodyPart новой частью тела BodyPart.CHEST("грудь").
5.4. Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).


Требования:
1. Класс AbstractRobot должен быть абстрактным.
2. Класс AbstractRobot должен реализовывать интерфейсы Attackable и Defensable.
3. Класс Robot должен наследоваться от класса AbstractRobot.
4. Логика поведения роботов должна быть вынесена в класс AbstractRobot.
5. В классе BodyPart должна содержаться и быть инициализирована final static переменная CHEST типа BodyPart.
6. Новая часть тела(BodyPart) должна быть добавлена в логику методов attack и defense в классе AbstractRobot.*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }
}
public class AbstractRobot implements Attackable, Defensable {
    private static int hitCount;
    public String name;



    public String getName() {
        return name;
    }

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {

            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount >= 4) {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {

            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount >= 4) {
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}
public class Robot extends AbstractRobot  {
    public Robot(String name) {
        this.name = name;
    }

}

public final class BodyPart {
    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart CHEST = new BodyPart("грудь");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
