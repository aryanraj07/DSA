package Strings;

public class _06Shortest_Path {
    public static float finddShortest(String path)
    {
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            if(dir=='N')
            {
                y+=1;
            }
            else if(dir=='S')
            {
                y-=1;
            }
            else if(dir=='E')
            {
                x+=1;
            }
            else
            {
                x-=1;
            }

        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String[] args) {

        //finding the shortest distance
        String path="WNEENESENNN";
        System.out.println(finddShortest(path));






    }
}
