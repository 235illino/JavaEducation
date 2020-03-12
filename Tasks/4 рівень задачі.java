/* 
Bingo!
Исправь строчку 'Object animal = new Pet();' в методе main так, чтобы программа вывела "Bingo!".


Требования:
1. Класс Cat должен наследоваться от класса Pet.
2. Класс Tiger должен наследоваться от класса Cat.
3. В переменной Object animal должен храниться объект который будет одновременно являться и Pet, и Cat, и Tiger.
*/

public class Solution {
    public static void main(String[] args) {
        Object animal = new Tiger();
        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) System.out.println("Bingo!");
    }

    static class Pet {
    }

    static class Cat extends Pet {
    }

    static class Tiger extends Cat {
    }

}
/* 
Building и School
1. Расставь правильно наследование между Building(здание) и School(здание школы).
2. Подумай, объект какого класса должен возвращать методы getSchool и getBuilding.
3. Измени null на объект класса Building или School.


Требования:
1. Класс School должен наследоваться от класса Building.
2. Метод getSchool должен возвращать новую школу(School).
3. Метод getBuilding должен возвращать новое здание(Building).
4. Класс School должен быть статическим.
5. Класс Building должен быть статическим.*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //измените null на объект класса Building или School
        return new School();
    }

    public static Building getBuilding() {
        //измените null на объект класса Building или School
        return new Building();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}   
Коты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.

Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные после ввода пустой строки.
3. Программа должна выводить на экран описание каждого кота (cat.toString).
4. Программа должна создавать объект класса Cat для каждого введенного имени кота(строки считанной с клавиатуры) c помощью метода getCatByKey.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      while (true){
          String s = reader.readLine();
          if (s == null || s.isEmpty()) break;
          Cat cat = CatFactory.getCatByKey(s);
          System.out.println(cat.toString());
      }


    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
/* 
Food
1. Реализовать интерфейс Selectable в классе Food.
2. Метод onSelect() должен выводить на экран фразу "The food was selected".
3. Подумай, какие методы можно вызвать для переменной food и какие для selectable.
4. В методе foodMethods вызови методы onSelect, onEat, если это возможно.
5. В методе selectableMethods вызови методы onSelect, onEat, если это возможно.
6. Явное приведение типов не использовать.


Требования:
1. Интерфейс Selectable должен быть реализован в классе Food.
2. Метод onSelect() в классе Food должен выводить на экран фразу "The food was selected".
3. В методе foodMethods должны вызываться методы объекта типа Food.
4. В методе selectableMethods должны вызываться методы доступные у любого объекта реализующего интерфейс Selectable.
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
       food.onSelect();
       food.onEat();
        //тут добавьте вызов методов для переменной food
    }

    public static void selectableMethods(Selectable selectable) {
       selectable.onSelect();
       //тут добавьте вызов методов для переменной selectable
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
Без ошибок
Инициализировать объект obj таким классом, чтобы метод main выполнился без ошибок.


Требования:
1. Класс GrayMouse должен наследоваться от класса Mouse.
2. Класс Jerry должен наследоваться от класса GrayMouse.
3. В переменной obj должен храниться объект который будет одновременно являться и Mouse, и GrayMouse, и Jerry.
4. Метод main должен вызывать метод printClasses.*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry();//Add your code here

                Mouse mouse = (Mouse) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}

/* 
Player and Dancer
1. Подумать, что делает программа.
2. Изменить метод haveFun так, чтобы он вызывал метод
- play, если person имеет тип Player.
- dance, если person имеет тип Dancer.


Требования:
1. Класс Player должен реализовывать интерфейс Person.
2. Класс Dancer должен реализовывать интерфейс Person.
3. Метод haveFun должен вызывать метод play, если переданный ему объект является игроком(Player).
4. Метод haveFun должен вызывать метод dance, если переданный ему объект является танцором(Dancer).
5. Метод main должен считывать данные с клавиатуры.
6. Метод main должен прекращать считывать данные с клавиатуры, если введенная строка равна "exit".*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
       if (person instanceof Player){
           ((Player) person).play();
       }
       if (person instanceof Dancer){
           ((Dancer) person).dance();
       }
       //напишите тут ваш код
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
* 
Куриная фабрика
Написать Фабрику(Factory) по производству кур(Hen):

1. Создать класс Hen.
1.1. Сделать его абстрактным.
1.2. Добавить в класс абстрактный метод int getCountOfEggsPerMonth().
1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я - курица.".
2. Создать класс RussianHen, который наследуется от Hen.
3. Создать класс UkrainianHen, который наследуется от Hen.
4. Создать класс MoldovanHen, который наследуется от Hen.
5. Создать класс BelarusianHen, который наследуется от Hen.
6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.
7. В каждом из четырех последних классов написать свою реализацию метода getDescription.

Методы должны возвращать строку вида:
<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур.
9. Все созданные вами классы должны быть в отдельных файлах.


Требования:
1. Класс Hen должен быть абстрактным.
2. Класс Hen должен содержать абстрактный метод int getCountOfEggsPerMonth().
3. В классе Hen должен быть реализован метод String getDescription(), который возвращает строку "Я - курица.".
4. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны наследоваться от класса Hen и быть созданы в отдельных файлах.
5. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны реализовывать метод getCountOfEggsPerMonth, который должен возвращать количество яиц в месяц от данного типа куриц.
6. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны переопределять метод getDescription родительского класса, таким образом, чтобы возвращаемая ими строка имела вид: <getDescription() родительского класса> + < Моя страна - Sssss. Я несу N яиц в месяц.> где Sssss - название страны, а N - количество яиц в месяц.
7. Метод getHen должен быть реализован в классе HenFactory и должен возвращать тип кур для переданной в него страны.*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {


        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.RUSSIA)) {
                hen = new RussianHen();//напишите тут ваш код
            } else if(country.equals(Country.BELARUS)) {
                hen = new BelarusianHen();
            } else if (country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            } else if (country.equals(Country.UKRAINE)) {
                hen  = new UkrainianHen();
            }
            return hen;
        }
    }


}
public abstract class Hen {
   abstract int getCountOfEggsPerMonth();
    String getDescription() {return  "Я - курица.";}

}
public interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA = "Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }
    @Override
    String getDescription() {return  super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";}
}
public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 0;
    }
    @Override
    String getDescription() {return  super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";}
}
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }
    @Override
    String getDescription() {return  super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";}
}
public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }
    @Override
    String getDescription() {return  super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";}
}
* 
Мосты
1. Создать интерфейс Bridge с методом int getCarsCount().
2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
3. Метод getCarsCount() должен возвращать любое фиксированное значение типа int.
4. Метод getCarsCount() должен возвращать различные значения для различных классов.
5. В классе Solution создать публичный метод println(Bridge bridge).
6. В методе println вывести на консоль значение getCarsCount() для объекта bridge.
7. Каждый класс и интерфейс должны быть в отдельных файлах.


Требования:
1. Интерфейс Bridge должен быть создан в отдельном файле.
2. Классы WaterBridge и SuspensionBridge должны быть созданы в отдельных файлах.
3. Классы WaterBridge и SuspensionBridge должны реализовывать интерфейс Bridge.
4. Метод getCarsCount() должен возвращать различные значения типа int для различных классов, но всегда фиксированное(константное) значение для разных объектов одного и того же класса.
5. В классе Solution должен быть реализован публичный(public) метод println c одним параметром типа Bridge.
6. Метод println должен выводить на консоль количество машин(результат работы метода getCarsCount) для переданного ему моста(объекта типа Bridge).
7. В интерфейсе Bridge должен быть определен метод int getCarsCount().*/

