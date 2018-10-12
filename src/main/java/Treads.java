public class Treads extends Thread {
  //  public static  int i=0;
    public String str;
    public Treads(String str){
        this.str=str;

    }

    public void run() {
        for (int n = 0; n < 1000000000; n++)
            //System.out.println("Hey"+str);
    }
        public static void main(String[] args) throws InterruptedException {
        //Treads thread =new Treads ("Egg");
        Treads thread1 =new Treads ("Chiken");
        thread1 .start();
        thread1.setDaemon(true);
        //thread.join();
        thread1.join();

//            Thread thread = new Thread(new Treads());
//            Thread thread2 = new Thread(new Treads());
//            thread.start();
//            thread2.start();
//            for (int n=0; n<5000; n++)
//                i++;
//            try {
//                thread.join();
//                thread2.join();
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            System.out.println(i);
    }

}
