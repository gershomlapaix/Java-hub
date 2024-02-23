public class Threading1 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: "+ i);

            try{
                Thread.sleep(1000); // 1 second
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
