/* 
My first thread
Создать public static class TestThread - нить с интерфейсом Runnable.
TestThread должен выводить в консоль "My first thread".


Требования:
1. Добавь в класс Solution публичный статический класс TestThread.
2. Класс TestThread должен реализовывать интерфейс Runnable.
3. Метод run класса TestThread должен выводить "My first thread".
4. Программа должна вывести "My first thread".
5. Метод main не изменять.*/

public class Solution {

    public static class TestThread implements Runnable {

        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }

    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
}
/* 
My second thread
1. Создать public static класс TestThread, унаследованный от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
3. Метод run должен выводить в консоль "it's a run method".


Требования:
1. Добавь в класс Solution публичный статический класс TestThread.
2. Класс TestThread должен быть унаследован от класса Thread.
3. Класс TestThread не должен реализовывать какие-либо дополнительные интерфейсов.
4. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
5. Метод run класса TestThread должен выводить "it's a run method".
6. Метод main не изменять.*/

public class Solution {

    public static class TestThread extends Thread {

        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }

    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }
}
/* 
Список и нити
В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.


Требования:
1. В методе main создай 5 объектов типа SpecialThread.
2. В методе main создай 5 объектов типа Thread.
3. Добавь 5 разных нитей в список list.
4. Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
5. Метод run класса SpecialThread должен выводить "it's a run method inside SpecialThread".*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
       SpecialThread a1 = new SpecialThread();
       SpecialThread a2 = new SpecialThread();
       SpecialThread a3 = new SpecialThread();
       SpecialThread a4 = new SpecialThread();
       SpecialThread a5 = new SpecialThread();

       list.add(new Thread(a1));
       list.add(new Thread(a2));
       list.add(new Thread(a3));
       list.add(new Thread(a4));
       list.add(new Thread(a5));

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
/* 
Вывод стек-трейса
1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
2. SpecialThread должен выводить в консоль свой стек-трейс.

Подсказка: main thread уже выводит в консоль свой стек-трейс.


Требования:
1. Добавь в класс Solution публичный статический класс SpecialThread.
2. Класс SpecialThread не должен быть унаследован от какого-либо дополнительного класса.
3. Класс SpecialThread должен реализовывать интерфейс Runnable.
4. Метод run класса SpecialThread должен выводить свой стек-трейс.*/

public class Solution {

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Thread thread = new Thread(new SpecialThread());
            thread.start();

            System.out.println("*****************");

            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
/* 
Поговорим о музыке
1. Измени класс Violin так, чтоб он стал таском для нити. Используй интерфейс MusicalInstrument
2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
2.1. Считай время начала игры - метод startPlaying().
2.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
2.3. Считай время окончания игры - метод stopPlaying().
2.4. Выведи на консоль продолжительность игры в миллисекундах. Используй методы из пунктов 2.1 и 2.3.

Пример "Playing 1002 ms".


Требования:
1. Класс Violin не должен быть унаследован от какого-либо дополнительного класса.
2. Класс Violin должен реализовывать интерфейс MusicalInstrument.
3. Метод run класса Violin должен вызывать метод startPlaying.
4. Метод run класса Violin должен вызывать метод sleepNSeconds с параметром 1 секунда.
5. Метод run класса Violin должен вызывать метод stopPlaying.
6. Метод run класса Violin должен выводить на консоль продолжительность игры в миллисекундах. Используй формат из примера.

Метод run класса Violin должен выводить на консоль продолжительность игры в миллисекундах. Используй формат из примера.


*/

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {

        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }

        @Override
        public void run() {
            Date start = startPlaying();
            sleepNSeconds(1);
            Date finish = stopPlaying();
            long timeSpent = finish.getTime() - start.getTime();
            System.out.println( "Playing " + timeSpent + " ms");
        }
    }
}
package com.javarush.task.task16.task1606;

import java.util.ArrayList;
import java.util.List;

