package Simple;

public class Simplesgl {
     //根据类型进行初始化，引用类型返回null，并且只能是static
     private static Simplesgl instance;//这里是引用类型
     //定义为private
     private Simplesgl(){

     }
     public static Simplesgl newInstance(){
         //进行创建唯一的对象,因为引用类型返回值为null
         if(instance==null){
             instance=new Simplesgl();
         }
         return instance;
     }

     public static void main(String[] args) {
        //单例模式：永远就只是创建一个对象。
        // Simplesgl sgl =new Simplesgl();
        // Simplesgl sgl2=new Simplesgl();
        Simplesgl sgl =Simplesgl.newInstance();
        Simplesgl sgl2=Simplesgl.newInstance();
        Simplesgl sgl3=Simplesgl.newInstance();
        System.out.println(sgl);
        System.out.println(sgl2);
        System.out.println(sgl3);
// int i=0;
// for(i=0;i<100;i++)
         new Thread(
             ()->{
                Singletonlanhan sgl4 =Singletonlanhan.getInstance();
                System.out.println(sgl4);
             }
         ).start();

         new Thread(
            ()->{
               Singletonlanhan sgl5 =Singletonlanhan.getInstance();
               System.out.println(sgl5);
            }
        ).start();

    }
}
