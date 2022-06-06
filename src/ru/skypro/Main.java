package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte bananasWeight = 1;
        byte orangesWeight = 2;
        byte meatWeight = 1;
        byte potatoesWeight = 3;
        double peppersWeight = 0.4;

        double productsWeight = bananasWeight + orangesWeight + meatWeight + potatoesWeight + peppersWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг");
    }
}
