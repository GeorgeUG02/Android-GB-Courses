import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,4,7};
        a=a1(a);
        System.out.println(Arrays.toString(a));
        int[] b = {1,4,4,4,1,1,1};
        int[] c = {1,1,1};
        System.out.println(b.equals(c));
        System.out.println(a2(b));
        System.out.println(a2(c));
    }
    public static int [] a1(int [] arr){

        boolean b=Arrays.stream(arr).anyMatch((a)->a==4);
        if(!b) throw new RuntimeException();
        int[] arr2;
        int i;
        for(i=arr.length-1;i>=0;i--){
            if(arr[i]==4) break;
        }

        if (i==arr.length-1) arr2=new int[0];

        else{
            i++;
            int k=i;
            arr2=new int[arr.length-k];
            for(;i<arr.length;i++) {
                arr2[i-k]=arr[i];
            }
        }
        return arr2;
    }
    public static boolean a2(int [] arr){
        boolean b=Arrays.stream(arr).anyMatch((a)->a==4);
        boolean b2=Arrays.stream(arr).anyMatch((a)->a==1);
        if(!b||!b2) return false;
        for(int i=0;i<arr.length;i++) if(arr[i]!=1&&arr[i]!=4) return false;
        return true;
    }
}

