package dataStructure.ch4StackandQueue;
/*
 * 원형 큐로서 큐에 Point 객체를 저장 - 교재 소스코드를 원형 큐가 되도록 수정하는 연습
 */

import java.util.Random;
import java.util.Scanner;


class Point4 {
	private int ix;
	private int iy;

	public Point4(int x, int y) {
		ix = x;
		iy = y;
	}

	@Override
	public String toString() {
		return "<" + ix + ", " + iy + ">";
	}

	public int getX() {
		return ix;
	}

	public int getY() {
		return iy;
	}

	public void setX(int x) {
		ix = x;
	}

	public void setY(int y) {
		iy = y;
	}
	@Override
	public boolean equals(Object p) {
		if ((this.ix == ((Point4)p).ix) && (this.iy == ((Point4)p).iy))
			return true;
		else return false;
	}
}

public class Test4_5ObjectCircularQueue {

	static int QUEUE_SIZE = 0;
	Point4[] que;//배열로 객체원형 큐 구현
	int front, rear;
	int num;
	static boolean isEmpty;
	//--- 실행시 예외: 큐가 비어있음 ---//
		public class EmptyQueueException extends RuntimeException {
			public EmptyQueueException() {
			}
		}

	//--- 실행시 예외: 큐가 가득 찼음 ---//
		public class OverflowQueueException extends RuntimeException {
			public OverflowQueueException() {
			}
		}
	public Test4_5ObjectCircularQueue(int count) {
		front=rear=num=0;
		QUEUE_SIZE=count;
		try {
			que = new Point4[QUEUE_SIZE];
		}catch(OutOfMemoryError e) {
			QUEUE_SIZE=0;
		}

	}
	void push(Point4 it) throws OverflowQueueException{
		if(num>=QUEUE_SIZE)
			throw new OverflowQueueException();
		num++;
		que[rear++]=it;
		if(rear==QUEUE_SIZE)
			rear=0;
	}

	Point4 pop() throws EmptyQueueException{
		if(num<=0)
			throw new EmptyQueueException();
		num--;
		Point4 it = que[front++];
		if(front==QUEUE_SIZE)
			front=0;
		return it;
	}

	 void clear() {
		for(int i = 0; i < que.length; i++) {
			que[i] = null;
			front = rear = 0;
		}
		isEmpty = true;
		System.out.println("원형 큐가 비었습니다.");
	}


	//--- 큐의 크기를 반환 ---//
		public int getCapacity() {
			return QUEUE_SIZE;
		}

	//--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
		public int size() {
			return num;
		}
		public int indexOf(Point4 it) {
			if(num<=0)
				System.out.println("Queue Empty");
			for(int i=0;i<num;i++) {
				int idx=(front+i)%QUEUE_SIZE;
				if(que[idx].equals(it))
					return idx;
			}
			return -1;
		}
		public void dump() {
			if(num<=0)
				System.out.println("Queue Empty");
			System.out.println("총 "+num+"개의 큐");
			for(int i=0;i<num;i++) {
				int idx=(front+i)%QUEUE_SIZE;
				System.out.println(que[idx]+" ");
			}
			System.out.println();
		}
		public Point4 peek() throws EmptyQueueException {
			if(num<=0)
				throw new EmptyQueueException();
			Point4 it = que[front];
			return it;
		}

public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	Test4_5ObjectCircularQueue oq = new Test4_5ObjectCircularQueue(4); // 최대 64개를 인큐할 수 있는 큐
	Random random = new Random();
	int rndx = 0, rndy = 0;
	Point4 p = null;
	int x;
	int y;
	
	while (true) {
		System.out.println(" "); // 메뉴 구분을 위한 빈 행 추가
		System.out.printf("현재 데이터 개수: %d / %d\n", oq.size(), oq.getCapacity());
		System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(5)인덱스 찾기 (6)큐 비우기 (0)종료: ");
		int menu = stdIn.nextInt();
		
		switch (menu) {
		case 1: // 인큐

			rndx = random.nextInt(20);
			rndy = random.nextInt(20);
			System.out.print("입력데이터: (" + rndx + ", " + rndy + ")");
			p = new Point4(rndx,rndy);
			try {
				oq.push(p);
			} catch(Test4_5ObjectCircularQueue.OverflowQueueException e) {
				System.out.println("stack이 가득찼있습니다.");
			}
			break;

		case 2: // 디큐
			try {
				p = oq.pop();
				System.out.println("디큐한 데이터는 " + p + "입니다.");
			} catch (Test4_5ObjectCircularQueue.EmptyQueueException e) {
				System.out.println("큐가 비어 있습니다.");
			}
			break;

		case 3: // 피크
			try {
				p = oq.peek();
				System.out.println("피크한 데이터는 " + p + "입니다.");
			} catch (Test4_5ObjectCircularQueue.EmptyQueueException e) {
				System.out.println("큐가 비어 있습니다.");
			}
			break;

		case 4: // 덤프
			oq.dump();
			break;
		
		case 5: // 인덱스 찾기
			System.out.print("찾는 값의 x좌표: ");
			x = stdIn.nextInt();
			p.setX(x);
			System.out.print("찾는 값의 y좌표: ");
			y = stdIn.nextInt();
			p.setY(y);
			int idx=oq.indexOf(p);
			System.out.println("찾는 값의 인덱스: "+idx);
			break;
		case 6:
			oq.clear();
			System.out.println("스택이 비었습니다");
			break;
			
		default:
			break;
		}
	}
}

	
}
