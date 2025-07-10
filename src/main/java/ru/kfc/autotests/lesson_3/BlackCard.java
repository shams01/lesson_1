package ru.kfc.autotests.lesson_3;

public class BlackCard implements CardMethods{
    private String cardName;
    private double balance;
    private double bonus;

    public BlackCard(double balance){
        this.cardName = "Бонусная дебетовая карта";
        this.balance = balance;
        this.bonus = 0;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            bonus += amount * 0.0005;
        }
    }

    @Override
    public boolean makePurchase(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public void displayCardInfo() {
        System.out.println("Информация по карте:");
        System.out.println("  Имя карты: " + cardName);
        System.out.println("  Баланс: " + balance);
        System.out.println("  Бонусные баллы: " + bonus);
    }
}
