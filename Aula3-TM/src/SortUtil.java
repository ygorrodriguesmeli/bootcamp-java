public class SortUtil {

    public static void sort(Precedente[] arr) {
        int n = arr.length;
        while (n > 0)
        {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++)
            {
                if (arr[currentIndex - 1].precedeA(arr[currentIndex]) > 0)
                {
                    Precedente temp = arr[currentIndex - 1];
                    arr[currentIndex - 1] = arr[currentIndex];
                    arr[currentIndex] = temp;
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }
    }

}
