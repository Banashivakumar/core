class Direction{
	public static void main (String []args){
		char []directions = {'N','S','E','W'};
		char direction=directions[2];
		System.out.println(direction);
		directions[2] = 'E';
		char newDirection=directions[2];
		System.out.println(newDirection);
		int size=directions.length;
		System.out.println(size);
	
	}
}
	
	