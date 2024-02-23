public class Threading2 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable: "+ i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
