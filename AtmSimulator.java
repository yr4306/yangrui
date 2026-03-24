import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice, amount;

        while (true) {
            System.out.println("\n1. 检查余额\n2. 取款\n3. 存款\n0. 退出");
            System.out.print("选择操作: ");
            choice = sc.nextInt();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.println("余额: " + balance + ".0");
                    break;
                case 2:
                    System.out.print("输入金额: ");
                    amount = sc.nextInt();
                    if (amount <= 0 || amount % 100 != 0) {
                        System.out.println("错误: 金额必须为正数且是100的倍数");
                    } else if (amount > balance) {
                        System.out.println("错误: 资金不足。可用余额: " + balance + ".0");
                    } else {
                        balance -= amount;
                        System.out.println("取款成功，剩余余额: " + balance + ".0");
                    }
                    break;
                case 3:
                    System.out.print("输入金额: ");
                    amount = sc.nextInt();
                    if (amount <= 0 || amount % 100 != 0) {
                        System.out.println("错误: 金额必须为正数且是100的倍数");
                    } else {
                        balance += amount;
                        System.out.println("存款成功，当前余额: " + balance + ".0");
                    }
                    break;
                default:
                    System.out.println("无效选项");
            }
        }
        sc.close();
    }
}