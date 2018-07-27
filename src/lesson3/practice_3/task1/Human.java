package lesson3.practice_3.task1;

class Human {
    String name;
    int age;

    /**
     * Тема: Состояние и поводение объектов
     * <p>
     * Задание 1: Дополнить класс таким образом, чтобы при создании экземпляра класса Human
     * было имя и возраст.
     */

    /*
    Состояние объекта

    Необходимо добавить состояние объекта. В качестве состояния у данного объекта есть два поля
    имя и возраст.

    Имя: тип данных String (любая строка), название переменной (поля) name
    Возраст, тип данных int (целочисленные значения), название переменной (поля) age

    String name;
    int age;
     */

    /*
    Конструктор класса
    Необходимо дополнить конструктор класса таким образом,
    чтобы при создании экземпляра класса (объекта)
    в поля name и age передавались значения поступившие в конструктор (аргументы)
     */

    Human(String newName, int newAge) {
        name = newName;
        age = newAge;
        //this.name = name;
        //this.age = age;
    }

    /*
    Поведение объекта
    Необходимо дополнить методы getName() и getAge() таким образом,

    - чтобы getName() возвращал текущее имя объекта
    - чтобы getAge() возвращал текущий возраст пользователя
     */

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}