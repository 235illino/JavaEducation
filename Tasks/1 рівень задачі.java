/* 
Домашние животные
Отредактировать три класса: Pet (домашнее животное), Cat (кот) и Dog (собака).
Унаследовать кота и собаку от животного.


Требования:
1. В классе Solution должен быть public класс Pet (домашнее животное).
2. В классе Solution должен быть public класс Cat (кот).
3. В классе Solution должен быть public класс Dog (собака).
4. Класс Cat должен быть унаследован от класса Pet.
5. Класс Dog должен быть унаследован от класса Pet.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Pet {

    }

    public class Cat extends Pet {

    }

    public class Dog extends Pet {

    }
}
Лошадь и Пегас
Отредактировать два класса: Horse (лошадь) и Pegasus (пегас).
Унаследовать пегаса от лошади.


Требования:
1. В классе Solution должен быть класс Horse (лошадь).
2. Класс Horse должен быть public.
3. В классе Solution должен быть класс Pegasus (пегас).
4. Класс Pegasus должен быть public.
5. Класс Pegasus должен быть унаследован от класса Horse.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Horse {

    }

    public class Pegasus extends Horse {

    }
}
/* 
Межпланетная ферма
Написать шесть классов: Animal (животное), Cow (корова), Pig (свинья), Sheep (овца), Bull (бык) и Goat (козел).
Унаследовать корову, свинью, овцу, быка и козла от животного.


Требования:
1. В классе Solution должен быть public класс Animal (животное).
2. В классе Solution должен быть public класс Cow (корова).
3. В классе Solution должен быть public класс Pig (свинья).
4. В классе Solution должен быть public класс Sheep (овца).
5. В классе Solution должен быть public класс Bull (бык).
6. В классе Solution должен быть public класс Goat (козел).
7. Класс Cow должен быть унаследован от класса Animal.
8. Класс Pig должен быть унаследован от класса Animal.
9. Класс Sheep должен быть унаследован от класса Animal.
10. Класс Bull должен быть унаследован от класса Animal.
11. Класс Goat должен быть унаследован от класса Animal.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Animal {

    }

    public class Cow extends Animal {

    }

    public class Pig extends Animal {

    }

    public class Sheep extends Animal {

    }

    public class Bull extends Animal {

    }

    public class Goat extends Animal {

    }

}
Хороши работнички
Написать четыре класса: Employee (сотрудник), Manager (управляющий), Chief (директор) и Secretary (секретарь).
Унаследовать управляющего, директора и секретаря от сотрудника.


Требования:
1. В классе Solution должен быть public класс Employee (сотрудник).
2. В классе Solution должен быть public класс Manager (управляющий).
3. В классе Solution должен быть public класс Chief (директор).
4. В классе Solution должен быть public класс Secretary (секретарь).
5. Класс Manager должен быть унаследован от класса Employee.
6. Класс Chief должен быть унаследован от класса Employee.
7. Класс Secretary должен быть унаследован от класса Employee.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Manager extends Employee {

    }

    public class Chief extends Employee {

    }

    public class Employee {

    }

    public class Secretary extends Employee {

    }
}
ИТ-компания
Исправить девять классов: Worker (сотрудник), Clerk (клерк), IT (ИТ-специалист), Programmer (программист), ProjectManager (менеджер проекта), CTO (технический директор), HR (рекрутер), OfficeManager (офис-менеджер), Cleaner (уборщик).
Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
Унаследовать клерка и ИТ-специалиста от сотрудника.


Требования:
1. В классе Solution должен быть public класс Worker (сотрудник).
2. В классе Solution должен быть public класс Clerk (клерк).
3. В классе Solution должен быть public класс IT (ИТ-специалист).
4. В классе Solution должен быть public класс Programmer (программист).
5. В классе Solution должен быть public класс ProjectManager (менеджер проекта).
6. В классе Solution должен быть public класс CTO (технический директор).
7. В классе Solution должен быть public класс HR (рекрутер).
8. В классе Solution должен быть public класс OfficeManager (офис-менеджер).
9. В классе Solution должен быть public класс Cleaner (уборщик).
10. Классы Programmer, ProjectManager и CTO должны быть унаследованы от класса IT.
11. Классы HR, Cleaner и OfficeManager должны быть унаследованы от класса Clerk.
12. Классы Clerk и IT должны быть унаследованы от класса Worker.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Worker {

    }

    public class Clerk extends Worker {

    }

    public class IT extends Worker {

    }

    public class Programmer extends IT {

    }

    public class ProjectManager extends IT {

    }

    public class CTO extends IT {

    }

    public class OfficeManager extends Clerk {

    }

    public class HR extends Clerk {

    }

    public class Cleaner extends Clerk {

    }
}
/* 
Скрытный инкапсулированный кот
Скрыть все внутренние переменные класса Cat.


Требования:
1. Переменная name класса Cat должна быть скрыта.
2. Переменная age класса Cat должна быть скрыта.
3. Переменная weight класса Cat должна быть скрыта.
4. В классе Cat должны быть 3 переменные.
5. Все переменные класса Cat должны быть private.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
} 	
/* 
Наш кот слишком публичен!
Скрыть внутренние переменные класса Cat, к которым есть доступ с помощью методов.


Требования:
1. Переменная name класса Cat должна быть скрыта.
2. Переменная age класса Cat должна быть скрыта.
3. Переменная weight класса Cat должна быть открыта.
4. В классе Cat должны быть 3 переменные.
5. В Cat должны быть private и public переменные.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
Неприступный кот
Скрыть все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.


Требования:
1. Переменная name класса Cat должна быть скрыта.
2. Переменная age класса Cat должна быть скрыта.
3. Переменная weight класса Cat должна быть скрыта.
4. В Cat должны быть private и public методы.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}
	
/* 
Как кошка с собакой
Скрыть все внутренние переменные класса Cat и Dog.
Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.


Требования:
1. Переменные класса Cat должны быть скрыты.
2. Переменные класса Dog должны быть скрыты.
3. Методы класса Cat должы быть скрыты.
4. Методы класса Dog должы быть скрыты.
5. Методы, с помощью которых классы Cat и Dog взаимодействуют друг с другом, должны быть публичными.*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}
Не забываем инкапсулировать
Посмотри внимательно на методы и добавь недостающие поля.


Требования:
1. В классе Cat должно быть поле типа String с именем name.
2. В классе Cat должно быть поле типа int с именем age.
3. В классе Cat должно быть поле типа int с именем weight.
4. В классе Cat должно быть поле типа int с именем speed.
5. В классе Cat должны быть 4 поля.
6. Все поля класса Cat должны быть private.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat(String name, int age, int weight) {

        }

        public String getName() {
            return null;
        }

        public int getAge() {
            return 0;
        }

        public void setWeight(int weight) {

        }

        public void setSpeed(int speed) {

        }
    }
}
/* 
«Из ребра его»
Изменить два класса Adam (Адам) и Eve (Ева).
Унаследовать Еву от Адама.


Требования:
1. В классе Solution должен быть класс Adam (Адам).
2. Класс Adam должен быть public.
3. В классе Solution должен быть класс Eve (Ева).
4. Класс Eve должен быть public.
5. Класс Eve должен быть унаследован от класса Adam.*/