/* 
join: в нужное время в нужном месте
Подумай, в каком месте и для какого объекта нужно вызвать метод join, чтобы результат выводился по-порядку
сначала для firstThread, а потом для secondThread.
Вызови метод join в нужном месте.

Пример вывода:
firstThread : String 1
firstThread : String 2
...
firstThread : String 19
firstThread : String 20
secondThread : String 1
...
secondThread : String 20


Требования:
1. Метод main должен вызывать метод join для объекта firstThread.
2. Метод main не должен вызывать метод join для объекта secondThread.
3. Метод main не должен вызывать System.out.println() или System.out.print().
4. Вывод программы должен соответствовать примеру из задания.*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        PrintListThread firstThread = new PrintListThread("firstThread");
        PrintListThread secondThread = new PrintListThread("secondThread");
        firstThread.start();
        firstThread.join();
        secondThread.start();
    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<String>();
        if (n < 1) return result;

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }

    public static class PrintListThread extends Thread {
        public PrintListThread(String name) {
            super(name);
        }

        public void run() {
            printList(getList(20), getName());
        }
    }
}

join

/* 
Расставь вызовы методов join()
1. Разберись, что делает программа.
2. Расставь вызовы методов join() так, чтобы для каждой кошки выполнялось следующее:
2.1. Сначала кошка рожает котят.
2.2. Потом все котята вылазят из корзинки в произвольном порядке.
2.3. В конце кошка собирает их назад в корзинку.
2.4. Все события для одной кошки могут быть перемешаны с событиями для другой кошки.
2.5. Добавить сон котят (200 мс) в investigateWorld.


Требования:
1. У каждого котенка (объекта типа Kitten) должен быть вызван метод join.
2. Метод investigateWorld должен обеспечивать сон котенка на 200 мс. Используй метод Thread.sleep(200).
3. Программа должна создавать две кошки и четыре котенка.
4. Методы, которые отвечают за вывод в консоль, не изменять.
5. Вывод программы должен отображать выполнение требований условия.*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушинка");
    }

    private static void investigateWorld() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Котенок 1, мама - " + getName());
            kitten2 = new Kitten("Котенок 2, мама - " + getName());
            start();
        }

        public void run() {
            System.out.println(getName() + " родила 2 котенка");
            try {

                initAllKittens();
                kitten1.join();
                kitten2.join();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten2.start();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", вылез из корзинки");
            investigateWorld();
        }
    }
}

/* 
Horse Racing
Разберись, что делает программа.
Реализуй метод calculateHorsesFinished.
Он должен:
1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
2. Если лошадь еще не пришла к финишу (!isFinished()), то:
2.1. Вывести в консоль "Waiting for " + horse.getName().
2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
2.3. Не считать такую лошадь финишировавшей.


Требования:
1. Метод calculateHorsesFinished должен вернуть количество финишировавших лошадей.
2. Метод calculateHorsesFinished должен вызывать метод isFinished у каждой лошади из переданного списка.
3. Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished должен вывести в консоль "Waiting for " + horse.getName().
Пример сообщения для первой лошади: "Waiting for Horse_01".
4. Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished должен подождать пока она финиширует. Используй правильный метод для ожидания.
5. После завершения работы программы, консоль должна содержать информацию о том, что все лошади финишировали. Пример сообщения для первой лошади: "Horse_01 has finished the race!".*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        for (int i = 0; i < horses.size(); i++){
            Horse horse = horses.get(i);
            if (!horse.isFinished()) {
                horse = horses.get(i);
                System.out.println("Waiting for " + horse.getName());
                horse.join();
           }
           else {
                finishedCount += 1;
            }
        }//напишите тут ваш код
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   // Delay
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}


/* 
Продвижение на политических дебатах
1. Разберись, что делает программа.
2. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
3. Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.


Требования:
1. Вызови метод join у нужного объекта.
2. Метод toString класса политик Politician должен выводить сколько речей сказал политик, например: "Иванов сказал речь 35 раз".
3. Программа должна создавать 3 объекта типа Politician.
4. Методы, которые отвечают за вывод в консоль, не изменять.
5. Вывод программы должен свидетельствовать о том, что Иванов сказал больше всего речей на политических дебатах.*/

public class Solution {
    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Иванов");
        ivanov.join();
        Politician petrov = new Politician("Петров");
        Politician sidorov = new Politician("Сидоров");
        while (ivanov.getSpeechCount() + petrov.getSpeechCount() + sidorov.getSpeechCount() < totalSpeechCount) {
        }

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politician extends Thread {
        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getSpeechCount());
        }
    }
}

sleep

