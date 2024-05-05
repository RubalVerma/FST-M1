package Activities;

public class CustomException extends Exception{

    private String message = null;

    CustomException(String message)
    {
        this.message = message;
    }

    public String getmessage()
    {
        return message;
    }
}
