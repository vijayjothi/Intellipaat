public class VariableReferenca {

    public void changeVar(int x){      //pass by value
        x=x+5;
        System.out.println("changed var is "+x);
    }

    public void changeRef(VarRef ref){    //pass by reference
        ref.y=30;
        System.out.println(ref.y);
    }

    public static void main(String[] args) {
        VariableReferenca var=new VariableReferenca();
        int x=10;
        System.out.println("Before passing: "+x);
        var.changeVar(x); //pass by value
        System.out.println("After passing: "+x);
        System.out.println();

        VarRef ref=new VarRef();
        ref.y=20;
        System.out.println("Before calling:"+ref.y);
        var.changeRef(ref);//pass by reference
        System.out.println("after calling:"+ref.y);
    }
}

class VarRef{
    int y;
}
