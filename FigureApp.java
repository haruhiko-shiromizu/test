class FigureApp {
	public static void main(String[] args) {
		FigureApp fa1 = new FigureApp();
		fa1.initprint();
	}

	public void initprint() {
		MyRectangle aRectangle = new MyRectangle();
		aRectangle.init(10, 5);
		MySquare1 aSquare1 = new MySquare1();
		aSquare1.init(8);
		MySquare2 aSquare2 = new MySquare2();
		aSquare2.init(8);
		MyTriangle1 aTriangle1 = new MyTriangle1();
		aTriangle1.init(10, 5);
		MyTriangle2 aTriangle2 = new MyTriangle2();
		aTriangle2.init(10, 5);
		MyTriangle3 aTriangle3 = new MyTriangle3();
		aTriangle3.init(10, 5);

		System.out.println("�����`�T�C�Y = "+ aRectangle.areaSize());
		System.out.println("�����`1 �T�C�Y = "+ aSquare1.areaSize());
		System.out.println("�����`2 �T�C�Y = "+ aSquare2.areaSize());
		System.out.println("�O�p�`1 �T�C�Y = "+ aTriangle1.areaSize());
		System.out.println("�O�p�`2 �T�C�Y = "+ aTriangle2.areaSize());
		System.out.println("�O�p�`3 �T�C�Y = "+ aTriangle3.areaSize());
	}
}
