public class Sound {

    /* the array of values in this sound; guaranteed not to be null */
    private int[] samples;
  
    /* constructor not shown */
    public Sound(int[] samples) {
        this.samples = samples;
    }

    public int[] getSamples() {
        return samples;
    }
 
    /* Changes those values in this sound that have an amplitude
     * greater than limit. Values greater than limit are changed to
     * limit. Values less than -limit are changed to -limit.
     * The method returns the total number of values that were changed
     * in the array.
     *
     * PRECONDITION: limit ≥ 0
     */
     public int limitAmplitude(int limit) {
         /* To be implemented in part (a) */
         int count = 0;
        for(int i = 0; i < samples.length; i++) {
            if(samples[i] > limit) {
                samples[i] = limit;
                count++;
            }
            if(samples[i] < -limit) {
                samples[i] = -limit;
                count++;
            }
        }
        return count;
     }
  
    /* Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     *
     * PRECONDITION: samples contains at least one nonzero value
     *
     * POSTCONDITION: the length of samples reflects the removal
     *                of starting silence
     */
     public void trimSilenceFromBeginning() {
         /* To be implemented in part (b) */
         int ind = 0;
         for(int i = 1; i < samples.length; i++) {
             if(samples[i - 1] == 0 && samples[i] != 0) {
                 if(ind == 0) {
                     ind = i;
                 }
             }
         }
         int[] temp = new int[samples.length - ind];
         int count = 0;
         for(int j = ind; j < samples.length; j++) {
             temp[count] = samples[j];
             count++;
         }
         samples = temp;
    }
     
 }
