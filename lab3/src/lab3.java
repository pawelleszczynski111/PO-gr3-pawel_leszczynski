import java.util.LinkedList;
        import java.util.Random;
public class lab3 {
    public static void main(String[] args) {
        Random r=new Random();

//        zad1 a)
//
//        int i,p=0,np=0;
//        int[] tab= new  int[10];
//        for(i=0;i<tab.length;i++)
//        {
//            tab[i]=r.nextInt(101);
//        }
//        for(i=0;i<tab.length;i++)
//        {
//            if(tab[i]%2==0) p=p+1;
//            else np=np+1;
//        }
//        System.out.printf("ilosc parzystych= "+p+" ilosc nieparzystych= "+np);
//
//       b)

//        int i,d=0,u=0,z=0;
//        int[] tab= new  int[10];
//        for(i=0;i<tab.length;i++)
//        {
//            tab[i]=r.nextInt(101);
//        }
//        for(i=0;i<tab.length;i++)
//        {
//            if(tab[i]>0) d=d+1;
//            else if(tab[i]<0) u=u+1;
//            else z++;
//        }
//        System.out.printf("ilosc dodatnich= "+d+" ilosc ujemnych= "+u+" ilosc zer= "+z);

//        c)

//        int i,nw=0,p=0;
//        int[] tab= new  int[10];
//        for(i=0;i<tab.length;i++)
//        {
//            tab[i]=r.nextInt(101);
//        }
//        for(i=0;i<tab.length;i++)
//        {
//            if(tab[i]>nw){
//                nw=tab[i];
//            }
//            if(tab[i]==nw) p++;
//        }
//        System.out.printf("element najwiekszy= "+nw+" ilosc powtorzen= "+p);

//        d)

//        int i,d=0,u=0;
//        int[] tab= new  int[10];
//        for(i=0;i<tab.length;i++)
//        {
//            tab[i]=r.nextInt(101);
//        }
//        for(i=0;i<tab.length;i++)
//        {
//            if(tab[i]>0) d=d+tab[i];
//            else u=u+tab[i];
//        }
//        System.out.printf("suma dodatnich= "+d+" suma ujemnych= "+u);

//        e)

//        int i,d=0,nw1=0,nw2=0;
//        int[] tab= new  int[10];
//        for(i=0;i<tab.length;i++)
//        {
//            tab[i]=r.nextInt(101);
//        }
//        for(i=0;i<tab.length;i++)
//        {
//            if(tab[i]>=0) {
//                d=d+1;
//                nw1=d;
//            }
//            else {
//                nw2=nw1;
//                d=0;
//            }
//        }
//        if(nw1>nw2) System.out.printf("najdluzszy ciag= "+nw1);
//        else System.out.printf("najdluzszy ciag= "+nw2);

//        f)

        int i;
        int[] tab= new  int[10];
        for(i=0;i<tab.length;i++)
        {
            tab[i]=r.nextInt(101);
        }
        for(i=0;i<tab.length;i++)
        {
            if(tab[i]>0)tab[i]=1;
            if(tab[i]<0)tab[i]=-1;
        }
        for(i=0;i<tab.length;i++){
            System.out.printf(" "+tab[i]);
        }
    }
}
