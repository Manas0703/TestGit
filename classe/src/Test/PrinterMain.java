package Test;

/*class Movie() {
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}
	
}*/
public class PrinterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer printer = new Printer(50, true);
		System.out.println("Initial Page Count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(5);
		System.out.println("Pages Printed was = " + pagesPrinted + " total print count for printer = " + printer.getPagesPrinted());
		printer = new Printer(70, false);
		pagesPrinted = printer.printPages(4);
		System.out.println("Pages Printed was = " + pagesPrinted + " total print count for printer = " + printer.getPagesPrinted());
		//printer = new Printer(150, true);
		pagesPrinted = printer.printPages(11);
		System.out.println("Pages Printed was = " + pagesPrinted + " total print count for printer = " + printer.getPagesPrinted());
	}

}
