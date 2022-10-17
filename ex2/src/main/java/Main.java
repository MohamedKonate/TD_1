public class Main {
    public static void main(String[] args) {

        IPaire<Integer,String> v1=new Paire<>(1,"un");
        System.out.println("("+v1.fst()+","+v1.Snd()+")");
        IPaire<Double,String> v2= v1.changerFst(1.0);
        System.out.println("("+v2.fst()+","+v2.Snd()+")");
        IPaire<Double,IPaire<Integer,String>> v3= v2.changerSnd(v1);
        System.out.println("("+v3.fst()+", ("+v3.Snd().fst()+","+v3.Snd().Snd()+"))");
    }
}