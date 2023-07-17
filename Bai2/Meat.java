package Bai2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

        setManufacturingDate(getManufacturingDate().plusDays(7));
        return getManufacturingDate();
    }

    public double getRealMoney() {
        long day = ChronoUnit.DAYS.between(LocalDate.now(), getExpiryDate());
        if (day<= 5) {
           return getAmount()* 70/100;
        }else {
            return getAmount()*90/100;
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
