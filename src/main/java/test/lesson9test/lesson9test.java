package test.lesson9test;

public class lesson9test {
    public static void main(String[] args) {

        String[][] array1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] array2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            int result = Sum(array2);
            System.out.println(Sum(array2));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());;
        } catch (MyArrayDataException e){
            System.out.println("Не корректные данные массива ! ");
            System.out.println("Ошибка в ячейке: " + e.i + " x " + e.j);
        }


    }

    public static int Sum(String[][] array) throws MyArrayDataException,MyArraySizeException {
        int sum = 0;
        if (array.length != 4){
            throw new MyArraySizeException("Размер массива превышен");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4){
                throw new MyArraySizeException("Размер массива превышен");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new  MyArrayDataException(i,j);
                }

            }
        }
        return sum;
    }
}
