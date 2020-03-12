Киты и коровы
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:

Я не корова, Я - кит.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Whale должен наследоваться от класса Cow.
3. Класс Whale должен переопределять метод getName().
4. Метод main() должен вызывать метод getName() у объекта cow.
5. Переопределить метод getName в классе Whale(Кит), чтобы программа выводила на экран: "Я не корова, Я - кит."
6. Метод main() должен выводить на экран результат вызова метода getName().*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());

    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "Я не корова, Я - кит.";
        }
    }


}
есарю — кесарево
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака - собаку.


Требования:
1. Класс Cat должен наследоваться от класса Pet.
2. Класс Dog должен наследоваться от класса Pet.
3. Класс Cat должен переопределять метод getChild() чтобы кот порождал кота.
4. Класс Dog должен переопределять метод getChild() чтобы собака порождала собаку.
5. Метод main() должен вызывать метод getChild() у объекта типа Cat.
6. Метод main() должен вызывать метод getChild() у объекта типа Dog.*/

public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        public Pet getChild() {
            return new Cat();
        }

    }

    public static class Dog extends Pet {
        public Pet getChild() {
            return new Dog();
        }

    }
}
package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Cat менять нельзя.
3. Класс Dog менять нельзя.
4. Класс Bird менять нельзя.
5. Класс Lamp менять нельзя.
6. Метод printObjectType() должен выводить на экран одну из надписей, в зависимости от переданного объекта. Например "Лампа" для объектов типа Solution.Lamp.*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        HashMap<Class, String> map = new HashMap<>();
        map.put(Cat.class, "Кошка");
        map.put(Bird.class, "Птица");
        map.put(Lamp.class, "Лампа");
        map.put(Cat.class, "Кошка");
        map.put(Dog.class, "Собака");
        System.out.println(map.get(o.getClass()));


        //Напишите тут ваше решение
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
/* 
Определимся с животным
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат - одно значение из: "Корова", "Кит", "Собака", "Неизвестное животное".


Требования:
1. Программа должна выводить текст на экран.
2. В классе Solution должен быть статический класс Cow.
3. В классе Solution должен быть статический класс Dog.
4. В классе Solution должен быть статический класс Whale.
5. В классе Solution должен быть статический класс Pig.
6. Метод getObjectType() должен возвращать одно значение из: "Корова", "Кит", "Собака", "Неизвестное животное" в зависимости от переданного объекта. Например "Корова" для объектов типа Solution.Cow.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cow) return "Корова";
        if (o instanceof Whale) return "Кит";
        if (o instanceof Dog) return "Собака";

        return "Неизвестное животное";

    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}

/* 
Выполняем перегрузку!
Написать два метода: print(int) и print(String).


Требования:
1. Программа не должна выводить текст на экран.
2. Класс Solution должен содержать три метода.
3. Класс Solution должен содержать статический метод main().
4. Класс Solution должен содержать статический метод print() с параметром типа int.
5. Класс Solution должен содержать статический метод print() с параметром типа String.*/

public class Solution {
    public static void main(String[] args) {

    }
    public static void print(int a) {};

    public static void print(String a) {};

   //Напишите тут ваши методы
}
Int и Integer
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.


Требования:
1. Класс Solution должен содержать статический метод main().
2. Класс Solution должен содержать статический void метод print() с параметром типа int.
3. Класс Solution должен содержать статический void метод print() с параметром типа Integer.
4. Метод main() должен вызывать метод print() с параметром типа int.
5. Метод main() должен вызывать метод print() с параметром типа Integer.*/

public class Solution {
    public static void main(String[] args) {
        print(10);
        Integer num = 100;
        print(num);

    }

    public static void print(int a) {

    }

    public static void print(Integer a) {
    }

    //Напишите тут ваши методы
}
Свобода печати
Написать пять методов print с разными параметрами.


Требования:
1. Программа не должна выводить текст на экран.
2. Класс Solution должен содержать шесть методов.
3. Класс Solution должен содержать статический метод main().
4. Класс Solution должен содержать пять статических методов print() с разными параметрами.*/

public class Solution {
    public static void main(String[] args) {

    }
    public static void print(int a){};
    public static void print(double a){};
    public static void print(long a){};
    public static void print(Integer a){};
    public static void print(String a){};


