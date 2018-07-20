package lesson3.practice_3.task2;

class Circle {
    double radius;

    /**
     * Необходимо дополнить класс таким образом, чтобы метод (поведение) calculateArea()
     * мог подсчитать площадь круга
     */
    /*
    Состояние объекта
    Необходимо добавить состояние
     */
    /*
    Необходимо дополнить конструктор класса так, чтобы при создании
    объекта менялось его состояние
     */
    public Circle(double newRadius) {
        radius = newRadius;
    }

    /*
    Поведение объекта
    Необходимо переделать поведение объекта
    таким образом, чтобы основываясь на состоянии можно было подсчитать площадь
     */
    double calculateArea() {
        double circleSquare = Math.PI * radius * radius;
        return circleSquare;
    }
}
