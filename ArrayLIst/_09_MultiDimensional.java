    package ArrayLIst;

    import java.lang.reflect.Array;
    import java.util.ArrayList;

    public class _09_MultiDimensional {
        public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
            ArrayList<Integer> list1=new ArrayList<>();
            list1.add(2);
            list1.add(4);
            list1.add(5);
            list1.add(6);
            list1.add(7);
            ArrayList<Integer> list2=new ArrayList<>();
            list2.add(2);
            list2.add(4);
            list2.add(5);
            list2.add(6);
            list2.add(7);
            mainList.add(list1);
            mainList.add(list2);
            System.out.println(mainList);
            for(int i=0;i<mainList.size();i++)
            {
                ArrayList<Integer> currList=mainList.get(1);
                for(int j=0;j<currList.size();j++)

                {
                    System.out.print(currList.get(j)+" ");
                }
                System.out.println();
            }

        }
    }
