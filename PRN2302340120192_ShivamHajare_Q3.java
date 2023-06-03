public class PRN2302340120192_ShivamHajare_Q3 {
        public static void main(String[] args) {
            System.out.println("hi")
            int flag=0;
            System.out.println("1");
            for(int i=1;i<=100;i++)
            {
                flag=0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        flag=0;
                        break;
                    }
                    flag=1;
                }
                if(flag==1)
                {
                    System.out.println(i);
                }

            }
        }
}
