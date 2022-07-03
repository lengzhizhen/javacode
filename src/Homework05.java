import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class Homework05 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
class for01{
    public static void main(String[] args){
        /**
         * for(1.循环变量的初始化;2.循环条件;4.循环变量的迭代){
         *      3.循环操作(可以是多条语句)
         * }
         */
        for(int i=1 ; i <= 10 ; i++){
            System.out.println("生如逆旅一苇以航");
        }
        /**死循环
        for(int j = 1 ; ;){
            System.out.println("OK?"+(j++));
        }
         **/
        int count = 3;
        for(int i = 0 , j = 0 ; i < count ; i++ , j+=2){
            System.out.println("i="+i+","+"j="+j);
        }

    }
}

class for02{
    public static void main(String[] args){
        /**
         *  打印1-100之间能被9整除的整数，并求出个数及总和
         *  思路分析：
         *  1.完成输出1-100的值
         *  2.在输出的过程中，进行过滤只输出9的倍数，i%9==0
         *  3.统计个数定义一个变量int count=0,当条件满足时,count++
         *  4.总和，定义一个变量int sum=0,当满足条件时，sum+=i
         *
         * 建立编程思想
         *  1.为了适应更好的需求，把范围开始的值和结束的值做成变量
         *  2.还可以更进一步，9的倍数也做成变量
         *
         */
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        int t = 9;
        for(int i = start ; i <= end ;i++){
            if (i % t == 0) {
                System.out.println("i=" + i);
                count ++;
                sum += i;
            }
        }
        System.out.println("一共有"+count);
        System.out.println("总和为"+sum);

    }
}

class for03{
    public static void main(String[] args){
        /**
         * 先输出0-5
         * 后面的+是5-i
         *
         * 编程思想
         * 5替换成变量n
         */
        int n = 10;
        for (int i=0 ; i <= n;i++){
            System.out.println(i + "+"+(n-i)+"="+n);
        }
    }
}

class while01{
    public static void main(String[] args){
        int i = 1;//循环变量初始化
        while(i<=10){//循环条件
            System.out.println("生如逆旅一苇以航"+i);//执行语句
            i++;//循环变量迭代
        }
    }
}

class while02{
    public static void main(String[] args){
        System.out.println("1-100之间所有能被三整除的数:");
        int i = 1;
        while (i <= 100){
            if(i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("40-200之间所有偶数:");
        int j = 40;
        while(j <= 200){
            if(j % 2 == 0){
                System.out.println(j);
            }
            j++;
        }
    }
}

class do_while01{
    public static void main(String[] args){
        //1.打印1-100
        System.out.println("打印1-100");
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i <= 100);
        System.out.println("计算1-100的和");
        int j = 1;
        int sum = 0;
        do{
            sum += j;
            j++;
        }while (j <= 100);
        System.out.println("1-100的和为"+sum);
        System.out.println("1-200能被5整除但不能被3整除的数");
        int k = 1;
        int count = 0;
        do {
            if(k % 5 == 0 && k % 3 != 0){
                System.out.println(k);
                count++;
            }
            k++;
        }while (k <= 200);
        System.out.println("有"+count+"个");

    }
}

class do_while02{
    public static void main(String[] args){
        //如果李三不还钱一只使出五连鞭，直到李三说y还钱为止
        Scanner scanner = new Scanner(System.in);
//        for (; ;){
//            System.out.println("老韩问还钱么?y/n");
//            char i = scanner.next().charAt(0);
//            if(i != 'y'){
//                System.out.println("五连鞭");
//            }else if(i == 'y'){
//                System.out.println("再见");
//                break;
//            }
//        }
        char answer = ' ';
        do {
            System.out.println("老韩使出五连鞭~");
            System.out.println("老韩问还钱么?y/n");
            answer = scanner.next().charAt(0);
            System.out.println("它的回答是"+answer);

        }while (answer != 'y');
    }
}

class for_for01{
    /**
     * 执行流程：
     * 强调：1.执行1,2,3,4，5，6之后，在内层循环进行执行直到不满足4的循环条件，开始跳到外层循环然后再重复第二轮，依次内推
     *      2.循环操作执行的次数等于外层循环的次数乘以内层循环的次数
     * for(1.循环变量的初始化;2.循环条件;7.循环变量的迭代){
     *      for(3.循环变量的初始化;4.循环条件;6.循环变量的迭代){
     *               5.循环操作(可以是多条语句)
     *         }
     *     }
     */
    public static void main(String[] args){
        for(int i = 0 ; i < 2 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.println("i="+i+"j="+j);
            }
        }
    }

}


