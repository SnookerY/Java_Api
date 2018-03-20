package com.java.demo2;

public class Cell {

	int row;
	int col;
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Cell(int row, int col){
		this.row = row;
		this.col = col;
	}
	
	public Cell(){
		this(0, 0);
	}
	
	public Cell(Cell cell){
		this(cell.row, cell.col);
	}
	
	public void drop(){
		row++;
	}
	
	public void moveRight(){
		col++;
	}
	
	public void moveLeft(){
		col--;
	}
	
	@Override
	public String toString(){
		return row + "," +col;
	}
	
	@Override
	public boolean equals(Object obj){
		//1.�ж��������ͱ���obj�Ƿ�Ϊ��ֵ
		if(obj == null){
			return false;
		}
		
		//2.�жϵ�ǰ�����Ƿ�Ϊobj����
		if(this == obj){
			return true;
		}
		
		//3.�ж��������ͱ���obj�Ƿ�ΪCell�����ͱ���
		if(obj instanceof Cell){
			Cell cell = (Cell)obj;
			return cell.row == row && cell.col ==col;
		}else{
			return false;
		}
		
	}
}
