package IO.Files;/*
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
import java.util.regex.Pattern;

public class file1 implements FilenameFilter {
    public file1(Object arg) {
    }
    public static void main(String[] args) {
        File path = new File(".");
        String [] list;
        if (args.length == 0){
            list = path.list();
        }
        else {
            list = path.list(new file1(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String file01 : list){
            System.out.println(file01);
        }
        System.out.println("你好");
    }
    @Override
    public boolean accept(File dir, String name) {
        return false;
    }
}
class DirFilter implements FilenameFilter{
    private Pattern pattern;
    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }
    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}