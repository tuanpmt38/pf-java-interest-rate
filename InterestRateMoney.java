public class InterestRateMoney {
    public static void main(String[] args) {
        int month;
        double rate;
        double money;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter number of months:");
        month = sc.nextInt();
        System.out.println("Enter number of rate:");
        rate = sc.nextDouble();
        System.out.println("Enter number of money:");
        money = sc.nextDouble();
        double totalinterset = 0;
        for (int i = 1; i < month; i++) {
            totalinterset = money * (rate / 12) * month;
        }
        System.out.println("Total of totalinterset: " + totalinterset);

    }
}