    //Напишите тут ваши методы
}
Три метода и минимум
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.


Требования:
1. Программа не должна выводить текст на экран.
2. Класс Solution должен содержать четыре метода.
3. Класс Solution должен содержать статический метод int min(int, int).
4. Метод int min(int, int) должен возвращать минимальное из двух чисел типа int.
5. Класс Solution должен содержать статический метод long min(long, long).
6. Метод long min(long, long) должен возвращать минимальное из двух чисел типа long.
7. Класс Solution должен содержать статический метод double min(double, double).
8. Метод double min(double, double) должен возвращать минимальное из двух чисел типа double.*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }

    public static long min(long a, long b) {
        if (a > b) return b;
        else return a;
    }

    public static double min(double a, double b) {
        if (a > b) return b;
        else return a;
    }
   //Напишите тут ваши методы
}
package com.javarush.task.task12.task1211;

/* 
Абстрактный класс Pet
Сделать класс Pet абстрактным.


Требования:
1. Программа не должна выводить текст на экран.
2. Класс Pet должен быть статическим.
3. Класс Pet должен быть абстрактным.
4. Класс Pet должен иметь один метод getName().*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }
    }

}
«Исправь код», часть 1
Исправь код, чтобы программа компилировалась.

Подсказка:
метод getChild должен остаться абстрактным.


Требования:
1. Класс Pet должен быть статическим.
2. Класс Pet должен иметь два метода.
3. Метод getChild() должен быть абстрактным.
4. Класс Pet должен быть объявлен с модификатором, который запрещает создавать конкретные объекты этого класса.*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
Корова — тоже животное
Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.


Требования:
1. Класс Animal должен быть абстрактным.
2. Класс Cow не должен быть абстрактным.
3. Класс Cow должен наследоваться от класса Animal.
4. Класс Cow должен реализовать абстрактный метод из класса Animal.
5. Метод getName() класса Cow должен возвращать любое имя коровы.*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {

        @Override
        public String getName() {
            return "mu";
        }
    }

}
Кошки не должны быть абстрактными!
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы.
Классы Cat и Dog не должны быть абстрактными.


Требования:
1. Класс Pet должен быть абстрактным.
2. Класс Dog не должен быть абстрактным.
3. Класс Cat не должен быть абстрактным.
4. Класс Dog должен реализовать абстрактные методы из класса Pet.
5. Класс Cat должен реализовать абстрактные методы из класса Pet.*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

}

/* 
Летать охота
Напиши свой public интерфейс CanFly(летать).
Добавь в него два метода.


Требования:
1. Класс Solution должен содержать интерфейс CanFly.
2. Интерфейс CanFly должен быть публичным.
3. Интерфейс CanFly должен содержать два метода.
4. Интерфейс CanFly не должен иметь родителя.*/

public class Solution {
    public static void main(String[] args) {

    }

 public interface CanFly{
    void Fly();
    void FlyHigh();

    }   //add an interface here - добавь интерфейс тут

}
Класс Human и интерфейсы CanRun, CanSwim
Напиши public класс Human(человек) и public интерфейсы CanRun(бежать/ездить), CanSwim(плавать).
Добавь в каждый интерфейс по oдному методу.
Добавь эти интерфейсы классу Human, но не реализуй методы.
Объяви класс Human абстрактным.


Требования:
1. Класс Solution должен содержать интерфейс CanRun с одним методом.
2. Класс Solution должен содержать интерфейс CanSwim с одним методом.
3. Класс Solution должен содержать класс Human.
4. Класс Human должен реализовывать интерфейсы CanRun и CanSwim.
5. Класс Human должен быть абстрактным.
6. Класс Human не должен иметь методов.*/

public class Solution {
    public static void main(String[] args) {


    }

    public abstract class Human implements CanRun, CanSwim{
    }

    interface CanRun {
        void Run();
    }

