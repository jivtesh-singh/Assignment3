public class question2 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 10, 15, 6, 7, 11};
        int size = arr.length;
        int[] sortarr = new int[size + 1];
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; ++i)
        {
            count[i] = 0;
        }

        //storing count of each element
        for (int i = 0; i < size; i++)
        {
            count[arr[i]]++;
        }

        //storing total count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];

        }
        //mapping the index of the each element in the arr in count array and placing them in sortarr
        for (int i = size - 1; i >= 0; i--) {
            sortarr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }


        for (int i = 0; i < size; i++)
        {
            arr[i] = sortarr[i];
            System.out.print(arr[i]+" ");
        }


    }
}