/* 
Часы
1. Разберись, что делает программа.
2. Реализуй логику метода printTikTak:
2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik
2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak


Требования:
1. Метод printTikTak должен выводить две строчки: "Tik" и "Tak".
2. Метод printTikTak должен работать примерно секунду.
3. Метод printTikTak должен два раза заснуть на полсекунды. Используй метод Thread.sleep(500).
4. В консоли не должно быть сообщений после фразы "Double-check".
5. Метод main должен создавать объект типа Clock.
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
            Thread.sleep(500);
            System.out.println("Tik");
            Thread.sleep(500);
            System.out.println("Tak");//add your code here - добавь код тут
        }
    }
}

* 
Stopwatch (Секундомер)
1. Разберись, что делает программа.
2. Реализуй логику метода doStep так, чтобы учитывалась скорость бегуна.
2.1. Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун.
Нужно, чтобы бегун действительно делал заданное количество шагов в секунду.
Если Иванов делает 4 шага в секунду, то за 2 секунды он сделает 8 шагов.
Если Петров делает 2 шага в секунду, то за 2 секунды он сделает 4 шага.
2.2. Метод sleep в классе Thread принимает параметр типа long.

ВАЖНО! Используй метод Thread.sleep(), а не Stopwatch.sleep().


Требования:
1. Метод getSpeed должен возвращать int.
2. Поле speed класса Runner должно иметь тип int.
3. Конструктор класса Runner должен принимать String и int.
4. Метод doStep должен учитывать скорость бегуна. Если скорость бегуна 2 шага в секунду, метод должен работать пол секунды; если скорость бегуна 4 шага в секунду, метод должен работать четверть секунды.
5. Вывод программы должен отображать сколько шагов сделали Иванов и Петров за 2 секунды.*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner ivanov = new Runner("Ivanov", 4);
        Runner petrov = new Runner("Petrov", 2);
        //на старт!
        //внимание!
        //марш!
        ivanov.start();
        petrov.start();
        Thread.sleep(2000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException e) {
            }
        }

        private void doStep() throws InterruptedException {
            stepNumber++;
            long l = 1000/owner.getSpeed();
            Thread.sleep(l);//add your code here - добавь код тут
            System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
        }
    }

    public static class Runner {
        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }
}


package com.javarush.task.task16.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем секунды
1. Напиши реализацию метода run в нити Stopwatch (секундомер).
2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
3. Выведи количество секунд в консоль.


Требования:
1. Метод run класса Stopwatch (секундомер) должен содержать цикл.
2. Метод run должен вызывать Thread.sleep(1000).
3. Метод run должен увеличивать значение поля seconds на 1 каждую секунду.
4. После прерывания работы нити Stopwatch (вызова метода interrupt), метод run должен вывести количество секунд (seconds) в консоль.
5. В классе Stopwatch должен быть только один метод run.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;
        public void run() {
            try { while (!isInterrupted()){
                Thread.sleep(1000);
                seconds++;}

                //add your code here - добавьте код тут
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}


package com.javarush.task.task16.task1618;

/* 
Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().


Требования:
1. Класс TestThread должен быть унаследован от Thread.
2. Класс TestThread должен иметь public void метод run.
3. Метод main должен создавать объект типа TestThread.
4. Метод main должен вызывать метод start у объекта типа TestThread.
5. Метод main должен вызывать метод interrupt у объекта типа TestThread.*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();//Add your code here - добавь код тут
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        @Override
        public void run() {
            super.run();
        }
    }
}

/* 
А без interrupt слабо?
Разберись, как работает программа.
Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.


Требования:
1. В классе Solution должен быть публичный статический метод ourInterruptMethod без параметров.
2. Метод run должен выводить надпись "he-he" каждые пол секунды, пока не будет вызван метод ourInterruptMethod.
3. Необходимо изменить условие цикла while в методе run.
4. Метод main должен создавать объект типа Thread передавая в конструктор объект типа TestThread.
5. Метод main должен вызывать метод start у объекта типа Thread.
6. Метод main должен вызывать метод ourInterruptMethod.*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }
    public static boolean isCancel;

    public static void ourInterruptMethod() {
        isCancel = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!Solution.isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

/* 
Thread.currentThread - всегда возвращает текущую нить
1. В методе printMsg присвой переменной t текущую нить.
2. В методе printMsg после всех действий поставь задержку в 1 миллисекунду.


Требования:
1. Метод printMsg должен получать текущую нить с помощью Thread.currentThread.
2. Метод printMsg должен должен усыплять нить на 1 миллисекунду.
3. Метод printMsg должен вызывать метод getName у текущей нити.
4. Метод main должен вызвать метод printMsg у объекта типа ThreadNamePrinter 5 раз.
5. Метод run должен вызвать метод printMsg 5 раз.
6. Метод printMsg у объекта типа ThreadNamePrinter суммарно должен быть вызван 10 раз.*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) throws InterruptedException {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    printMsg();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printMsg() throws InterruptedException {
            Thread t = Thread.currentThread();//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("Name=" + name);
            Thread.sleep(1);//add sleep here - добавь sleep тут
        }
    }
}

package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с numSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].

Пример для numSeconds=4 :
"4 3 2 1 Прервано!"

4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для numSeconds=3 :
"3 2 1 Марш!"

PS: метод sleep выбрасывает InterruptedException.


Требования:
1. Метод run класса RacingClock должен содержать цикл.
2. Объект класса RacingClock должен каждую секунду уменьшать значение переменной numSeconds на единицу.
3. Метод main должен вызывать Thread.sleep(3500).
4. Метод main должен вызывать метод interrupt у объекта clock.
5. Если numSeconds равно 3, то программа должна вывести "3 2 1 Марш!".
6. Если numSeconds равно 4, то программа должна вывести "4 3 2 1 Прервано!".*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
//        System.out.println(clock.isDaemon());
//        clock.setDaemon(false);
        Thread.sleep(3500);
        clock.interrupt();
//        clock.interrupt();//add your code here - добавь код тут
    }

        public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
           while (numSeconds > 0){

               try {
                   System.out.print(numSeconds + " ");
                   numSeconds--;
                   Thread.sleep(1000);
//                   Thread.currentThread().interrupt();

               } catch (InterruptedException e) {
                   System.out.print("Прервано!");
                   return;
               }

           }
            System.out.println("Марш!");//add your code here - добавь код тут
        }
    }
}

* 
Один для всех, все - для одного
1. Разберись, как работает программа.
1.1. Обрати внимание, что объект Water - один для всех нитей.
2. Реализуй метод ourInterruptMethod, чтобы он прерывал все нити из threads.
3. В методе run исправь значения переменных:
3.1. isCurrentThreadInterrupted - должна равняться значению метода isInterrupted у текущей нити.
3.2. threadName - должна равняться значению метода getName (реализовано в классе Thread) у текущей нити.


Требования:
1. Метод ourInterruptMethod должен прервать все нити из списка threads.
2. Метод run должен получать текущую нить с помощью Thread.currentThread.
3. Метод run должен использовать метод isInterrupted текущей нити.
4. Метод run должен использовать метод getName текущей нити.
5. Метод main должен работать примерно 3 сек.*/

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<Thread>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        for (int i = 0; i < threadCount; i++) {
            threads.get(i).interrupt();
        }
        //add your code here - добавь код тут
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables - исправь 2 переменных
            Thread thread = Thread.currentThread();
            boolean isCurrentThreadInterrupted = thread.isInterrupted();
            String threadName = thread.getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Объект " + sharedResource + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                isCurrentThreadInterrupted=true;
            }
        }
    }
}

