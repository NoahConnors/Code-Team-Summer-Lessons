class ENLevel1Loop {
	public static void main(String args[]) throws InterruptedException {
		boolean awfulloop = true;
		while(awfulloop) {
			System.out.println("This program is the worst thing ever made.");
			System.out.println("It has to be a 10 line loop, so...");
			System.out.println("this is the 10th line of code. Enjoy the horror.");
			System.out.println("And actually now that's a lie since I added another method in there ;).");
			Thread.sleep(60);
		}
	}
}