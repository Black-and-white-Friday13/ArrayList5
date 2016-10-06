import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); 
        list.add("лира");
        list.add("лоза");
        list.add("лила");
        list.add("рак");
        list.add("работает");
        list.add("валидно");
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).contains("р") && list.get(i).contains("л"))
            {
                continue;
            }
            else if (list.get(i).contains("р"))
            {
                list.remove(list.get(i));
                i--;
            }
            else if (list.get(i).contains("л"))
            {
            list.add(i, list.get(i));
                i++;
            }

        }
        return list;
    }
}
