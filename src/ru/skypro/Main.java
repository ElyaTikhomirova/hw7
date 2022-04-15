package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.print("ФИО сотрудника - " + fullName);

        // Задание 2
        System.out.println();
        String full = fullName.toUpperCase();
        System.out.print("Данные ФИО сотрудника для заполнения отчета - " + full);

        //Задание 3
        System.out.println();
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.print("Данные ФИО сотрудника - " + fullName1);


    }
}
