package test;

public class Elements {
    public static void main(String[] args) {
        int[] kiosk_q1 = {4200, 4800, 5000};
        int[] kiosk_q2 = {5200, 5800, 6000};
        int[] kiosk_q3 = {4600, 4900, 5800};
        int[] kiosk_q4 = {5000, 5100, 6100};

        int[] outlet_q1 = {5700, 6300, 6000};
        int[] outlet_q2 = {7000, 6700, 7300};
        int[] outlet_q3 = {6700, 6500, 6200};
        int[] outlet_q4 = {7200, 6900, 7500};

        int[] sum = new int[12];
        int total = 0;

        for (int i = 0; i < kiosk_q1.length; i++) {
            sum[i] = kiosk_q1[i] + outlet_q1[i];
            sum[i + 3] = kiosk_q2[i] + outlet_q2[i];
            sum[i + 6] = kiosk_q3[i] + outlet_q3[i];
            sum[i + 9] = kiosk_q4[i] + outlet_q4[i];
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println("Месяц " + (i+1) + " объем продаж: \t" + sum[i]);
            total += sum[i];
        }

        System.out.println("ОБЩИЙ ОБЪЕМ ПРОДАЖ ЗА ГОД\t" + total);
    }
}
