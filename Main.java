import java.util.*;

public class Main{
  static class Tree{
    int x;
    Vector<Tree>child= new Vector<>();
  }
  static Tree General(int x){
    Tree temp= new Tree();
    temp.x= x;
    return temp;
  }
  static void LevelOrderTraversal(Tree root){
    if (root== null)
    return;
    Queue<Tree> q= new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()){
      int size= q.size();
      while (size> 0){
        Tree a= q.peek();
        q.remove();
        System.out.print(p.x + " ");
        for (int i= 0; i< a.child.size(); i++)
        q.add(a.child.get(i));
        size--;
      }     
      System.out.println();
    }
  }
  public static void main(String[] args){
    Tree root= General(1);
    (root.child).add(General(2));
    (root.child).add(General(2));
    (root.child.get(0).child).add(General(3));
    (root.child.get(0).child).add(General(3));
    (root.child.get(1).child).add(General(3));
    (root.child.get(1).child).add(General(3));
    LevelOrderTraversal(root);
  }
}