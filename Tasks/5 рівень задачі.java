* 
ООП - Расставить интерфейсы
1. Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
2. Реализуй их методы.


Требования:
1. Класс Clothes должен поддерживать интерфейс Movable.
2. Класс Clothes должен поддерживать интерфейс Sellable.
3. Класс Clothes должен поддерживать интерфейс Discountable.
4. В классе Clothes должен быть реализован метод isMovable.
5. В классе Clothes должен быть реализован метод getAllowedAction без параметров.
6. В классе Clothes должен быть реализован метод getAllowedAction с одним параметром типа String.*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        @Override
        public boolean isMovable() {
            return false;
        }

        @Override
        public Object getAllowedAction(String name) {
            return null;
        }

        @Override
        public Object getAllowedAction() {
            return null;
        }
    }
}

/* 
ООП - Наследование животных
1. Создать public static класс Goose(Гусь).
2. Создать public static класс Dragon(Дракон).
3. Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
4. Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
5. В классах Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
6. В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса].
7. В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSize родительского класса].


Требования:
1. Класс Goose должен быть создан внутри класса Solution и быть статическим.
2. Класс Dragon должен быть создан внутри класса Solution и быть статическим.
3. Класс Goose должен быть потомком класса SmallAnimal.
4. Класс Dragon должен быть потомком класса BigAnimal.
5. В классе Goose должен быть переопределен метод getSize, который должен возвращать строку формата "Гусь маленький, " + [getSize родительского класса].
6. В классе Dragon должен быть переопределен метод getSize, который должен возвращать строку формата "Дракон большой, " + [getSize родительского класса].
7. Область видимости переопределенных методов getSize в классах Goose и Dragon должна быть расширена до максимальной.*/

public class Solution {
    static class Goose extends SmallAnimal{
        public  String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    static class Dragon extends BigAnimal{
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }//добавьте классы Goose и Dragon тут

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
ООП - машинки
1. Для вывода используй только переменные из класса Constants.
2. В классе Ferrari реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
3. В классе Lanos реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
4. Создайте public static класс LuxuriousCar(РоскошнаяМашина).
5. Создайте public static класс CheapCar(ДешеваяМашина).
6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
9. В классах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными способами модификаторы доступа так, чтобы в классах Ferrari и Lanos выполнялось расширение видимости.


Требования:
1. Класс Solution должен содержать public static класс LuxuriousCar.
2. Класс Solution должен содержать public static класс CheapCar.
3. Класс Ferrari должен быть потомком класса LuxuriousCar.
4. Класс Lanos должен быть потомком класса CheapCar.
5. Метод printlnDesire в классе LuxuriousCar, должен выводить на экран фразу "Я хочу ездить на роскошной машине".
6. Метод printlnDesire в классе CheapCar, должен выводить на экран фразу "Я хочу ездить на дешевой машине".
7. Метод printlnDesire в классе Ferrari, должен выводить на экран фразу "Я хочу ездить на Феррари".
8. Метод printlnDesire в классе Lanos, должен выводить на экран фразу "Я хочу ездить на Ланосе".
9. Область видимости методов printlnDesire в классах Ferrari и Lanos должна быть шире, чем в их классах родителях.*/

import static com.javarush.task.task15.task1503.Solution.Constants.*;

public class Solution {
    public static class LuxuriousCar{
        void printlnDesire(){
            System.out.println(WANT_STRING + LUXURIOUS_CAR);
        }
    }
    public static class CheapCar{
        protected void printlnDesire(){
            System.out.println(WANT_STRING + CHEAP_CAR);
        }
    }

    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            System.out.println(WANT_STRING + FERRARI_NAME);//add your code here
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            System.out.println(WANT_STRING + LANOS_NAME);//add your code here
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}
ООП - книги
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора - название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.


Требования:
1. Класс Solution должен содержать public static класс MarkTwainBook.
2. Класс MarkTwainBook должен быть потомком класса Book.
3. В классе MarkTwainBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
4. Конструктор класса MarkTwainBook должен вызывать конструктор класса предка (Book) с параметром "Mark Twain".
5. Метод getBook в классе MarkTwainBook должен иметь тип возвращаемого значения MarkTwainBook и возвращать текущий объект.
6. Класс Solution должен содержать public static класс AgathaChristieBook.
7. Класс AgathaChristieBook должен быть потомком класса Book.
8. В классе AgathaChristieBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
9. Конструктор класса AgathaChristieBook должен вызывать конструктор класса предка (Book) с параметром "Agatha Christie".
10. Метод getBook в классе AgathaChristieBook должен иметь тип возвращаемого значения AgathaChristieBook и возвращать текущий объект.
11. Метод getTitle в классах AgathaChristieBook и MarkTwainBook должен возвращать название конкретной книги.
12. Метод getOutputByBookType должен возвращать корректную строку для объектов типа AgathaChristieBook.
13. Метод getOutputByBookType должен возвращать корректную строку для объектов типа MarkTwainBook.
14. В классе MarkTwainBook должно быть создано поле title типа String (название книги).
15. В классе AgathaChristieBook должно быть создано поле title типа String (название книги).*/

public class Solution {
    public static class MarkTwainBook extends Book{

