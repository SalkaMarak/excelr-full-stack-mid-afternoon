package app3.excelr;
class J
{
	public static void main(String[] args)
	{
		F f1 = new F();
		f1.test1();
		H h1 = new H();
		h1.test1();
		I i1 = new I();
		i1.test1();
		System.out.println("done");
	}
}

//we can access it from anywhere since they are all subclasses (direct or indirect) of F.