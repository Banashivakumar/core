class Colour{
public static void main(String []args){
	char []colours={'R','B','O','P','G'};
	char colour=colours[2];
	System.out.println(colours);
	colours[2] = 'O';
	char newcolour=colours[2];
	System.out.println(newcolour);
	int size=colours.length;
	System.out.println(size);
}
}