class MedianFinder {

    /** initialize your data structure here. */
     PriorityQueue<Integer> lo = null;
    PriorityQueue<Integer> ho = null;
    public MedianFinder() {
        
       lo = new PriorityQueue<>();
        ho  = new PriorityQueue<>(5000,Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        
        lo.offer(num);
        ho.offer(lo.poll());
        
        if(lo.size()<ho.size()){
            
            lo.offer(ho.poll());
            
        }
        
    }
    
    public double findMedian() {
        
        return lo.size()>ho.size()?lo.peek():(lo.peek()+ho.peek())/2.0 ;         
    }
}
