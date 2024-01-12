package ch6.ex1;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    void increment(){
        if(count>=max){
            System.out.println("최댓값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }
    public int getCount(){
        return count;
    }
}
