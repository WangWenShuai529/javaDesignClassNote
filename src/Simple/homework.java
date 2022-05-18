package Simple;
import java.awt.*;
import javax.swing.*;

public class homework  extends JFrame{


    public homework(String name) {
    }

    public static void main(String[] args) {

        System.out.println("懒汉式，线程安全");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);

        String name1 = "张三看月亮";
        String name2 = "李四看月亮";
//窗口1
        JFrame frame1 = new homework(name1);
        frame1.setTitle(name1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //设置一个关闭窗口
        frame1.setSize(600 , 600);         //setSize()设置窗口大小
        frame1.setVisible(true);           //setVisible(true)  让窗口显示出来

        JLabel label1 = new JLabel("月亮的半经是1738.0KM，距离地球363300.0KM.");
        frame1.add(label1);

//窗口2
        JFrame frame2 = new homework(name2);
        frame2.setTitle(name2);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //设置一个关闭窗口
        frame2.setSize(600 , 600);         //setSize()设置窗口大小
        frame2.setVisible(true);           //setVisible(true)  让窗口显示出来

        JLabel label2 = new JLabel("月亮的半经是1738.0KM，距离地球363300.0KM.");
        frame2.add(label2);
    }

}

class Singleton{
    private static Singleton instance;


    private Singleton(){

    }

    //提供一个静态的公共方法，当使用到该方法时，才去创建instance，所有也称懒汉式

    public synchronized static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
            System.out.println("月亮的半经是1738.0KM，距离地球363300.0KM.");
        }
        return instance;

    }

}



