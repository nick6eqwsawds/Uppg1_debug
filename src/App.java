public class App {
    public static void main(String[] args) throws Exception {

        int slump = (int) Math.random()*100;
        slump-=49;
        if(slump < 0 ){
            System.out.println("Slumptalet är negativt");
        }
        else {
            System.out.println("slumptalet är positivt");
        }
        int[] array = {3,2,5,4,6,8,9,7};

        for (int i = 5; i < array.length; i++) {
            System.out.println(i+" har värdet "+array[i]);
        }
        boolean fort = true;
        while(fort==true){
            System.out.println("En gång till");
        }
    }
}
