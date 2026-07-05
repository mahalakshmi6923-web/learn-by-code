public class SymmetricPairs {
    public static void main(String[] args) {
        int arr[][] = { {11,20},{30,40},{5,10},{40,30},{20,11}};
        int n = arr.length;
        System.out.println("Following pairs have symmetric pairs:");
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.println("(" + arr[i][0] + ", " + arr[i][1] + ")");
                }
            }
        }
    }
}