package _04_Serialization;

import java.io.Serializable;

/*
 * Complete this class so that it can be serialized.
 */
public class SaveData implements Serializable{
	public final String name;
	public final int age;
	private final int column;
	private final int height;
	private final int width;
	private final int row;

	public SaveData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public SaveData(int width, int height, int row, int column) {
		this.width = width;
		this.height = height;
		this.row = row;
		this.column = column;
	}
}
