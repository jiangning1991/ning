package Smthing.Day31;

/**
 * Created by jiangning on 2017/3/31.
 */
public class CustomerBiz {
    String[] names = new String[30];

    public void addName(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public void showNames() {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                break;
            }
            System.out.print(names[i] + "\t");
        }
    }

    public boolean editName(String oldName, String newName) {
        boolean find = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i]!=null&&names[i].equals(oldName)) {
                names[i] = newName;
                find = true;
                break;
            }
        }
        return find;
    }
}
