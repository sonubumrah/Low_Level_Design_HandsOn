package MultithreadingPractice;

public class DemoThread implements Runnable{
    Car.PrintNumber printNumber;
    DemoThread(Car.PrintNumber printNumber){
        this.printNumber=printNumber;
    }
    @Override
    public   void run()   {
        try{
            printNumber.printOdd();
        }catch (Exception exception){

        }

    }
}
