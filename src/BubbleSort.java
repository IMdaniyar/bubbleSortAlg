import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size = ");
        int size = in.nextInt();
        int array [] = new int[size];
        System.out.println("Insert Array Elements = ");
        for (int i = 0; i < size;i++)
        {
            array[i] = in.nextInt();
        }

        System.out.print("Array Elements = ");

        for (int i = 0; i < size; i++)
        {
            System.out.print(" " + array[i]);
        }

        System.out.println();

        for (int i = 0; i<size - 1; i++)
        {
            for (int j = 0; j < size -1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        print(Arrays.toString(array));
    }

    private static void print(String toString)
    {
        System.out.println("Отсортировнанный массив  : " + toString);
    }
}
