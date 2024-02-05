public class Main {
    public static void main(String[] args) {

        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        var firstBoxerMass = 78.2;
        var secondBoxerMass = 82.7;
        System.out.println("Общая масса двух бойцов = " + (firstBoxerMass + secondBoxerMass));
        System.out.println("Разница между массами бойцов = " + (secondBoxerMass - firstBoxerMass));

        // Задача 7
        var mass1 = 98.7;
        var mass2 = 75.9;
        var remainder = mass1 % mass2;
        System.out.println(remainder);

        // Задача 8
        var workHoursTotal = 640;
        var workHoursPerWorker = 8;
        var workers = workHoursTotal / workHoursPerWorker;
        System.out.println("Всего работников в компании — " + workers + " человек");
        var newWorkers = workers + 94;
        var newWorkHoursTotal = newWorkers * workHoursPerWorker;
        System.out.println("Если в компании работает " + newWorkers + " человека, то всего " + newWorkHoursTotal + " часа работы может быть поделено между сотрудниками");
    }
}