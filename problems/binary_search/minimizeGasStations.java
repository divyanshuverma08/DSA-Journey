// https://www.geeksforgeeks.org/problems/minimize-max-distance-to-gas-station/1
package problems.binary_search;

import java.util.PriorityQueue;

public class minimizeGasStations {
    public static void main(String[] args) {

    }

    // Optimal - Binary Search
    public double minMaxDistOptimal(int[] stations, int K) {
        // code here
        int n = stations.length;

        if (n <= 1)
            return 0.0;

        double low = 0.0, high = 0.0;

        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, stations[i + 1] - stations[i]);
        }

        double diff = 1e-6;

        while (high - low > diff) {
            double mid = (low + high) / 2.0;

            if (numberOfGasStationsRequired(mid, stations) > K) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return high;
    }

    static int numberOfGasStationsRequired(double dist, int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int stationsInSection = (int) ((arr[i + 1] - arr[i]) / dist);
            if (arr[i + 1] - arr[i] == (stationsInSection * dist)) {
                stationsInSection--;
            }
            count += stationsInSection;
        }

        return count;
    }

    // Better Priority Queue
    class Pair {
        double distance;
        int index;

        Pair(double d, int i) {
            this.distance = d;
            this.index = i;
        }
    }

    public double minMaxDist(int[] stations, int K) {
        // code here
        int n = stations.length;

        if (n <= 1)
            return 0.0;

        int[] howManySectors = new int[n - 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.distance, a.distance));

        for (int i = 0; i < n - 1; i++) {
            pq.add(new Pair(stations[i + 1] - stations[i], i));
        }

        for (int gasStations = 0; gasStations < K; gasStations++) {
            Pair maxSection = pq.poll();
            int maxIndex = maxSection.index;
            howManySectors[maxIndex]++;

            double originalDistance = stations[maxIndex + 1] - stations[maxIndex];
            double newDistance = originalDistance / (howManySectors[maxIndex] + 1);
            Pair pair = new Pair(newDistance, maxIndex);
            pq.add(pair);
        }

        return pq.peek().distance;
    }
}
