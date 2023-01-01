package testEasyCodeRu.ShowSum.lecsion13;

public class Rectangle {

    public static void main(String[] args) {
        isRectangle(new int[]{5, 5, 5, 5});
        isRectangle(new int[]{5, 6, 5, 6});
        isRectangle(new int[]{5, 7, -5, 3});


    }

    private static void print(String str) {
        System.out.println(str);
    }

    private static void isRectangle(int[] sides) {
        if (sides.length == 4) {
            if (sides[0] > 0 && sides[1] > 0 && sides[2] > 0 && sides[3] > 0) {
                if (sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3]) {
                    print("квадрат");
                } else if (sides[0] == sides[2] && sides[1] == sides[3]) {
                    print("прямоугольник");
                } else {
                    print("четырехугольник");
                }
            } else {
                print("все стороны должны быть больше нуля");
            }
        } else {
            print("нужно число 4");
        }
    }
}
