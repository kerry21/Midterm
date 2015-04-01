import static org.junit.Assert.*;

import org.junit.Test;


	public class TrTest {

		@Test
		public void test() {
			Triangle tri = new Triangle(1,1,1);
			tri.getType(tri);
			tri.isTriangle(tri);
			tri.getBorders();
		}

		@Test
		public void test1() {
			Triangle tri = new Triangle(3,1,3);
			tri.getType(tri);
			tri.getBorders();
			tri.isTriangle(tri);
		}
		@Test
		public void test8() {
			Triangle tri = new Triangle(2,1,3);
			tri.getType(tri);
			tri.getBorders();
			tri.isTriangle(tri);
		}
		@Test
		public void test2() {
			Triangle tri = new Triangle(1,1,2);
			tri.getType(tri);
			tri.getBorders();
			tri.isTriangle(tri);
		}
		@Test
		public void test3() {
			Triangle tri = new Triangle(4,5,6);
			tri.getType(tri);
			tri.getBorders();
			tri.isTriangle(tri);
		}
		@Test
		public void test4() {
			Triangle tri = new Triangle(6,5,4);
			tri.getType(tri);
			tri.getBorders();
			tri.isTriangle(tri);
		}
		@Test
		public void test5() {
			Triangle tri = new Triangle(5,5,3);
			tri.getType(tri);
			tri.getBorders();
			tri.isTriangle(tri);
		}
		@Test
		public void test6() {
			Triangle tri = new Triangle(2,3,1);
			tri.getType(tri);
			tri.getBorders();
			tri.isTriangle(tri);
		}
	}


