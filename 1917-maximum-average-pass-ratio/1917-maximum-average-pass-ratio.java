import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double gainA = (double) (a[0] + 1) / (a[1] + 1) - (double) a[0] / a[1];
            double gainB = (double) (b[0] + 1) / (b[1] + 1) - (double) b[0] / b[1];
            return Double.compare(gainB, gainA); 
        });

        for (int[] cls : classes) {
            pq.offer(cls);
        }

        for (int i = 0; i < extraStudents; i++) {
            int[] top = pq.poll();
            top[0]++; 
            top[1]++;
            pq.offer(top);
        }

        double sum = 0;
        for (int[] cls : pq) {
            sum += (double) cls[0] / cls[1];
        }

        return sum / classes.length;
    }
}
