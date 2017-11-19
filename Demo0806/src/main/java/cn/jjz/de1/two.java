package cn.jjz.de1;

/**
 * Created by lenovo on 2017/8/6.
 */
public class two {
    private int num; //输出数字
    private int runThreadNum; //当前运行线程编号
    public two(int num, int runThreadNum){
        this.num = num;
        this.runThreadNum = runThreadNum;
    }
    /**
     * 打印线程
     */
    static class PrintThread extends Thread{
        private int threadNum; //当前运行线程编号
        private two demo; //锁对象

        public PrintThread(int threadNum, two demo){
            this.threadNum = threadNum;
            this.demo = demo;
        }
        @Override
        public void run() {
            synchronized (demo) {
                try{
                    for(int i=1; i<=5; i++){
                        while(true){
                            if(threadNum == demo.runThreadNum){
                                break;
                            }
                            else{
                                //如果当前线程不是接下来要运行的线程，进入等待池
                                demo.wait();
                            }
                        }
                        for(int j=1; j<=5; j++){
                            System.out.println("线程"+threadNum+"："+(++demo.num));
                        }
                        demo.runThreadNum = demo.runThreadNum%3 +1; //计算之后运行的线程编号
                        demo.notifyAll(); //唤醒所有等待池中的线程
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
        two demo = new two(0,1);
        new PrintThread(1,demo).start();
        new PrintThread(2,demo).start();
        new PrintThread(3,demo).start();
    }

}
