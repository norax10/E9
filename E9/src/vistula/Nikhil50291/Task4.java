package vistula.Nikhil50291;

public class Task4 {

    public static void Method(int Nikhil) throws LessThanOneException,GreaterThanOneException,EqualsZeroException{
        if(Nikhil<0){
            throw new LessThanOneException("The number Is Less Than 0");
        }
        else if (Nikhil>1){
            throw new GreaterThanOneException("The number Is Greater Than 1");
        }
        else if(Nikhil==0){
            throw new EqualsZeroException("The number Is equal To 0");
        }
    }
    public static  void main(String[]args) throws GreaterThanOneException, LessThanOneException, EqualsZeroException {
        try {
            Method(0);
        }
        catch (GreaterThanOneException | EqualsZeroException |LessThanOneException tfs ){
            System.out.println(tfs);
        }

    }


}
