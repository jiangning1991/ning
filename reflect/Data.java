package reflect;

/**
 * Created by jiangning on 2017/5/11.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by mingfei.net@gmail.com
 * 5/11/17 10:34
 * https://github.com/thu/RealEstate
 */
public class Data {
    //抓取链家网内，房屋单价，总价，
    private static final String[] fileNames = {
            "dongcheng",
            "xicheng",
            "chaoyang",
            "haidian",
            "fengtai",
            "shijingshan",
            "tongzhou",
            "changping",
            "daxing",
            "yizhuangkaifaqu",
            "shunyi",
            "fangshan",
            "mentougou",
            "pinggu",
            "huairou",
            "miyun",
            "yanqing",
            "yanjiao"
    };
    private static final String PATH = "data/bj/";

    public static void main(String[] args) {
        for (String fileName : fileNames) {
            Set<String> set = new HashSet<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(PATH.concat(fileName)))) {
                String line;
                while ((line = reader.readLine()) != null) {
//                    if (line.contains("车库") || line.contains("车位")) {
//
//                    }
                    set.add(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println(fileName + " is not exist.");
                continue;
            } catch (IOException e) {
                e.printStackTrace();
            }
            List<Double> list = new ArrayList<>();
            for (String s : set) {
                String[] strings = s.split("@");//以@符号为间隔，把抓取内容转换为数组类型
                list.add(Double.parseDouble(strings[strings.length - 3]));//这里设置抓取内容为数组类型，length-1为单价 length-2为总价
            }
            Collections.sort(list);
//            System.out.print(list.get(0) + ",");
//            System.out.print(list.get(list.size() - 1) + ",");
            double sum = 0d;
            for (Double aDouble : list) {
                sum += aDouble;
            }

            System.out.print(Math.round(sum / list.size()) + ",");
//            System.out.println("---");
        }
    }
}
