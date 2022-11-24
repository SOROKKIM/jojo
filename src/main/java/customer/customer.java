package customer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
public class customer {
    String customerName;
    int customerAccount;
    int customerTotal;
    String check;
    LocalDateTime time;
    public LocalDateTime getTime() {
        return time;
    } // 시간기록

    public String getCustomerName() {
        return customerName; //소유주명
    }
    public int getCustomerAccount() {
        return customerAccount; // 계좌번호
    }
    public int getCustomerTotal() {
        return customerTotal; // 잔고
    }
    public String getcheck() {return check;}

    public customer(String customerName, int customerAccount, int customerTotal, String check) {
        this.customerName = customerName;
        this.customerAccount = customerAccount;
        this.customerTotal = customerTotal;
        this.check = check;
        this.time = LocalDateTime.now();
    }
    public String toString() {
        return "{" + "성 명 : " + customerName + ", 계좌번호 : " + customerAccount + ", 잔 고 :" + customerTotal +", "+ check +"시간 :"+time+ '}';
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<customer> customer = new ArrayList<>();
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);

        while (true){
            System.out.println(" -----------메모작성 프로그램---------------- ");
            System.out.println("|   1. 입금    2. 출금    3. 잔고확인        ㅣ");
            System.out.println(" --------------------------------------- ");

            System.out.print("👩🏻‍🎓메뉴 중 하나를 선택해주세요👩🏻‍🎓 : ");
            int menu = sc.nextInt();

            if (menu == 6) break;
            switch(menu){
                case 1:

                    customer n = new customer("홍길동",232,2223,"입금", 1234);
                    customer.add(n);
                    customer b = new customer("김이박",323,1112,"입금", 4321);
                    customer.add(b);

                    break;

                case 2:
                    System.out.println("❗️ 출금 ❗️");
                    for (int i = 0; i < customer.size(); i++) {
                        System.out.println(customer.get(i).getTime());
                        System.out.println(customer.get(i));
                    }
                    System.out.println();
                    break;


                case 3:
                    System.out.println("계좌번호를 입력해 주세요.");
                    int findAccount = Integer.parseInt(sc.next());
                    boolean isFind = false;

                    for (int i = 0; i < customer.size(); i++){
                        if (customer.get(i).getCustomerAccount()==findAccount){
                            System.out.println(customer.get(i));
                            isFind = true;
                            System.out.println();
                        }
                    }
                    if (!isFind) System.out.println("존재하지 않는 계좌번호 입니다.");
                    break;
            }
        }
        System.out.println("프로그램을 종료합니다");
    }
}