class for_for02{
    public static void main(String[] args){
        /**
         * 1.统计三个班的成绩情况，每个班有五名同学，求出各个班的平均分和所有班级的平均分（学生的成绩从键盘输入）
         * 2.统计三个班的及格人数每个班有五名同学
         *
         * 思路分析：
         * (1)先计算一个班，5个学生的成绩和平均分
         * 1.1创建一个Scanner对象，接收用户输入
         * 1.2得到该班级平均分，定义一个double sum把该班级五个学生的成绩累积起来
         *
         * (2)统计三个班的平均分
         *
         * (3)所有班级的平均分
         * 3.1定义一个变量，double totalScore累积所有学生的成绩
         * 3.2当多重循环结束后， totalScore/15
         *
         * (4)统计三个班的及格人数
         * 4.1定义一个变量int passNum = 0 ,当有一个学生的成绩大于等于60 passNum++
         */
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;//累积所有学生的成绩
        int passNum = 0;
        for(int i = 1 ; i <= 3 ; i++) {
            double sum = 0;//一个班级的总分
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第"+i+"个班" + j + "个学生的成绩");
                double score = scanner.nextDouble();
                System.out.println("成绩是" + score);
                if(score >= 60){
                    passNum++;
                }
                sum += score;
            }
            System.out.println("sum="+sum+",平均分为"+sum/5);
            //把sum累积到totalScore
            totalScore += sum;
        }
        System.out.println("三个班总分"+totalScore+"的平均分为："+totalScore/15);
        System.out.println("三个班的及格人数为："+passNum);


    }
}

class for_for04{
    public static void main(String[] args){
        for (int i = 0 ; i <= 9 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println( );//换行
        }
    }
}

class Star{
    public static void main(String[] args){
        /**
         * 打印空心金字塔
         * 1.先打印一个矩形(5*5)
         *      *****
         *      *****
         *      *****
         *      *****
         * 2.打印半个金字塔(层数与每层个数对应)
         *          *       1层1个
         *          **      2层2个
         *          ***     3层3个
         *          ****    4层4个
         *          *****   5层5个
         *3.打印整个金字塔(每层个数=层数*2-1，空格个数=5-当前层数)
         *          *       1层1个   有4个空格
         *         ***      2层3个   有3个空格
         *        *****     3层5个   有2个空格
         *       *******    4层7个   有1个空格
         *      *********   5层9个   有0个空格
         *
         * 4.打印空心金字塔(当前行的第一位置为* ， 最后一个位置为*，最后一层全部为*，当第五层全部输出*)
         *        *        1层1个   有4个空格
         *       * *       2层2个   有3个空格
         *      *   *      3层2个   有2个空格
         *     *     *     4层2个   有1个空格
         *    *********    5层9个   有0个空格
         */
        System.out.println("实心矩形");
        for (int i = 1 ; i <= 5;i++){//i表示层数
            for (int j = 1 ; j <= 5 ; j++){//j表示每层的个数
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\t");
        System.out.println("半个实心金字塔");
        for (int i = 1 ; i <= 5;i++){//i表示层数
            for (int j = 1 ; j <= i ; j++){//j表示每层的个数
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("整个实心金字塔");
        System.out.println("\t");

        for (int i = 1 ; i <= 5;i++){//i表示层数
            for (int k = 1 ; k <= 5 - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {//j表示每层的个数
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("空心金字塔");
        System.out.println("请输入空心金字塔的层数：");
        Scanner scanner = new Scanner(System.in);
        int totalLevel = scanner.nextInt();
        for (int i = 1 ; i <= totalLevel ; i++){
            for (int k = 1 ; k <= totalLevel - i ; k++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= 2 * i - 1 ; j++){
                if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}