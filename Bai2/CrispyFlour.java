package Bai2;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour() {
        super();
    }

    public CrispyFlour(int id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate date = LocalDate.of(2023,5,10);
        LocalDate newdate = date.plusYears(1);
        setManufacturingDate(newdate);
        return getManufacturingDate();
    }
    public double  getRealMoney() {
        int day = getManufacturingDate().getDayOfMonth()-LocalDate.now().getDayOfMonth();
        if (day <= 60) {
            System.out.println("discountedPrice 40%");
            return getCost()*60/100;
        }else if(day <=120) {
            System.out.println("discountedPrice 20%");
            return getCost()*80/100;
        }else {
            System.out.println("discountedPrice 10%");
            return getCost()*90/100;
        }
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " Name: " + getName() + " Time: " + getExpiryDate() + " Cost: " + getCost() + " Quantity: " + quantity;
    }
}
