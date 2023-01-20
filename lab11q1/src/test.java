public class test {
    public static void main(String[] args) {                 
        Expo exp = new Expo(7, 1); 
        exp.printValue(); 
        Sine s = new Sine(7, Math.PI/4); 
        s.printValue(); 
        Cosine cs = new Cosine(7, 1); 
        cs.printValue(); 
        Taylor[] taylor = new Taylor[3];
        taylor[0] = new Expo(7, 2);
        taylor[1] = new Sine(7, Math.PI/3);
        taylor[2] = new Cosine(7, Math.PI/3);
        for (Taylor i : taylor) {
            i.printValue();
        }
    }
}
