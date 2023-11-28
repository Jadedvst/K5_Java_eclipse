package dataStructure.ch4StackandQueue;

//4장 소스코드의 Point2 버젼을 학습한 후에 Queue 버젼을 구현한다.

import java.util.ArrayList;
import java.util.List;
/*
* objectStack에 Point2 객체를 push, pop하는 코드를 구현 실습한다
*/
import java.util.Random;
import java.util.Scanner;
class Point2 { //x,y좌표
	private int ix;
	private int iy;

	public Point2(int x, int y) {
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
		if ((this.ix == ((Point2)p).ix) && (this.iy == ((Point2)p).iy))
			return true;
		else return false;
	}
}

class objectStack{
	//--- 실행시 예외: 스택이 비어있음 ---//
	// generic class는 Throwable을 상속받을 수 없다 - 지원하지 않는다
	public class EmptyGenericStackException extends Exception {
		private static final long serialVersionUID = 1L;
		public EmptyGenericStackException() {
			super();
		}
	}

	//--- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowGenericStackException extends RuntimeException {
		public OverflowGenericStackException() {
		}
	}

    private List<Point2> data;           // 스택용 배열
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터

//--- 생성자(constructor) ---//
	public objectStack(int capacity) {
		// 배열 생성// 메모리 부족으로 배열 생성 불가시
		top=0;
		this.capacity=capacity;
		try {
			data = new ArrayList<Point2>(capacity);
		}catch(OutOfMemoryError e){
			capacity=0;
		}
	}

//--- 스택에 x를 푸시 ---// 스택이 다 차면 에러 발생, 아닌 이상 제일 위의 (포인터가 있는) 스택에 x push, 그 후 포인터 올리기
	public void push(Point2 xy) throws OverflowGenericStackException {
		if(top>=capacity)
			throw new OverflowGenericStackException();
		data.add(top++,xy);
	}

//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	//스택이 없으면 에러 발생,포인터를 내린 후에 값을 빼오기
	public Point2 pop() throws EmptyGenericStackException  {
		if(top<=0)
			throw new EmptyGenericStackException();
		return data.remove(--top);
	}

//--- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	//당연히 데이터를 보기위해 포인터를 내려야한다
	public String peek() throws EmptyGenericStackException  {
		if(top<=0)
			throw new EmptyGenericStackException();
		return data.get(top-1).toString();
	
	}

//--- 스택을 비움 ---//
	public void clear() {
		top = 0;
	}

//--- 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 ---//
	//제일 마지막에서 부터 탐색
	public int indexOf(Point2 xy) {
		for(int i=top-1;i>=0;i--) {
			if(data.get(i)==xy)
				return i;
		}
		return -1;
	}

//--- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return top;
	}

//--- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

//--- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return top >= capacity;
	}

//--- 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력 ---//
	public void dump() {
		//없을 경우엔 출력
		if(top<=0)
			System.out.println("스택이 비었습니다.");
		else {
			for(int i=0;i<top;i++)
				System.out.print(data.get(i).toString()); 
			System.out.println();
		}
	}
}
public class Test4_2_1ObjectStack {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		objectStack s = new objectStack(8); // 최대 8 개를 push할 수 있는 stack
		Random random = new Random();
		int rndx = 0, rndy = 0;
		Point2 p = null;
		
		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)push　(2)pop　(3)peek　(4)dump (5)clear　(0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			switch (menu) {
			case 1: // 푸시
				System.out.print("데이터: ");
				rndx = random.nextInt(20);
				rndy = random.nextInt(20);
//				System.out.print("데이터 x: ");
//				rndx = stdIn.nextInt();
//				System.out.print("데이터 y: ");
//				rndy = stdIn.nextInt();
				p = new Point2(rndx,rndy);
				try {
					s.push(p);
				} catch(objectStack.OverflowGenericStackException e) {
					System.out.println("stack이 가득찼있습니다.");
				}
				break;

			case 2: // 팝
				try {
					p = s.pop();
					System.out.println("pop한 데이터는 " + p + "입니다.");
				} catch(objectStack.EmptyGenericStackException e) {
					System.out.println("stack이 비어있습니다.");
				}
				break;

			case 3: // 피크
				try {
//					p = s.peek();
					System.out.println("peek한 데이터는 " + s.peek() + "입니다.");
				} catch (objectStack.EmptyGenericStackException e) {
					System.out.println("stack이 비어있습니다.");
				}
				break;

			case 4: // 덤프
				s.dump();
				break;
			case 5:
				s.clear();
				break;
			}
		}
	}
}