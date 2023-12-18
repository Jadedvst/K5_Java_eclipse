package dataStructure.ch4StackandQueue;

/*
 * 교재에 있는 소스코드
 * 입력하여 실행 실습
 * 정수형 스택 소스 코드
 */

import java.util.Scanner;

//int형 고정 길이 스택

class IntStack {
	private int[] stk; // 스택용 배열
	private int capacity; // 스택의 크기
	private int ptr; // 스택 포인터

//--- 실행시 예외: 스택이 비어있음 ---//
	public class EmptyIntStackException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public EmptyIntStackException() {
		}
	}

//--- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowIntStackException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public OverflowIntStackException() {
			System.out.println("Stack Exception");
		}
	}

//--- 생성자(constructor) ---//
	public IntStack(int maxlen) {
		ptr=0;
		capacity=maxlen;
		try {
			stk= new int[capacity];		// 배열 생성
		} catch (OutOfMemoryError e) {	// 메모리 부족으로 배열 생성 불가시
			capacity=0;
		}
	}

//--- 스택에 x를 푸시 ---// 스택이 다 차지 않은 이상 제일 위의 (포인터가 있는) 스택에 x push, 그 후 포인터 올리기
	public int push(int x) throws OverflowIntStackException { //push를 선언한곳
		if(isFull())
			throw new OverflowIntStackException(); 
		return stk[ptr++] = x;
	}

//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public int pop() throws EmptyIntStackException {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr]; //포인터를 내린 후에 값을 빼오기
	}

//--- 스택에서 데이터를 피크(peek, 제일 마지막(정상)에 있는 데이터를 들여다봄) ---//
	public int peek() throws EmptyIntStackException {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1]; //당연히 데이터를 보기위해 포인터를 내려야한다
	}

//--- 스택을 비움 ---//
	public void clear() {
		ptr = 0; //ptr이 쌓인 스택
		//capacity를 가진 stk를 비우기만 
		//stk=0을 쓰면 스택자체가 사라진다
	}

//--- 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 ---//
	public int indexOf(int x) {
		//제일 마지막에서 부터 탐색
		if(isEmpty())
			System.out.println("스택이 비었습니다.");
		for(int i=ptr-1;i>=0;i--)
			if(stk[i]==x)
				return i;
		return -1;
	}

//--- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return ptr; //ptr이 쌓인 스택
	}

//--- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return ptr <= 0;
	}

//--- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return ptr >= capacity;
	}

//--- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() {
		//없을 경우엔 error
		if(ptr<=0)
			System.out.println("스택이 비었습니다.");
		else {
			for(int i=0;i>=ptr;i++)
				System.out.print(stk[i]+ " ");
			System.out.println();
		}
	}
}
