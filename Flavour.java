class Flavour{
	public static void main (String []args){
		char []flavours = {'A','M','B','S','C','Z','V','K','G','R'};
		char flavour=flavours[5];
		System.out.println(flavour);
		flavours[5] = 'p';
		char newFlavour=flavours[5];
		System.out.println(newFlavour);
		int size=flavours.length;
		System.out.println(size);
	
	}
}
	
	