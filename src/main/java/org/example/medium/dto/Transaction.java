package org.example.medium.dto;

import java.time.LocalDate;

public class Transaction {
    private String id;
    private LocalDate date;
    private double amount;

    public Transaction(String id, LocalDate date, double amount) {
        this.amount = amount;
        this.date = date;
        this.id = id;
    }

    public String getId() {return id;}
    public double getAmount() {return amount;}
    public LocalDate getDate() {return date;}

    @Override
    public String toString() {
        return id +" "+date + " " + amount;
    }
}