    interface CanSwim {
        void Swim();
    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
}
Все мы немного кошки…
Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись "Я - кот".


Требования:
1. Класс Solution должен содержать класс Pet.
2. Класс Solution должен содержать класс Cat.
3. Класс Cat должен наследоваться от класса Pet.
4. Класс Pet должен содержать один метод getName().
5. Класс Cat должен переопределять метод getName().
6. Программа должна выводить на экран результат метода getName() объекта pet.*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "Я - кот";
        }
    }
}
/* 
Больше не Пушистик
Переопредели метод setName в классе Cat так, чтобы программа выдавала на экран надпись

"Я - кот"


Требования:
1. Класс Solution должен содержать класс Pet.
2. Класс Solution должен содержать класс Cat.
3. Класс Cat должен наследоваться от класса Pet.
4. Класс Pet должен содержать два метода getName() и setName().
5. Класс Cat должен переопределять метод setName().
6. Программа должна выводить на экран результат метода getName() объекта pet.*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            super.setName("Я - кот");
        }
    }
}
/* 
Неведома зверушка
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
"Кот", "Тигр", "Лев", "Бык", "Животное".


Требования:
1. Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Pig.
2. Класс Solution должен содержать метод String getObjectType(Object o).
3. Метод getObjectType() должен возвращать строку "Кот" если передан объект типа Cat.
4. Метод getObjectType() должен возвращать строку "Тигр" если передан объект типа TigerTiger.
5. Метод getObjectType() должен возвращать строку "Лев" если передан объект типа Lion.
6. Метод getObjectType() должен возвращать строку "Бык" если передан объект типа Bull.
7. Метод getObjectType() должен возвращать строку "Животное" если передан любой другой объект.
8. Программа должна выводить на экран результат метода getObjectType().*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cat) return "Кот";
        if (o instanceof Tiger) return "Тигр";
        if (o instanceof Lion) return "Лев";
        if (o instanceof Bull) return "Бык";


        return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}

      if (o instanceof Cat) return "Кот";
        if (o instanceof Tiger) return "Тигр";
        if (o instanceof Lion) return "Лев";
        if (o instanceof Bull) return "Бык";
        if (o instanceof Cow) return "Корова";
        if (o instanceof Animal) return "Животное";
        Посетители
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
"Кот", "Тигр", "Лев", "Бык", "Корова", "Животное".

Замечание:
постарайся определять тип животного как можно более точно.


Требования:
1. Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Cow, Animal.
2. Класс Solution должен содержать метод String getObjectType(Object o).
3. Метод getObjectType() должен возвращать строку "Кот", если передан объект типа Cat.
4. Метод getObjectType() должен возвращать строку "Тигр", если передан объект типа Tiger.
5. Метод getObjectType() должен возвращать строку "Лев", если передан объект типа Lion.
6. Метод getObjectType() должен возвращать строку "Бык", если передан объект типа Bull.
7. Метод getObjectType() должен возвращать строку "Корова", если передан объект типа Cow.
8. Метод getObjectType() должен возвращать строку "Животное", если передан объект типа Animal.
9. Программа должна выводить на экран результат метода getObjectType().*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cat) {
            if (o instanceof Tiger) return "Тигр";
            if (o instanceof Lion) return "Лев";
            return "Кот";}

        if (o instanceof Bull) return "Бык";
        if (o instanceof Cow) return "Корова";
        if (o instanceof Animal) return "Животное";

        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}

/* 
Лазать, летать и бегать
1. Внутри класса Solution создай интерфейс public interface CanFly(летать) с методом void fly().
2. Внутри класса Solution создай интерфейс public interface CanClimb(лазить по деревьям) с методом void climb().
3. Внутри класса Solution создай интерфейс public interface CanRun(бегать) с методом void run().
4. Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
5. Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).


Требования:
1. Класс Solution должен содержать интерфейс CanFly с методом void fly().
2. Класс Solution должен содержать интерфейс CanClimb с методом void climb().
3. Класс Solution должен содержать интерфейс CanRun с методом void run().
4. Объект класса Cat должен уметь бегать(поддерживать интерфейс CanRun) и лазить по деревьям(поддерживать интерфейс CanClimb).
5. Объект класса Dog должен уметь бегать(поддерживать интерфейс CanRun).
6. Класс Tiger должен быть котом.
7. Объект класса Duck должен уметь бегать(поддерживать интерфейс CanRun) и летать(поддерживать интерфейс CanFly).*/

