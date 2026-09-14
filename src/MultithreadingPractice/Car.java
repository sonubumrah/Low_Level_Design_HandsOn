package MultithreadingPractice;

public class Car {
    int price;
    String name;
    public Car(int price, String name){
        this.price=price;
        this.name=name;
    }

    public static class PrintNumber {
        int num=1;
        int limit;
        PrintNumber(int limit){
            this.limit=limit;
        }
        public synchronized void printOdd() throws InterruptedException{
            while(num<=limit){
                if(num%2==0){
                    wait();
                }
                else{
                    System.out.println("odd Thread "+ num++);
                    notifyAll();
                }
            }
        }
        public synchronized void printEven() throws InterruptedException{
            while(num<=limit){
                if(num%2==1){
                    wait();
                }
                else{
                    System.out.println("Even Thread "+num++);
                    notifyAll();
                }
            }
        }
    }
}
