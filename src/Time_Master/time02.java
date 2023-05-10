package Time_Master;/**
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.util.Scanner;

public class time02 {
    public static void main(String[] args) {

        p p = new p();
        pp pp = new pp(p);
        p.start();
        pp.start();

    }
}
class p extends Thread{
    boolean aBoolean = true;
    @Override
    public void run() {
        while (aBoolean){
        System.out.println("hi");
        }
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }
}
class pp extends Thread{
    private p pt;


    public pp(p pt) {
        this.pt = pt;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("输入指令");
            Scanner scanner = new Scanner(System.in);
            char key = scanner.next().charAt(0);
            if (key == 'Q'){
                System.out.println("b dead");
                pt.setaBoolean(false);
                break;
            }
        }
    }
}