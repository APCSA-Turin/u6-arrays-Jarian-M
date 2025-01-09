public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
    /* Creates a Payroll object
     
       PRECONDITIONS: items != null, items.length >= 3
     */
    
    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }

    public double[] getWages() {
        return wages;
    }
    
   
    /*  Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold() {
      /* To be implemented in part (a) */
      int min = itemsSold[1];
      int max = itemsSold[1];
      for(int sold: itemsSold) {
          if(sold < min) {
              min = sold;
          }
          if(sold > max) {
              max = sold;
          }
      }
      int sum = 0;
      for(int sold: itemsSold) {
          sum += sold;
      }
      double avg = (double) (sum - min - max) / (itemsSold.length - 2);
      return avg;
    }
   
    /* Computes employee wages as described in part (b) and stores
       them in wages. The parameter fixedWage represents the fixed
       amount each employee is paid per day. The parameter
       perItemWage represents the amount each employee is paid per
       item sold.
     */
    public void computeWages(double fixedWage, double perItemWage) {
      /* To be implemented in part (b) */
      double bonus = computeBonusThreshold();
      for(int i = 0; i < wages.length; i++) {
          if(itemsSold[i] > bonus) {
              wages[i] = (fixedWage + perItemWage * itemsSold[i]) * 1.1;
          } else {
              wages[i] = fixedWage + perItemWage * itemsSold[i];
          }
      }
    }
  }
  