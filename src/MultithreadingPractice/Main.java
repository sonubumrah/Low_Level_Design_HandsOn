//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  IO.println(String.format("Hello and welcome!"));
//  Car.PrintNumber printNumber=new Car.PrintNumber(10);
//
//  DemoThread demoThread1=new DemoThread(printNumber);
//  DemoThread2 demoThread2=new DemoThread2(printNumber);
//  Thread thread1=new Thread(demoThread1);
//  Thread thread2=new Thread(demoThread2);
//  thread1.start();
//  thread2.start();
    Car car1=new Car(5, "swift");
    Car car2=new Car(5,"swift");
    System.out.println(car1);
    System.out.println(car2);
//    Car car3=new Car(3,"alto");
//    List<Car> list=new ArrayList<>();
//    list.add(car1);
//    list.add(car2);
//    list.add(car3);
//    Collections.sort(list,new newCarComperator());
//    Map<Car, Integer> map =new HashMap<>();
//    map.put(car1,car1.price);
//    map.put(car2,car2.price);
//    map.put(car3,car3.price);
//    for(Car car:map.keySet()){
//      System.out.println(car.name);
//    }
//    for(Car x:list){
//      System.out.println(x.name);
//    }

}
