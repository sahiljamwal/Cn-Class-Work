package com.sahil.Dequeue;

public class Dequeue {
	// Complete this class

	private int data[];
	private int front;
	private int rear;
	private int size;

	public Dequeue(int size) {
		data = new int[size];
		front = -1;
		rear = 0;
		this.size = size;
	}

	public int getFront() {
		if (front == -1)
			return -1;
		else
			return data[front];
	}

	public int getRear() {
		if (front == -1)
			return -1;
		else
			return data[rear];

	}

	public void insertFront(int item) {
		if (front == -1) {
			front = 0;
			rear = 0;
			data[front] = item;

		} else if ((front == 0 && rear == size - 1) || front == rear + 1) {
			System.out.println("-1");
			return;
		} else if (front == 0) {
			front = size - 1;
			data[front] = item;

		} else {
			front = front - 1;
			data[front] = item;
		}

	}

	public void insertRear(int item) {
		if (size == 0) {
			front = 0;
			rear = 0;
			data[rear] = item;
		} else if ((front == 0 && rear == size - 1) || front == rear + 1) {
			System.out.println("-1");
			return;
		}

		else if (rear == size - 1) {
			rear = 0;
			data[rear] = item;

		} else {
			rear = rear + 1;
			data[rear] = item;
		}
	}

	public void deleteFront() {
		if (front == -1) {
			System.out.println("-1");
			return;
		}
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == size - 1) {
			front = 0;
		}

		else {
			front = front + 1;
		}
	

	}

	public void deleteRear() {
		if (front == -1) {
			System.out.println("-1");
			return;
		}
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (rear == 0) {
			rear = size - 1;
		}

		else {
			rear = rear - 1;
		}

	}

}