public class Statements {
    public static void main(String[] args) {
        int i=10,j=9;

        while(true){
            System.out.println("Hi " +i);
            i++;
            if(i>15)break;
        }

        for(;;){
            System.out.println("hello for loop "+j);
            j++;
            if (j>13)break;
        }

        //break statement
        for (int k=1;k<=3;k++){
            for (int l=1;l<=4;l++){
                System.out.println("the value of k: "+ k+ " and l: "+l);
                if (l==3)break;
            }
        }
        System.out.println();
        test:for (int k=1;k<=3;k++){
            for (int l=1;l<=4;l++){
                System.out.println("the value of k: "+ k+ " and l: "+l);
                if (l==3)break test;
            }
        }
        System.out.println();
        for (int a=1;a<=10;a++){
            if (a==6)continue;
            System.out.println(a);
        }
    }
}
