public class CabInvoiceGenerator {
    public static  final  double costperkm=10.0;
        public static  final  double costpermin=1.0;
        public static  final  double minfare=5;
        public  double calculatefare(double distance,int time){
            double totalfare =(distance*costperkm)+(time*costpermin);
            if(totalfare<5){
                return minfare;
            }
            return totalfare;
        }

    }



