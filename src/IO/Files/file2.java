package IO.Files;/*
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class file2 {
    public static void main(String[] args) {
        File path1 = new File(".");
        String [] list1;
        if (args.length == 0){
            list1 = path1.list();
        }
        else {
            list1 = path1.list(new FilenameFilter(){
                private Pattern pattern = Pattern.compile(args[0]);

                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
            Arrays.sort(list1,String.CASE_INSENSITIVE_ORDER);
            for (String dieitem : list1){
                System.out.println(dieitem);
            }
    }
    }
}
//这段代码的作用是列出当前目录下的所有文件和目录，并按照字母顺序排序。如果命令行参数中包含一个正则表达式，那么只列出文件名匹配该正则表达式的文件和目录。

//        具体来说，这段代码首先创建了一个File对象path1，它表示当前目录。
//        然后，如果命令行参数为空，就使用path1.list()方法列出当前目录下的所有文件和目录；否则，就使用path1.list(FilenameFilter)方法列出当前目录下文件名匹配正则表达式的文件和目录。
//        在这个例子中，FilenameFilter是一个接口，我们使用了匿名内部类的方式来实现它。在accept()方法中，我们使用了正则表达式来判断文件名是否匹配给定的模式。
//        最后，我们使用Arrays.sort()方法对文件名进行排序，并使用String.CASE_INSENSITIVE_ORDER作为排序规则，这样可以忽略文件名的大小写。
//        最后，我们使用for循环遍历排序后的文件名数组，并使用System.out.println()方法将每个文件名输出到控制台。