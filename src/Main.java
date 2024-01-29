public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }else{
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задание 2");
        int temperature = 5;
        if (temperature < 5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }else{
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задание 3");
        int speed = 60;
        if (speed <= 60){
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }else{
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        System.out.println("Задание 4");
        int years = 25;
        if (years >= 2 && years <= 6){ // При написании:(2 <= years <= 6), выдовал ошибку. С чем это может быть связано?
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад.");
        }else if (years >= 7 && years <= 17){
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить  ходить в школу.");
        }else if (years >= 18 && years <= 24){
            System.out.println("Если возраст человека равен " + years + ", то его место в университете.");
        }else if (years > 24){
            System.out.println("Если возраст человека равен " + years + ", то ему пора ходить на работу.");
        }
        System.out.println("Задание 5");
        int yearsChild = 14;
        int adult = 1;
        if (yearsChild < 5){
            System.out.println("Если возраст ребенка равен " + yearsChild + ", то ему нельзя кататься на аттракционе.");
        }else if (yearsChild >= 5 && yearsChild < 14 && adult >= 1){
            System.out.println("Если возраст ребенка равен " + yearsChild + ", то ему можно кататься на аттракционе в сопровождении.");
        }else if (yearsChild >= 14){
            System.out.println("Если возраст ребенка равен " + yearsChild + ", то ему можно кататься без сопровождения взрослого");
        }
        System.out.println("Задание 6");
        int sittingPlaces = 60;
        int maxPlaces = 102;
        int human = 103;
        if (human <= sittingPlaces && human <= maxPlaces){
            System.out.println("Место в вагоне сидячее");
        }else if (human > sittingPlaces && human <= maxPlaces){
            System.out.println("Место в вагоне стоячее");
        }else if (human > maxPlaces){
            System.out.println("Мест в вагоне нет");
        }
        System.out.println("Задание 7");
        int one = 15;
        int two = 18;
        int three = 25;
        if (three > two && three > one){
            System.out.println("Наибольшее число: " + three);
        }else if (two > three && two > one){
            System.out.println("Наибольшее число: " + two);
        }else if (one > two && one > three){
            System.out.println("Наибольшее число: " + one);
        }









    }
}