package com.github.bzalyaliev.wycash;

class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.currency().equals(money.currency());
    }

    public String toString() {
        return amount + " " + currency;
    }
}