        private String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }


        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
    public static class AgathaChristieBook extends Book{

        private String title;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            if (this instanceof MarkTwainBook) return markTwainOutput;
            else if (this instanceof AgathaChristieBook)return agathaChristieOutput;
            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
/* 
ООП - исправь ошибки в наследовании
Исправь метод containsBones и всю связанную с ним логику так, чтобы:
1. Поведение программы осталось прежним.
2. Метод containsBones должен возвращать тип Object и значение "Yes" вместо true, "No" вместо false


Требования:
1. Метод containsBones в классе BodyPart должен иметь тип возвращаемого значения Object.
2. Класс Finger должен быть потомком класса BodyPart.
3. Метод containsBones в классе Finger должен иметь тип возвращаемого значения Object.
4. Метод containsBones в классе BodyPart должен возвращать строку "Yes".
5. Метод containsBones в классе Finger должен возвращать строку "Yes", если метод containsBones в классе BodyPart возвращает "Yes" и флаг isArtificial равен false,
 если приведенное условие не выполняется - вернуть "No".
6. Метод toString в классе BodyPart должен возвращать строку формата "name(имя части тела) содержит кости", если метод containsBones возвращает "Yes" для этой части тела,
 а если "No", то строку формата "name(имя части тела) не содержит кости".*/

public class Solution {
    public static interface LivingPart {
        Object containsBones();
    }

    public static class BodyPart implements LivingPart {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public Object containsBones() {
            return "Yes";
        }

        public String toString() {
            if (containsBones().equals("Yes")) {
                return name + " содержит кости";
            } else {
                return name + " не содержит кости";
            }
        }
    }
        public static class Finger extends BodyPart {
            private boolean isArtificial;

            public Finger(String name, boolean isArtificial) {
                super(name);
                this.isArtificial = isArtificial;
            }

            public Object containsBones() {
                if (super.containsBones().equals("Yes") && !isArtificial)
                    return "Yes";
                else return "No";
            }
        }

        public static void main(String[] args) {
            printlnFingers();
            printlnBodyParts();
            printlnLivingParts();
        }

        private static void printlnLivingParts() {
            System.out.println(new BodyPart("Рука").containsBones());
        }

        private static void printlnBodyParts() {
            List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
            bodyParts.add(new BodyPart("Рука"));
            bodyParts.add(new BodyPart("Нога"));
            bodyParts.add(new BodyPart("Голова"));
            bodyParts.add(new BodyPart("Тело"));
            System.out.println(bodyParts.toString());
        }