import static jdk.nashorn.internal.objects.Global.println;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

   static public void println(Bridge bridge){

       System.out.println(bridge.getCarsCount());

    }//add println method here
}
public interface Bridge {
    int getCarsCount();
}
public class SuspensionBridge implements Bridge {
    @Override
    public int getCarsCount() {
        return 1;
    }
}
public class WaterBridge implements Bridge {
    @Override
    public int getCarsCount() {
        return 2;
    }
}
/* 
Дегустация вин
1. Создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль "Вкусно".
2. Создать класс Wine, который наследуется от Drink, с реализованным методом public String getHolidayName(), который возвращает строку "День Рождения".
3. Создать класс BubblyWine, который наследуется от Wine, с реализованным методом public String getHolidayName(), который возвращает строку "Новый Год".
4. Написать реализацию методов getDeliciousDrink, getWine, getBubblyWine.
5. Все классы должны находиться в отдельных файлах.


Требования:
1. Абстрактный класс Drink должен быть создан в отдельном файле.
2. В классе Drink должен быть реализован метод public void taste(), который выводит на экран строку - "Вкусно".
3. Класс Wine должен быть создан в отдельном файле и быть потомком класса Drink.
4. В классе Wine должен быть реализован метод public String getHolidayName(), который возвращает строку - "День Рождения".
5. Класс BubblyWine должен быть создан в отдельном файле и быть потомком класса Wine.
6. В классе BubblyWine должен быть реализован метод public String getHolidayName(), который возвращает строку - "Новый Год".
7. В классе Solution должен быть реализован метод getDeliciousDrink(), который возвращает объект типа Wine.
8. В классе Solution должен быть реализован метод getWine(), который возвращает объект типа Wine.
9. В классе Solution должен быть реализован метод getBubblyWine(), который возвращает объект типа BubblyWine.*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Wine wine = new Wine();
        return wine;

    }

    public static Wine getWine() {
        Wine wine1 = new Wine();
        return wine1;
    }

    public static Wine getBubblyWine() {
        BubblyWine wine2 = new BubblyWine();
        return wine2;
    }
}
public abstract class Drink {
    public void taste(){
        System.out.println("Вкусно");
    }
}
public class Wine extends Drink {
    public String getHolidayName(){return "День Рождения";}
}
public class BubblyWine extends Wine {
    public String getHolidayName(){return "Новый Год";}
}
/* 
Реализовать метод printMainInfo
1. Напиши реализацию метода printMainInfo, чтобы:
1.1. Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
1.2. Если в метод передают объект типа Movable, у этого объекта вызывался метод move.


Требования:
1. Класс Solution должен содержать реализацию метода printMainInfo с одним параметром типа Object.
2. Метод printMainInfo должен быть статическим.
3. Метод printMainInfo должен иметь самый широкий уровень доступа(public).
4. Метод printMainInfo должен вызывать у переданного ему в качестве параметра объекта метод draw, если этот объект реализует интерфейс Drawable.
5. Метод printMainInfo должен вызывать у переданного ему в качестве параметра объекта метод move, если этот объект реализует интерфейс Movable.*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        if (object instanceof Drawable){
            ((Drawable) object).draw();

        }
        if (object instanceof Movable){
            ((Movable) object).move();

        }
        //напишите тут ваш код
    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }
    }
}

/* 
Computer
1. Создай интерфейс CompItem.
2. Добавь в него метод String getName().
3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
4. Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
5. Создай класс Computer.
6. В класс Computer добавь приватное поле keyboard типа Keyboard.
7. В класс Computer добавь приватное поле mouse типа Mouse.
8. В класс Computer добавь приватное поле monitor типа Monitor.
9. Создай конструктор с тремя параметрами в классе Computer используя комбинацию клавиш Alt+Insert внутри класса (команда Constructor).
10. Внутри конструктора инициализируйте все три поля (переменных) класса в соответствии с переданными параметрами.
11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert и выбери команду Getter).
12. Все созданные классы и интерфейс должны быть в отдельных файлах.


Требования:
1. Интерфейс CompItem должен существовать в отдельном файле.
2. В интерфейсе CompItem должен быть объявлен метод getName() с типом возвращаемого значения String и без параметров.
3. Классы Keyboard, Monitor и Mouse должны реализовывать интерфейс CompItem, а также существовать в отдельных файлах.
4. Метод getName в классах реализующих интерфейс CompItem должен возвращать простое имя класса, например "Keyboard" для класса Keyboard.
5. Класс Computer должен содержать по одному приватному полю типа Keyboard, Mouse, Monitor, а также существовать в отдельном файле.
6. Конструктор класса Computer должен принимать 3 параметра(keyboard, mouse, monitor) и корректно инициализировать соответствующие поля класса.
7. Для полей keyboard, mouse и monitor Computer должны быть созданы геттеры(getKeyboard, getMouse, getMonitor), которые будут возвращать соответствующие поля класса Computer.
*/

