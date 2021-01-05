public class EnumTest {
    enum Mango{
        Carrie(0),
        FairChild(10),
        Haden(6);

        private int total;
        Mango(int t){
            total = t;
        }
        void setTotal(int t){
            total = t;
        }
        int getTotal(){
            return total;
        }

    }
    public static void main(String [] args){
        Mango mango = Mango.Carrie;
        mango.setTotal(100);

        System.out.println("Mango of type" + mango + " total is " + mango.getTotal());
        System.out.println("Mango of type" + mango + " total is " + mango.getTotal());


        for(Mango m: Mango.values()){
            System.out.println("We have " + m.getTotal() + " " + m + " in shop");
        }
    }
}
