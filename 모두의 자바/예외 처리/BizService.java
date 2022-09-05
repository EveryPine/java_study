package Exception;

public class BizService {
	public void bizMethod(int i) throws BizException{
		System.out.println("Business Method is started..");
		if(i < 0)
			throw new BizException("The parameter i should be greater than zero.");
		System.out.println("Business Method is ended.");
	}
}
