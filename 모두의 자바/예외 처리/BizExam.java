package Exception;

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);
		try {
			biz.bizMethod(-3);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("closing programs..");


	}

}
