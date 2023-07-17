package Bai2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
        setManufacturingDate(getManufacturingDate().plusYears(1));
        return getManufacturingDate();
    }

    public double getRealMoney() {
        long mouth = ChronoUnit.MONTHS.between(LocalDate.now(),getExpiryDate());
        if (mouth <= 2 && mouth >= 0) {
            System.out.println("discounted Price 40%");
            return getAmount() * 60 / 100;
        } else if (mouth <= 4 && mouth > 2) {
            System.out.println("discountedPrice 20%");
            return getAmount() * 80 / 100;
        } else if (mouth < 12 && mouth > 4) {
            System.out.println("discountedPrice 10%");
            return getAmount() * 90 / 100;
        } else {
            System.out.println("hết hạn sử dụng");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " Name: " + getName() + " Time: " + getExpiryDate() + " Cost: " + getCost() + " Quantity: " + quantity;
    }
}
