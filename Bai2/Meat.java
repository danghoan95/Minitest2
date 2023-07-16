package Bai2;

import java.time.LocalDate;

public class Meat extends Material  {
    private double weight;

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(int id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getAmount() {
        return getCost() * weight;
    }

    public LocalDate getExpiryDate() {
        LocalDate date = LocalDate.of(2023,7,10);
        LocalDate newDate = date.plusDays(7);
        setManufacturingDate(newDate);
        return getManufacturingDate();
    }

    public double getRealMoney() {
        int day = getManufacturingDate().getDayOfMonth()-LocalDate.now().getDayOfMonth();
        if (day<= 5) {
           return getCost()* 70/100;
        }else {
            return getCost()*90/100;
        }
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " Name: " + getName() + " Time: " + getExpiryDate() + " Cost: " + getCost() + " Weight: " + weight;
    }
}
