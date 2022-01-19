public class intset {
    boolean[] tab = new boolean[100];

    public void insertElement (int index) {
        if (index>0 && index<=100)
            tab[index-1] = true;
    }
    public void deleteElement (int index) {
        if (index>0 && index<=100)
            tab[index-1] = false;
    }
    public void wypisz(boolean[] tab){
        for(int i=0; i<100; i++){
            System.out.println("Element: " + tab[i]);
        }
    }
    public void union(boolean[] tab1, boolean[] tab2){
        boolean[] nowa = new boolean[100];
        for(int i=0; i<100; i++){
            if(tab1[i]== true || tab2[i]== true){
                nowa[i] = true;
            }
        }
    }
    public void intersection(boolean[] tab1, boolean[] tab2){
        boolean[] nowa = new boolean[100];
        for(int i=0; i<100; i++){
            if(tab1[i]== true && tab2[i]== true){
                nowa[i] = true;
            }
        }
    }
    public void toString(boolean[] tab){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<100; i++){
            if(tab[i]==true){
                sb.append(tab[i]);
                sb.append(" ");
            }
        }
    }
    public void equals(boolean[] tab1, boolean[] tab2){
        int n = 0;
        for(int i=0; i<100; i++) {
            if (tab1[i]==tab2[i])
                n++;
        }
        if(n==100)
            System.out.println("Zbiory sa rowne");
        else System.out.println("Zbiory nie sa rowne");
    }

}