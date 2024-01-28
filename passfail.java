public class passfail {
    public static void main(String args[]){
    int marks= 60;
    if(marks<90 && marks>80)
    {
        System.out.println("A");
    }
    else if(marks>=80 && marks<=100)
    {
        System.out.println("B");
    }
    else if(marks>=60 && marks<=80)
    {
        System.out.println("C");
    }
    else if(marks>=44 && marks<=60)
    {
        System.out.println("Pass");
    }
    else
    {
        System.out.println("Fail");
    }

    
}
}
