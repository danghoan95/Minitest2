package Bai1;

public class Main1 {
    public static void main(String[] args) {
//ProgrammingBook programmingBook = new ProgrammingBook(1,"book",100000,"kevin","vietnam","no");
//ProgrammingBook programmingBook1 = new ProgrammingBook(2,"book1",80000,"kevin1","vietnam","no");
//ProgrammingBook programmingBook2 = new ProgrammingBook(3,"book2",200000,"kevin2","vietnam","no");
//ProgrammingBook programmingBook3 = new ProgrammingBook(4,"book3",400000,"kevin3","vietnam","no");
//ProgrammingBook programmingBook4 = new ProgrammingBook(5,"book4",500000,"kevin4","vietnam","no");
//
//ProgrammingBook[] books ={programmingBook,programmingBook1,programmingBook2,programmingBook3,programmingBook4};
//
//FictionBook fictionBook =new FictionBook(1,"book5",50000,"kevin5","love language");
//FictionBook fictionBook1 =new FictionBook(2,"book6",60000,"kevin6","love language");
//FictionBook fictionBook2 =new FictionBook(3,"book7",70000,"kevin7","love language");
//FictionBook fictionBook3 =new FictionBook(4,"book8",80000,"kevin8","love language");
//FictionBook fictionBook4 =new FictionBook(5,"book9",90000,"kevin9","love language");

        Book programmingBook = new ProgrammingBook(1,"book",100000,"kevin","vietnam","no");
        Book programmingBook1 = new ProgrammingBook(2,"book1",80000,"kevin1","vietnam","no");
        Book programmingBook2 = new ProgrammingBook(3,"book2",200000,"kevin2","vietnam","no");
        Book programmingBook3 = new ProgrammingBook(4,"book3",400000,"kevin3","vietnam","no");
        Book programmingBook4 = new ProgrammingBook(5,"book4",500000,"kevin4","vietnam","no");



        Book fictionBook =new FictionBook(1,"book5",50000,"kevin5","Fiction ");
        Book fictionBook1 =new FictionBook(2,"book6",60000,"kevin6","Fiction 1");
        Book fictionBook2 =new FictionBook(3,"book7",70000,"kevin7","Fiction 1");
        Book fictionBook3 =new FictionBook(4,"book8",80000,"kevin8","Fiction ");
        Book fictionBook4 =new FictionBook(5,"book9",90000,"kevin9","Fiction 1");

        Book[] books ={programmingBook,programmingBook1,programmingBook2,programmingBook3,programmingBook4,
                fictionBook,fictionBook1,fictionBook2,fictionBook3,fictionBook4
        };
        double sum =0;
        for (Book value: books){
            sum += value.getPrice();
        }

        System.out.println(sum);
        int count =0;
        for (Book value : books) {
            if (value instanceof FictionBook) {
                FictionBook fi = (FictionBook)  value;
                if (((FictionBook) value).getCategory().equals("Fiction 1")) {
                    count++;
                }

            }
        }
        System.out.println(count);
        int count1 =0;
for(int i =0;i<books.length;i++){
    if (books[i].getPrice()<90000){
        count1 ++;
    }
}
        System.out.println(count1);
    }
}
