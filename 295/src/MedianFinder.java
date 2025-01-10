import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class MedianFinder {
    Queue<Integer> A,B;
    public MedianFinder() {
        A = new PriorityQueue<>();//小顶堆，存储较大的一部分
        B = new PriorityQueue<>((x, y) -> y - x);//大顶堆，存储较小的一部分
    }

    public void addNum(int num) {
        if (A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (B.peek() + A.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
