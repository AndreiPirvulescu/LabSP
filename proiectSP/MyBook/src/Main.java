package MyBook.src;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main {
	public static void main(String[] args) throws Exception {
Section cap1 = new Section("Capitolul 1");
Paragraph p1 = new Paragraph();
cap1.add(p1);
Paragraph p2 = new Paragraph();
cap1.add(p2);
Paragraph p3 = new Paragraph();
cap1.add(p3);
Paragraph p4 = new Paragraph();
cap1.add(p4);
cap1.add(new ImageProxy("ImageOne"));
cap1.add(new Image("ImageTwo") {
	@Override
	public int getWidth(ImageObserver observer) {
		return 0;
	}

	@Override
	public int getHeight(ImageObserver observer) {
		return 0;
	}

	@Override
	public ImageProducer getSource() {
		return null;
	}

	@Override
	public Graphics getGraphics() {
		return null;
	}

	@Override
	public Object getProperty(String name, ImageObserver observer) {
		return null;
	}
});
cap1.add(new Paragraph());
cap1.add(new Table("Table 1"));
BookStatistics stats = new BookStatistics();
cap1.accept(stats);
stats.printStatistics();
}

/*	public static class Image{
		public Image(){

		}
	}*/
	private static class BookStatistics {
		public void printStatistics() {
		}
	}

	private static class Paragraph {
		public Paragraph() {
		}
	}

	private static class Section {
		public Section(String s) {
		}

		public void add(Paragraph p1) {
		}

		public void accept(BookStatistics stats) {
		}
	}

	private static class Table extends Paragraph {
		public Table(String s) {
			super();
		}
	}

	private static class ImageProxy extends Paragraph {
		public ImageProxy(String imageOne) {
		}
	}
}