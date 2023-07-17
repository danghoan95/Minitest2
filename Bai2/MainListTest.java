package Bai2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        LocalDate localDate;
        int cost;
        int quantity;
        float weight;
        int index;
        Material crispyFlour = new CrispyFlour(1, "bột sắn", LocalDate.of(2023, 6, 13), 50000, 10);
        Material crispyFlour1 = new CrispyFlour(2, "bột đao", LocalDate.of(2022, 8, 20), 60000, 20);
        Material crispyFlour2 = new CrispyFlour(3, "bột chiên xù", LocalDate.of(2021, 7, 5), 70000, 40);
        Material crispyFlour3 = new CrispyFlour(4, "bột chiên giòn", LocalDate.of(2022, 9, 10), 80000, 50);
        Material crispyFlour4 = new CrispyFlour(5, "bột gạo", LocalDate.of(2022, 12, 12), 90000, 30);

        Material meat = new Meat(6, "thịt chân giò", LocalDate.of(2023, 7, 12), 200000, 3);
        Material meat1 = new Meat(7, "thịt vai", LocalDate.of(2023, 7, 11), 200000, 3);
        Material meat2 = new Meat(8, "thịt ba chỉ", LocalDate.of(2023, 7, 10), 200000, 3);
        Material meat3 = new Meat(9, "thịt thăn", LocalDate.of(2023, 7, 13), 200000, 3);
        Material meat4 = new Meat(10, "thịt mông", LocalDate.of(2023, 7, 6), 200000, 3);

        List<Material> materialList = new ArrayList<>();
        materialList.add(crispyFlour);
        materialList.add(crispyFlour1);
        materialList.add(crispyFlour2);
        materialList.add(crispyFlour3);
        materialList.add(crispyFlour4);
        materialList.add(meat);
        materialList.add(meat1);
        materialList.add(meat2);
        materialList.add(meat3);
        materialList.add(meat4);

        int choie;
        int choie1;
        int choie2;
        int choie3;
        double money = 0;
        do {
            System.out.println("Menu :");
            System.out.println("1. AddProduct :");
            System.out.println("2. EditProduct ");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Discount");
            System.out.println("0. Exit");
            System.out.println("Enter choie: ");
            choie = Integer.parseInt(scanner.nextLine());
            switch (choie) {
                case 1:
                    System.out.println("1. AddProduct :");
                    choie1 = Integer.parseInt(scanner.nextLine());
                    switch (choie1) {
                        case 1:
                            System.out.println("1. CrispyFlour");
                            System.out.println("Enter id: ");
                            id = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter name: ");
                            name = scanner.nextLine();
                            System.out.println("Enter Local Date: ");
                            localDate = LocalDate.parse(scanner.nextLine());
                            System.out.println("Enter cost: ");
                            cost = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter quantity: ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            Material newCris = new CrispyFlour(id, name, localDate, cost, quantity);
                            materialList.add(newCris);
                            break;
                        case 2:
                            System.out.println("2. Meat");
                            System.out.println("Enter id: ");
                            id = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter name: ");
                            name = scanner.nextLine();
                            System.out.println("Enter Local Date: ");
                            localDate = LocalDate.parse(scanner.nextLine());
                            System.out.println("Enter cost: ");
                            cost = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Weight : ");
                            weight = Float.parseFloat(scanner.nextLine());
                            Material newMeat = new Meat(id, name, localDate, cost, weight);
                            materialList.add(newMeat);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("2. EditProduct ");
                    choie2 = Integer.parseInt(scanner.nextLine());
                    switch (choie2) {
                        case 1:
                            System.out.println("1. CrispyFlour");
                            System.out.println("Enter index : ");
                            index = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i < materialList.size(); i++) {
                                if (materialList.get(index) == materialList.get(i)) {
                                    System.out.println("Enter id: ");
                                    materialList.get(index).setId(scanner.nextInt());
                                    scanner.nextLine();
                                    System.out.println("Enter name: ");
                                    materialList.get(index).setName(scanner.nextLine());
                                    System.out.println("Enter Local Date: ");
                                    materialList.get(index).setManufacturingDate(LocalDate.parse(scanner.nextLine()));
                                    System.out.println("Enter cost: ");
                                    materialList.get(index).setCost(Integer.parseInt(scanner.nextLine()));
                                    System.out.println("Enter quantity: ");
                                    if (materialList.get(index) instanceof CrispyFlour) {
                                        ((CrispyFlour) materialList.get(index)).setQuantity(Integer.parseInt(scanner.nextLine()));
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("2. Meat");
                            System.out.println("Enter index : ");
                            index = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i < materialList.size(); i++) {
                                if (materialList.get(index) == materialList.get(i)) {
                                    System.out.println("Enter id: ");
                                    materialList.get(index).setId(scanner.nextInt());
                                    scanner.nextLine();
                                    System.out.println("Enter name: ");
                                    materialList.get(index).setName(scanner.nextLine());
                                    System.out.println("Enter Local Date: ");
                                    materialList.get(index).setManufacturingDate(LocalDate.parse(scanner.nextLine()));
                                    System.out.println("Enter cost: ");
                                    materialList.get(index).setCost(Integer.parseInt(scanner.nextLine()));
                                    scanner.nextLine();
                                    System.out.println("Enter weight: ");
                                    if (materialList.get(index) instanceof Meat) {
                                        ((Meat) materialList.get(index)).setWeight(Integer.parseInt(scanner.nextLine()));
                                    }
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("3. Delete");
                    System.out.println("Enter index");
                    int index1 = Integer.parseInt(scanner.nextLine());
                    materialList.remove(index1);
                case 4:
                    for (Material material : materialList) {
                        System.out.println(material.toString());
                    }
                    break;
                case 5:
                    System.out.println("5. Discount id :");
                    id = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < materialList.size(); i++){
                        if(materialList.get(i).getId()==id){
                            if(materialList.get(i) instanceof  CrispyFlour){
                                System.out.println( ((CrispyFlour) materialList.get(i)).getAmount());
                                System.out.println( ((CrispyFlour) materialList.get(i)).getRealMoney());
                            }
                            if (materialList.get(i) instanceof Meat){
                                System.out.println(( (Meat) materialList.get(i)).getAmount());
                                System.out.println(( (Meat) materialList.get(i)).getRealMoney());
                            }
                        }
                    }


                        case 0:
                    System.exit(0);
            }

        } while (choie != 0);


    }

}

