public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");}

        System.out.println();
        System.out.println("Задача 2");

        int temperature = 3;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице ровно " + temperature + " градусов, непонятно, что делать");
        }


        System.out.println();
        System.out.println("Задача 3");

        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, то придется заплатить штраф");
        }

        System.out.println();
        System.out.println("Задача 4");

        int age2 = 24;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");
        }

        System.out.println();
        System.out.println("Задача 5");

        int childAge = 65;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        System.out.println();
        System.out.println("Задача 6");

        int numberOfPeople = 25;
        int seating = 60;
        int totalPlaces = 102;
        if (numberOfPeople < seating) {
            System.out.println("Если в вагоне " + numberOfPeople + " людей, то остались сидячие и стоячие места");}
        else if (numberOfPeople >= seating && numberOfPeople < totalPlaces) {
            System.out.println("Если в вагоне " + numberOfPeople + " людей, то остались только стоячие места");
        } else System.out.println("В вагоне не осталось мест");

        System.out.println();
        System.out.println("Задача 7");

        int one = 12;
        int two = 27;
        int three = 27;
        int max = one;
        if (two > max) { max = two; }
        else if (three > max) { max = three; }
        System.out.println("Максимальное число: " + max);



    }
}