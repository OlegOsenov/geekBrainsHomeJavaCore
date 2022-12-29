package lesson9;

public class ArrayException {

    public static void main(String[] args) {

        String[][] array1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            int resultArray = Sum(array1);
            System.out.println("Сумма массива, после преобразования в int: " + resultArray);
        } catch (MyArraySizeException e) {
            e.getMessage();
        } catch (MyArrayDataException e) {
            System.out.println("Не корректные данные, ошибка в ячейке : " + e.i + "x" + e.j);
        }


    }

    public static int Sum(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива не корректный");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Размер массива не корректный");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }

            }
        }
        return sum;
    }
}