        private static void printlnFingers() {
            List<Finger> fingers = new ArrayList<Finger>(5);
            fingers.add(new Finger("Большой", true));
            fingers.add(new Finger("Указательный", true));
            fingers.add(new Finger("Средний", true));
            fingers.add(new Finger("Безымянный", false));
            fingers.add(new Finger("Мизинец", true));
            System.out.println(fingers.toString());
        }
    }
/* 
Что-то лишнее
1. Программа должна выводить следующее:
Это double
Это Object
Это double
Это Integer
Это double

2. Удали реализации всех лишних методов


Требования:
1. В классе Solution должен остаться метод print с одним параметром типа Integer.
2. В классе Solution должен остаться метод print с одним параметром типа Object.
3. В классе Solution должен остаться метод print с одним параметром типа double.
4. Вывод на экран должен соответствовать условию.*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
//        Это double
//        Это Object
//        Это double
//        Это Integer
//        Это double
    }

    public static void print(Integer i) {
        System.out.println("Это Integer");
    }

//    public static void print(int i) {
//        System.out.println("Это Integer");
//    }

    public static void print(Short i) {
        System.out.println("Это Object");
    }

    public static void print(Object i) {
        System.out.println("Это Object");
    }

    public static void print(double i) {
        System.out.println("Это double");
    }

//    public static void print(Double i) {
//        System.out.println("Это double");
//    }

//    public static void print(float i) {
//        System.out.println("Это Double");
//    }
}
Требования:
1. Интерфейс SpecificSerializable должен расширять (extends) интерфейс Serializable.
2. Класс JavaDev должен реализовывать интерфейс SepecificSerializable.
3. В коде не должно быть явного наследования от Object (extends Object).
4. Класс JuniorJavaDev не должен явно наследовать интерфейс SpecificSerializable.*/

public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about com.javarush.task.task15.task1511?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}
/* 
Статики-1
В статическом блоке инициализировать labels 5 различными парами ключ-значение.


Требования:
1. В классе Solution должен быть только один метод (main).
2. В классе Solution должно быть объявлено статическое поле labels типа Map.
3. Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
4. Метод main должен выводить содержимое labels на экран.*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "aaa");
        labels.put(2.0, "aaa");
        labels.put(3.0, "aaa");
        labels.put(4.0, "aaa");
        labels.put(5.0, "aaa");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
1. В статическом блоке считайте две переменные с консоли А и В с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().


Требования:
1. Поле A должно быть публичным и статическим.
2. Поле B должно быть публичным и статическим.
3. Программа должна считывать данные с клавиатуры в статическом блоке.
4. Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
5. Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.*/

public class Solution {
    public static int A;
    public static int B;
    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String s1 = reader.readLine();
            A = Integer.parseInt(s);
            B = Integer.parseInt(s1);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
/* 
Значения по умолчанию
1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
2. В методе main вывести их значения в заданном порядке.


Требования:
1. В классе Solution должно быть объявлено поле intVar типа int.
2. В классе Solution должно быть объявлено поле doubleVar типа double.
3. В классе Solution должно быть объявлено поле DoubleVar типа Double.
4. В классе Solution должно быть объявлено поле booleanVar типа boolean.
5. В классе Solution должно быть объявлено поле ObjectVar типа Object.
6. В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
7. В классе Solution должно быть объявлено поле StringVar типа String.
8. Метод main должен выводить значения полей на экран(каждое с новой строки или через пробел) в заданном порядке. Инициализировать переменные не нужно.*/

public class Solution {
    public  int intVar;
    public  double doubleVar;
    public  Double DoubleVar;
    public  boolean booleanVar;
    public  Object ObjectVar;
    public  Exception ExceptionVar;
    public  String StringVar;



    public static void main(String[] args) {
       Solution solution = new Solution();
        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);

    }
}
package com.javarush.task.task15.task1517;

/* 
Статики и исключения
В статическом блоке выбросьте Exception
В результате класс не загрузится, и вы увидите сообщение об ошибке вместо значения переменной B

Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)

Hint: Нужно погуглить причину, если получилось следующее:
java: initializer must be able to complete normally
java: unreachable statement


Требования:
1. В классе Solution в статическом блоке должно возникать исключение (Exception).
2. Программа не должна ничего выводить на экран(кроме автоматического сообщения о возникшем исключении).
3. Программа не должна считывать данные с клавиатуры.
4. Класс Solution должен быть public.*/

public class Solution {
    public static int A = 0;

