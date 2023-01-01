package testEasyCodeRu.ShowSum.lecsion13;

public class CheckMarks {
    public static void main(String[] args) {
        isCheckMarks(new int[] {5,4,3,5});
        isCheckMarks(new int[]{5,4,3,5,2,4,5});
    }

    private static void isCheckMarks(int[] marks){
        int average;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        average = sum / marks.length;
        if (average == 5){
            print("Отличник");
        }else {
            print("Не отличник");
        }
    }

    private static void print(String msg){
        System.out.println(msg);
    }
}
