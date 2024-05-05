package Activities;

public class Activity8 {
    public static void main(String[] args)  {

        try {
            Activity8 et = new Activity8();
            et.exceptionTest("will print");
            et.exceptionTest("Won't execute");
            et.exceptionTest(null);
        }catch(CustomException msg)
        {
            System.out.println("Inside catch block: " + msg.getmessage());
        }

    }
        public void exceptionTest(String str) throws CustomException {
            if(str==null)
            {
                throw new CustomException("String value is null");
            }else
            {
                System.out.println(str);
            }
    }

    }