public class Solution {
    public interface CanFly{ void fly(); }
    public interface CanClimb{ void climb(); }
    public interface CanRun{ void run(); }

    public static void main(String[] args) {

    }

    public abstract class Cat implements CanClimb, CanRun {
    }

    public abstract class Dog implements CanRun {
    }

    public abstract class Tiger extends Cat {
    }

    public abstract class Duck implements CanFly, CanRun {
    }
}
/* 
Интерфейсы к классу Human
Добавь как можно больше интерфейсов к классу Human, но чтобы он не стал абстрактным классом.
Добавлять методы в класс Human запрещается.


Требования:
1. Класс Solution должен содержать интерфейс Worker с методом void workLazy().
2. Класс Solution должен содержать интерфейс Businessman с методом void workHard().
3. Класс Solution должен содержать интерфейс Secretary с методом void workLazy().
4. Класс Solution должен содержать интерфейс Miner с методом void workVeryHard().
5. Класс Solution должен содержать класс Human с методами: void workHard() и void workLazy().
6. Класс Human должен реализовывать три интерфейса.*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Worker, Businessman, Secretary {

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}
/* 
Родитель класса CTO
Добавь такой класс-родитель к классу CTO(технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.


Требования:
1. Класс Solution должен содержать интерфейс Businessman с методом void workHard().
2. Класс Solution должен содержать не абстрактный класс CTO.
3. Класс CTO должен реализовывать интерфейс Businessman.
4. Класс CTO не должен содержать методов.
5. Класс Solution должен содержать дополнительный класс.
6. Класс CTO должен наследоваться от дополнительного класса.
7. Дополнительный класс должен содержать один метод.*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Worker {

        public void workHard() {

        }

    }

    public static class CTO extends Worker implements Businessman {


    }
}
/* 
Попадание в десятку
Добавь еще один метод, чтобы программа выводила на экран число 10.

Подсказка:
используй перегрузку методов.


Требования:
1. Класс Solution должен содержать три метода.
2. Перегруженный метод transformValue должен удваивать переданное в него число.
3. Тип и значение переменной i менять нельзя.
4. Тип и значение переменной x менять нельзя.
5. Команду вывода на экран менять нельзя.
6. Метод main должен вызывать метод transformValue только один раз.
7. Программа должна вывести на экран число 10.*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }
    public static int transformValue(Integer i) {
        return i * 2;
    }

}
Ненужные абстракции
Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась.
Добавь там где надо и удали там, где они не нужны.


Требования:
1. Класс Pegasus должен реализовывать интерфейс CanFly.
2. Класс Pegasus должен наследоваться от класса Horse.
3. Класс SwimmingPegasus должен наследоваться от класса Pegasus.
4. Обьект класса Horse создать можно.
5. Обьект класса Pegasus создать можно.
6. Метод swim() класса SwimmingPegasus не должен иметь реализации.*/

public class Solution {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public abstract void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public void fly() {

        }
    }

    public static abstract class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }

}
/* 
Нужно добавить в программу новую функциональность
Сделать класс Pegasus(пегас) на основе класса Horse(лошадь) и интерфейса CanFly(летать).


Требования:
1. Класс Solution должен содержать интерфейс CanFly с методом fly().
2. Класс Solution должен содержать класс Horse с методом run().
3. Класс Solution должен содержать класс Pegasus.
4. Класс Pegasus должен наследоваться от класса Horse.
5. Класс Pegasus должен реализовывать интерфейс CanFly.*/

public class Solution {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus() {
            @Override
            public void fly() {

            }
        };
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static abstract class Pegasus extends Horse implements CanFly {
    }
}
package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).


Требования:
1. Класс Solution должен содержать класс Pair.
2. Класс Solution должен содержать два метода.
3. Класс Solution должен содержать метод getMinimumAndIndex().
4. Метод getMinimumAndIndex() должен возвращать минимальное число в массиве и его позицию (индекс).*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        int min = 0;
        int minIndex = 0;
        if (list.size() != 0) {
            min = list.get(0);
            minIndex = 0;
        } else {

        }

        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
                minIndex = i;
            }
        }


        return new Pair<Integer, Integer>(min, minIndex);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
