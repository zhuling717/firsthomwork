package java;

import java.util.ArrayList;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        System.out.println("请输入一串数字");
        int[] m = in();
        sort(m);
        System.out.println("请输入另一串数字");
        int[] n= in();
        sort(n);
        System.out.println("合并后");
        combine(m,n);
    }

    public static int[] in()
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<Integer>();
        String str = new String();
        str = in.nextLine();
        Scanner num = new Scanner(str);
        while (num.hasNext()) {
            int temp = in.nextInt();
            l.add(temp);
        }
        int[] b =new int[l.size()];
        for(int i =0,j=0 ;i<l.size();i++){
            b[j]=l.get(i);
            j++;
        }
        return b;
    }
    public static void sort(int a[]){
        for (int i = 0; i <a.length-1; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if(a[j]>a[j+1]){
                    int tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
        }
        for (int i = 0; i <a.length-1 ; i++) {
            System.out.println(a[i]);
        }
    }
    public static void combine(int b[],int c[]){
        int l=b.length+c.length;
        int k=0,j=0;
        int[] com=new int[l];
        for (int i = 0; i <l ; i++) {
            if(b[k]>c[j]){
                com[i]=c[j];
                j++;
            }
            else{
                com[i]=b[k];
                k++;
            }
        }
        for (int i = 0; i <l ; i++) {
            System.out.println(com[i]);
        }
}
}
