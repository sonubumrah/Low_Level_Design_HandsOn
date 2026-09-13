package MultithreadingPractice;

public class DemoThread2 implements Runnable{
    Car.PrintNumber printNumber;
    DemoThread2(Car.PrintNumber printNumber){
        this.printNumber=printNumber;
    }

    @Override
    public   void run()   {
        try{
            printNumber.printEven();
        }catch (Exception exception){

        }

    }
}
