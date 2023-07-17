package Bai2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int id;
        Scanner scanner = new Scanner(System.in);

        Material crispyFlour = new CrispyFlour(1, "bột sắn", LocalDate.of(2023, 6, 13), 50000, 10);
        Material crispyFlour1 = new CrispyFlour(2, "bột đao", LocalDate.of(2022, 8, 20), 60000, 20);
        Material crispyFlour2 = new CrispyFlour(3, "bột chiên xù", LocalDate.of(2021, 7, 5), 70000, 40);
        List<Material> materialList = new ArrayList<>();
        materialList.add(crispyFlour);
        materialList.add(crispyFlour1);
        materialList.add(crispyFlour2);
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
    }
}
