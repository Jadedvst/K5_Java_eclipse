package dataStructure.ch2BasicDataStructure;

class PhyscData2 implements Comparable<PhyscData2>{
	String name;
	int height;
	double vision;
	
	public PhyscData2(String string, int i, double d) {
		this.name=string;
		this.height=i;
		this.vision=d;
	}
	
	//객체 비교를 위한 구문 Comparable(compareTo),Comparator(compare)
	@Override
	//이름순
	public int compareTo(PhyscData2 o) {
		if(name.compareTo(o.name)==0)
			if(height-o.height==0)
				return (int) (vision-o.vision);
			else return height-o.height;
		
		else return name.compareTo(o.name);
	}
	//자리 정하기
	public int compareTo2(PhyscData2 o) {
		if(height-o.height==0)
			if((int) (vision-o.vision)==0)
				return name.compareTo(o.name);
			else return (int) (vision-o.vision);
		else return height-o.height;
	}
	
	

}
public class Test2_14_ObjectArraySorting {

	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("홍동", 184, 1.3),
				new PhyscData2("홍길동", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("이길동", 172, 0.6),
				new PhyscData2("박길동", 167, 0.2),
				new PhyscData2("최길동", 167, 0.2),
		};
		showData(data);
		System.out.println("\n"+"-".repeat(10)+"By Object Name"+"-".repeat(15));
		sortData(data);
		showData(data);
		System.out.println("\n"+"-".repeat(10)+"By Object Height"+"-".repeat(15));
		sortData2(data);
		showData(data);
		
		//객체 비교가 없을시//////////////////
//		System.out.println("\n"+"-".repeat(10)+"By Name"+"-".repeat(15));
//		sortDataName(data);
//		showData(data);
//		System.out.println("\n"+"-".repeat(10)+"By Height"+"-".repeat(15));
//		sortDataHeight(data);
//		showData(data);
	}
	

	static void showData(PhyscData2[] data) {
		for(PhyscData2 pd:data)
		System.out.println(
					  pd.name
				+ "\t(Height:"
					+ pd.height
				+ ",Vision:"
					+ pd.vision
				+ ")");
	}
	
	private static void swap(PhyscData2[] data, int i, int j) {
		PhyscData2 temp;
		temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}
	

	private static void sortData(PhyscData2[] data) {
		for(int i=0;i<data.length;i++)
			for(int j=i;j<data.length;j++)
				if(data[i].compareTo(data[j])>0) 
					swap(data,i,j);
	}
	
	private static void sortData2(PhyscData2[] data) {
		for(int i=0;i<data.length;i++)
			for(int j=i;j<data.length;j++)
				if(data[i].compareTo2(data[j])>0) 
					swap(data,i,j);
	}
	//객체 비교가 없을시//////////////////
//	private static void sortDataHeight(PhyscData2[] data) {
//		for(int i=0;i<data.length;i++)
//			for(int j=i;j<data.length;j++)
//				if(data[i].height>data[j].height) {
//				
//					swap(data,i,j);
//				}
//		
//	
//	}
//	
//	
//	private static void sortDataName(PhyscData2[] data) {
//		for(int i=0;i<data.length;i++)
//			for(int j=i;j<data.length;j++)
//				if(data[i].name.compareTo(data[j].name)>0)
//					swap(data,i,j);	
//		
//	}
	


}