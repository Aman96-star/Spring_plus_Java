package Spring_Basic;
// instead of crating object in a class just pass or inject from outside
// public class DI {
//    static class Engine{
//         void start(){
//             System.out.println("Engine Started");
//         }        
//     }

//   static  class Car{
//         Engine E = new Engine(); // tight coupling

//         void show(){
//             E.start();
//         }
//     }  

//     public static void main(String[] args) {
//        Car C = new Car();
//        C.show(); 
//     }

// }

// we can use of method overinding nature to directly change the method content

public class DI {
  static class Engine{
    void start(){
        System.out.println("Engine Started");
    }
  }

  static class Car extends Engine{
        void start(){
            System.out.println("Car Started overide the engine");
        }
    }
    
    public static void main(String[] args){
        Car C = new Car();
        C.start();
    }
}