    static {
        try {
            throw new ExceptionInInitializerError();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //throw an exception here - выбросьте эксепшн тут
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
/* 
Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. меньше либо равно нулю или больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.




Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные с клавиатуры после того, как была введена строка "exit".
3. Если введенная строка содержит точку(".") и может быть корректно преобразована в число типа Double - должен быть вызван метод print(Double value).
4. Если введенная строка может быть корректно преобразована в число типа short и полученное число больше 0, но меньше 128 - должен быть вызван метод print(short value).
5. Если введенная строка может быть корректно преобразована в число типа Integer и полученное число меньше или равно 0 или больше или равно 128 - должен быть вызван метод print(Integer value).
6. Во всех остальных случаях должен быть вызван метод print(String value).*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while (true) {
            try {
                s = reader.readLine();
                if (s.equals("exit")) {
                    break;
                } else if (s.contains(".")) {
                    print(Double.parseDouble(s));
                } else if (0 >= Integer.parseInt(s) || Integer.parseInt(s) >= 128) {
                    print(Integer.parseInt(s));
                } else if (0 < Integer.parseInt(s) && Integer.parseInt(s) < 128) {
                    print(Short.parseShort(s));
                }

            }
            catch (NumberFormatException e){
                print(s);
            }


        }//напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
/* 
Тренировка мозга
Найти логическую ошибку: утка(Duck) должна корректно реализовывать интерфейс CanMove.
Исправьте ошибку.

Результат вывода в консоль должен быть:
Flying
Moving


Требования:
1. Результат вывода на экран должен соответствовать условию.
2. В классе Duck должен быть реализован метод doAnotherAction.
3. Метод doAnotherAction() в классе Duck должен выводить на экран строку "Moving".
4. Метод move в классе Util должен вызывать метод doAnotherAction у переданного ему объекта.
5. Класс Duck должен реализовывать интерфейс CanMove.
6. Класс Duck должен реализовывать интерфейс CanFly.*/

public class Solution {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements CanFly, CanMove {
        @Override
        public void doAction() {
            System.out.println("Flying");
        }

        @Override
        public void doAnotherAction() {
            System.out.println("Moving");
        }
    }

    public static class Util {
        static void fly(CanFly animal) {
            animal.doAction();
        }

        static void move(CanMove animal) {
            animal.doAnotherAction();
        }
    }

    public static interface CanFly {
        void doAction();
    }

    public static interface CanMove {
        void doAnotherAction();
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
1. Найти пример реализации паттерна Singleton с ленивой реализацией(lazy initialization). Используй свой любимый поисковик(например google).
2. По образу и подобию в отдельных файлах создай три класса синглтона Sun, Moon, Earth.
3. Реализуй интерфейс Planet в классах Sun, Moon, Earth.
4. В статическом блоке класса Solution вызови метод readKeyFromConsoleAndInitPlanet.
5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считай один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet thePlanet, иначе обнулить Planet thePlanet.


Требования:
1. Класс Sun не должен позволять создавать объекты своего типа извне класса.
2. Класс Sun должен содержать приватное статическое поле instance типа Sun.
3. В классе Sun должен быть реализован публичный статический метод getInstance возвращающий значение поля instance.
4. Метод getInstance в классе Sun должен ВСЕГДА возвращать один и тот же объект.
5. Поле instance должно быть инициализировано после первого обращения к методу getInstance, но не раньше.
6. Класс Moon не должен позволять создавать объекты своего типа извне класса.
7. Класс Moon должен содержать приватное статическое поле instance типа Moon.
8. В классе Moon должен быть реализован публичный статический метод getInstance возвращающий значение поля instance.
9. Метод getInstance в классе Moon должен ВСЕГДА возвращать один и тот же объект.
10. Поле instance должно быть инициализировано после первого обращения к методу getInstance, но не раньше.
11. Класс Earth не должен позволять создавать объекты своего типа извне класса.
12. Класс Earth должен содержать приватное статическое поле instance типа Earth.
13. В классе Earth должен быть реализован публичный статический метод getInstance возвращающий значение поля instance.
14. Метод getInstance в классе Earth должен ВСЕГДА возвращать один и тот же объект.
15. Поле instance должно быть инициализировано после первого обращения к методу getInstance, но не раньше.
16. Метод readKeyFromConsoleAndInitPlanet должен быть вызван в статическом блоке класса Solution.
17. Метод readKeyFromConsoleAndInitPlanet должен считывать одну строку с клавиатуры.
18. Метод readKeyFromConsoleAndInitPlanet должен корректно обновлять значение переменной thePlanet в соответствии с условием задачи.
19. Классы Sun, Moon и Earth должны быть созданы в отдельных файлах.*/

public class Solution {



    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        }
        catch (Exception e) {e.printStackTrace();}

    }

    public static void readKeyFromConsoleAndInitPlanet() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        if(s.equals(Planet.EARTH)) {thePlanet = Earth.getInstance();}
        else if (s.equals(Planet.MOON)) {thePlanet = Moon.getInstance();}
        else if (s.equals(Planet.SUN)) {thePlanet = Sun.getInstance();}
        else {thePlanet = null;}

        }

        // implement step #5 here - реализуйте задание №5 тут
    }
    public class Sun implements Planet {
    private static Sun instance;
    private Sun () {}
    public static Sun getInstance(){
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }

}
public interface Planet {
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}
/* 
Перегрузка конструкторов
1. В классе Solution создай 4 конструктора с разными модификаторами доступа.
2. В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
3. Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
4. Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 конструктора с различными модификаторами доступа(все кроме private).


Требования:
1. В классе SubSolution должно содержаться 3 различных конструктора.
2. В классе Solution должно содержаться 4 различных конструктора.
3. В классе Solution должны быть объявлены конструкторы со всеми возможными модификаторами доступа.
4. В классе SubSolution должны быть объявлены конструкторы со всеми возможными модификаторами доступа кроме private.
5. Класс Solution должен быть родителем класса SubSolution.*/

public class Solution {

    public String name;
    public int age;
    public int weight;

    private Solution(String name, int age){}
    protected Solution(String name){}
    public Solution(int age){}
    Solution(int weight, String name){}

    public static void main(String[] args) {

    }
}
public class SubSolution extends Solution {
    public SubSolution(String name) {
        super(name);
    }

    protected SubSolution(int age) {
        super(age);
    }

    SubSolution(int weight, String name) {
        super(weight, name);
    }
}
/* 
Файл в статическом блоке
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.


Требования:
1. Константа FILE_NAME не должна быть пустой.
2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по-отдельности в список lines.
3. Поле FILE_NAME НЕ должно быть final.
4. Класс Solution должен содержать список lines.*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            File file = new File(Statics.FILE_NAME);
            FileReader fileReader = new FileReader(file); // поток, который подключается к текстовому файлу
            BufferedReader bufferedReader = new BufferedReader(fileReader); // соединяем FileReader с BufferedReader

            String line;
            while((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            bufferedReader.close(); // закрываем поток
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
public class Statics {
    public static String FILE_NAME = "/home/ilya/Documents/123.java";
}
/* 
ООП. Hrivna — тоже деньги
Исправь класс Hrivna так, чтоб избежать возникновения ошибки StackOverflowError.


Требования:
1. Класс Hrivna должен быть потомком класса Money.
2. В классе Hrivna должен быть реализован метод getAmount.
3. Метод getAmount в классе Hrivna должен возвращать значение поля amount.
4. В процессе выполнения программы НЕ должны возникать исключения или ошибки.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        private double amount = 123d;
        public Object getAmount(){return amount;}
        public Hrivna getMoney() {
            return this;
        }
    }
}
/* 
Singleton
Класс является синглтоном (реализует паттерн Singleton), если позволяет создать всего один объект своего типа.

Реализовать Singleton pattern:
1. Создай класс Singleton в отдельном файле.
2. Добавь в него статический метод getInstance().
3. Метод getInstance должен возвращать один и тот же объект класса Singleton при любом вызове метода getInstance.
4. Подумай, каким образом можно запретить создание других объектов этого класса.
5. Сделай все конструкторы в классе Singleton приватными (private).
6. В итоге должна быть возможность создать объект (экземпляр класса) ТОЛЬКО используя метод getInstance.


Требования:
1. Класс Singleton должен быть создан в отдельном файле.
2. Класс Singleton не должен позволять создавать объекты своего типа извне класса.
3. Класс Singleton должен содержать приватное статическое поле instance типа Singleton.
4. В классе Singleton должен быть реализован публичный статический метод getInstance возвращающий значение поля instance.
5. Метод getInstance должен ВСЕГДА возвращать один и тот же объект.*/
public class Solution {
    public static void main(String[] args) {

        Singleton a = Singleton.getInstance();

        System.out.println(a);
    }
}
public class Singleton {
    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
