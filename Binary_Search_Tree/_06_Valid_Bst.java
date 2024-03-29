package Binary_Search_Tree;

public class _06_Valid_Bst {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        if(root.data<val)
        {
            root.right=insert(root.right,val);
        }
        else {
            root.left=insert(root.left,val);
        }
        return root;
    }
    public static boolean isValid(Node root,Node min,Node max)
    {
        if(root==null)
        {
            return true;
        }
        if(min!=null && root.data<=min.data)
        {
            return false;
        }
        if(max!=null && root.data>=max.data)
        {
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right,root,max);



    }
    public static void main(String[] args) {
int []values={5,3,1,4,6,7};
//int []values={1,1,1};
Node root=null;
for(int i=0;i<values.length;i++){
    root=insert(root,values[i]);
}
if(isValid(root,null,null))
{
    System.out.println("Valid Bst");
}
else{
    System.out.println("Invalid Bst");
}
    }
}
