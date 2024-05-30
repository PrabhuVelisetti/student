package pro;


 class marks {
	int s1=10,s2=20,s3=12,n1=3;
}

	 class tot extends marks {
		
	int tot=s1+s2+s3;
		void tot(){
			System.out.println(tot);
		}
	}
	 class avg extends tot
	{
		int avg=(tot)/n1;
		
			void avg(){
				    System.out.println(avg);
		}
	
	}
	class students {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tot s=new tot();
		avg a=new avg();
		 s.tot();
		 a.avg();
		

	}
}
