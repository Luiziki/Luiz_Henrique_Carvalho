public class A {

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

        public void MA3(){
            System.out.println("Alteração a classe A partir do clone");
        }
    };