public class Solution {
    public static void main(String[] args) {
    }

    //Адам
    public class Adam {

    }

    //Ева
    public class Eve extends Adam {

    }
}
Заклятые друзья
Изменить два класса AppleIPhone и SamsungGalaxyS2.
Унаследовать SamsungGalaxyS2 от AppleIPhone.


Требования:
1. В классе Solution должен быть класс AppleIPhone.
2. Класс AppleIPhone должен быть public.
3. В классе Solution должен быть класс SamsungGalaxyS2.
4. Класс SamsungGalaxyS2 должен быть public.
5. Класс SamsungGalaxyS2 должен быть унаследован от класса AppleIPhone.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class AppleIPhone {

    }

    public class SamsungGalaxyS2 extends AppleIPhone {

    }
}
/* 
Играем в Дарвина
Изменить четыре класса: Fish (Рыба), Animal (Животное), Ape (Обезьяна), Human (Человек).
Унаследовать животное от рыбы, обезьяну от животного и человека от обезьяны.


Требования:
1. В классе Solution должен быть public класс Fish (Рыба).
2. В классе Solution должен быть public класс Animal (Животное).
3. В классе Solution должен быть public класс Ape (Обезьяна).
4. В классе Solution должен быть public класс Human (Человек).
5. Класс Animal должен быть унаследован от класса Fish.
6. Класс Ape должен быть унаследован от класса Animal.
7. Класс Human должен быть унаследован от класса Ape.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Fish {

    }

    public class Animal extends Fish {

    }

    public class Ape extends Animal {

    }

    public class Human extends Ape {

    }

}
Все мировые религии
Изменить три класса: Judaism (Иудаизм), Christianity (Христианство), Islam (Мусульманство).
Унаследовать христианство от иудаизма и мусульманство от христианства.


Требования:
1. В классе Solution должен быть public класс Judaism (Иудаизм).
2. В классе Solution должен быть public класс Christianity (Христианство).
3. В классе Solution должен быть public класс Islam (Мусульманство).
4. Класс Christianity должен быть унаследован от класса Judaism.
5. Класс Islam должен быть унаследован от класса Christianity.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Judaism {

    }

    public class Christianity extends Judaism {

    }

    public class Islam extends Christianity {

    }

}
package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int[] nums = new int[inputArray.length];

        for (int i = 0; i<nums.length; i++){
            nums[i] = inputArray[i];
        }

        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums.length-i-1; j++){
                if (nums[j]>nums[j+1]){
                    int tmp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        }// напишите тут ваш код


        return new Pair<Integer, Integer>(nums[0], nums[nums.length-1]);
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

//Минимакс
//Написать метод, который возвращает минимальное и максимальное числа в массиве.
//
//
//Требования:
//1. Программа не должна считывать данные с клавиатуры.
//2. Класс Pair не изменять.
//3. Метод main не изменять.
//4. Допиши реализацию метода getMinimumAndMaximum, он должен возвращать пару из минимума и максимума.
//5. Программа должна вывести правильный результат.
//6. Метод getMinimumAndMaximum не должен изменять массив inputArray.