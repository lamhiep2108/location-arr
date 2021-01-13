import java.util.Scanner;

public class maxarr {
    public static void main(String[] args) {
        int[] arr ;
        int size;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("sl pt");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("Size should not exceed 20");
            }
        }while (size>20);
        arr=new int[size];
        int i =0;
        while (i<arr.length){
            System.out.println("enter element"+(i+1)+":");
            arr[i]=scanner.nextInt();
            i++;
        }
        System.out.println("Property list");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+",");
        }
        int max=0;
        for (int j = 0; j < arr.length; j++) {
            if (max<arr[j]){
                max=arr[j];
                max=j+1;
            }
        }
        System.out.println("max: "+max);

    }
}
