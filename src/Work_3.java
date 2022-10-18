public class Work_3 {
    public static void main(String[] args) {
        System.out.println("Задача 6.");
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var totalWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println(totalWeight);
        var weightDifference = boxerOneWeight - boxerTwoWeight;
        System.out.println(weightDifference);
        weightDifference = boxerTwoWeight - boxerOneWeight;
        System.out.println(weightDifference);
        weightDifference = boxerTwoWeight % boxerOneWeight;
        System.out.println(weightDifference);

        System.out.println("Задача 7.");
        var hour = 640;
        var workHours = 8;
        var employee = hour / workHours;
        System.out.println("Всего работников в компании – " + employee + " человек");

        System.out.println("Задача 8.");
        var newEmployee = employee + 94;
        var newWorkHour = hour * newEmployee;
        System.out.println("Если в компании работает " + newEmployee + " человек, то всего " + newWorkHour + " часа работы может быть поделено между сотрудниками");
    }
}
