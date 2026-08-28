import java.util.Scanner;

class onedarrays  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
//output
//Enter 5 elements:
//10 20 30 40 50
//Array elements are:
//10
//20
//30
//40
//50