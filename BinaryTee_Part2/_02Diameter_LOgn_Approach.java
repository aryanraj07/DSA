package BinaryTee_Part2;

public class _02Diameter_LOgn_Approach {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.left=null;
            this.right=null;
        }
    }
public  static  class Info{
        int diam;
        int ht;
        Info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }

}
public static Info diameter(Node root)
{
    if(root==null)
    {
        return new Info(0,0);
    }
    Info leftINfo=diameter(root.left);
    Info rightInfo=diameter(root.right);
    int diam=Math.max(Math.max(leftINfo.diam,rightInfo.diam),leftINfo.ht+rightInfo.ht+1);
    int ht=Math.max(leftINfo.ht,rightInfo.ht)+1;
    return new Info(diam,ht);
}

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);
    }
}
