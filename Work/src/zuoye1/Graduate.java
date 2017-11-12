package zuoye1;

public class Graduate implements StudentManageInterface, TeacherManageInterface {
    String name;
    String sex;
    int age;
    double fee;
    
   
	public void getFee() {
		// TODO Auto-generated method stub
		
	}
	public void setFee() {
		// TODO Auto-generated method stub
		
	}

	
	
	  void biaojiao(int pay1, int pay){
		if(pay1-pay>2000) {
			System.out.println("provide a loan");
		}
	}
	
  public void getPay(double pay1) {
		
		System.out.println("获得学费:"+pay1);
	}
	
	public void setPay(double pay) {
		
		System.out.println("学校所需学费:"+pay);
	}
	
	public static void main(String []args) {
		Graduate zhangsan=new Graduate();
		zhangsan.getPay(4650);
		zhangsan.setPay(2000);
		
		zhangsan.biaojiao(4650, 2000);
	}

	

	

}