/* 
Рекурсивное создание нитей
1. Измени класс GenerateThread так, чтобы он стал нитью.
2. Создай конструктор GenerateThread, который должен:
2.1. Вызвать конструктор суперкласса с параметром String - номером созданной нити. Используй createdThreadCount.
2.2. Запустить текущую нить.
2.3. Номер первой нити должен начинается с 1.
3. Переопредели метод toString, для этого внутри GenerateThread нажми Alt+Insert -> Override Methods. Начни печатать toString.
3.1. Метод toString должен возвращать № текущей нити и слово " created". Используй getName().

Пример:
8 created

4. Пока количество созданных нитей меньше Solution.count метод run должен:
4.1. Создать новую нить типа GenerateThread.
4.2. Вывести в консоль созданную в пункте 4.1 нить.
5. В итоге должно быть выведено в консоль 15 строк.


Требования:
1. Класс GenerateThread должен быть унаследован от Thread.
2. В классе GenerateThread должен быть открытый конструктор без параметров.
3. Конструктор класса GenerateThread должен увеличивать значение createdThreadCount и передавать его в виде строки в конструктор суперкласса.
4. Конструктор класса GenerateThread должен запускать нить.
5. Метод toString класса GenerateThread должен возвращать имя нити и слово " created". Пример: "8 created".
6. Если количество созданных нитей меньше Solution.count, метод run должен создать новую нить типа GenerateThread.
7. Если количество созданных нитей меньше Solution.count, метод run должен вывести созданную нить в консоль.
8. Вывод программы должен соответствовать заданию, показывать, что все 15 нитей были созданы.*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        public static String n = "" + createdThreadCount;

        public GenerateThread() {

            super(GenerateThread.n);

//          System.out.println(createdThreadCount);


            start();
            createdThreadCount++;
            n = "" + createdThreadCount;
        }

        public void run() {
            if (createdThreadCount-1 < Solution.count) {



                GenerateThread thread = new GenerateThread();

                try {
                    thread.join();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println(thread);

            }

        }

        @Override
        public String toString() {
            return getName() + " created";
        }
    }
}
    
/* 
Взаимная блокировка
1. Разберись, как работает программа.
2. Не меняя классы T1 и T2 сделай так, чтобы их нити завершились, не обязательно успешно.
3. Метод sleep не использовать.


Требования:
1. Метод main должен запускать нить t1.
2. Метод main должен запускать нить t2.
3. Класс T1 не изменять.
4. Класс T2 не изменять.
5. Метод sleep не использовать.
6. Вывод программы должен состоять из 2х строк, информирующих о завершении нитей. Например: "T1 was interrupted" и "T2 finished".
7. Нити t1 и t2 должны завершаться (не обязательно успешно).*/

