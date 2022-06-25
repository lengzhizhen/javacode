import javafx.application.Application;
import javafx.stage.Stage;

public class Homework01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //1.编写Hello,World的程序
        System.out.println("Hello,World!");
        //2.将个人基本信息（姓名，性别，籍贯，住址）打印到控制台上输出
        System.out.println("姓名\t性别\t籍贯\t住址\n图图\t男\t襄阳\t北京");
        //3.JDK,JVM和JRE的关系
            //1.JDK=JRE+开发工具集
            //2.JRE=JVM+Java核心类库
        //4.环境变量path配置及其作用
            //1.环境变量的作用是为了在dos任意目录下,可以去使用java和javac命令
            //2.先配置JAVA_HOME=指向JDK安装的主目录
            //3.配置path环境变量，增加%JAVA_HOME%\bin
    }


    }
    class Test {
        public static void main(String[] arges) {

            int a = 1;
            int b = 2;
            b = 520;
            System.out.println(a);
            System.out.println(b);
            String name = "冷志真";
            int age = 22;
            double score = 99.5;
            char sex = '男';
            System.out.println("个人信息如下:");
            System.out.println("姓名:" + name);
            System.out.println("年龄:" + age);
            System.out.println("性别:" + sex);
            System.out.println("分数:" + score);

            /**
             * 基本数据类型：1.整数类型：byte(1),short(2),int(4),long(8)
             * 2.浮点型：单精度float(4),双精度double(8)
             * 3.布尔型：boolean(1),存放false,true
             * 引用数据类型：1.类（class）2.接口（interface）3.数组（[]）
             */
        }
    }


