class CircularTour {
    public static int findStartPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        for (int start = 0; start < n; start++) {
            int fuel = 0, count = 0, i = start;
            while (count < n) {
                fuel += petrol[i] - distance[i];
                if (fuel < 0) break;
                i = (i + 1) % n;
                count++;
            }
            if (count == n) return start;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        System.out.println(findStartPoint(petrol, distance));
    }
}
