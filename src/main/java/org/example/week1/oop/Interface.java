package org.example.week1.oop;

public interface Interface extends TestInterface,Test2Interface{
   void getAll(String newParametr);
    default   void setAll(){
       System.out.println("default");
   }

}
class User implements Interface{

    @Override
    public void getAll(String newParametr){
        System.out.println("мир" + newParametr);
    }

    @Override
    public void ride() {
        System.out.println("Велик");
    }
    @Override
    public void read(){
        System.out.println("Book");
    }

//    @Override
//    public void setAll(){
//        System.out.println("default 2");
//    }
}
class Main{
   public static void main(String[] args) {
        Interface world = new User();
        world.getAll("Амир");
        world.setAll();
        world.ride();
        world.read();
    }
}

interface TestInterface {
    void ride();
}
interface Test2Interface{
    void read();
}
