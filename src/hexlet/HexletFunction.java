package hexlet;

public class HexletFunction {

    public static int[] take(int[] array, int quantity) {
        if (quantity >= array.length) {
            int[] result = new int[array.length];
            System.arraycopy(array, 0, result, 0, array.length);
            return result;
        }
        int[] result = new int[quantity];
        System.arraycopy(array, 0, result, 0, quantity);
        return result;
    }

    public static int[] takeFail(int[] array, int quantity) {
        int[] result = new int[quantity];
        if (quantity >= array.length) {
            System.arraycopy(array, 0, result, 0, array.length);
            return result;
        }
        System.arraycopy(array, 0, result, 0, quantity);
        return result;
    }

    public static int[] takeFail2(int[] array, int quantity) {
        return array;
    }


}


