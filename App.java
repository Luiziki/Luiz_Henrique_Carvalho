public class App {
    public static void main(String[] args) throws Exception {

        A teste = new A();
        
        teste.MA1();
        teste.MA2();

        B testeB = new B();

        testeB.MB1();
        testeB.MB2();

    };
    public static class A {

        // Atributo
        private int a1;
        private float a2;

        // Método construtor
        public A() {
        }

        public int getA1() {
            return a1;
        }

        public float getA2() {
            return a2;
        }

        public void setA1(int a1) {
            this.a1 = a1;
        }

        public void setA2(float a2) {
            this.a2 = a2;
        }

        // Metodo
        public void MA1() {
            System.out.println("Método MA1.");
        }

        public void MA2() {
            System.out.println("Método MA2.");
        }
    };
    public static class B {

        // Atributo
        private int b1;
        private float b2;
        
        // Método construtor
        public B() {
        }

        public int getB1() {
            return b1;
        }

        public float getB2() {
            return b2;
        }

        public void setB1(int b1) {
            this.b1 = b1;
        }

        public void setB2(float b2) {
            this.b2 = b2;
        }

        // Metodo
        public void MB1() {
            System.out.println("Método MB1.");
        }

        public void MB2() {
            System.out.println("Método MB2.");
        }
    };
}
