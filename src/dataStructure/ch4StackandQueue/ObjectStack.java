package dataStructure.ch4StackandQueue;

//4장 소스코드의 Point 버젼을 학습한 후에 Queue 버젼을 구현한다.

import java.util.ArrayList;
import java.util.List;
/*
* objectStack에 Point 객체를 push, pop하는 코드를 구현 실습한다
*/
import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;

class Point {
	private int ix;
	private int iy;

	public Point(int x, int y) {
		ix = x;
		iy = y;
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
}

public class ObjectStack{
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

    private List<Point> data;           // 스택용 배열
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터

//--- 생성자(constructor) ---//
	public ObjectStack(int capacity) {
		// 배열 생성// 메모리 부족으로 배열 생성 불가시
		top=0;
		this.capacity=capacity;
		try {
			data = new ArrayList<Point>(capacity);
		}catch(OutOfMemoryError e){
			capacity=0;
		}
	}

//--- 스택에 x를 푸시 ---// 스택이 다 차면 에러 발생, 아닌 이상 제일 위의 (포인터가 있는) 스택에 x push, 그 후 포인터 올리기
	public void push(Point xy) throws OverflowGenericStackException {
		if(top>=capacity)
			throw new OverflowGenericStackException();
		data.add(top++,xy);
	}

//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	//스택이 없으면 에러 발생,포인터를 내린 후에 값을 빼오기
	public Point pop() throws EmptyGenericStackException  {
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
	public int indexOf(Point xy) {
		for(int i=top-1;i>=0;i--) {
			if(data.get(i).equals(xy))
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
