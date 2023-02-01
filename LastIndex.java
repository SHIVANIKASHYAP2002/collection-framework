import java.util.*;
class LastIndex{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<10;i++){
            
            al.add(sc.nextInt());
        }
        System.out.println(al);
        System.out.println("Enter the index value ");
        int n=sc.nextInt();
        int k=al.size();
        System.out.println(k);
        System.out.println("enter the element to enter");
        int x=sc.nextInt();
        al.remove(k-n);
        al.add(k-n, x);
        System.out.println(al);

    }
}