package ru.netology.services;

public class RestCalc {
    public static void main(String[] args) {

        RestCalcService service = new RestCalcService();
        System.out.println("Количество месяцев отдыха в году = " + (service.calculate(100000, 60000, 150000)));
    }
}