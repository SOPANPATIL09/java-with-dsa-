public class LamdaExample {
    public static void main(String args[]){
        Runnable r=()->{
            for(int i=0; i<5; i++){
                System.out.println("Hello World");
            }
        };

        Thread t=new Thread(r);
        t.start();
    }
}