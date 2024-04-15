import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
       this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class Solution {
    static Node insertData(Node n,int data)
    {
        Node p=n;
        Node temp=new Node(data);
        if(n==null)
        {
            n=temp;
            p=n;
        }
        else
        {
            if(temp.data<n.data)
            {
                if(p.prev==null)
                {
                p.prev=temp;
                }
                else
                {
                    p=p.prev;
                    insertData(p,data);
                }
            }
            else
            {
               if(p.next==null)
                {
                p.next=temp;
                }
                else
                {
                    p=p.next;
                    insertData(p,data);
                } 
            }
        }
        return n;
    }
    static void btTraversal(Node n)
    {
        if(n!=null)
        {
            System.out.print(n.data+" ");
            btTraversal(n.prev);
            btTraversal(n.next);
        }
        else
        {
            return;
        }
    }
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        Node n=null;
        for(int i=0;i<a;i++)
        {
            int x=sc.nextInt();
            Node bn=insertData(n,x);
            n=bn;
        }
        btTraversal(n);
    }
}
