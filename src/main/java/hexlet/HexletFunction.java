package hexlet;

public class HexletFunction {

    public static int indexOf(String[] items, String value) {
        if (items != null && value != null && items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                if (value.equals(items[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int failJustWrongIndex(String[] items, String value) {
        if (items == null || value == null || items.length == 0 || value.isEmpty()) {
            return -1;
        }
        for (int i = items.length - 1; i > 0; i--) {
            if (value.equals(items[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int failWithEmptyArray(String[] items, String value) {
        if (items.length == 0) {
            return 0;
        }
        if (items == null || value == null || value.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < items.length; i++) {
            if (value.equals(items[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int failWithNullArray(String[] items, String value) {
        if (items == null) {
            return 0;
        }
        if (items.length == 0 || value == null || value.isEmpty()) {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < items.length; i++) {
            if (value.equals(items[i])) {
                result = i;
            }
        }
        return result;
    }

    public static int failWithEmptyValue(String[] items, String value) {

        if (items == null || value == null || items.length == 0) {
            return -1;
        }
        if (value.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < items.length; i++) {
            if (value.equals(items[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int failWithNullValue(String[] items, String value) {
        if (value == null) {
            return 0;
        }
        if (items == null || items.length == 0 || value.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < items.length; i++) {
            if (value.equals(items[i])) {
                return i;
            }
        }
        return -1;
    }


}


