package server.sbehavior;

public class Loop implements Runnable{

    private int value = 42;

    public Loop(){

    }

    @Override
    public void run() {
        int temp;
        for(int i = 0; i < 50; i++){
            temp = this.compute(i);
        }
    }

    public int compute (int i) {
        if(i<=0) // fuer negative Zahl auch
            return 0;
        else if(i==1)
            return 1;
        else
            return compute(i-2)+compute(i-1);
    }

}
