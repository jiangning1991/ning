package Smthing.Day30;

/**
 * Created by jiangning on 2017/3/30.
 */
public class CustomerBiz {
    String name;//客户名字

     String[] names = new String[5];
     int i = 0;

    public String addName(String str){
        if (i>5){
            return "超出上限输入失败";
        }
        names[i] = str;
        i++;
        for (int j=0;j<=i;j++){
            if(names[j]==str){
                return"添加成功";
            }
        }
        return "添加失败";
    }

    public void showNames(){
        for(int j = 0; j < i; j++){
            System.out.print(names[j]+"\t");

        }

    }
    public String reappear(String oldName,String newName){
        for (int k=0;k<i;k++){
            if (names[k].equals(oldName)) {
                names[k]=newName;
                return "";
            }else {
                System.out.println("找不到替换对象");
            }
        }
        return "替换失败";
    }
    public String check(int start,int end,String name){
        for (int j= start;j<=end;j++){
            if(end<i){
                if(names[j].equals(name)) {
                    return "在这个区间内找到了该姓名，替换成功";
                }


            }else {
                return "这个区间有问题";
            }
        }
        return "这个区间内不存在这个名字";

    }


}
