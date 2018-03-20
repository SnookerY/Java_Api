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
		//1.判断引用类型变量obj是否为空值
		if(obj == null){
			return false;
		}
		
		//2.判断当前变量是否为obj变量
		if(this == obj){
			return true;
		}
		
		//3.判断引用类型变量obj是否为Cell类类型变量
		if(obj instanceof Cell){
			Cell cell = (Cell)obj;
			return cell.row == row && cell.col ==col;
		}else{
			return false;
		}
		
	}
}
