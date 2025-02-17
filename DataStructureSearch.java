public class DataStructureSearch {
    public static boolean arraySearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == target) return true;
        return false;
    }

    public static boolean hashSetSearch(int[] arr, int target) {
        boolean[] hashSet = new boolean[1000000];
        for (int i = 0; i < arr.length; i++) hashSet[arr[i]] = true;
        return hashSet[target];
    }

    public static boolean treeSetSearch(int[] arr, int target) {
        int[] treeSet = arr.clone();
        quickSort(treeSet, 0, treeSet.length - 1);
        return binarySearch(treeSet, target) != -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) arr[i] = i;
        arraySearch(arr, 999999);
        hashSetSearch(arr, 999999);
        treeSetSearch(arr, 999999);
    }
}
