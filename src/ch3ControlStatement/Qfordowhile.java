package ch3ControlStatement;

public class Qfordowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------FOR----------------------------");
		for (int i=1;i<10;i++) {
			for (int j=1;j<10;j++) {// 안의 것이 먼저 나열됨
				if (i*j>=10) {
					System.out.print(j+"*"+i+"="+(i*j)+" ");
				}else {
					System.out.print(j+"*"+i+"="+(i*j)+"  ");
				}			
			}
			System.out.println("\n");
		}
		System.out.print("-".repeat(20));
		System.out.print("WHILE");
		System.out.println("-".repeat(20));
		
		int w=1;
		int y=1;
		while(w<10) {
			while(y<10) {
				if(w*y>=10) {
					System.out.print(y+"*"+w+"="+(y*w)+" ");
				}else {
					System.out.print(y+"*"+w+"="+(y*w)+"  ");
				}
			y++;	
			}
			y=1; //안의 while 에서 10에 도달 했으니 다시 확정해야함. 작동을 멈춤
			System.out.println("\n");
		w++;
		}
		System.out.println("--------------------------DO WHILE-------------------------");
		int m=1;
		int n=1;
		do {
			do{
				if(m*n>=10) {
					System.out.print(m+"*"+n+"="+(n*m)+" ");
				}else {
					System.out.print(m+"*"+n+"="+(n*m)+"  ");
				}
				m++;
			}while(m<10); //안에 있는게 j 역활
			m=1; //안의 do 에서 10에 도달 했으니 다시 확정해야함. 10을 오바해버림
			System.out.println("\n");
			n++;
		}while (n<10); 
		
	}
	
}
