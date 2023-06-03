public class PRN2302340120192_ShivamHajare_Q4 {
    public static void main(String[] args) {
        int no=121;
        int temp=no;
        int sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            sum=(sum*10)+rem;
            temp=temp/10;

        }
        System.out.println(sum);
        if(sum==no)
        {
            System.out.println("ArmStrong no!!!");
        }
        else{
            System.out.println("not armStrong no");
        }
    }
}
