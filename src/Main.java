public class Main {

    public static void main(String[] args) {
        int[] list = new int[]{6, 10, 8, 4, 5, 1, 7, 3, 9, 2};

        int min = lowestValue(list);
        System.out.println(min);

        int max = highestValue(list);
        System.out.println(max);

    }
    public static int lowestValue(int[] list) {
        int minValue = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < minValue) {
                minValue = list[i];
            }
        }
        return minValue;
    }
    public static int highestValue(int[] list) {
        int maxValue = list[0];
        for(int i = 1; i < list.length;i++){
            if(list[i] > maxValue){
                maxValue = list[i];
            }
        }
        return maxValue;
    }
}
