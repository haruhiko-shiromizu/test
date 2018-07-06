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

		System.out.println("長方形サイズ = "+ aRectangle.areaSize());
		System.out.println("正方形1 サイズ = "+ aSquare1.areaSize());
		System.out.println("正方形2 サイズ = "+ aSquare2.areaSize());
		System.out.println("三角形1 サイズ = "+ aTriangle1.areaSize());
		System.out.println("三角形2 サイズ = "+ aTriangle2.areaSize());
		System.out.println("三角形3 サイズ = "+ aTriangle3.areaSize());
	}
}
