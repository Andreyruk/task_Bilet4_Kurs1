public class Main {
    public static void main(String[] args) {
//        Задача билета №4.
//Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.

        String[] stringArray = {"a", "b", "a", "a", "b", "h", "c", "p", "h", "a", "t", "c", "d", "b", "t", "d", "z"};
        System.out.println(arrString(stringArray));
    }

    public static String arrString(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] != null) {
                for (int j = i + 1; j < stringArray.length; j++) {
                    if (stringArray[i].equals(stringArray[j])) {
                        stringArray[j] = null;
                    }
                }
                stringBuilder.append(stringArray[i]);
            }
        }
        return stringBuilder.toString();
    }
}

