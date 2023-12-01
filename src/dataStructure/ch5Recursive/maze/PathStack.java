package dataStructure.ch5Recursive.maze;

import java.util.ArrayList;
import java.util.List;


//enum Directions {N, NE, E, SE, S, SW, W, NW}
//class Mouse{
//	int r;
//	int c;
//	Directions dir;
//	Mouse(int r, int c, Directions dir){
//		this.r=r;
//		this.c=c;
//		this.dir=dir;
//	}
//	@Override
//	public String toString() {
//		return "(" + r + "," + c + ") dir = " + dir;
//	}
//}

class Mouse{
int r;
int c;
int dir;
Mouse(int r, int c, int dir){
	this.r=r;
	this.c=c;
	this.dir=dir;
}
@Override
public String toString() {
	return "(" + r + "," + c + ") dir = " + dir;
}
}

public class PathStack {
	private List<Mouse> data; // 스택용 배열
	private int capacity; // 스택의 크기
	private int ptr; // 스택 포인터

	// --- 실행시 예외 : 스택이 비어있음 ---//
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// --- 실행시 예외 : 스택이 가득 참 ---//
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}
	
	public PathStack(int maxlen){
		this.capacity=maxlen;
		try {
			data = new ArrayList<Mouse>(capacity);
		}catch(OutOfMemoryError e) {
			capacity =0;
		}
	}
	public void push(Mouse pos) throws OverflowIntStackException{
		if(ptr>=capacity)
			throw new OverflowIntStackException();
		data.add(ptr++,pos);
	}
	public Mouse pop() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		Mouse pos = data.get(--ptr);
		return pos;
	}
// --- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public Mouse peek() throws EmptyIntStackException {
		if (ptr <= 0) // 스택이 빔
			throw new EmptyIntStackException();
		return data.get(ptr - 1);
	}

	// --- 스택을 비움 ---//
	public void clear() {
		ptr = 0;
	}

	// --- 스택에서 x를 찾아 인덱스(벌견하지 못하면 –1)를 반환 ---//
	public int indexOf(Mouse x) {
		for (int i = ptr - 1; i >= 0; i--) // 정상 쪽에서 선형검색
			if (data.get(i).equals(x))
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// --- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

	// --- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return ptr;
	}

	// --- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// --- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return ptr >= capacity;
	}

	// --- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(data.get(i) + " ");
			System.out.println();
	}
}
}
