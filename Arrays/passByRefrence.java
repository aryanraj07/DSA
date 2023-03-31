package Arrays;

public class passByRefrence {
    public static void update(int []arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=arr[i]+1;

        }
    }
    public static void update2(int n)
    {
        n=11;
    }


    public static void main(String[] args) {
        //pass by reference
        int []arr={99,100,101,102,103};
        update(arr);
        for (int j : arr) {
            System.out.print(j+" ");
        }
        int n=5;
        update2(n);
        System.out.println(n);

    }


}