public class Solution {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
public class Monitor implements CompItem {
    @Override
    public String getName() {
        return "Monitor";
    }
}
public class Mouse implements CompItem {
    @Override
    public String getName() {
        return "Mouse";
    }
}


public class Keyboard implements CompItem {
    @Override
    public String getName() {
        return "Keyboard";
    }
}
public interface CompItem {
    String getName();
}

/* 
MovieFactory
Расширение функционала по аналогии, чтение с консоли:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Thriller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".

Аналогично получению объекта SoapOpera сделать:
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie типа Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName().


Требования:
1. Классы Cartoon и Thriller должны быть статическими и существовать внутри класса Solution.
2. Метод MovieFactory.getMovie должен возвращать объект типа Cartoon в случае передачи ему строки "cartoon" в качестве параметра.
3. Метод MovieFactory.getMovie должен возвращать объект типа Thriller в случае передачи ему строки "thriller" в качестве параметра.
4. Метод main должен считывать строки с клавиатуры.
5. Метод main должен прекращать считывать строки с клавиатуры в случае, если была введена некорректная строка(не "cartoon", не "thriller" или не "soapOpera").
6. Для каждой введенной строки (в том числе для некорректной) необходимо вызвать метод MovieFactory.getMovie.
7. Для всех введенных корректных строк необходимо вывести на экран простые имена(movie.getClass().getSimpleName()) типов объектов возвращаемых методом MovieFactory.getMovie.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //ввести с консоли несколько ключей (строк), пункт 7

        while (true){
            String key = reader.readLine();
            if (key.equals("cartoon")) {
               Movie movie = MovieFactory.getMovie("cartoon");
                System.out.println(movie.getClass().getSimpleName());

            } else if (key.equals("soapOpera")) {
               Movie movie = MovieFactory.getMovie("soapOpera");
                System.out.println(movie.getClass().getSimpleName());

            } else if (key.equals("thriller")) {
               Movie movie = MovieFactory.getMovie("thriller");
                System.out.println(movie.getClass().getSimpleName());

            }else { Movie movie = MovieFactory.getMovie(key);
            break;}
        }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }
    static class Cartoon extends Movie {}
    static class Thriller extends Movie {}

    //Напишите тут ваши классы, пункт 3
}
/* 
User, Loser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "loser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Loser.
3.3. Вызывает метод writeCode(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.


Требования:
1. Метод main должен считывать строки с клавиатуры.
2. Метод main должен прекращать считывать строки с клавиатуры, как только введенная строка не совпадает с одной из ожидаемых(user, loser, coder, proger).
3. Для каждой корректной(user, loser, coder, proger) введенной строки должен быть вызван метод doWork с соответствующим объектом класса Person в качестве параметра.
4. В классе Solution должен быть реализован метод doWork с одним параметром типа Person.
5. Метод doWork должен вызывать метод live() у переданного объекта, если этот объект имеет тип User.
6. Метод doWork должен вызывать метод doNothing() у переданного объекта, если этот объект имеет тип Loser.
7. Метод doWork должен вызывать метод writeCode() у переданного объекта, если этот объект имеет тип Coder.
8. Метод doWork должен вызывать метод enjoy() у переданного объекта, если этот объект имеет тип Proger.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;



            while (true) {
                key = reader.readLine();
                if (key.equals("user")) {
                    Person.User user = new Person.User();
                    doWork(user);//создаем объект, пункт 2
                } else if(key.equals("loser")) {
                    Person.Loser loser = new Person.Loser();
                    doWork(loser);
                } else if(key.equals("coder")) {
                    Person.Coder coder = new Person.Coder();
                    doWork(coder);
                } else if(key.equals("proger")) {
                    Person.Proger proger = new Person.Proger();
                    doWork(proger);
                } else break;
            }

    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();// пункт 3
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
    }

public interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }

}


 while ((key = reader.readLine()).matches("user|loger|coder|proger"));
 /* 
Клининговый центр
1. Реализовать метод cleanAllApartments.
Для каждого объекта из apartments:
2. Для однокомнатных квартир (OneRoomApt) вызвать метод clean1Room.
т.е. если объект типа OneRoomApt, то вызвать у него метод clean1Room.
3. Для двухкомнатных квартир (TwoRoomApt) вызвать метод clean2Rooms
т.е. если объект типа TwoRoomApt, то вызвать у него метод clean2Rooms.
4. Для трехкомнатных квартир (ThreeRoomApt) вызвать метод clean3Rooms
т.е. если объект типа ThreeRoomApt, то вызвать у него метод clean3Rooms.


Требования:
1. Метод cleanAllApartments должен принимать список аппартаметов в качестве параметра.
2. В методе cleanAllApartments для всех однокомнатных аппартаментов(OneRoomApt) содержащихся в списке необходимо вызвать метод clean1Room.
3. В методе cleanAllApartments для всех двухкомнатных аппартаментов(TwoRoomApt) содержащихся в списке необходимо вызвать метод clean2Rooms.
4. В методе cleanAllApartments для всех трехкомнатных аппартаментов(ThreeRoomApt) содержащихся в списке необходимо вызвать метод clean3Rooms.
5. Классы OneRoomApt, TwoRoomApt, ThreeRoomApt должны поддерживать(реализовывать) интерфейс Apartment.*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for ( Apartment item:apartments ) {
            if( item instanceof OneRoomApt ) ((OneRoomApt)item).clean1Room();
            else if ( item instanceof TwoRoomApt ) ((TwoRoomApt)item).clean2Rooms();
            else if ( item instanceof ThreeRoomApt ) ((ThreeRoomApt)item).clean3Rooms();
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
Исправление ошибок
1. Подумай, как связаны интерфейсы Swimmable(способен плавать) и Walkable(способен ходить) с классом OceanAnimal(животное океана).
2. Расставь правильно наследование интерфейсов и класса OceanAnimal.
3. Подумай, как могут быть связаны классы Orca(Косатка), Whale(Кит), Otter(Выдра) с классом OceanAnimal.
4. Расставь правильно наследование между классами Orca, Whale, Otter и классом OceanAnimal.
5. Подумай, какой класс должен реализовать интерфейс Walkable и добавить интерфейс этому классу.
6. Подумай, какое животное еще не умеет плавать и добавить ему интерфейс Swimable.


Требования:
1. Косатка(Orca) является животным океана(потомком OceanAnimal) и умеет плавать(поддерживает интерфейс Swimmable).
2. Кит(Whale) является животным океана(потомком OceanAnimal) и умеет плавать(поддерживает интерфейс Swimmable).
3. Выдра(Otter) умеет ходить(поддерживает интерфейс Walkable) и плавать(поддерживает интерфейс Swimmable).
4. Выдра(Otter) НЕ является животным океана(потомком OceanAnimal).
5. Кит(Whale) и Косатка(Orca) НЕ умеют ходить(не поддерживают интерфейс Walkable).*/

public class Solution {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimmable {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal {
        @Override
        Swimmable getCurrentAnimal() {
            return null;
        }
    }

    static class Whale extends OceanAnimal {

        @Override
        Swimmable getCurrentAnimal() {
            return null;
        }
    }

    static class Otter implements Walkable, Swimmable {

        @Override
        public void walk() {

        }

        @Override
        public void swim() {

        }
    }
}
/* 
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.


Требования:
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nod;
        Integer num1 = Integer.parseInt(reader.readLine());
        if (num1 <= 0) throw new Exception();
        Integer num2 = Integer.parseInt(reader.readLine());
        if (num2 <= 0) throw new Exception();


        if (num1<num2)
            nod=num1;
        else
            nod=num2;

        while (nod!=1){
            if (num1%nod==0 && num2%nod==0)
                break;
            nod--;
        }
        System.out.println(nod);
    }
}
