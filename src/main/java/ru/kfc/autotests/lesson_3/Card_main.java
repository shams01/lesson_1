package ru.kfc.autotests.lesson_3;

public class Card_main {
    public static void main(String[] args) {
        StudentCard studentCard = new StudentCard(1300);
        BlackCard blackCard = new BlackCard(5000);

        studentCard.deposit(1500);
        studentCard.makePurchase(2000);
        studentCard.makePurchase(3000);
        System.out.println(studentCard.getBalance());
        studentCard.displayCardInfo();

        System.out.println("////////////////////////////////////////");

        blackCard.deposit(1500);
        blackCard.makePurchase(2000);
        blackCard.makePurchase(3000);
        System.out.println(blackCard.getBalance());
        blackCard.displayCardInfo();
    }
}