public class Solution {
    static Thread t1 = new T1();
    static Thread t2 = new T2();

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t2.start();
        t1.interrupt();
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            try {
                t2.join();
                System.out.println("T1 finished");
            } catch (InterruptedException e) {
                System.out.println("T1 was interrupted");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            try {
                t1.join();
                System.out.println("T2 finished");
            } catch (InterruptedException e) {
                System.out.println("T2 was interrupted");
            }
        }
    }
}

//Создание по образцу
//        Разберись, как работает программа.
//        По образу и подобию CountdownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number.
//
//
//        Требования:
//        1. Класс CountUpRunnable должен реализовывать интерфейс Runnable.
//        2. Класс CountUpRunnable должен иметь публичный метод run без параметров.
//        3. Метод run класса CountUpRunnable должен работать примерно 2,5 секунды.
//        4. Метод run класса CountUpRunnable должен каждые полсекунды выводить имя потока, двоеточие и значение счетчика от 1 до 5 (например: "Увеличиваем: 1").
//        5. Метод run класса CountUpRunnable должен вызывать Thread.sleep(500).

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexDown = 1;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    Thread.sleep(500);
                    countIndexDown += 1;
                    if (countIndexDown == Solution.number+1) return;

                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //read count of strings
        int count = Integer.parseInt(reader.readLine());

        //init threads
        ReaderThread consolReader1 = new ReaderThread();
        ReaderThread consolReader2 = new ReaderThread();
        ReaderThread consolReader3 = new ReaderThread();

        consolReader1.start();
        consolReader2.start();
        consolReader3.start();

        while (count > readStringCount.get()) {
        }

        consolReader1.interrupt();
        consolReader2.interrupt();
        consolReader3.interrupt();
        System.out.println("#1:" + consolReader1);
        System.out.println("#2:" + consolReader2);
        System.out.println("#3:" + consolReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<String>();

        public void run() {
            while (!Thread.currentThread().isInterrupted()){
                try {
                    if(reader.ready()) {
                        String s =reader.readLine();
                        readStringCount.incrementAndGet();
                        result.add(s);
                    }

                } catch (IOException e) {
                }
            }//add your code here - добавьте код тут
        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
//Только по-очереди!
//        1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
//        2. В методе run реализовать чтение с консоли трех строк.
//        3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
//        4. В методе main вывести результат для каждой нити.
//        5. Используй join.
//
//        Пример:
//
//        Входные данные:
//        a
//        b
//        c
//        d
//        e
//        f
//
//        Выходные данные:
//        a b c
//        d e f
//
//
//        Требования:
//        1. Объяви в классе Solution public static класс Read3Strings.
//        2. Класс Read3Strings должен быть унаследован от Thread.
//        3. Метод run класса Read3Strings должен считывать три строки.
//        4. Класс Read3Strings должен содержать публичный метод printResult.
//        5. Метод printResult должен выводить в консоль 3 считанные строки, разделив их пробелами.
//        6. Метод main должен вызывать методы start у созданных нитей.
//        7. Метод main должен вызывать методы join у созданных нитей.
//        8. Вывод программы должен отображать, что потоки считывали строки последовательно, а не параллельно.

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();//add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

   public static class Read3Strings extends Thread{
       private List<String> result = new ArrayList<>();
       @Override
       public void run() {

           for (int i = 0; i < 3; i++) {
               String s = null;
               try {
                   s = reader.readLine();
               } catch (IOException e) {
                   e.printStackTrace();
               }
               result.add(s);

               }
           }
       public void printResult() {
           for (int i = 0; i < 3; i++) {
               System.out.print(result.get(i) + " ");
           }
       }
       }
   }  //add your code here - добавьте код тут
